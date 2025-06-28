package com.rafael.gerenciamentofuncionarios.service;

import com.rafael.gerenciamentofuncionarios.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioManager {
    List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Funcionario buscarFuncionarioId(int id) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id)
                return f;
        }
        return null;
    }

    public List<Funcionario> buscarFuncionarioNome(String nome) {
        List<Funcionario> nomeEncontrado = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (f.getNome().toLowerCase().contains(nome.toLowerCase()))
                return nomeEncontrado;
        }
        return null;
    }

    public void listagemFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Lista de cadastro vazia");
            return;
        }
        for (Funcionario f : funcionarios) {
            f.informacoes();
        }
    }
}

