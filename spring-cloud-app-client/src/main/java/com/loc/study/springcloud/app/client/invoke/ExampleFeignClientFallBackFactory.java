package com.loc.study.springcloud.app.client.invoke;


import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class ExampleFeignClientFallBackFactory implements FallbackFactory<ExampleFeignClient> {

  @Override
  public ExampleFeignClient create(Throwable throwable) {
    return () -> "feign call fail";
  }
}
