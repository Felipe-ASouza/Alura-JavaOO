public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.pegaSaldo();
        System.out.println(primeiraConta.pegaSaldo());

        primeiraConta.pegaSaldo();
        System.out.println(primeiraConta.pegaSaldo());


        Conta segundaConta = new Conta();
        segundaConta.pegaSaldo();
        System.out.println("A primeira conta tem " + primeiraConta.pegaSaldo());
        System.out.println("A segunda conta tem " + segundaConta.pegaSaldo());
    }
}
