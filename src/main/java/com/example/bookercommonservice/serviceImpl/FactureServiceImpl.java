package com.example.bookercommonservice.serviceImpl;

import com.example.bookercommonservice.bean.Facture;
import com.example.bookercommonservice.dao.FactureDao;
import com.example.bookercommonservice.dto.CustomerOrderDto;
import com.example.bookercommonservice.service.FactureService;
import com.example.bookercommonservice.utils.PdfUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FactureServiceImpl implements FactureService {

    private final FactureDao factureDao;

    @Override
    public String generateFacture(CustomerOrderDto customerOrderDto) {
        Facture facture = new Facture();
        String factureRef = UUID.randomUUID().toString();
        facture.setReference(factureRef);
        facture.setPdf(PdfUtils.generatePdf(customerOrderDto, factureRef));
        factureDao.save(facture);
        return UUID.randomUUID().toString();
    }
}
