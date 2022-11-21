package br.com.concessionaria.servico;

public class ServicoDeSeguro implements Servico {
    public TiposDeSeguro tiposDeSeguro;

    @Override
    public void oferecerServico() {
            if (tiposDeSeguro == (TiposDeSeguro.NENHUM)) {
                System.out.println("Que pena! \n");
            } else {
                System.out.println("foi adicionado a compra do veículo! \n");
            }
        }
    }

