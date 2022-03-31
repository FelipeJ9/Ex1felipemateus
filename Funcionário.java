package Ex1felipemateus;

public class Funcionário {
    String cpf, nome;
    double salario, valorRefeicao=550.00;

    public String retornarDados(){
        return " -- Nome: " + nome + " -- CPF: " + cpf + " -- Salario: " + salario + " --";
    }

    public void aumentarSalario(double porcentagem){
        porcentagem = 1 + (porcentagem/100);
        salario = salario * porcentagem;    
    }

    public void ajustarValeRefeicao(double porcentagem){
        porcentagem = 1 + (porcentagem/100);
        valorRefeicao = valorRefeicao * porcentagem;
    }
}