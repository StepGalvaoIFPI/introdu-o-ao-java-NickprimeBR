import java.util.Scanner;

class q4{

    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        System.out.print("digite a temperatura em celsius:");
        double c = Double.valueOf(ent.nextLine());
        double f = c*1.8+32;
        double k = (f+459.67)/1.8;
        System.out.println("celsius"+c);
        System.out.println("farenheit"+f);
        System.out.print("kelvin"+k);
        

    }
}