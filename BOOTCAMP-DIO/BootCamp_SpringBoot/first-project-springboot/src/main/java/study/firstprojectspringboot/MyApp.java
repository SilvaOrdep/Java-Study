package study.firstprojectspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Classe com a interface CommandLineRunner que serve como se fosse o "sout" de um código simples em Java
@Component
public class MyApp implements CommandLineRunner {
    //@Autowired serve como indicação de injeção
    @Autowired
    private CalculadoraTest calculadora;

    //Classe de execução herdada da interface de Run
    @Override
    public void run(String... args) throws Exception {
        System.out.println("A soma dos valores 3 e 7 é de "+calculadora.somar(3,7));
    }
}
