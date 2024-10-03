import java.util.Scanner;

public class ArrayValores {
    public static void main(String[] args) {
        try{
            int [] numeros = {1,2,3};
            System.out.println(numeros[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: indeice fora dos limites do array.");
        }finally {
            System.out.println("Fim da execucao.");
        }
    }
}
