package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.PaymentTypeService;
import com.atk.tennisAcademy.dataAccess.PaymentTypeRepository;

import com.atk.tennisAcademy.entities.PaymentType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentTypeManager implements PaymentTypeService {

//    private static final Logger log = LogManager.getLogger(PaymentTypeManager.class);
    @Autowired
    PaymentTypeRepository paymentTypeRepository;

    @Override
    public List<PaymentType> getAllPaymentTypes() {
        return paymentTypeRepository.findAll();
    }

    @Override
    public PaymentType savePaymentType(PaymentType paymentType) {
        return paymentTypeRepository.save(paymentType);
    }

    @Override
    public boolean deletePaymentType(Long id) {
        try {
            paymentTypeRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public PaymentType getPaymentTypeById(Long id) {
        return paymentTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PaymentType updatePaymentType(Long id, PaymentType paymentType) {
        PaymentType foundPaymentType = getPaymentTypeById(id);
        if (foundPaymentType!=null) {
            foundPaymentType.setDescription(paymentType.getDescription());
            paymentTypeRepository.save(foundPaymentType);
            return foundPaymentType;
        } else
            return null;
    }
}
