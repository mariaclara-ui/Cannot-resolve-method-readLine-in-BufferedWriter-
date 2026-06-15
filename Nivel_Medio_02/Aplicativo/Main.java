package buff.Nivel_Medio_02.Aplicativo;

import buff.Nivel_Medio_02.Entidades.Usuario;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file = new File("usuarios.csv");

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Yasmin","yaya@gmail.com",19));
        usuarios.add(new Usuario("Emily","Mi@gmail.com",19));
        usuarios.add(new Usuario("Maria","Ma@gmail.com",18));
        usuarios.add(new Usuario("Davi","dada@gmail.com",19));

        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(file));
            for (Usuario usuario:usuarios){
                bw.write(
                        usuario.getNome()+";"+usuario.getEmail()+";"+usuario.getIdade());
                bw.newLine();
            }
            bw.close();
        }catch (IOException e ){
            System.out.println("ERRO ao salvar o arquivo");
        }
        List<Usuario> Lista = new ArrayList<>();
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));

            String linha;
            while ((linha= br.readLine())!=null){
                String[] vetor=linha.split(";");

                String nome=vetor[0];
                String email=vetor[1];
                int idade=Integer.parseInt((vetor[2]));

                Usuario usuario= new Usuario(nome,email,idade);

                Lista.add(usuario);
            }

        }catch (IOException e){
            System.out.println("ERRO ao ler o arquivo");
        }
        System.out.println("Usuarios adicionados");

        for (Usuario usuario:Lista){
            usuario.exibirInfo();
        }
    }
}
