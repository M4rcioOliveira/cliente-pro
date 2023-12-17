package com.totvs.clientepro.model.entity;

import com.totvs.clientepro.enums.TipoTelefone;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
//@Table(name = "telefone")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Telefone {

    @Id
    @UuidGenerator
    private String id;
    @Column(unique = true, nullable = false)
    private String numero;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoTelefone tipo;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

}
