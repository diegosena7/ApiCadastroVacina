package br.com.dsena.vacinas.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="tb_cadastro_aplicadao_vacina")
public class TbCadastroAplicacaoVacinas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_vacina;

    @Column(name="nome_vacina", nullable = false)
    private String nomeVacina;

    @Column(name="email_usuario", nullable = false, updatable = false)
    private String emailUsuario;

    @Column(name="data_vacina", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVacina;

    public Integer getId_vacina() {
        return id_vacina;
    }

    public void setId_vacina(Integer id_vacina) {
        this.id_vacina = id_vacina;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Date getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(Date dataVacina) {
        this.dataVacina = dataVacina;
    }

    //Construtor com todos atributos como argumento
    public TbCadastroAplicacaoVacinas(Integer id_vacina, String nomeVacina, String emailUsuario, Date dataVacina) {
        this.id_vacina = id_vacina;
        this.nomeVacina = nomeVacina;
        this.emailUsuario = emailUsuario;
        this.dataVacina = dataVacina;
    }

    //Construtor sem argumentos
    public TbCadastroAplicacaoVacinas() {
    }
}
