package com.picpay.minpicpay.wallet;

import java.math.BigDecimal;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import java.util.Date;


@Entity
@Table(name = "Wallets")
public record Wallet(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
                String document, String name, String password, BigDecimal balance, String address,
                String phone, String photo, @Version Long version, @CreatedDate Date createdAt,
                String email

) {


}
