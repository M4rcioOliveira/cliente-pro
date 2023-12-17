package com.totvs.clientepro.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
//@Table(name = "endereco")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Endereco {

    @Id
    @UuidGenerator
    private String id;
    @Column(nullable = false)
    private String bairro;
    @Column(nullable = false)
    private String cep;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String uf;
    private String numero;
    private String complemento;

}
