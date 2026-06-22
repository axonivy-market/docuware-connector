
package com.docuware.dev._public.intellix;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.docuware.dev._public.intellix package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Document_QNAME = new QName("http://dev.docuware.com/public/intellix", "Document");
    private static final QName _Page_QNAME = new QName("http://dev.docuware.com/public/intellix", "Page");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.docuware.dev._public.intellix
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentContent }
     * 
     * @return
     *     the new instance of {@link DocumentContent }
     */
    public DocumentContent createDocumentContent() {
        return new DocumentContent();
    }

    /**
     * Create an instance of {@link PageContent }
     * 
     * @return
     *     the new instance of {@link PageContent }
     */
    public PageContent createPageContent() {
        return new PageContent();
    }

    /**
     * Create an instance of {@link SimpleWord }
     * 
     * @return
     *     the new instance of {@link SimpleWord }
     */
    public SimpleWord createSimpleWord() {
        return new SimpleWord();
    }

    /**
     * Create an instance of {@link Word }
     * 
     * @return
     *     the new instance of {@link Word }
     */
    public Word createWord() {
        return new Word();
    }

    /**
     * Create an instance of {@link Space }
     * 
     * @return
     *     the new instance of {@link Space }
     */
    public Space createSpace() {
        return new Space();
    }

    /**
     * Create an instance of {@link Words }
     * 
     * @return
     *     the new instance of {@link Words }
     */
    public Words createWords() {
        return new Words();
    }

    /**
     * Create an instance of {@link Line }
     * 
     * @return
     *     the new instance of {@link Line }
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link RectangleBase }
     * 
     * @return
     *     the new instance of {@link RectangleBase }
     */
    public RectangleBase createRectangleBase() {
        return new RectangleBase();
    }

    /**
     * Create an instance of {@link TextZone }
     * 
     * @return
     *     the new instance of {@link TextZone }
     */
    public TextZone createTextZone() {
        return new TextZone();
    }

    /**
     * Create an instance of {@link GridTable }
     * 
     * @return
     *     the new instance of {@link GridTable }
     */
    public GridTable createGridTable() {
        return new GridTable();
    }

    /**
     * Create an instance of {@link CellZone }
     * 
     * @return
     *     the new instance of {@link CellZone }
     */
    public CellZone createCellZone() {
        return new CellZone();
    }

    /**
     * Create an instance of {@link TableZone }
     * 
     * @return
     *     the new instance of {@link TableZone }
     */
    public TableZone createTableZone() {
        return new TableZone();
    }

    /**
     * Create an instance of {@link BarCodeZone }
     * 
     * @return
     *     the new instance of {@link BarCodeZone }
     */
    public BarCodeZone createBarCodeZone() {
        return new BarCodeZone();
    }

    /**
     * Create an instance of {@link PictureZone }
     * 
     * @return
     *     the new instance of {@link PictureZone }
     */
    public PictureZone createPictureZone() {
        return new PictureZone();
    }

    /**
     * Create an instance of {@link Rulerline }
     * 
     * @return
     *     the new instance of {@link Rulerline }
     */
    public Rulerline createRulerline() {
        return new Rulerline();
    }

    /**
     * Create an instance of {@link SimplePageContent }
     * 
     * @return
     *     the new instance of {@link SimplePageContent }
     */
    public SimplePageContent createSimplePageContent() {
        return new SimplePageContent();
    }

    /**
     * Create an instance of {@link Candidate }
     * 
     * @return
     *     the new instance of {@link Candidate }
     */
    public Candidate createCandidate() {
        return new Candidate();
    }

    /**
     * Create an instance of {@link CandidateInfo }
     * 
     * @return
     *     the new instance of {@link CandidateInfo }
     */
    public CandidateInfo createCandidateInfo() {
        return new CandidateInfo();
    }

    /**
     * Create an instance of {@link DocumentContent.Embedded }
     * 
     * @return
     *     the new instance of {@link DocumentContent.Embedded }
     */
    public DocumentContent.Embedded createDocumentContentEmbedded() {
        return new DocumentContent.Embedded();
    }

    /**
     * Create an instance of {@link DocumentContent.Pages }
     * 
     * @return
     *     the new instance of {@link DocumentContent.Pages }
     */
    public DocumentContent.Pages createDocumentContentPages() {
        return new DocumentContent.Pages();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentContent }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/public/intellix", name = "Document")
    public JAXBElement<DocumentContent> createDocument(DocumentContent value) {
        return new JAXBElement<>(_Document_QNAME, DocumentContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PageContent }{@code >}
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/public/intellix", name = "Page")
    public JAXBElement<PageContent> createPage(PageContent value) {
        return new JAXBElement<>(_Page_QNAME, PageContent.class, null, value);
    }

}
