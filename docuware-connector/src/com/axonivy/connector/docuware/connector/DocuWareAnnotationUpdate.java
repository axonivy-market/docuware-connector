package com.axonivy.connector.docuware.connector;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties class to match the JSON format used by the Docuware rest services
 * for updating annotations
 *
 */
public class DocuWareAnnotationUpdate {
	@JsonProperty("Annotations")
    private List<Annotation> annotations;

    public List<Annotation> getAnnotations() { return annotations; }
    public void setAnnotations(List<Annotation> annotations) { this.annotations = annotations; }

	/**
	 * Convenience builder: creates a request with a single stamp annotation.
	 */
	public static DocuWareAnnotationUpdate ofStamp(int pageNumber, int sectionNumber, String stampId, int layer,
			String fieldName, String itemValue) {
		StampField field = StampField.of(fieldName, TypedValue.ofString(itemValue));
		StampPlacement stamp = StampPlacement.of(stampId, layer, field);
		AnnotationsPlacement placement = AnnotationsPlacement.of(stamp);
		Annotation annotation = Annotation.of(pageNumber, sectionNumber, placement);

		DocuWareAnnotationUpdate request = new DocuWareAnnotationUpdate();
		request.setAnnotations(List.of(annotation));
		return request;
	}

	public static DocuWareAnnotationUpdate ofStamp(int pageNumber, int sectionNumber, String stampId, int layer,
			String... fieldValues) {
		StampField[] fields = new StampField[fieldValues.length];
		for (int i = 0; i < fieldValues.length; i++) {
			fields[i] = StampField.ofIndex(i + 1, fieldValues[i]);
		}
		StampPlacement stamp = StampPlacement.of(stampId, layer, fields);
		AnnotationsPlacement placement = AnnotationsPlacement.of(stamp);
		Annotation annotation = Annotation.of(pageNumber, sectionNumber, placement);

		DocuWareAnnotationUpdate request = new DocuWareAnnotationUpdate();
		request.setAnnotations(List.of(annotation));
		return request;
	}

	public static class Annotation {
		@JsonProperty("PageNumber")
		private int pageNumber;

		@JsonProperty("SectionNumber")
		private int sectionNumber;

		@JsonProperty("AnnotationsPlacement")
		private AnnotationsPlacement annotationsPlacement;

		public int getPageNumber() {
			return pageNumber;
		}

		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}

		public int getSectionNumber() {
			return sectionNumber;
		}

		public void setSectionNumber(int sectionNumber) {
			this.sectionNumber = sectionNumber;
		}

		public AnnotationsPlacement getAnnotationsPlacement() {
			return annotationsPlacement;
		}

		public void setAnnotationsPlacement(AnnotationsPlacement annotationsPlacement) {
			this.annotationsPlacement = annotationsPlacement;
		}

		public static Annotation of(int pageNumber, int sectionNumber, AnnotationsPlacement placement) {
			Annotation a = new Annotation();
			a.pageNumber = pageNumber;
			a.sectionNumber = sectionNumber;
			a.annotationsPlacement = placement;
			return a;
		}
	}

	public static class AnnotationsPlacement {
		@JsonProperty("Items")
		private List<StampPlacement> items;

		public List<StampPlacement> getItems() {
			return items;
		}

		public void setItems(List<StampPlacement> items) {
			this.items = items;
		}

		public static AnnotationsPlacement of(StampPlacement... stamps) {
			AnnotationsPlacement p = new AnnotationsPlacement();
			p.items = List.of(stamps);
			return p;
		}
	}

	public static class StampPlacement {
		@JsonProperty("$type")
		private String type = "StampPlacement";

		@JsonProperty("Location")
		private Location location;

		@JsonProperty("StampId")
		private String stampId;

		@JsonProperty("Layer")
		private int layer;

		@JsonProperty("Field")
		private List<StampField> field;

		@JsonProperty("Password")
		private String password;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Location getLocation() {
			return location;
		}

		public void setLocation(Location location) {
			this.location = location;
		}

		public String getStampId() {
			return stampId;
		}

		public void setStampId(String stampId) {
			this.stampId = stampId;
		}

		public int getLayer() {
			return layer;
		}

		public void setLayer(int layer) {
			this.layer = layer;
		}

		public List<StampField> getField() {
			return field;
		}

		public void setField(List<StampField> field) {
			this.field = field;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public static StampPlacement of(String stampId, int layer, StampField... fields) {
			StampPlacement s = new StampPlacement();
			s.stampId = stampId;
			s.layer = layer;
			s.field = List.of(fields);
			return s;
		}
	}

	public static class Location {
		@JsonProperty("X")
		private String x;

		@JsonProperty("Y")
		private String y;

		public String getX() {
			return x;
		}

		public void setX(String x) {
			this.x = x;
		}

		public String getY() {
			return y;
		}

		public void setY(String y) {
			this.y = y;
		}

		public static Location of(String x, String y) {
			Location l = new Location();
			l.x = x;
			l.y = y;
			return l;
		}

		public static Location of(int x, int y) {
			return of(String.valueOf(x), String.valueOf(y));
		}
	}

	public static class StampField {
		public static final String NAME_FORMAT = "<#%d>";

		@JsonProperty("Name")
		private String name;

		@JsonProperty("TypedValue")
		private TypedValue typedValue;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public TypedValue getTypedValue() {
			return typedValue;
		}

		public void setTypedValue(TypedValue typedValue) {
			this.typedValue = typedValue;
		}

		public static StampField of(String name, TypedValue typedValue) {
			StampField f = new StampField();
			f.name = name;
			f.typedValue = typedValue;
			return f;
		}

		public static StampField ofIndex(int index, String value) {
			return of(String.format(NAME_FORMAT, index), TypedValue.ofString(value));
		}
	}

	public static class TypedValue {
		@JsonProperty("Item")
		private String item;

		@JsonProperty("ItemElementName")
		private String itemElementName = "string";

		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public String getItemElementName() {
			return itemElementName;
		}

		public void setItemElementName(String itemElementName) {
			this.itemElementName = itemElementName;
		}

		public static TypedValue ofString(String item) {
			TypedValue v = new TypedValue();
			v.item = item;
			v.itemElementName = "string";
			return v;
		}
	}
}
