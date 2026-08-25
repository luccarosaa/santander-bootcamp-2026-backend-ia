package one.digitalinnovation.gof.model;

import io.swagger.v3.oas.annotations.media.Schema;

// Categorias aceitas para organizar receitas e despesas
@Schema(description = "Categoria da transacao: ALIMENTACAO, TRANSPORTE, MORADIA, SAUDE, EDUCACAO, LAZER, SALARIO ou OUTROS.")
public enum Categoria {
	ALIMENTACAO,
	TRANSPORTE,
	MORADIA,
	SAUDE,
	EDUCACAO,
	LAZER,
	SALARIO,
	OUTROS
}
