package com.rafael.gerenciamentofuncionarios.service;

import com.rafael.gerenciamentofuncionarios.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioManager {
    List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}

