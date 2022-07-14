package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

/**
 * Class Data.
 */
public class Data {

  private final LocalDateTime data;

  public Data(LocalDateTime data) {
    this.data = data;
  }

  @JsonFormat(pattern = "EEEE, MMM dd, yyyy HH:mm:ss.SSS")
  public LocalDateTime getData() {
    return data;
  }
}
