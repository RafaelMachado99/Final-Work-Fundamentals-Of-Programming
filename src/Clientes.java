import java.util.Scanner;
import java.util.Arrays;
public class Clientes {

    private Pacientes[] paciente;

    private int posicao;

    public Clientes() {
        paciente = new Pacientes[10];
        posicao = 0;
    }

    public String inserirPaciente(Pacientes pacientex) {
        pacientex.setNome();
        pacientex.setCpf();
        pacientex.setTelefone();
        pacientex.setConvenio();
        pacientex.setDiagnostico();
        pacientex.setNumeroConsultas();
        if (posicao >= paciente.length) {
    return "Paciente não pode ser inserido!";
}
        paciente[posicao] = pacientex;
        posicao++;
    return "Paciente inserido com sucesso!";
}


    public void removerPaciente() {
        if (posicao == 0) {
            System.out.println("Não há pacientes cadastrados. Por favor, insira um paciente primeiro.");
            return;
        }
    
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do paciente a ser removido: ");
        String nome = teclado.nextLine();
    
        int index = -1;
        for (int i = 0; i < posicao; i++) {
            if (paciente[i].getNome().equalsIgnoreCase(nome)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < posicao - 1; i++) {
                paciente[i] = paciente[i + 1];
            }
            paciente[posicao - 1] = null;
            posicao--;
            System.out.println("Paciente removido com sucesso!");
        } else {
            System.out.println("Não existe, tente novamente!");
        }
    }

    public void ordeminsercao() {
            System.out.println("Ordem de Inserção:");
        for (int i = 0; i < posicao; i++) {
            System.out.println((i + 1) + ". " + paciente[i].getNome());
    }
    System.out.println();
}


    public void ordemalfabeto() {
        Pacientes[] pacientealfabeto = Arrays.copyOf(paciente, posicao);
        Arrays.sort(pacientealfabeto, (p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
        System.out.println("Ordem Alfabética:");
        int num = 0;
        for (Pacientes pacientex : pacientealfabeto) {
            System.out.println(num + 1 + ". " + pacientex.getNome());
            num++;
        }
        System.out.println();
    }

    public double mediaConsultas() {
        if (posicao == 0) {
            return 0;
        }

        double soma = 0;
        for (int i = 0; i < posicao; i++) {
            soma += paciente[i].getNumeroConsultas();
        }

        return soma / posicao;
    }

    public void porcentagemdoencas() {
        if (posicao == 0) {
            System.out.println("Não há cadastros.");
            return;
        }

        int countCovid = 0;
        int countDengue = 0;
        int countInfluenza = 0;
        int countMeningite = 0;
        int countOutro = 0;

        for (int i = 0; i < posicao; i++) {
            String diagnostico = paciente[i].getDiagnostico();

            if (diagnostico.equalsIgnoreCase("Covid")) {
                countCovid++;
            } else if (diagnostico.equalsIgnoreCase("Dengue")) {
                countDengue++;
            } else if (diagnostico.equalsIgnoreCase("Influenza")) {
                countInfluenza++;
            } else if (diagnostico.equalsIgnoreCase("Meningite")) {
                countMeningite++;
            } else {
                countOutro++;
            }
        }

        int totalPacientes = posicao;
        double percentCovid = (countCovid / (double) totalPacientes) * 100;
        double percentDengue = (countDengue / (double) totalPacientes) * 100;
        double percentInfluenza = (countInfluenza / (double) totalPacientes) * 100;
        double percentMeningite = (countMeningite / (double) totalPacientes) * 100;
        double percentOutro = (countOutro / (double) totalPacientes) * 100;

        System.out.println("\n===== Porcentagem de Pacientes =====");
        System.out.println("Covid: " + percentCovid + "%");
        System.out.println("Dengue: " + percentDengue + "%");
        System.out.println("Influenza: " + percentInfluenza + "%");
        System.out.println("Meningite: " + percentMeningite + "%");
        System.out.println("Outro: " + percentOutro + "%");
    }

}