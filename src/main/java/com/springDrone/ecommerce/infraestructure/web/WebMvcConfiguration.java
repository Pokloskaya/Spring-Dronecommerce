package com.springDrone.ecommerce.infraestructure.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration //<.> ensures Spring Boot will find this class when scanning
public class WebMvcConfiguration implements WebMvcConfigurer { //<.>
    @Bean
    public LocaleResolver localeResolver() {
        return new CookieLocaleResolver(); //<.> store the selected language in a browser cookie
    }

    @Bean
    public LocaleChangeInterceptor localeInterceptor() { //<.>
        LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
        localeInterceptor.setParamName("lang");
        return localeInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) { //<.>
        registry.addInterceptor(localeInterceptor());
    }
}