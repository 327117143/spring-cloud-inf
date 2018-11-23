package com.kolema.infmybatisplus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                // 扫描文档
                .apis(RequestHandlerSelectors.basePackage("com.kolema.infmybatisplus"))
                // 扫描请求路径
                .paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().
                title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("spring boot , swagger2")
                .termsOfServiceUrl("https://gitee.com/MSXR/springcloud-demo/")
                .contact(new Contact("xr", "", "414329841@qq.com"))
                .version("1.0.0")
                .build();
    }

}
