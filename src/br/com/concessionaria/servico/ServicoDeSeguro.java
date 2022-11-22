package br.com.concessionaria.servico;

public class ServicoDeSeguro implements Servico<TiposDeSeguro> {
    public TiposDeSeguro tiposDeSeguro;

    public TiposDeSeguro seguroEscolhido;

    @Override
    public void oferecerServico(TiposDeSeguro t) {
        if (t == TiposDeSeguro.NENHUM) {
            System.out.println("Que pena! \n");
        } else {
            System.out.println("foi adicionado a compra do veículo! \n");
        }
        seguroEscolhido = t;
    }
}

