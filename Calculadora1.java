import java.util.Scanner;

import static javax.management.Query.or;

public class Calculadora1 {
    public static void main(String[]args) {
        System.out.println("Bem vindo(a) a sua calcualdora!");
        System.out.println("O que vamos relaizar hoje?:");

        String r = "S";
        Scanner opcao = new Scanner(System.in);

        while (r.equals("S") ) {
            System.out.print("Escolha uma das opsões: [1]Soma [2]Subtrair [3]Multiplicar [4]Dividir: ");
            int operacao = opcao.nextInt();
            if (operacao < 1 || operacao > 4) {
                System.out.println("Opção não existe, tente novamente!");
                continue;
            }
                System.out.print("Agora digite o 1° nuemro: ");
                int num1 = opcao.nextInt();
                System.out.print("Agora digite o 2° nuemro: ");
                int num2 = opcao.nextInt();
                if (operacao == 1) {
                    System.out.println("O resultado é " + (num1 + num2));
                } else if (operacao == 2) {
                    if (num1 > num2){
                    System.out.println("O resultado é " + (num1 - num2));}
                    else{
                        System.out.println("O resultado é " + (num2 - num1));}
                } else if (operacao == 3) {
                    System.out.println("O resultado é " + (num1 * num2));
                } else if (operacao == 4) {
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Não pode ser executado");
                        continue;
                    }
                    if (num1 > num2) {
                        System.out.println("O resultado é " + (num1 / num2));
                    } else {
                        System.out.println("O resultado é " + num2 / num1);
                    }
                }
                System.out.print("Deseja continuar? [S/N]: ");
                r = opcao.next().toUpperCase();
                if (!r.equalsIgnoreCase("S")) {
                System.out.println("Fim do programa!"); }}}}

