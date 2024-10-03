public class ContaBancaria {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        if (novoSaldo >= 0){
            saldo = novoSaldo;
        }else {
            System.out.println("Saldo invalido.");
        }
    }


}
