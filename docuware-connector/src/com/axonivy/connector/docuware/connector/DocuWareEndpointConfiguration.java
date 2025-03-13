package com.axonivy.connector.docuware.connector;

import java.util.Arrays;
import java.util.List;

public class DocuWareEndpointConfiguration {

  private String fileCabinetId;
  private List<String> fileCabinetIds;
  private String storeDialogId;
  private List<String> storeDialogIds;
  private String organizationId;
  private List<String> organizationIds;

  public DocuWareEndpointConfiguration() { }

  public DocuWareEndpointConfiguration(String fileCabinetId, String storeDialogId, String organizationId) {
    this.fileCabinetId = fileCabinetId;
    this.fileCabinetIds = List.of(fileCabinetId);
    this.storeDialogId = storeDialogId;
    this.storeDialogIds = List.of(storeDialogId);
    this.organizationId = organizationId;
    this.organizationIds = List.of(organizationId);
  }

  public DocuWareEndpointConfiguration(String fileCabinetId, List<String> fileCabinetIds, String storeDialogId,
      List<String> storeDialogIds, String organizationId, List<String> organizationIds) {
    this.fileCabinetId = fileCabinetId;
    this.fileCabinetIds = fileCabinetIds;
    this.storeDialogId = storeDialogId;
    this.storeDialogIds = storeDialogIds;
    this.organizationId = organizationId;
    this.organizationIds = organizationIds;
  }

  public String getFileCabinetId() {
    return fileCabinetId;
  }

  public void setFileCabinetId(String fileCabinetId) {
    this.fileCabinetId = fileCabinetId;
  }

  public List<String> getFileCabinetIds() {
    return fileCabinetIds;
  }

  public void setFileCabinetIds(List<String> fileCabinetIds) {
    this.fileCabinetIds = fileCabinetIds;
  }

  public String getStoreDialogId() {
    return storeDialogId;
  }

  public void setStoreDialogId(String storeDialogId) {
    this.storeDialogId = storeDialogId;
  }

  public List<String> getStoreDialogIds() {
    return storeDialogIds;
  }

  public void setStoreDialogIds(List<String> storeDialogIds) {
    this.storeDialogIds = storeDialogIds;
  }

  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public List<String> getOrganizationIds() {
    return organizationIds;
  }

  public void setOrganizationIds(List<String> organizationIds) {
    this.organizationIds = organizationIds;
  }

  @Override
  public String toString() {
    return String.format("filecabinet: %s / storeDialogId: %s / organization: %s",
        Arrays.asList(fileCabinetId, fileCabinetIds),
        Arrays.asList(storeDialogId, storeDialogIds),
        Arrays.asList(organizationId, organizationIds));
  }
}
