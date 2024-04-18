import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        lerArquivoCSV();
    }

    public static ArrayList<String> lerArquivoCSV() {
        ArrayList<String> nomes = new ArrayList<>();
        String arquivoCSV = "C:\\Users\\maria\\OneDrive\\Área de Trabalho\\Maria Clara Marques Lino.L8 - 4231924407\\ExercicioUm\\src\\estudantes_una_2024.csv";
        try {

            Scanner scanner = new Scanner(new File(arquivoCSV));

            // Lê linha por linha do arquivo
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                nomes.add(linha);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + arquivoCSV);
            e.printStackTrace();
        }
        System.out.println("--Antes-- \n" + nomes);
        System.out.println("--Ordenando estudantes por nome--");
        nomes.remove(0);
        Collections.sort(nomes);
        for (String nome : nomes) {
            System.out.println("Nome:" + nome);
        }
        return nomes;
    }
}