import java.util.Scanner;

public class AppPacientes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Clientes pacientenovo = new Clientes();
        int opcao;
        
        do {
            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Inserir");
            System.out.println("2. Remover");
            System.out.println("3. Ordem de Inserção");
            System.out.println("4. Ordem Alfabética");
            System.out.println("5. Média de Consultas");
            System.out.println("6. Porcentagem das Doenças");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    Pacientes pacientex = new Pacientes();
                    pacientenovo.inserirPaciente(pacientex);
                    break;
                case 2:
                    pacientenovo.removerPaciente();
                    break;
                case 3:
                    pacientenovo.ordeminsercao();
                    break;
                case 4:
                    pacientenovo.ordemalfabeto();
                    break;
                case 5:
                    double mediaConsultas = pacientenovo.mediaConsultas();
                    System.out.println("Média das consultas: " + mediaConsultas);
                    break;
                case 6:
                    pacientenovo.porcentagemdoencas();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        teclado.close();
    }
}