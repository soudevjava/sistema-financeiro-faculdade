package com.api.financeiro.controllers;

import com.api.financeiro.dtos.DespesasDto;
import com.api.financeiro.entities.DespesasEntity;
import com.api.financeiro.services.DespesasService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(value = "*", maxAge = 3600)
@RequestMapping("/financeiro")
public class DespesasController {

    @Autowired
    private DespesasService despesasService;

    private static DespesasEntity setDespesaEntity(DespesasDto despesasDto) {
        var despesasEntiry = new DespesasEntity();
        BeanUtils.copyProperties(despesasDto, despesasEntiry);
        despesasEntiry.setData(LocalDateTime.now(ZoneId.of("UTC")));

        return despesasEntiry;
    }

    @PostMapping("/nova-despesa")
    public ResponseEntity<Object> novaDespesa(@RequestBody @Valid DespesasDto despesasDto) {
        return ResponseEntity.status(HttpStatus.OK).body(this.despesasService.criarNovaDespesa(setDespesaEntity(despesasDto)));
    }
}
