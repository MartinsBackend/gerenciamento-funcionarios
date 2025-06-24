package com.rafael.gerenciamentofuncionarios.model;

import java.time.Period;

public class Temporario extends Funcionario{
    private Period contrato;

    public Temporario(String nome, int id, double salario, String cargo, Period contrato) {
        super(nome, id, salario, cargo);
        this.contrato = contrato;
    }

    public Period getContrato() {
        return contrato;
    }

    public void setContrato(Period contrato) {
        this.contrato = contrato;
    }
}
