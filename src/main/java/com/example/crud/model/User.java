package com.example.crud.model;

import javax.persistence.Column;
//Pacote para tornar a classe uma entidade e seu correpondente em banco de dados
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Uso com parcimonia 
import lombok.Data;

// @Getter - Lombok gerar todos dos métodos get equivalentes as propriedades criadas
// @Setter - Lombok gera todos os métodos set equivalentes as propriedades criadas
@Data // Lombok gera todos os métodos get e set correspondentes as propriedades criadas, entre outros
@Entity
@Table(name = "Usuarios") // Podemos customizar nossas entidades na base de dados 

public class User {

    @Id // Indica Chave primária 
    @GeneratedValue(strategy = GenerationType.AUTO) // Indica autoincremento
    private Long id;

    @Column(name = "nameUser", length = 200, nullable = false) // Podemos e devemos caracterizar colunas
    private String name;

    @Column(name = "descrition", length = 10, nullable = true) // Podemos e devemos caracterizar colunas
    private String descrition;

}
