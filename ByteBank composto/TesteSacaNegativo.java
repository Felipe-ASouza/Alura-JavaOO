public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta contaDoJulio = new Conta();
        contaDoJulio.deposita(100);
        System.out.println(contaDoJulio.getSaldo());

        contaDoJulio.saca(10);

        System.out.println(contaDoJulio.getSaldo());
    }
}
