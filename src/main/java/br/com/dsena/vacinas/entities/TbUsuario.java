package br.com.dsena.vacinas.entities;

import javax.persistence.*;
import java.util.Date;

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
    private Date dataNascimento;

    //Getters and Seters
    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //Construtor com todos atributos como argumento
    public TbUsuario(Long idusuario, String nome, String email, String cpf, Date dataNascimento) {
        this.idusuario = idusuario;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    //Construtor sem argumentos
    public TbUsuario() {
    }
}
