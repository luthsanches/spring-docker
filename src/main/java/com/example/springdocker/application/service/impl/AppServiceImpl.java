package com.example.springdocker.application.service.impl;

import com.example.springdocker.application.mapper.EntityToVOMapper;
import com.example.springdocker.application.service.AppService;
import com.example.springdocker.domain.model.valueobjects.PessoaVO;
import com.example.springdocker.infra.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    PessoaRepository repository;

    @Autowired
    EntityToVOMapper mapper;

    public PessoaVO consulta() {

        var pessoa = repository.findById(1);

        if (pessoa.isPresent()) {
            return mapper.toPessoaVO(pessoa.get());
        }
        return null;
    }


}
