# AplicacaoTesteDeSoftware

## Descrição
Este projeto é uma aplicação Spring Boot que fornece uma API REST para operações básicas de calculadora, como soma, subtração, multiplicação e divisão. A aplicação também inclui tratamento global de exceções e testes unitários e de integração.

## Dependências
As principais dependências utilizadas neste projeto são:

- **Spring Boot Starter**: Fornece a base para a aplicação Spring Boot.
- **Spring Boot Starter Web**: Inclui as bibliotecas necessárias para criar APIs REST.
- **Spring Boot Starter Test**: Inclui bibliotecas para testes unitários e de integração.

O arquivo `pom.xml` contém todas as dependências necessárias para o projeto.

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```
## Estrutura do Projeto
#### `AplicacaoTesteDeSoftwareApplication.java`
Esta é a classe principal que inicia a aplicação Spring Boot.
```java
@SpringBootApplication
public class AplicacaoTesteDeSoftware {
    public static void main(String[] args) {
        SpringApplication.run(AplicacaoTesteDeSoftware.class, args);
    }
}
```

#### `CalculadoraService.java`
Esta classe fornece os métodos de serviço para operações de calculadora.
```java
@SpringBootApplication
public class AplicacaoTesteDeSoftware {
    public static void main(String[] args) {
        SpringApplication.run(AplicacaoTesteDeSoftware.class, args);
    }
}
```

#### `CalculadoraController.java`
Este controlador expõe os endpoints da API REST para as operações de calculadora.
```java
@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
    @Autowired
    private CalculadoraService calculadoraService;
    
    @GetMapping("/soma")
    public ResponseEntity<Integer> soma(@RequestParam int a, @RequestParam int b) {
        int resultado = calculadoraService.soma(a, b);
        return ResponseEntity.ok(resultado);
    }
    
    @GetMapping("/divisao")
    public ResponseEntity<Double> divisao(@RequestParam int a, @RequestParam int b) {
        double resultado = calculadoraService.divide(a, b);
        return ResponseEntity.ok(resultado);
    }
}
```

## Testes
### Unitários
#### `CalculadoraServiceTest.java`
Testes unitários para os métodos do CalculadoraService.
```java
public class CalculadoraServiceTest {
    private final CalculadoraService calculatorService = new CalculadoraService();
    
    @Test
    void testSoma() {
        assertEquals(5, calculatorService.soma(2, 3));
    }
    
    @Test
    void testSubtrai() {
        assertEquals(1, calculatorService.subtrai(3, 2));
    }
    
    @Test
    void testMultiplica() {
        assertEquals(6, calculatorService.multiplica(2, 3));
    }
    
    @Test
    void testDivide() {
        assertEquals(2.5, calculatorService.divide(5, 2), 0.0001);
    }
    
    @Test
    void testDividePorZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        calculatorService.divide(5, 0);
        });
        assertEquals("Divisão por zero", exception.getMessage());
    }
}
```

### Integração
#### `CalculadoraControllerIntegrationTest.java`
Testes de integração para os endpoints do CalculadoraController.
```java
@SpringBootTest
@AutoConfigureMockMvc
public class CalculadoraControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    void testSomaEndpoint() throws Exception {
        mockMvc.perform(get("/api/calculadora/soma")
        .param("a", "4")
        .param("b", "5"))
        .andExpect(status().isOk())
        .andExpect(content().string("9"));
    }
    
    @Test
    void testDivisaoEndpoint() throws Exception {
        mockMvc.perform(get("/api/calculadora/divisao")
        .param("a", "5")
        .param("b", "2"))
        .andExpect(status().isOk())
        .andExpect(content().string("2.5"));
    }
    
    @Test
    void testDivisaoPorZeroEndpoint() throws Exception {
    mockMvc.perform(get("/api/calculadora/divisao")
        .param("a", "5")
        .param("b", "0"))
        .andExpect(status().isBadRequest())
        .andExpect(content().string("Divisão por zero"));
    }
}
```

