package br.com.springschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springschool.domain.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {

}
