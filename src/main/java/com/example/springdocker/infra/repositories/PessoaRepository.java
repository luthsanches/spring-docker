package com.example.springdocker.infra.repositories;

import com.example.springdocker.domain.entities.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity,Integer> {
}
