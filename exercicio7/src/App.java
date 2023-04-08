import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int lado;
        int area;
        int dobro;
        Scanner teclado = new Scanner(System.in);
        System.out.println("diga qual lado do quadrado");
        lado = teclado.nextInt();
        area = lado * lado;
        dobro = area + area;
        System.out.println("o dobro da area do quadrado é " + dobro);
        teclado.close();
    }
}
