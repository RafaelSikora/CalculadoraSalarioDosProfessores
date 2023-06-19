
/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 */
import java.util.Scanner;

public class App {

    //Calculo professor CNPJ
    public static void CNPJ (double contrato,String nomeProfessor){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor do contrato:");
        contrato = teclado.nextDouble();

        double salarioCNPJ = contrato;
        System.out.print("O nome do(a) professor(a) é: " + nomeProfessor);
        System.out.println("");
        System.out.print("O salário do(a) professor(a) é de: R$" + salarioCNPJ);    
    teclado.close();
    }

    //Calculo professor CLT
    public static void CLT (double mensal,String nomeProfessor){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor do seu salario mensal:");
        mensal = teclado.nextDouble();

        double salarioCLT = mensal;

        
        System.out.print("O nome do(a) professor(a) é: " + nomeProfessor);
        System.out.println("");
        System.out.print("O salário do(a) professor(a) é de: R$" + salarioCLT);
    teclado.close();
    }

 //Calculo Professor Horista
 public static void Horista (double horasTrabalhadas,double valorHora,String nomeProfessor){
        
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Informe quantas horas você trabalhou:");
        horasTrabalhadas = teclado.nextDouble();

        System.out.println("Informe quanto você ganha por hora:");
        valorHora = teclado.nextDouble();

        double salarioHorista = horasTrabalhadas * valorHora;
    
        System.out.print("O nome do(a) professor(a) é: " + nomeProfessor);
        System.out.println("");
        System.out.print("O salário do(a) professor(a) é de: R$" + salarioHorista);
    teclado.close();
}

    //Entrada de dados
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Seja bem vindo ao sistema feito para você calcular o seu salário!");
        System.out.println("Digite o seu nome:");
        String nomeProfessor = teclado.nextLine();

        System.out.println("Informe seu regime trabalhista:(1 para CLT, 2 para Horista ou 3 para CNPJ)?");
        int regimePagamento = teclado.nextInt();

        switch(regimePagamento){

            case 1: 
            CLT(regimePagamento, nomeProfessor);
            break;  

            case 2:
            Horista(regimePagamento, regimePagamento, nomeProfessor);
            break;

            case 3:
            CNPJ(regimePagamento, nomeProfessor);
            break;

            default:
            System.out.println("Regime de pagamento invalido. Reinicie o programa.");
            break;
        }
    teclado.close();
    }
}