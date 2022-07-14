package com.example.demo.service;

import com.example.demo.Calculadora;
import org.springframework.stereotype.Service;

/**
 * Class CalculadoraService.
 */
@Service
public class CalculadoraService {

  public Calculadora calcular(Integer primeiroValor, Integer segundoValor, String operacao) {
    return new Calculadora(primeiroValor, segundoValor, operacao);
  }
}
