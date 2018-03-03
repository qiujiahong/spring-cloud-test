package com.loc.study.springcloud.app.controller;

import com.loc.study.springcloud.app.config.CloudConf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/10/19.
 */
@RefreshScope
@RestController
@RequestMapping(value = "/cloud/config")
@EnableConfigurationProperties(CloudConf.class)
public class CloudConfigController {

  @Value("${loc.cloud.controller:param3}")
  private String param3;

  @Autowired
  private CloudConf cloudConf;

  @GetMapping(value = "/configParam1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public String getConfigParam1() {
    return cloudConf.getParam1();
  }

  @GetMapping(value = "/configParam2", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public int getConfigParam2() {
    return cloudConf.getParam2();
  }

  @GetMapping(value = "/configParam3", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public String getConfigParam3() {
    return param3;
  }
}
