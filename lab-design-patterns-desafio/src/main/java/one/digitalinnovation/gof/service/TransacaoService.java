package one.digitalinnovation.gof.service;

import java.math.BigDecimal;

import one.digitalinnovation.gof.model.Transacao;

// Facade da aplicacao: concentra as operacoes de transacao em uma unica porta para que o controller nao precise conhecer detalhes do repositorio
public interface TransacaoService {

	Iterable<Transacao> buscarTodas();

	Transacao buscarPorId(Long id);

	void inserir(Transacao transacao);

	void atualizar(Long id, Transacao transacao);

	void deletar(Long id);

	BigDecimal calcularSaldo();
}
