/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prototipo.vacinacaoweb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 *
 * @author didin
 */
@Document(collection = "vacinas")
public class Vacina {
    @Id
    String id;
    String nomePaciente;
    boolean temVacinacaoAnterior;
    String estabelecimentoSaude;
    String nomeProfissional;
    String estrategiaVacinacao;
    String nomeVacina;
    String tipoDose;
    String descricaoDose;
    String loteVacina;
    String Fonecedor;
    Date dataValidade;
    Date dataAplicacao;

    public Vacina() {
    }

    public Vacina(String id, String nomePaciente, boolean temVacinacaoAnterior, String estabelecimentoSaude, String nomeProfissional, String estrategiaVacinacao, String nomeVacina, String tipoDose, String descricaoDose, String loteVacina, String fonecedor, Date dataValidade, Date dataAplicacao) {
        this.id = id;
        this.nomePaciente = nomePaciente;
        this.temVacinacaoAnterior = temVacinacaoAnterior;
        this.estabelecimentoSaude = estabelecimentoSaude;
        this.nomeProfissional = nomeProfissional;
        this.estrategiaVacinacao = estrategiaVacinacao;
        this.nomeVacina = nomeVacina;
        this.tipoDose = tipoDose;
        this.descricaoDose = descricaoDose;
        this.loteVacina = loteVacina;
        Fonecedor = fonecedor;
        this.dataValidade = dataValidade;
        this.dataAplicacao = dataAplicacao;
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

    public boolean isTemVacinacaoAnterior() {
        return temVacinacaoAnterior;
    }

    public void setTemVacinacaoAnterior(boolean temVacinacaoAnterior) {
        this.temVacinacaoAnterior = temVacinacaoAnterior;
    }

    public String getEstabelecimentoSaude() {
        return estabelecimentoSaude;
    }

    public void setEstabelecimentoSaude(String estabelecimentoSaude) {
        this.estabelecimentoSaude = estabelecimentoSaude;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public String getEstrategiaVacinacao() {
        return estrategiaVacinacao;
    }

    public void setEstrategiaVacinacao(String estrategiaVacinacao) {
        this.estrategiaVacinacao = estrategiaVacinacao;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getTipoDose() {
        return tipoDose;
    }

    public void setTipoDose(String tipoDose) {
        this.tipoDose = tipoDose;
    }

    public String getDescricaoDose() {
        return descricaoDose;
    }

    public void setDescricaoDose(String descricaoDose) {
        this.descricaoDose = descricaoDose;
    }

    public String getLoteVacina() {
        return loteVacina;
    }

    public void setLoteVacina(String loteVacina) {
        this.loteVacina = loteVacina;
    }

    public String getFonecedor() {
        return Fonecedor;
    }

    public void setFonecedor(String fonecedor) {
        Fonecedor = fonecedor;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
}
