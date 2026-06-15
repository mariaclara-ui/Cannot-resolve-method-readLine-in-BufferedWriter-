package buff.Nivel_Medio_02.Entidades;

public final class  Usuario {
    private String nome;
    private String email;
    private Integer idade;

    public Usuario(String nome, String email, Integer idade) {
        this.nome = nome;
        this.email=email;
        this.idade=idade;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public Integer getIdade() {
        return idade;
    }

    public void exibirInfo() {
        System.out.println(
                "nome='" + nome +
                        "', email='" + email +
                        "', idade=" + idade
        );
    }
}
