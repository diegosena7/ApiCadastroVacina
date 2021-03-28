package br.com.dsena.vacinas.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/*
Utilizado as anotações do Lombok, @Id onde é referenciada a PK e @Column onde é referenciada o nome da coluna da tabela
A @Entity referencia a classe como uma Entidade e na PK usamos a anotação para gerar automaticamente a sequência do Id
do tipo IDENTITY, através da anotação @GeneratedValue.
Foi utilizado a anotação @JsonFormat para formatar a data recebida para o padrão brasileiro (dd/mm/yyyy).
Gerado getters and seters através da anotação @Data com o auxílio do Lombok
 */
@Data
@Entity
@Table(name="TbUsuario")
public class TbUsuario {
    @Id
    @Column(name="id_usuario")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idusuario;

    @Column(name="nome_usuario")
    private String nome;

    @Column(name="email_usuario")
    private String email;

    @Column(name="cpf")
    private String cpf;

    @Column(name="data_nascimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;
}
