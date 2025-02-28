package com.ecommerce.api.services;

import com.ecommerce.api.repositories.PaymantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymantService {

    @Autowired
    public PaymantRepository paymantRepository;
}
