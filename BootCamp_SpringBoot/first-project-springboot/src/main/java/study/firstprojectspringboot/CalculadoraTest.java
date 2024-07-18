package study.firstprojectspringboot;

import org.springframework.stereotype.Component;

// exemplo de objeto a ser instanciado, é necessário aqui onde temos acesso ao código fonte, a anotação @Component
@Component
public class CalculadoraTest {
    public int somar(int a, int b) {
        return a + b;
    }
}
