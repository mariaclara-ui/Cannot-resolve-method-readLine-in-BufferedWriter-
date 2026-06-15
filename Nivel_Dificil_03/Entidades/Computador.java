package buff.Nivel_Dificil_03.Entidades;

public class Computador extends Equipamento{
    private String procesador;
    private Integer quantidadeMemoria;

    public Computador(String id, String marca, String procesador, Integer quantidadeMemoria) {
        super(id, marca);
        this.procesador = procesador;
        this.quantidadeMemoria=quantidadeMemoria;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "procesador='" + procesador +
                ", quantidadeMemoria=" + quantidadeMemoria +
                '}';
    }
}
