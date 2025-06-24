package com.rafael.gerenciamentofuncionarios.model;

public class Funcionario {
    protected String nome;
    protected int id;
    protected double salario;
    protected String cargo;

    public Funcionario(String nome, int id, double salario, String cargo) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
