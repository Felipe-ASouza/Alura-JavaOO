public class TestaMetodos {
    public static void main(String[] args) {
        Conta contaDoFelipe = new Conta();
        contaDoFelipe.deposita(50);
        System.out.println(contaDoFelipe.pegaSaldo());

        boolean conseguirRetirar = contaDoFelipe.saca(20);
        System.out.println(contaDoFelipe.pegaSaldo());
        System.out.println(conseguirRetirar);

        Conta contaDaJulia = new Conta();
        contaDaJulia.deposita(1000);

        if (contaDaJulia.transfere(3000, contaDoFelipe)) {
            System.out.println("Transferencia realizada com sucesso.");
        } else {
            System.out.println("Não foi possível realizar a transferencia, saldo insuficiente.");
        }
        System.out.println(contaDaJulia.pegaSaldo());
        System.out.println(contaDoFelipe.pegaSaldo());
    }
}
