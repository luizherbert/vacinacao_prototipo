/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prototipo.vacinacaoweb.controllers;

import com.prototipo.vacinacaoweb.models.Vacina;
import com.prototipo.vacinacaoweb.repositories.PacienteRepository;
import com.prototipo.vacinacaoweb.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author didin
 */
@Controller
public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;

    @RequestMapping("/vacina")
    public String vacina(Model model) {
        model.addAttribute("pacientes", pacienteRepository.findAll());
        model.addAttribute("vacina", pacienteRepository.findAll().iterator().next().getVacinaList().get(0));
        return "vacina";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        return "create";
    }

    @RequestMapping("/save")
    public String save(@RequestParam String nomePaciente
            , @RequestParam String estabelecimentoSaude
            , @RequestParam String estrategiaVacinacao
            , @RequestParam String nomeVacina ) {

        /*---------------------------------------------
           POPULA DADOS DO PACIENTE
          ---------------------------------------------*/
        Paciente paciente = new Paciente();
        paciente.setNomePaciente(nomePaciente);

        /*---------------------------------------------
           POPULA DADOS DA VACINA
          ---------------------------------------------*/
        Vacina vacina = new Vacina();
        vacina.setEstabelecimentoSaude(estabelecimentoSaude);
        vacina.setEstrategiaVacinacao(estrategiaVacinacao);
        vacina.setNomeVacina(nomeVacina);

        List<Vacina> listaVacina = new ArrayList();
        listaVacina.add(vacina);
        paciente.setVacinaList(listaVacina);

        pacienteRepository.save(paciente);

        return "redirect:/show/" + paciente.getId();
    }

    @RequestMapping("/show/{id}")
    public String show(@PathVariable String id, Model model) {
        model.addAttribute("paciente", pacienteRepository.findById(id).get());
        model.addAttribute("vacina", pacienteRepository.findById(id).get().getVacinaList().get(0));
        return "show";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam String id) {
        Paciente paciente = pacienteRepository.findById(id).get();
        pacienteRepository.delete(paciente);

        return "redirect:/vacina";
    }
    
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("paciente", pacienteRepository.findById(id).get());
        model.addAttribute("vacina", pacienteRepository.findById(id).get().getVacinaList().get(0));
        return "edit";
    }

    @RequestMapping("/update")
    public String update(@RequestParam String id, @RequestParam String nomePaciente
            , @RequestParam String estabelecimentoSaude
            , @RequestParam String estrategiaVacinacao
            , @RequestParam String nomeVacina ) {
        Paciente paciente = pacienteRepository.findById(id).get();
        paciente.setId(id);
        paciente.setNomePaciente(nomePaciente);
        paciente.getVacinaList().get(0).setEstabelecimentoSaude(estabelecimentoSaude);
        paciente.getVacinaList().get(0).setEstrategiaVacinacao(estrategiaVacinacao);
        paciente.getVacinaList().get(0).setNomeVacina(nomeVacina);

        pacienteRepository.save(paciente);

        return "redirect:/show/" + paciente.getId();
    }
}
