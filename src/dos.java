import java.util.Scanner;

public class dos {
    public static void main(String[] args) {
        int tamaño;
        Scanner tk = new Scanner(System.in);

        System.out.println("Ingrese dimension de la matriz: "); tamaño=tk.nextInt();

        uno Objeto = new uno(tamaño);
        Objeto.datosM();
        Objeto.sumM();
        Objeto.muestraSuperMatriz();
    }
}
