import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int x; //Variável em que vai ser usual para conversão dos valores
        
        System.out.println("Digite um valor em km >> ");
        x = scan.nextInt();

        while (x != 0){

            System.out.println(
                    "Em Metros: " + Distancia.metros(x) + "3m \n" +
                    "Em milhas: " + Distancia.milhas(x) + "milhas \n");
            x = scan.nextInt();

        }
        System.out.println("Finalizado!");
    }
}