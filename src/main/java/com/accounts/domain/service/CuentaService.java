package com.accounts.domain.service;

import com.accounts.app.rest.request.CuentaRequest;
import com.accounts.app.rest.response.CuentaResponse;
import com.accounts.domain.model.Cuenta;

import java.util.List;

public interface CuentaService {
    Cuenta crea(CuentaRequest request);
    List<CuentaResponse> buscaTodo();
}
