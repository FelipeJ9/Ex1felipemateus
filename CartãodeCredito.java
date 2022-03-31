package Ex1felipemateus;

public class CartãodeCredito {
    int numero;
    double totalFatura;

    public double consultarFatura(){
        return totalFatura;
    }
    
    public String retornarDados(){
        return "Número do cartão: " + numero + "---- Valor fatura: " + totalFatura + "----";
    }
  
}