package com.example.demo.service;

import com.example.demo.Data;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.springframework.stereotype.Service;

/**
 * Class DataService.
 */
@Service
public class DataService {
  public Data retornaDataAtual() {
    return new Data(LocalDateTime.now(ZoneId.of("UTC")));
  }
}
