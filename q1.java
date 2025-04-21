import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite a base do triangulo:");
        int base = Integer.valueOf(entrada.nextLine());

        System.out.print("digite a altura do triangulo:");
        int altura = Integer.valueOf(entrada.nextLine());

        double area = (base * altura)/2;
        System.out.println("area:"+area); 
    }
    
}