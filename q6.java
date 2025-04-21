import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("digite o salário:");
    double salario = Double.valueOf(sc.nextLine());
    double imposto = salario*0.1;
    double sfinal =  salario-imposto;

    System.out.println("salario:R$"+salario);
    System.out.println("imposto:R$"+imposto);
    System.out.println("salario final:"+sfinal);
    }
    
}
