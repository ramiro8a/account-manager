package com.accounts.domain.model;

import com.accounts.app.rest.response.CuentaResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="t_tabla")
public class Cuenta extends BaseModel{
    @Column(name = "nro_cuenta")
    private String nroCuenta;

    public static CuentaResponse aCuentaResponse(Cuenta cuenta){
        return new CuentaResponse(
                cuenta.getNroCuenta(),
                cuenta.getId()
        );
    }
}
