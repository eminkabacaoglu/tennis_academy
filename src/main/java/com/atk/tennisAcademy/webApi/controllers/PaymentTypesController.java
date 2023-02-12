package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.PaymentTypeService;
import com.atk.tennisAcademy.entities.PaymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/paymenttypes")
public class PaymentTypesController {

    @Autowired
    PaymentTypeService paymentTypeService;
    @GetMapping
    public List<PaymentType> getAllPaymentTypes(){
        return paymentTypeService.getAllPaymentTypes();
    }


    @GetMapping("/{id}")
    public PaymentType getPaymentTypeById(@PathVariable Long id){
        return paymentTypeService.getPaymentTypeById(id);
    }

    @PostMapping
    public PaymentType savePaymentType(@RequestBody PaymentType paymentType){
        return paymentTypeService.savePaymentType(paymentType);
    }

    @DeleteMapping("/{id}")
    public boolean deletePaymentType(@PathVariable Long id){
        return  paymentTypeService.deletePaymentType(id);
    }

    @PutMapping("/{id}")
    public PaymentType updatePaymentType(@PathVariable Long id,@RequestBody PaymentType paymentType){
        return paymentTypeService.updatePaymentType(id,paymentType);
    }
}
