
//Conta bancária com métodos (debitar e creditar)

package com.example.Ex12.model;

public class Conta {

    private String codigo;
    private String cliente;
    private Double saldo;

    // Construtor
    public Conta(String codigo, String cliente, Double saldo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // Metodo p/ debitar
    public void debitar(Double valor) {
        this.saldo -= valor;
    }

    // Metodo pa/ creditar
    public void creditar(Double valor) {
        this.saldo += valor;
    }
}