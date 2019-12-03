package com.api.service1.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.api.service1"))
                .paths(PathSelectors.regex("/rest.*")).build();
    }

    private ApiInfo metaApiInfo() {
        List<VendorExtension> vendorExtensions = new ArrayList<>();
        ApiInfo api = new ApiInfo("Service Title", "API description", "1.0", "termsOfServiceUrl",
                new Contact("name", "", "email"), "licenseNo", "licenseUrl", vendorExtensions);
        return api;
    }

}