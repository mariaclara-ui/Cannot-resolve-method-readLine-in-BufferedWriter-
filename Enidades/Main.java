package buff.Nivel_Facil_01.Enidades;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        File file= new File("meus_jogos.txt");
        salvarJogos(file);
        lerJogos(file);
    }
    public static void salvarJogos(File file){

        BufferedWriter bw = null;

        try {
            bw= new BufferedWriter(new FileWriter(file));

            bw.write("Hades");
            bw.newLine();
            bw.write("Dark souls");
            bw.newLine();
            bw.write("Minecraft");
            bw.newLine();
            bw.write("The sims");

            bw.close();

            System.out.println("Jogos salvos");

        }catch (IOException e){
            System.out.println("Erro ao escrever o arquivo");
        }
    }
    public static void lerJogos(File file){
        BufferedReader br= null;
        try {
            br=new BufferedReader(new FileReader(file));

            String linha;
            while ((linha= br.readLine())!= null){
                System.out.println(linha);
            }
            br.close();
        }catch (IOException e ){
            System.out.println("ERRO ao ler o arquivo");
        }
    }
}
