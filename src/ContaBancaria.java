public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    public ContaBancaria( String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        if (this.saldo <= 0 || valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }

    public void tranferir(ContaBancaria destino, double valor) {
        destino.depositar(valor);
        this.saldo -= valor;
        if (this.saldo <= 0 || valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println(this.saldo);
    }
}
