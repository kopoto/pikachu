package com.kopoto.yhh.pikachu.spi;

import com.kopoto.yhh.pikachu.PikachuAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

//@FeignClient(value = PikachuAutoConfiguration.FEIGN_CLIENT_NAME)
public interface HelloSpi {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    int test();
}
