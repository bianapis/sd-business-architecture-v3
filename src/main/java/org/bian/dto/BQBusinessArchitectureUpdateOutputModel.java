package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBusinessArchitectureUpdateOutputModel
 */
public class BQBusinessArchitectureUpdateOutputModel   {
  private String businessArchitecturePreconditions = null;

  private String businessArchitectureSpecificationSchedule = null;

  private String businessArchitectureVersionNumber = null;

  private String businessArchitectureServiceType = null;

  private String businessArchitectureServiceDescription = null;

  private String businessArchitectureServiceInputsandOuputs = null;

  private String businessArchitectureServiceWorkProduct = null;

  private String businessArchitectureServiceName = null;

  private String businessArchitectureUpdateActionTaskReference = null;

  private Object businessArchitectureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return businessArchitecturePreconditions
  **/

  public String getBusinessArchitecturePreconditions() {
    return businessArchitecturePreconditions;
  }

  public void setBusinessArchitecturePreconditions(String businessArchitecturePreconditions) {
    this.businessArchitecturePreconditions = businessArchitecturePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return businessArchitectureSpecificationSchedule
  **/

  public String getBusinessArchitectureSpecificationSchedule() {
    return businessArchitectureSpecificationSchedule;
  }

  public void setBusinessArchitectureSpecificationSchedule(String businessArchitectureSpecificationSchedule) {
    this.businessArchitectureSpecificationSchedule = businessArchitectureSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return businessArchitectureVersionNumber
  **/

  public String getBusinessArchitectureVersionNumber() {
    return businessArchitectureVersionNumber;
  }

  public void setBusinessArchitectureVersionNumber(String businessArchitectureVersionNumber) {
    this.businessArchitectureVersionNumber = businessArchitectureVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return businessArchitectureServiceType
  **/

  public String getBusinessArchitectureServiceType() {
    return businessArchitectureServiceType;
  }

  public void setBusinessArchitectureServiceType(String businessArchitectureServiceType) {
    this.businessArchitectureServiceType = businessArchitectureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return businessArchitectureServiceDescription
  **/

  public String getBusinessArchitectureServiceDescription() {
    return businessArchitectureServiceDescription;
  }

  public void setBusinessArchitectureServiceDescription(String businessArchitectureServiceDescription) {
    this.businessArchitectureServiceDescription = businessArchitectureServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return businessArchitectureServiceInputsandOuputs
  **/

  public String getBusinessArchitectureServiceInputsandOuputs() {
    return businessArchitectureServiceInputsandOuputs;
  }

  public void setBusinessArchitectureServiceInputsandOuputs(String businessArchitectureServiceInputsandOuputs) {
    this.businessArchitectureServiceInputsandOuputs = businessArchitectureServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return businessArchitectureServiceWorkProduct
  **/

  public String getBusinessArchitectureServiceWorkProduct() {
    return businessArchitectureServiceWorkProduct;
  }

  public void setBusinessArchitectureServiceWorkProduct(String businessArchitectureServiceWorkProduct) {
    this.businessArchitectureServiceWorkProduct = businessArchitectureServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return businessArchitectureServiceName
  **/

  public String getBusinessArchitectureServiceName() {
    return businessArchitectureServiceName;
  }

  public void setBusinessArchitectureServiceName(String businessArchitectureServiceName) {
    this.businessArchitectureServiceName = businessArchitectureServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return businessArchitectureUpdateActionTaskReference
  **/

  public String getBusinessArchitectureUpdateActionTaskReference() {
    return businessArchitectureUpdateActionTaskReference;
  }

  public void setBusinessArchitectureUpdateActionTaskReference(String businessArchitectureUpdateActionTaskReference) {
    this.businessArchitectureUpdateActionTaskReference = businessArchitectureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return businessArchitectureUpdateActionTaskRecord
  **/

  public Object getBusinessArchitectureUpdateActionTaskRecord() {
    return businessArchitectureUpdateActionTaskRecord;
  }

  public void setBusinessArchitectureUpdateActionTaskRecord(Object businessArchitectureUpdateActionTaskRecord) {
    this.businessArchitectureUpdateActionTaskRecord = businessArchitectureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

