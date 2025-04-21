import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite a distancia da viagem em km:");
        int distancia = Integer.valueOf(entrada.nextLine());

        System.out.print("digite a sua velocidade em km/h:");
        int velocidade = Integer.valueOf(entrada.nextLine());
        
        double tmpviagem = distancia/velocidade;
        System.out.print("tempo de viagem:"+tmpviagem+" horas");
    }
    
}
