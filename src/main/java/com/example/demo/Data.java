package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class Data {

  private final LocalDateTime data;

  public Data(LocalDateTime data) {
    this.data = data;
  }

  @JsonFormat(pattern = "EEEE, MMM dd, yyyy HH:mm:ss a")
  public LocalDateTime getData() {
    return data;
  }
}
