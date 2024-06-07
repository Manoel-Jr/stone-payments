package br.com.stone_payments_challenge.history.repositories;

import br.com.stone_payments_challenge.history.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {

    List<History> findByClientId(String clientId);
}
