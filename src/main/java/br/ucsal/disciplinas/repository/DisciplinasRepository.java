package br.ucsal.disciplinas.repository;

import br.ucsal.disciplinas.model.Disciplinas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinasRepository extends JpaRepository<Disciplinas, Long> {
        List<Disciplinas> findCursoById(Long id);
}
