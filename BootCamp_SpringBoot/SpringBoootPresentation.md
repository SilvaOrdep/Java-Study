# <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg" width="30" alt="Spring Logo"> Spring Boot Study

Projetos feitos em springboot, aplicando os principais conceitos e fundamentos.
## Conteúdo

O conteúdo deste repositório inclui:

- Introdução ao Spring Framework
- Configuração Inicial do Projeto Spring Boot
- Injeção de Dependência e Controle Inverso (IoC)
- Beans e Componentes
- Spring Boot Starters
- Anotações Comuns (como @Autowired, @Component, @Service, @Repository)
- Controladores REST (@RestController)
- Configuração de Aplicações (application.properties e application.yml)
- Segurança com Spring Security
- Acesso a Dados com Spring Data JPA
- Tratamento de Exceções
- Testes com Spring Boot
- ... (repositório constantemente atualizado e incrementado)

## Introdução ao Spring Framework

Spring é um framework poderoso e versátil que oferece suporte abrangente para o desenvolvimento de aplicações Java.

## Beans 

No Spring, um Bean é um objeto que é instanciado, montado e gerenciado pelo Spring IoC Container.

### Anotações Comuns:

- **@Component**: Indica que uma classe é um componente Spring. Pode ser usada para autodetecção de classes e injeção de dependência.
- **@Service**: Uma especialização de @Component. Indica que a classe é um serviço, que geralmente contém lógica de negócios.
- **@Repository**: Outra especialização de @Component. Indica que a classe é um repositório de dados, onde são feitas as operações de persistência.
- **@Controller**: Indica que a classe é um controlador Spring MVC, que trata requisições HTTP.

## Configuração Inicial do Projeto Spring Boot

Para criar um projeto Spring Boot, você pode usar o Spring Initializr (https://start.spring.io/) ou na própria IDE Intellij Idea. 

