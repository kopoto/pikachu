package com.kopoto.yhh.pikachu.spi;

import com.kopoto.yhh.pikachu.PikachuAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient(value = PikachuAutoConfiguration.FEIGN_CLIENT_NAME)
public interface TestSpi {
    @RequestMapping(value = "/mono", method = RequestMethod.GET)
    int test();
}