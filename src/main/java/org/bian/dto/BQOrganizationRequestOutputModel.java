package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrganizationRequestOutputModel
 */
public class BQOrganizationRequestOutputModel   {
  private String organizationRequestActionTaskReference = null;

  private Object organizationRequestActionTaskRecord = null;

  private String organizationRequestRecordReference = null;

  private Object requestResponseRecord = null;

  private String applicationArchitecturePreconditions = null;

  private String applicationArchitectureSpecificationSchedule = null;

  private String applicationArchitectureVersionNumber = null;

  private String applicationArchitectureServiceType = null;

  private String applicationArchitectureServiceDescription = null;

  private String applicationArchitectureServiceInputsandOuputs = null;

  private String applicationArchitectureServiceWorkProduct = null;

  private String applicationArchitectureServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Organization instance request service call 
   * @return organizationRequestActionTaskReference
  **/

  public String getOrganizationRequestActionTaskReference() {
    return organizationRequestActionTaskReference;
  }

  public void setOrganizationRequestActionTaskReference(String organizationRequestActionTaskReference) {
    this.organizationRequestActionTaskReference = organizationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return organizationRequestActionTaskRecord
  **/

  public Object getOrganizationRequestActionTaskRecord() {
    return organizationRequestActionTaskRecord;
  }

  public void setOrganizationRequestActionTaskRecord(Object organizationRequestActionTaskRecord) {
    this.organizationRequestActionTaskRecord = organizationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Organization service request record 
   * @return organizationRequestRecordReference
  **/

  public String getOrganizationRequestRecordReference() {
    return organizationRequestRecordReference;
  }

  public void setOrganizationRequestRecordReference(String organizationRequestRecordReference) {
    this.organizationRequestRecordReference = organizationRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return applicationArchitecturePreconditions
  **/

  public String getApplicationArchitecturePreconditions() {
    return applicationArchitecturePreconditions;
  }

  public void setApplicationArchitecturePreconditions(String applicationArchitecturePreconditions) {
    this.applicationArchitecturePreconditions = applicationArchitecturePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return applicationArchitectureSpecificationSchedule
  **/

  public String getApplicationArchitectureSpecificationSchedule() {
    return applicationArchitectureSpecificationSchedule;
  }

  public void setApplicationArchitectureSpecificationSchedule(String applicationArchitectureSpecificationSchedule) {
    this.applicationArchitectureSpecificationSchedule = applicationArchitectureSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return applicationArchitectureVersionNumber
  **/

  public String getApplicationArchitectureVersionNumber() {
    return applicationArchitectureVersionNumber;
  }

  public void setApplicationArchitectureVersionNumber(String applicationArchitectureVersionNumber) {
    this.applicationArchitectureVersionNumber = applicationArchitectureVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return applicationArchitectureServiceType
  **/

  public String getApplicationArchitectureServiceType() {
    return applicationArchitectureServiceType;
  }

  public void setApplicationArchitectureServiceType(String applicationArchitectureServiceType) {
    this.applicationArchitectureServiceType = applicationArchitectureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return applicationArchitectureServiceDescription
  **/

  public String getApplicationArchitectureServiceDescription() {
    return applicationArchitectureServiceDescription;
  }

  public void setApplicationArchitectureServiceDescription(String applicationArchitectureServiceDescription) {
    this.applicationArchitectureServiceDescription = applicationArchitectureServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return applicationArchitectureServiceInputsandOuputs
  **/

  public String getApplicationArchitectureServiceInputsandOuputs() {
    return applicationArchitectureServiceInputsandOuputs;
  }

  public void setApplicationArchitectureServiceInputsandOuputs(String applicationArchitectureServiceInputsandOuputs) {
    this.applicationArchitectureServiceInputsandOuputs = applicationArchitectureServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return applicationArchitectureServiceWorkProduct
  **/

  public String getApplicationArchitectureServiceWorkProduct() {
    return applicationArchitectureServiceWorkProduct;
  }

  public void setApplicationArchitectureServiceWorkProduct(String applicationArchitectureServiceWorkProduct) {
    this.applicationArchitectureServiceWorkProduct = applicationArchitectureServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return applicationArchitectureServiceName
  **/

  public String getApplicationArchitectureServiceName() {
    return applicationArchitectureServiceName;
  }

  public void setApplicationArchitectureServiceName(String applicationArchitectureServiceName) {
    this.applicationArchitectureServiceName = applicationArchitectureServiceName;
  }


}

