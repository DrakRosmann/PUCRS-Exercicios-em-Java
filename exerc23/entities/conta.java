package entities;

public class conta {
    private double saldo;

    public conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public String exibirLimite(){
        if (saldo<500){
            return "Você não possui limite.\n";
        } else if (saldo >=500 && saldo<1000) {
            return "Seu limite é de R$"+(saldo*0.08)+"\n";
        } else {
            return "Seu limite é de R$"+(saldo*0.15)+"\n";
        }
    }

    @Override
    public String toString() {
        return "Você tem R$"+
                saldo+
                " em conta.\n";
    }
}
