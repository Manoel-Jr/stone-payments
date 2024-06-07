package br.com.stone_payments_challenge.transaction.repositories;

import br.com.stone_payments_challenge.transaction.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
