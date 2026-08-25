package one.digitalinnovation.gof.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.TipoTransacao;
import one.digitalinnovation.gof.model.Transacao;
import one.digitalinnovation.gof.model.TransacaoRepository;
import one.digitalinnovation.gof.service.TransacaoService;

// Implementa a Facade de transacoes e usa o Repository para persistencia
@Service
public class TransacaoServiceImpl implements TransacaoService {

	// Spring Data JPA cria a implementacao concreta deste repositorio em runtime
	@Autowired
	private TransacaoRepository transacaoRepository;

	@Override
	public Iterable<Transacao> buscarTodas() {
		return transacaoRepository.findAll();
	}

	@Override
	public Transacao buscarPorId(Long id) {
		return transacaoRepository.findById(id).orElse(null);
	}

	@Override
	public void inserir(Transacao transacao) {
		transacaoRepository.save(transacao);
	}

	@Override
	public void atualizar(Long id, Transacao transacao) {
		// Garante que o registro salvo sera o mesmo indicado pela rota PUT
		transacao.setId(id);
		transacaoRepository.save(transacao);
	}

	@Override
	public void deletar(Long id) {
		transacaoRepository.deleteById(id);
	}

	@Override
	public BigDecimal calcularSaldo() {
		BigDecimal saldo = BigDecimal.ZERO;

		// Regra de negocio: receita aumenta o saldo; despesa reduz o saldo
		for (Transacao transacao : transacaoRepository.findAll()) {
			if (TipoTransacao.RECEITA.equals(transacao.getTipo())) {
				saldo = saldo.add(transacao.getValor());
			} else if (TipoTransacao.DESPESA.equals(transacao.getTipo())) {
				saldo = saldo.subtract(transacao.getValor());
			}
		}

		return saldo;
	}
}
