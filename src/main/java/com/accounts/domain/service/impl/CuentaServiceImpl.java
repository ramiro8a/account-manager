package com.accounts.domain.service.impl;

import com.accounts.app.rest.request.CuentaRequest;
import com.accounts.app.rest.response.CuentaResponse;
import com.accounts.domain.model.Cuenta;
import com.accounts.domain.repository.CuentaRepository;
import com.accounts.domain.service.CuentaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CuentaServiceImpl implements CuentaService {
    @Autowired
    private CuentaRepository repository;
    @Value("test.key:predefinido")
    private String valor;
    @Override
    public Cuenta crea(CuentaRequest request) {
        return repository.save(Cuenta.builder()
                .nroCuenta(request.nroCuenta())
                .build());
    }

    @Override
    public List<CuentaResponse> buscaTodo() {
        log.error(valor);
        List<Cuenta> result = repository.findAll();
        List<CuentaResponse> lista = new ArrayList<>();
        for (Cuenta cuenta: result){
            lista.add(Cuenta.aCuentaResponse(cuenta));
        }
        return lista;
    }
}
