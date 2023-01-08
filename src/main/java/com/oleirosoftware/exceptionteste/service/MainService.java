package com.oleirosoftware.exceptionteste.service;

import org.springframework.stereotype.Service;

import com.oleirosoftware.exceptionteste.exception.CheckedException;
import com.oleirosoftware.exceptionteste.exception.UncheckedException;

@Service
public class MainService {

    public void methodWithCheckedException() throws CheckedException {
        throw new CheckedException("Mensagem CheckedException");
    }

    public void methodWithUncheckedException() {
        throw new UncheckedException("Mensagem UncheckedException");
    }
}
