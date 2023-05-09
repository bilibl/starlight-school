package cn.lc.starlight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.MediaTypes;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 */
@Configuration
@EnableSwagger2
public class SwaggerApp {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("cn.lc.starlight.sys.controller"))
                //所有的controller
                //.apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .consumes(Collections.singleton(MediaType.APPLICATION_FORM_URLENCODED_VALUE));
//        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
    }
    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
               // .title("Spring Boot 使用 Swagger2 构建RESTful API")
                //创建人
                //.contact(new Contact("Bryan", "http://blog.bianxh.top/", ""))
                //版本号
               // .version("1.0")
                //描述
               // .description("API 描述")
                .build();
    }
}