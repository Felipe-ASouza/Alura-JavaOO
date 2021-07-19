public class TestaValores {
    public static void main(String[] args) {
        int total = 0;
        Conta conta = new Conta(1337,24226);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(2017,14234);
        Conta conta3 = new Conta(1337,3231);
    }
}
