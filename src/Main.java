import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//EJERCICIO1
        /*Scanner sp = new Scanner(System.in);
        for (int i = 1 ; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz");
                System.out.println();
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                System.out.println();
            } else if(i % 3 == 0)  {
                System.out.println("Fizzbuzz");
                System.out.println();
            }else{
                System.out.println(i);
                System.out.println();
            }
        }
        System.out.println("pon un numero");
        int numero;
        int acumulador = 0;
        do{
            System.out.println("escrbe un numero");
            numero = sp.nextInt();
                acumulador++;

        }while ( numero >= 0);
        System.out.println("contador final: " + acumulador);


        Scanner mp = new Scanner(System.in);
        System.out.println("Escribe numero");
        int tabla = mp.nextInt();
        tablaMultiplicar(tabla);


        Scanner mj = new Scanner(System.in);
        System.out.println("Escribe numero");
        int tabla1 = mj.nextInt();
        sumaDeMultiplicar(tabla1);


        Scanner np = new Scanner(System.in);
        int n1 = 0;
        int sumador = 0;
        int sumador1 = -1;

        while (n1 >= 0) {
            sumador = sumador + n1;
            n1 = np.nextInt();
            sumador1++;
        }
        System.out.println("la media es: " + sumador / sumador1);*/

Scanner sm = new Scanner(System.in);
        System.out.println("cuantos numeros quieres poner");
        int cantidad = sm.nextInt();
        int[] numero = {1, 2, 3, -4, 1, 5, 3, 4, 3, 5};
        int[] array = new  int[cantidad];

        for (int i = 0; i < array.length;i++){
            System.out.println("Introduce un numero");
            array[i] = sm.nextInt();
        }
        System.out.println(comprobarNegativo(array));


    }

    public static void tablaMultiplicar(int tabla) {
        System.out.println("Tabla del " + tabla);
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + tabla * i + " . ");
        }
    }

    public static int sumaDeMultiplicar(int tabla1) {
        int sumador = 0;
        for (int i = 1; i <= 10; i++) {
            sumador = sumador + (tabla1 * i);
        }
        System.out.println(sumador);
        return (sumador);
    }

    public static boolean comprobarNegativo(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return true;
            }
        }

return false;
    }
}





