import java.util.Scanner;

public class RectanguloAreaPerimetro{

    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese los datos del rectangulo: ");
        System.out.println("Ingrese la base del rectangulo (cm): ");
        float base = entrada.nextFloat();
        System.out.println("Ingrese la altura del rectangulo: ");
        float altura = entrada.nextFloat();

        //Calculo de area y perimetro
        float area = base * altura;
        float perimetro = 2 * (base + altura);

        //Mostrar los resultados
        System.out.println("Los resultados son: \nEl area del rectangulo es: " + area + "\nEl perimetro del rectangulo es: "+ perimetro);
        entrada.close();

    }

}