package Ex1felipemateus;

public class Main { 
    public static void main (String[] args) {
        Cliente cliente = new Cliente();
        for(int i=0; i<12; i++) {
            for(int j=0; j<31; j++) {
            cliente.conta.extrato[j][i] = "";
        }
    }
    
    cliente.conta.depositar(400);
    cliente.conta.sacar(100);
    cliente.nome = "felipe";
    cliente.cpf = "321"; 

    System.out.println(cliente.conta.retornarDados()); 
    System.out.println(cliente.conta.gerarExtrato(10));

}
}