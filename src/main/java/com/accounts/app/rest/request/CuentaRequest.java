package com.accounts.app.rest.request;

import jakarta.validation.constraints.NotBlank;

public record CuentaRequest(
        @NotBlank
        String nroCuenta
) {}
