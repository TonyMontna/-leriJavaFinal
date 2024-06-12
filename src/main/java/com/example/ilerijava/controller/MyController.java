package com.example.ilerijava.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.CustomException.CustomException;

@RestController
public class MyController {

    @GetMapping("/hata")
    public String hata() {
        throw new CustomException("Özel bir hata oluştu");
    }
}