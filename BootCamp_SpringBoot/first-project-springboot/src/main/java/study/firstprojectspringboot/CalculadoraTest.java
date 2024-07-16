package study.firstprojectspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraTest {
    public int somar(int a, int b) {
        return a + b;
    }
}
