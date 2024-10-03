import java.util.concurrent.CompletableFuture;

public class ExemploAssincrono {
        public static void main(String[] args) {
            // Chamada assíncrona e exibe o resultado
            calcularSomaAssincrona(5, 3).thenAccept(resultado -> System.out.println("Resultado: " + resultado));

            try {
                int resultado = calcularSomaAssincrona(5, 3).get();
                System.out.println("Resultado (síncrono): " + resultado);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static CompletableFuture<Integer> calcularSomaAssincrona(int a, int b) {
            return CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return a + b;
            });
        }
    }
