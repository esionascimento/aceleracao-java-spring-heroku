package com.example.demo.service;

import com.example.demo.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class DataService {
  public Data retornaDataAtual() {
    return new Data(LocalDateTime.now(ZoneId.of("UTC")));
  }
}
