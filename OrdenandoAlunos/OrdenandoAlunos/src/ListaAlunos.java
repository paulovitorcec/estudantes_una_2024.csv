import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ListaAlunos {

    public static void main(String[] args) throws Exception {

        File arquivo = new File("C:\\Users\\paulo\\Downloads\\estudantes_una_2024.csv");
        Scanner scanner = new Scanner(arquivo);
        scanner.useDelimiter("\n");
        scanner.next();

        ArrayList<String> nomes = new ArrayList<String>();
        while(scanner.hasNext()) nomes.add(scanner.next());
        Collections.sort(nomes);

        System.out.println("Lista de estudantes da UNA 2024 ordenada por ordem alfabética:");

        for(String nome : nomes) System.out.printf("Nome: %s\n", nome);

        scanner.close();
   }
    
}
