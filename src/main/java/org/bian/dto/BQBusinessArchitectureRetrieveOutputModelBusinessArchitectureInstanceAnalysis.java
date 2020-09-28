package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBusinessArchitectureRetrieveOutputModelBusinessArchitectureInstanceAnalysis
 */
public class BQBusinessArchitectureRetrieveOutputModelBusinessArchitectureInstanceAnalysis   {
  private Object businessArchitectureInstanceAnalysisRecord = null;

  private String businessArchitectureInstanceAnalysisReportType = null;

  private String businessArchitectureInstanceAnalysisParameters = null;

  private Object businessArchitectureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return businessArchitectureInstanceAnalysisRecord
  **/

  public Object getBusinessArchitectureInstanceAnalysisRecord() {
    return businessArchitectureInstanceAnalysisRecord;
  }

  public void setBusinessArchitectureInstanceAnalysisRecord(Object businessArchitectureInstanceAnalysisRecord) {
    this.businessArchitectureInstanceAnalysisRecord = businessArchitectureInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return businessArchitectureInstanceAnalysisReportType
  **/

  public String getBusinessArchitectureInstanceAnalysisReportType() {
    return businessArchitectureInstanceAnalysisReportType;
  }

  public void setBusinessArchitectureInstanceAnalysisReportType(String businessArchitectureInstanceAnalysisReportType) {
    this.businessArchitectureInstanceAnalysisReportType = businessArchitectureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return businessArchitectureInstanceAnalysisParameters
  **/

  public String getBusinessArchitectureInstanceAnalysisParameters() {
    return businessArchitectureInstanceAnalysisParameters;
  }

  public void setBusinessArchitectureInstanceAnalysisParameters(String businessArchitectureInstanceAnalysisParameters) {
    this.businessArchitectureInstanceAnalysisParameters = businessArchitectureInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return businessArchitectureInstanceAnalysisReport
  **/

  public Object getBusinessArchitectureInstanceAnalysisReport() {
    return businessArchitectureInstanceAnalysisReport;
  }

  public void setBusinessArchitectureInstanceAnalysisReport(Object businessArchitectureInstanceAnalysisReport) {
    this.businessArchitectureInstanceAnalysisReport = businessArchitectureInstanceAnalysisReport;
  }


}

