package reflections;

import anotacoes.Entidade;
import anotacoes.Tabela;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflection {

    public static void main(String[] args) {

        Entidade entidade = new Entidade("NomeAleatorio");

        Class<?> tipoClasse = entidade.getClass();

        try {
            Method teste = tipoClasse.getMethod("getNome");
            System.out.println(teste.invoke(entidade));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        if (tipoClasse.isAnnotationPresent(Tabela.class)) {
            Tabela anotacaoDaClasse = tipoClasse.getAnnotation(Tabela.class);

            System.out.println(anotacaoDaClasse.nome());
        }


    }

}
