package study.firstprojectspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectSpringbootApplication.class, args);
    }
    // Classe principal onde "chama"/executa a aplicação
    /*
    No SpringBoot, é deixado de lado a instanciação por meio do "new Objeto", é utilizado as anotações @component,
    @bean, etc para sinalizar que é um objeto a ser instanciado pelo container pai.
    */
}
