package br.com.concessionaria.cliente;

import br.com.concessionaria.cliente.FormaDePagamento;

public class PessoaFisica extends Cliente {
    private boolean cpf;

    public PessoaFisica(String nome, String telefone, String email, FormaDePagamento formaDePagamento, boolean cpf, Endereco endereco) {
        super(nome, telefone, email, formaDePagamento, endereco);
        this.cpf = cpf;
    }

    public boolean isCpf() {
        return cpf;
    }

    public void setCpf(boolean cpf) {
        this.cpf = cpf;
    }

    @Override
    public void validarDocumento() {
        if (cpf == false) {
            System.out.println("CPF não aprovado. Compra encerrada. \n");
            System.exit(0);
        } else {
            System.out.println("CPF aprovado. Vamos seguir a compra! \n");
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                ", cpf: " + cpf;
    }
}
