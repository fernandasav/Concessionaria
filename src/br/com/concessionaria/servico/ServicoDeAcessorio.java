package br.com.concessionaria.servico;

import static br.com.concessionaria.servico.TiposDeAcessorio.NENHUM;

public class ServicoDeAcessorio implements Servico {
    public TiposDeAcessorio tiposDeAcessorio;
    @Override
    public void oferecerServico() {
        if (tiposDeAcessorio == (TiposDeAcessorio.NENHUM)) {
            System.out.println("Que pena! \n");
        } else {
            System.out.println("foi adicionado ao veículo! \n");
        }
    }
}
