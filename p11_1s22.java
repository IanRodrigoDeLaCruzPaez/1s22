import java.util.Scanner;

public class p11_1s22{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad;
        edad = scanner.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad.");
           }else{
            System.out.println("Eres menor de edad");
            }



            System.out.println("Raiz cuadrada de 10" + Math.sqrt(10));
            System.out.println("Potencia " + Math.pow(5,3));
            System.out.println("Residuo de 10/2: " + (10%2));
            System.out.println("Residuo de 11/2: " + (11%2));

    }
}
