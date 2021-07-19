public class TesteBanco {
    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.nome = "Felipe Alexandre de Souza";
        felipe.cpf = "222.222.222-22";
        felipe.profissao = "Programador";

        Conta contaDoFelipe = new Conta();
        contaDoFelipe.deposita(100);

        contaDoFelipe.titular = felipe;
        System.out.println(contaDoFelipe.titular.nome);
        System.out.println(felipe);
    }
}
