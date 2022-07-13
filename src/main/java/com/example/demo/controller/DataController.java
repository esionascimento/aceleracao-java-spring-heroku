package com.example.demo.controller;

import com.example.demo.Data;
import com.example.demo.service.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

  private final DataService dataService;

  public DataController(DataService dataService) {
    this.dataService = dataService;
  }

  @GetMapping
  public Data retornaDataAtual() {
    return dataService.retornaDataAtual();
  }
}
