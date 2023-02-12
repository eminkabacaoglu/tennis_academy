package com.atk.tennisAcademy.business.abstracts;
import com.atk.tennisAcademy.entities.PaymentType;

import java.util.List;

public interface PaymentTypeService {

    List<PaymentType> getAllPaymentTypes();

    PaymentType savePaymentType(PaymentType paymentType);

    boolean deletePaymentType(Long id);

    PaymentType getPaymentTypeById(Long id);

    PaymentType updatePaymentType(Long id,PaymentType paymentType);
}
