import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");

        ContaCorrente conta1 = new ContaCorrente(cliente1);
        ContaPoupanca conta2 = new ContaPoupanca(cliente2);

        conta1.depositar(1000);
        conta2.depositar(1000);

        Banco banco = new Banco("Banco do Brasil");
        banco.setContas(List.of(conta1, conta2));

        banco.getContas().forEach(conta -> {
            conta.imprimirExtrato();
        });

        conta1.sacar(500);
        conta2.sacar(500);

        banco.getContas().forEach(conta -> {
            conta.imprimirExtrato();
        });

        conta1.emitirCheque(200);
        conta2.renderJuros(0.01);

        banco.getContas().forEach(conta -> {
            conta.imprimirExtrato();
        });

    }
}