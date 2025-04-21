import java.util.Scanner;

class q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("digite a altura do retangulo:");
        int altura = Integer.valueOf(sc.nextLine());

        System.out.print("digite a largura do retangulo:");
        int largura = Integer.valueOf(sc.nextLine());

        int area = altura*largura;
        int perimetro = (2*largura)+(2*altura);
        System.out.println("area:"+area);
        System.out.print("perimetro:"+perimetro);
    }
}