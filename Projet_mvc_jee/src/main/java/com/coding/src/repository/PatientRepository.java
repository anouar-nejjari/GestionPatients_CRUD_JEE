package com.coding.src.repository;

import com.coding.src.entitys.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Page<Patient> findByNomContainsIgnoreCaseOrPrenomContainsIgnoreCase(String nom,String prenom,Pageable pageable);
}
