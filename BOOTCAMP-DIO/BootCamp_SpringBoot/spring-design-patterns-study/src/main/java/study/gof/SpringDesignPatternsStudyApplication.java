package study.gof;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@OpenAPIDefinition(info = @Info(title = "Swagger OpenApi", version = "1", description = "API desenvolvida para testes do OpenApi"))
@SpringBootApplication
public class SpringDesignPatternsStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDesignPatternsStudyApplication.class, args);
    }

}
