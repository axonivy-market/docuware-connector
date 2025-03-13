package com.axonivy.connector.docuware.connector;

import java.util.Arrays;
import java.util.List;

public class DocuWareEndpointConfiguration {

  private String fileCabinetId;
  private List<String> fileCabinetIds;
  private String storeDialogId;

  public DocuWareEndpointConfiguration() { }

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

  @Override
  public String toString() {
    return String.format("filecabinet: %s / storeDialogId: %s", Arrays.asList(fileCabinetId, fileCabinetIds),
        storeDialogId);
  }
}
