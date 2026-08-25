package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Repository do Spring Data: fornece CRUD pronto para Transacao sem escrever SQL
@Repository
public interface TransacaoRepository extends CrudRepository<Transacao, Long> {
}
