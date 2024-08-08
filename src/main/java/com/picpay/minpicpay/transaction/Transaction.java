package com.picpay.minpicpay.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;

import org.springframework.data.relational.core.mapping.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Table(name = "Transactions")
public record Transaction(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
        Long payer, Long payee, BigDecimal amount, @CreatedDate LocalDateTime createdAt

) {

}
