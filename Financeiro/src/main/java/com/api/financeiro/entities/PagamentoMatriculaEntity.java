package com.api.financeiro.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PAGAMENTO_MATRICULA")
public class PagamentoMatriculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "matricula_id", nullable = false)
    private UUID matriculaId;

    @Column(name = "curso_id", nullable = false)
    private UUID cursoId;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @Column(name = "data", nullable = false)
    private LocalDateTime data;

}
