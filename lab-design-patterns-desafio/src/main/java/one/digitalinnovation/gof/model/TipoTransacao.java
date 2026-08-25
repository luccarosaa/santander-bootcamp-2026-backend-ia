package one.digitalinnovation.gof.model;

import io.swagger.v3.oas.annotations.media.Schema;

// Define se a transacao entra ou sai do saldo
@Schema(description = "Tipo da transacao: RECEITA soma no saldo; DESPESA subtrai do saldo.")
public enum TipoTransacao {
	RECEITA,
	DESPESA
}
