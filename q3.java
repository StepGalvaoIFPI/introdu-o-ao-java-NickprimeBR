import java.util.Scanner;

public class q3{
    public static void main(String[] args){
    Scanner entrada = new Scanner (System.in);
    double pi = 3.14;

    System.out.print("digite o valor do raio:");
    double raio = Double.valueOf(entrada.nextLine());

    double area = pi*(raio*raio);    
    double cumprimento = 2*pi*raio;

    System.out.println("area:"+area);
    System.out.println("cumprimento"+cumprimento);

    }
}