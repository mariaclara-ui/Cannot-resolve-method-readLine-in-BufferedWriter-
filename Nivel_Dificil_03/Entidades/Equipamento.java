package buff.Nivel_Dificil_03.Entidades;

public class Equipamento {
    private String id;
    private String marca;

    public Equipamento(String id, String marca) {
        this.id = id;
        this.marca=marca;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "id='" + id +
                ", marca='" + marca +
                '}';
    }
}
