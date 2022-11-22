package br.com.concessionaria.cliente;

import br.com.concessionaria.cliente.FormaDePagamento;

public class PessoaJuridica extends Cliente {
    private boolean cnpj;

    public PessoaJuridica(String nome, String telefone, String email, FormaDePagamento formaDePagamento, boolean cnpj, Endereco endereco) {
        super(nome, telefone, email, formaDePagamento, endereco);
        this.cnpj = cnpj;
    }

    public boolean isCnpj() {
        return cnpj;
    }

    public void setCnpj(boolean cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void validarDocumento() {
        if (cnpj == false) {
            System.out.println("CNPJ não aprovado. Compra encerrada. \n");
            System.exit(0);
        } else {
            System.out.println("CNPJ aprovado. Vamos seguir a compra! \n");
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                ", cnpj: " + cnpj;
    }
}

