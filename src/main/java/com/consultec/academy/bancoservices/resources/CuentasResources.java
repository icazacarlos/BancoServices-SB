package com.consultec.academy.bancoservices.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController; 

import com.consultec.academy.bancoservices.dao.CuentasDAO;
import com.consultec.academy.bancoservices.models.abstracts.Cuenta;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@RestController
@RequestMapping("${api.baseUrl}/cuentas")
@Slf4j
public class CuentasResources {

    @PostMapping()
    public ResponseEntity<String> crearCuenta(@RequestBody Cuenta cuenta) {

        log.debug("crearCuenta...");

        CuentasDAO cuentasDAO = new CuentasDAO();
        cuentasDAO.agregarCuenta(cuenta);
        return ResponseEntity.status(200).body("Cuenta Creada");
    }

    @GetMapping()
    public ResponseEntity<List<CuentasDAO>> consultarCuentas() {

        log.debug("consultarCuentas...");

        CuentasDAO cuentasDAO = new CuentasDAO();
        return ResponseEntity.status(200).body(cuentasDAO.consultarTodo());
    }
}
