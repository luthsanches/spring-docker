package com.example.springdocker.domain.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PESSOA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaEntity {
    @Id
    private Integer id;

    private String nome;

}
