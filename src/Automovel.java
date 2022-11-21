import br.com.concessionaria.automovel.CorAutomovel;
import br.com.concessionaria.automovel.MarcaAutomovel;
import br.com.concessionaria.automovel.ModeloAutomovel;

public class Automovel {
    private MarcaAutomovel marcaAutomovel;
    private ModeloAutomovel modeloAutomovel;
    private int ano;
    private CorAutomovel corAutomovel;
    private String placa;
    private Cliente cliente;

    public Automovel() {
    }

    public Automovel(MarcaAutomovel marcaAutomovel, ModeloAutomovel modeloAutomovel, int ano, CorAutomovel corAutomovel, String placa, Cliente cliente) {

        this.marcaAutomovel = marcaAutomovel;
        this.modeloAutomovel = modeloAutomovel;
        this.ano = ano;
        this.corAutomovel = corAutomovel;
        this.placa = placa;
        this.cliente = cliente;
    }

    public MarcaAutomovel getMarcaAutomovel() {
        return marcaAutomovel;
    }

    public void setMarcaAutomovel(MarcaAutomovel marcaAutomovel) {
        this.marcaAutomovel = marcaAutomovel;
    }

    public ModeloAutomovel getModeloAutomovel() {
        return modeloAutomovel;
    }

    public void setModeloAutomovel(ModeloAutomovel modeloAutomovel) {
        this.modeloAutomovel = modeloAutomovel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public CorAutomovel getCorAutomovel() {
        return corAutomovel;
    }

    public void setCorAutomovel(CorAutomovel corAutomovel) {
        this.corAutomovel = corAutomovel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\n--------Dados do Automovel-------- \n" +
                "Marca: " + marcaAutomovel +
                ", modelo: " + modeloAutomovel +
                ", ano: " + ano +
                ", cor: " + corAutomovel +
                ", placa: " + placa + "\n";
    }
}
