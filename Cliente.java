package Ex1felipemateus;

public class Cliente {
     String nome, cpf;
    Conta conta = new Conta();
    CartãodeCredito cartaoDeCredito = new CartãodeCredito();

    public String retornarDados(){
        return "Nome:" + nome + "---- CPF: " + cpf + 
               "\nCartão de crédito-> " + cartaoDeCredito.retornarDados() + 
               "\nConta=> " + conta.retornarDados() + ";
    }
}
