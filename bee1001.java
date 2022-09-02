import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        
        double A, B, X;
        
        A = in.nextDouble();
        B = in.nextDouble();
        
        X = A + B;
        
        System.out.printf("X = %.2f\n", X);
    }
}