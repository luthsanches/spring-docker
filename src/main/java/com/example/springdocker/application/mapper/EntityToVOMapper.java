package com.example.springdocker.application.mapper;

import com.example.springdocker.domain.entities.PessoaEntity;
import com.example.springdocker.domain.model.valueobjects.PessoaVO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.Arrays;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, imports = {Arrays.class})
public interface EntityToVOMapper {


    PessoaVO toPessoaVO(PessoaEntity p);

}
