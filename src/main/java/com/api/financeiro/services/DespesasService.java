package com.api.financeiro.services;

import com.api.financeiro.entities.DespesasEntity;
import com.api.financeiro.repositories.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DespesasService {

    @Autowired
    private DespesasRepository despesasRepository;

    @Transactional
    public DespesasEntity criarNovaDespesa(DespesasEntity despesasEntity) {
        return this.despesasRepository.save(despesasEntity);
    }
}
