import entities.conta;

import java.util.Scanner;

public class exerc23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Quanto de dinheiro em sua conta? R$");
        double dinheiro = in.nextDouble();

        conta c1 = new conta(dinheiro);
        
        int loop = 0;
        while (loop==0) {

            try {
                System.out.printf("1 - Sacar\n2 - Depositar\n3 - Exibir limite\n SEL: ");
                int menu = in.nextInt();
                switch (menu) {
                    case 1:
                        System.out.print("Digite o valor que deseja sacar: R$");
                        dinheiro = in.nextDouble();
                        if (dinheiro > c1.getSaldo()) {
                            System.out.println("Não é possível realizar o saque, saldo insuficiênte.");
                            break;
                        } else c1.sacar(dinheiro);
                        System.out.println(c1);
                        break;
                    case 2:
                        System.out.print("Digite o valor que deseja depositar: R$");
                        c1.depositar(in.nextDouble());
                        System.out.println(c1);
                        break;
                    case 3:
                        System.out.println(c1.exibirLimite());
                        break;
                    default:
                        System.out.println("Você digitou errado, tente novamente.");
                }
                System.out.print("Você deseja realizar outra operação (s/n)? ");
                String resp = in.next();
                if (resp.equals("n") || resp.equals("N")){
                    loop = 1;
                }
                System.out.println();
            }catch (java.util.InputMismatchException e){
                System.out.println("Você digitou errado, tente novamente.");
                in.nextLine();
            }


        }
    }
}
