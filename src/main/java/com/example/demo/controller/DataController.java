package com.example.demo.controller;

import com.example.demo.Calculadora;
import com.example.demo.Data;
import com.example.demo.service.CalculadoraService;
import com.example.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class DataController.
 */
@RestController
public class DataController {
  @Autowired
  private CalculadoraService service;
  private final DataService dataService;

  public DataController(DataService dataService) {
    this.dataService = dataService;
  }

  @GetMapping("/")
  public Calculadora calcular(@RequestParam Integer primeiroValor,
                              @RequestParam Integer segundoValor, @RequestParam String operacao) {

    return service.calcular(primeiroValor, segundoValor, operacao);
  }

  @GetMapping("/data")
  public Data retornaDataAtual() {
    return dataService.retornaDataAtual();
  }
}
