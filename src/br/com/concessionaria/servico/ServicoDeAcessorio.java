package br.com.concessionaria.servico;

import static br.com.concessionaria.servico.TiposDeAcessorio.NENHUM;

public class ServicoDeAcessorio implements Servico<TiposDeAcessorio> {
    public TiposDeAcessorio tiposDeAcessorio;
    public TiposDeAcessorio acessorioEscolhido;

    @Override
    public void oferecerServico(TiposDeAcessorio t) {
        if (t == TiposDeAcessorio.NENHUM) {
            System.out.println("Que pena! \n");
        } else {
            System.out.println("foi adicionado ao veículo! \n");
        }
        acessorioEscolhido = t;
    }
}

