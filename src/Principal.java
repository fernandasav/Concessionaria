import br.com.concessionaria.automovel.CorAutomovel;
import br.com.concessionaria.automovel.MarcaAutomovel;
import br.com.concessionaria.automovel.ModeloAutomovel;
import br.com.concessionaria.cliente.FormaDePagamento;
import br.com.concessionaria.servico.ServicoDeAcessorio;
import br.com.concessionaria.servico.ServicoDeSeguro;
import br.com.concessionaria.servico.TiposDeAcessorio;
import br.com.concessionaria.servico.TiposDeSeguro;
import com.sun.jdi.Value;

import java.time.DayOfWeek;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Bem-vindo ao sistema de vendas da B3! \n");

        System.out.println("Vendedor(a) digite seu nome para começar: \n");

        String nomeVendedor;
        Scanner x;
        x = new Scanner(System.in);
        nomeVendedor = x.nextLine();

        System.out.println("Vamos começar a venda, " + nomeVendedor + "! \n");


        Endereco enderecoUm = new Endereco("Avenida das Palmeiras", 1234, "Vila das Árvores", "Andradina", "São Paulo", "15444-888");

        PessoaFisica pessoaFisicaUm = new PessoaFisica("Fernanda", "12345679", "fer_nanda@gmail.com", FormaDePagamento.A_VISTA, true, enderecoUm);

        Automovel automovelUm = new Automovel(MarcaAutomovel.FORD, ModeloAutomovel.CAMINHONETE, 2018, CorAutomovel.BRANCO, "ABCDE", pessoaFisicaUm);


        System.out.println("Os dados cadastrados no sistema são: ");
        System.out.println(pessoaFisicaUm);
        System.out.println(enderecoUm);
        System.out.println(automovelUm);

        System.out.println("Verificando o documento do cliente...");
        pessoaFisicaUm.validarDocumento();

        System.out.println("Ofereça nossos serviços de pós venda!");

        System.out.println("Ofereça acessórios ao cliente: ");
        System.out.println("0 = Nenhum ");
        System.out.println("1 = Engate ");
        System.out.println("2 = Frisos ");
        System.out.println("3 = Mídia Player");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número do item escolhido: ");
        int acessorio = entrada.nextInt();

        switch (acessorio) {

            case 0:
                System.out.println("O cliente escolheu: " + TiposDeAcessorio.NENHUM);
                break;
            case 1:
                System.out.println("O cliente escolheu: " + TiposDeAcessorio.ENGATE);
                break;
            case 2:
                System.out.println("O cliente escolheu: " + TiposDeAcessorio.FRISOS);
                break;
            case 3:
                System.out.println("O cliente escolheu: " + TiposDeAcessorio.MIDIA_PLAYER);
                break;
            default:
                throw new IllegalArgumentException("Essa não é uma opção válida.");
        }

        ServicoDeAcessorio servicoDeAcessorio = new ServicoDeAcessorio();
        servicoDeAcessorio.oferecerServico();

        System.out.println("Ofereça seguros ao cliente: ");
        System.out.println("0 = Nenhum ");
        System.out.println("1 = Plano Básico ");
        System.out.println("2 = Plano Intermédiario ");
        System.out.println("3 = Plano Avançado ");


        Scanner entradaUm = new Scanner(System.in);
        System.out.println("Digite o número do item escolhido: ");
        int seguro = entrada.nextInt();

        switch (seguro) {
            case 0:
                System.out.println("O cliente escolheu: " + TiposDeSeguro.NENHUM);
                break;
            case 1:
                System.out.println("O cliente escolheu: " + TiposDeSeguro.PLANO_BASICO);
                break;
            case 2:
                System.out.println("O cliente escolheu: " + TiposDeSeguro.PLANO_INTERMEDIARIO);
                break;
            case 3:
                System.out.println("O cliente escolheu: " + TiposDeSeguro.PLANO_COMPLETO);
                break;
            default:
                throw new IllegalArgumentException("Essa não é uma opção válida.");
        }

        ServicoDeSeguro servicoDeSeguro = new ServicoDeSeguro();
        servicoDeSeguro.oferecerServico();


        System.out.println("Compra Finalizada! \n");

        System.out.println("########### IMPRIMINDO NOTA FISCAL ###########");

        NotaFiscal notaFiscal = new NotaFiscal();
        String folha = "Emitindo Nota Fiscal";
        notaFiscal.imprime("O vendedor foi o(a): " + nomeVendedor);
        notaFiscal.imprime("O comprador foi o(a): " + pessoaFisicaUm.getNome());
        notaFiscal.imprime("Comprou o veículo: " + automovelUm.getMarcaAutomovel());
        notaFiscal.imprime("Acessorios: " + String.valueOf(acessorio));
        notaFiscal.imprime("Seguros: " + String.valueOf(seguro));
        notaFiscal.imprime("Data: " + new Date());
    }
}

// quando escolhe a opção 0 nos switch o metodo servicodeacessorio e servicodeseguro nao
// reconhece.
// na impressao da notafical nao esta saindo o valor escrito de acessorios e seguros
//n consigo colocar as classes nos pacotes

