package com.digital.innovatione.banco;

public class ContaEmpresarial extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Empresarial ===");
        super.imprimirInfosComuns();
    }
}
