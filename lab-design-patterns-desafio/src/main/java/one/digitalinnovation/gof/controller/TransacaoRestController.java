package one.digitalinnovation.gof.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import one.digitalinnovation.gof.model.Transacao;
import one.digitalinnovation.gof.service.TransacaoService;

// Camada REST: recebe as requisicoes HTTP e delega as regras para o service
@RestController
@RequestMapping("transacoes")
public class TransacaoRestController {

	// O Spring injeta a implementacao de TransacaoService como um bean singleton
	@Autowired
	private TransacaoService transacaoService;

	// Lista todas as transacoes cadastradas
	@Operation(
			tags = "Transacoes - Consultas (R)",
			summary = "Listar todas as transacoes",
			description = "Retorna todas as receitas e despesas cadastradas.")
	@GetMapping
	public ResponseEntity<Iterable<Transacao>> buscarTodas() {
		return ResponseEntity.ok(transacaoService.buscarTodas());
	}

	// Busca uma transacao pelo identificador informado na URL
	@Operation(
			tags = "Transacoes - Consultas (R)",
			summary = "Buscar uma transacao por id",
			description = "Retorna apenas a transacao que possui o id informado na rota.")
	@GetMapping("/{id}")
	public ResponseEntity<Transacao> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(transacaoService.buscarPorId(id));
	}

	// Cria uma nova transacao a partir do JSON enviado no corpo da requisicao
	@Operation(
			tags = "Transacoes - Escrita (CUD)",
			summary = "Criar uma transacao",
			description = "Cadastra uma nova receita ou despesa. O id e gerado automaticamente pelo banco.",
			requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
					content = @Content(
							schema = @Schema(implementation = Transacao.class),
							examples = @ExampleObject(value = """
									{
									  "descricao": "Salario mensal",
									  "valor": 2500.00,
									  "tipo": "RECEITA",
									  "categoria": "SALARIO",
									  "data": "2026-08-25"
									}
									"""))))
	@PostMapping
	public ResponseEntity<Transacao> inserir(@RequestBody Transacao transacao) {
		transacaoService.inserir(transacao);
		return ResponseEntity.ok(transacao);
	}

	// Atualiza a transacao indicada pelo id da URL
	@Operation(
			tags = "Transacoes - Escrita (CUD)",
			summary = "Atualizar uma transacao",
			description = "Atualiza os dados da transacao indicada pelo id da rota.",
			requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
					content = @Content(
							schema = @Schema(implementation = Transacao.class),
							examples = @ExampleObject(value = """
									{
									  "descricao": "Mercado",
									  "valor": 180.50,
									  "tipo": "DESPESA",
									  "categoria": "ALIMENTACAO",
									  "data": "2026-08-25"
									}
									"""))))
	@PutMapping("/{id}")
	public ResponseEntity<Transacao> atualizar(@PathVariable Long id, @RequestBody Transacao transacao) {
		transacaoService.atualizar(id, transacao);
		return ResponseEntity.ok(transacao);
	}

	// Remove a transacao indicada pelo id da URL
	@Operation(
			tags = "Transacoes - Escrita (CUD)",
			summary = "Remover uma transacao",
			description = "Exclui a transacao indicada pelo id da rota.")
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		transacaoService.deletar(id);
		return ResponseEntity.ok().build();
	}

	// Retorna o saldo final: receitas somadas menos despesas
	@Operation(
			tags = "Transacoes - Consultas (R)",
			summary = "Consultar saldo",
			description = "Calcula o saldo total somando RECEITA e subtraindo DESPESA.")
	@GetMapping("/saldo")
	public ResponseEntity<BigDecimal> calcularSaldo() {
		return ResponseEntity.ok(transacaoService.calcularSaldo());
	}
}
