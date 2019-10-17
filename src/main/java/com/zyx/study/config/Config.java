package com.zyx.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author zyx
 * @name: Config
 * @description: TODO
 * @date 2019/10/1622:38
 */
public class Config {
    @Bean
    public LocalValidatorFactoryBean config(){
        return new LocalValidatorFactoryBean();
    }
}
