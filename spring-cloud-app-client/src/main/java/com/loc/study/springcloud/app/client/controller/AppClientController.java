package com.loc.study.springcloud.app.client.controller;

import com.loc.study.springcloud.app.client.invoke.ExampleFeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/10/26.
 */
@RestController
@RequestMapping(value = "/client")
public class AppClientController {


  @Autowired
  private ExampleFeignClient exampleFeignClient;

  @GetMapping(value = "/app", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public String getConfigParam1() {
    return exampleFeignClient.getConfigParam1();
  }
}
