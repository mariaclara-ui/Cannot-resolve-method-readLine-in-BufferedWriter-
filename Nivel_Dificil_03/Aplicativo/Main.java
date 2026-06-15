package buff.Nivel_Dificil_03.Aplicativo;

import buff.Nivel_Dificil_03.Entidades.Computador;
import buff.Nivel_Dificil_03.Entidades.Equipamento;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        File file=new File("C:\\atividade\\entada_inventario.txt");
        List<Equipamento> equipamentos = new ArrayList<>();
        List<String> erros = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linha;
            while ((linha = br.readLine())!=null){
                try {
                    String[] vetor=linha.split(";");
                    String tipo = vetor[0];


                    if (tipo.equals("E")){

                        String id=vetor[1];
                        String marca = vetor[2];
                        Equipamento equipamento = new Equipamento(id,marca);

                        equipamentos.add(equipamento);
                    }
                    else if (tipo.equals("C")){
                        String id = vetor[1];
                        String marca = vetor[2];
                        String processador = vetor[3];
                        Integer memoria =
                                Integer.parseInt(vetor[4]);

                        Computador computador = new Computador(id, marca, processador, memoria);

                        equipamentos.add(computador);
                    }
                    else {
                        erros.add("Linha inválida "+linha);
                    }
                }catch (IllegalArgumentException e){
                    erros.add(e.getMessage());
                }
            }
            br.close();
        }catch (IOException e){
            System.out.println("ERRO em ler o arquivo");
        }
        try {
            BufferedWriter bw= new BufferedWriter(new FileWriter("relatorio_valido.txt"));
            for (Equipamento equipamento:equipamentos){
                bw.write(equipamento.toString());
                bw.newLine();
            }
            bw.close();

        }catch (IOException e){
            System.out.println("ERRO ao gerar relatório");
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("log_error.txt"));

            for (String erro:erros){
                bw.write(erro);
                bw.newLine();
            }
            bw.close();
        }catch (IOException e){
            System.out.println("ERRO ao gerar log");
        }
    }
}
