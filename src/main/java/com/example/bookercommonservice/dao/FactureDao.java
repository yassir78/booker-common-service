package com.example.bookercommonservice.dao;

import com.example.bookercommonservice.bean.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureDao extends JpaRepository<Facture, Long> {

    Facture findByReference(String reference);
}
