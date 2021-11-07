package org.serratec.backend.repository;

import org.serratec.backend.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AlunoRepository  extends JpaRepository<Aluno, Long>{

	
	
	Aluno findById(long id);
}
