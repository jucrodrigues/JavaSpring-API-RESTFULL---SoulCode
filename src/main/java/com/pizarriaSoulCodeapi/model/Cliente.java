package com.pizarriaSoulCodeapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length= 100)
    private String nome;

    @Column(length= 100)
    private String telefone;

    @Column(length= 200)
    private String endereco;

    @Column(length= 30)
    private String login;

    @Column(length= 30)
    private String senha;

//    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
//    private List<Pedido> pedidos;


}
