/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prototipo.vacinacaoweb.controllers;

import com.prototipo.vacinacaoweb.repositories.VacinaRepository;
import com.prototipo.vacinacaoweb.models.Vacina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 *
 * @author didin
 */
@Controller
public class VacinaController {

    @Autowired
    VacinaRepository vacinaRepository;

    @RequestMapping("/vacina")
    public String vacina(Model model) {
        model.addAttribute("vacinas", vacinaRepository.findAll());
        return "vacina";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        return "create";
    }

/*    @RequestMapping("/save")
    public String save(@RequestParam String nomePaciente
            , @RequestParam boolean temVacinacaoAnterior, @RequestParam String estabelecimentoSaude
            , @RequestParam String nomeProfissional, @RequestParam String estrategiaVacinacao
            , @RequestParam String nomeVacina, @RequestParam String tipoDose, @RequestParam String descricaoDose
            , @RequestParam String loteVacina, @RequestParam String fonecedor, @RequestParam Date dataValidade
            , @RequestParam Date dataAplicacao) {
        Vacina vacina = new Vacina();
        vacina.setNomePaciente(nomePaciente);
        vacina.setTemVacinacaoAnterior(temVacinacaoAnterior);
        vacina.setEstabelecimentoSaude(estabelecimentoSaude);
        vacina.setNomeProfissional(nomeProfissional);
        vacina.setEstrategiaVacinacao(estrategiaVacinacao);
        vacina.setNomeVacina(nomeVacina);
        vacina.setTipoDose(tipoDose);
        vacina.setDescricaoDose(descricaoDose);
        vacina.setLoteVacina(loteVacina);
        vacina.setFonecedor(fonecedor);
        vacina.setDataAplicacao(dataAplicacao);
        vacina.setDataValidade(dataValidade);
        vacinaRepository.save(vacina);

        return "redirect:/show/" + vacina.getId();
    }*/

    @RequestMapping("/save")
    public String save(@RequestParam String nomePaciente
            , @RequestParam String estabelecimentoSaude
            , @RequestParam String estrategiaVacinacao
            , @RequestParam String nomeVacina) {

        Vacina vacina = new Vacina();
        vacina.setNomePaciente(nomePaciente);
        vacina.setEstabelecimentoSaude(estabelecimentoSaude);
        vacina.setEstrategiaVacinacao(estrategiaVacinacao);
        vacina.setNomeVacina(nomeVacina);

        vacinaRepository.save(vacina);

        return "redirect:/show/" + vacina.getId();
    }

    @RequestMapping("/show/{id}")
    public String show(@PathVariable String id, Model model) {
        model.addAttribute("vacina", vacinaRepository.findById(id).get());
        return "show";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam String id) {
        Vacina vacina = vacinaRepository.findById(id).get();
        vacinaRepository.delete(vacina);

        return "redirect:/vacina";
    }
    
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("vacina", vacinaRepository.findById(id).get());
        return "edit";
    }
    
/*    @RequestMapping("/update")
    public String update(@RequestParam String id, @RequestParam String nomePaciente
            , @RequestParam boolean temVacinacaoAnterior, @RequestParam String estabelecimentoSaude
            , @RequestParam String nomeProfissional, @RequestParam String estrategiaVacinacao
            , @RequestParam String nomeVacina, @RequestParam String tipoDose, @RequestParam String descricaoDose
            , @RequestParam String loteVacina, @RequestParam String fonecedor, @RequestParam Date dataValidade
            , @RequestParam Date dataAplicacao) {
        Vacina vacina = vacinaRepository.findById(id).get();
        vacina.setId(id);
        vacina.setNomePaciente(nomePaciente);
        vacina.setTemVacinacaoAnterior(temVacinacaoAnterior);
        vacina.setEstabelecimentoSaude(estabelecimentoSaude);
        vacina.setNomeProfissional(nomeProfissional);
        vacina.setEstrategiaVacinacao(estrategiaVacinacao);
        vacina.setNomeVacina(nomeVacina);
        vacina.setTipoDose(tipoDose);
        vacina.setDescricaoDose(descricaoDose);
        vacina.setLoteVacina(loteVacina);
        vacina.setFonecedor(fonecedor);
        vacina.setDataAplicacao(dataAplicacao);
        vacina.setDataValidade(dataValidade);
        vacinaRepository.save(vacina);

        return "redirect:/show/" + vacina.getId();
    }*/


    @RequestMapping("/update")
    public String update(@RequestParam String id, @RequestParam String nomePaciente
            , @RequestParam String estabelecimentoSaude
            , @RequestParam String nomeProfissional, @RequestParam String estrategiaVacinacao
            , @RequestParam String nomeVacina ) {
        Vacina vacina = vacinaRepository.findById(id).get();
        vacina.setId(id);
        vacina.setNomePaciente(nomePaciente);
        vacina.setEstabelecimentoSaude(estabelecimentoSaude);
        vacina.setNomeProfissional(nomeProfissional);
        vacina.setEstrategiaVacinacao(estrategiaVacinacao);
        vacina.setNomeVacina(nomeVacina);

        vacinaRepository.save(vacina);

        return "redirect:/show/" + vacina.getId();
    }
}
