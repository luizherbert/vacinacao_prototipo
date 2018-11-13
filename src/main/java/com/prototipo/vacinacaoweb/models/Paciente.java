package com.prototipo.vacinacaoweb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "pacientes")
public class Paciente {

    @Id
    private String id;
    private String codigoCNS;
    private String nomePaciente;
    private String nomeMae;
    private String codProtuario;
    private String CPF;
    private String Sexo;
    private Date dataNascimento;
    private List<Vacina> vacinaList;

    public Paciente() {
    }

    public Paciente(String id, String codCNS, String nomePaciente, String nomeMae, String codProtuario, String CPF, String sexo, Date dataNascimento, List<Vacina> vacinaList) {
        this.id = id;
        this.codigoCNS = codCNS;
        this.nomePaciente = nomePaciente;
        this.nomeMae = nomeMae;
        this.codProtuario = codProtuario;
        this.CPF = CPF;
        Sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.vacinaList = vacinaList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCodCNS() {
        return codigoCNS;
    }

    public void setCodCNS(String codCNS) {
        this.codigoCNS = codCNS;
    }

    public String getNomeUsuario() {
        return nomePaciente;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomePaciente = nomeUsuario;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getCodProtuario() {
        return codProtuario;
    }

    public void setCodProtuario(String codProtuario) {
        this.codProtuario = codProtuario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Vacina> getVacinaList() {
        return vacinaList;
    }

    public void setVacinaList(List<Vacina> vacinaList) {
        this.vacinaList = vacinaList;
    }
}
