package br.com.springschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springschool.domain.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
