package one.digitalinnovation.gof.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import io.swagger.v3.oas.annotations.media.Schema;

// Entidade JPA que representa uma movimentacao financeira no banco de dados.
@Entity
@Schema(description = "Transacao financeira usada para cadastrar receitas e despesas.")
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "Identificador gerado automaticamente pelo banco.", accessMode = Schema.AccessMode.READ_ONLY)
	private Long id;
	@Schema(example = "Salario mensal")
	private String descricao;
	@Schema(example = "2500.00")
	private BigDecimal valor;

	// Enum salvo como texto para manter o banco legivel: RECEITA ou DESPESA.
	@Enumerated(EnumType.STRING)
	@Schema(description = "Use RECEITA quando entra dinheiro ou DESPESA quando sai dinheiro.", example = "RECEITA")
	private TipoTransacao tipo;

	// Enum salvo como texto para facilitar leitura e manutencao dos dados.
	@Enumerated(EnumType.STRING)
	@Schema(description = "Categoria usada para organizar a transacao.", example = "SALARIO")
	private Categoria categoria;

	@Schema(example = "2026-08-25")
	private LocalDate data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoTransacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransacao tipo) {
		this.tipo = tipo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
}
