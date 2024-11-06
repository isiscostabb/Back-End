
package com.Exercicio13.Exercicio13.repositories;

import com.Exercicio13.Exercicio13.models.JogadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Resp pela interação com tabela
@Repository
public interface JogadorRepository extends JpaRepository<JogadorModel, Long> {
}
