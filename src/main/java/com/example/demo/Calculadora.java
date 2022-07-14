package com.example.demo;

/**
 * Class calculadora.
 */
public class Calculadora {
  private Integer valor;

  public Calculadora(Integer primeiroValor, Integer segundoValor, String operacao) {
    this.valor = calcular(primeiroValor, segundoValor, operacao);
  }

  private Integer calcular(Integer primeiroValor, Integer segundoValor, String operacao) {
    if (segundoValor == 0) {
      return 0;
    }
    switch (operacao) {
      case "ADICAO":
        return primeiroValor + segundoValor;
      case "SUBTRACAO":
        return primeiroValor - segundoValor;
      case "MULTIPLICACAO":
        return primeiroValor * segundoValor;
      case "DIVISAO":
        return primeiroValor / segundoValor;
      default:
        return 0;
    }
  }

  public void setValor(Integer valor) {
    this.valor = valor;
  }

  public Integer getValor() {
    return this.valor;
  }
}