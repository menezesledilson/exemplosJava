public class ArrayExemplo {


     public static int somaElementos(int[] array){
         int soma = 0;
         for (int elemento : array){
             soma += elemento;
         }
         return soma;
     }
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int resultado = somaElementos(numeros);
        System.out.println("A soma dos elementos e" + resultado);

    }
}
