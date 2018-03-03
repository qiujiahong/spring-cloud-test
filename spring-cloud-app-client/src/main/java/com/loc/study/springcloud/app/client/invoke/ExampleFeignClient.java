package com.loc.study.springcloud.app.client.invoke;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "loc-config", fallbackFactory = ExampleFeignClientFallBackFactory.class)
public interface ExampleFeignClient {

  @RequestMapping(value = "/cloud/config/configParam1", method = RequestMethod.GET)
  String getConfigParam1();
}
