package com.greenfox.seed0forever.p2pchat.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class statusOkOrErrorRestMessage implements RestMessageObject {

  private String status;
  private String message;

  public statusOkOrErrorRestMessage() {
  }

  public statusOkOrErrorRestMessage(String status, String message) {
    this.status = status;
    this.message = message;
  }

  @Override
  public String toString() {
    return "ErrorRestMessage{" +
            "status='" + status + '\'' +
            ", message='" + message + '\'' +
            '}';
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}