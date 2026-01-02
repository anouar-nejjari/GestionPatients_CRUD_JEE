package com.coding.src.controlleurs;

import com.coding.src.entitys.Patient;
import com.coding.src.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model,
                       @RequestParam(name = "page",defaultValue = "0") int page , // pass les nbrs des pages
                       @RequestParam(name = "size",defaultValue = "5") int size,
                        @RequestParam(name = "keyword",defaultValue = "") String keyword){ // pass les nbrs des elements
        Page<Patient>   pagePatients =  patientRepository.findByNomContainsIgnoreCaseOrPrenomContainsIgnoreCase(keyword,keyword,PageRequest.of(page,size)); // recuper les objets avec des page // patientRepository.findAll(PageRequest.of(page,size)
        model.addAttribute("listPatients",pagePatients.getContent()); // ajouter les patients to model instancie
        model.addAttribute("pages", new int[pagePatients.getTotalPages()]); // ajoute les pages
        model.addAttribute("currentPage", page); // ajoute current page
        model.addAttribute("keyword",keyword);
        return "patients";// patients : nome de la page HTML returne
    }
    @GetMapping("/deletePatients")
    public String delete(@RequestParam(name = "id") Long id, String keyword, int page){
        patientRepository.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }
    // en cours
    @PostMapping("/updatePatients")
    public String update(@RequestParam(name = "id") Long id){
        patientRepository.deleteById(id);
        return "redirect:/index";
    }
}
