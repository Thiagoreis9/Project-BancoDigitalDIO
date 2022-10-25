public class main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Thiago Reis");

        Conta cc = new ContaCorrente(c1);
        Conta poupanca = new ContaPoupanca(c1);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();



    }
}
