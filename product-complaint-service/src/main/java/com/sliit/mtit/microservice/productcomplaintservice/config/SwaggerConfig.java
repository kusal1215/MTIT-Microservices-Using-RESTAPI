package com.sliit.mtit.microservice.productcomplaintservice.config;

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
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.sliit.mtit.microservice"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }

      /*  private Predicate<String> postPaths() {
            return or(regex("/api/posts.*"), regex("/api/javainuse.*"));
        }*/

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Product Complaint Service - Spring Boot Swagger Configuration")
                .description("Java API reference for developers")
                .contact(new Contact("De Silva L. S. R. - IT18113914", "https://courseweb.sliit.lk/", "it18113914@my.sliit.lk")).license("Java License")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"").version("1.0").build();
    }


}
