package com.loc.study.springcloud.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * Created on 2017/10/19.
 */
@Configuration
@RefreshScope
@Data
@ConfigurationProperties(prefix = "loc.cloud.config")
public class CloudConf {
  String param1;
  int param2;
}
