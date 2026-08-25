package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.tags.Tag;

// Ponto de entrada da API. A anotacao habilita a configuracao automatica, o scan de componentes e o bootstrap do Spring Boot
@SpringBootApplication
@OpenAPIDefinition(tags = {
		@Tag(name = "Transacoes - Consultas (R)", description = "Operacoes de leitura: listar, buscar por id e consultar saldo."),
		@Tag(name = "Transacoes - Escrita (CUD)", description = "Operacoes que alteram dados: criar, atualizar e remover.")
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
