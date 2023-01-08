package com.oleirosoftware.exceptionteste.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oleirosoftware.exceptionteste.service.MainService;

@RestController
public class ControllerWithUncheckedException {

    @Autowired
    MainService service;

    @GetMapping("/route-unchecked-exception")
    public ResponseEntity<?> routeWithUncheckedException() {

        service.methodWithUncheckedException();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}