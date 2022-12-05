package com.bulldoginvestimentos.mvp.controllers;

import com.bulldoginvestimentos.mvp.services.RealEstateInvestmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fii")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RealEstateInvestmentController {

    private final RealEstateInvestmentService realEstateInvestmentService;

    @GetMapping("/list")
    public String getFiiList() {
        return realEstateInvestmentService.getRealEstateInvestmentList();
    }
}
