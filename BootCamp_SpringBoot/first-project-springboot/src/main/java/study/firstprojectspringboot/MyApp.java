package study.firstprojectspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private CalculadoraTest calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("A soma dos valores 3 e 7 é de "+calculadora.somar(3,7));
    }
}
