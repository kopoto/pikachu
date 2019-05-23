package com.kopoto.yhh.pikachu;


import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnExpression(PikachuAutoConfiguration.EXCLUDE_SPI_PROVIDER) // 本地实现SPI时避免 SPI 的实例化
@EnableFeignClients(basePackageClasses = {PikachuAutoConfiguration.class})
public class PikachuAutoConfiguration {
    /**
     * 服务名
     */
    public final static String FEIGN_CLIENT_NAME = "pikachu-server";
    static final String EXCLUDE_SPI_PROVIDER = "#{'${spring.application.name}'!='pikachu-server'}";
}

