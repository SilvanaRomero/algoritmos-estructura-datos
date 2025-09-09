import java.util.Scanner;

public class OperacionesMat{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int firstNumber = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int secondNumber = input.nextInt();

        //Operaciones matematicas
        int sum = firstNumber + secondNumber;
        int difference = secondNumber - firstNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;

        //Mostrar resultados
        System.out.println("Los números ingresados son: " + "\n -Primero número: " + firstNumber + "\n -Segundo número: "+secondNumber+
                "\n Los resultados de las operaciones matemáticas son: "+
                "\n Suma: "+ sum +
                "\n Resta: "+ difference +
                "\n Multiplicación: "+ product +
                "\n Division (entero): " + quotient);

    }
}