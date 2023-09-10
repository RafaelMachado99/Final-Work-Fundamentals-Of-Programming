import java.util.Scanner;

public class Pacientes {
    private String nome;
    private String cpf;
    private String telefone;
    private String convenio;
    private String diagnostico;
    private int numeroconsultas;

    public Pacientes() {
        this.nome = null;
        this.cpf = null;
        this.telefone = null;
        this.convenio = null;
        this.diagnostico = null;
        this.numeroconsultas = 0;
    }

    public double valorConsultas(double valor) {
        return valor = valor * this.getNumeroConsultas();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome() {
        Scanner teclado = new Scanner(System.in);
        String nomepaciente;
        System.out.println("Digite o nome do paciente: ");
        nomepaciente = teclado.next();
        this.nome = nomepaciente;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CPF: ");
        String cpf = teclado.nextLine();
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Telefone: ");
        String tele = teclado.nextLine();
        this.telefone = tele;
    }

    public String getConvenio() {
        return this.convenio;
    }

    public void setConvenio() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Convênio: ");
        String convenio = teclado.nextLine();
        this.convenio = convenio;
    }

    public String getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico() {
    Scanner teclado = new Scanner(System.in);
    String diagnostico;

    do {
        System.out.println("Diagnóstico: ");
        diagnostico = teclado.nextLine();

        if (diagnostico.equalsIgnoreCase("Covid") ||
        diagnostico.equalsIgnoreCase("Dengue") ||
        diagnostico.equalsIgnoreCase("Influenza") ||
        diagnostico.equalsIgnoreCase("Meningite") ||
        diagnostico.equalsIgnoreCase("Outro")) {
            this.diagnostico = diagnostico;
            System.out.println("Diagnóstico salvo como " + this.diagnostico);
            break;
        } else {
            System.out.println("Inválido, tente novamente.");
        }
    } while (true);
}


    public int getNumeroConsultas() {
        return this.numeroconsultas;
    }

    public void setNumeroConsultas() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Consultas no Mês: ");
        int numeroConsultas = teclado.nextInt();
        this.numeroconsultas = numeroConsultas;
    }


    @Override
    public String toString() {
        return "|" +
                " Nome = '" + getNome() + "'" +
                ", CPF = '" + getCpf() + "'" +
                ", Número = '" + getTelefone() + "'" +
                ", Convênio = '" + getConvenio() + "'" +
                ", Diagnóstico = '" + getDiagnostico() + "'" +
                ", Consultas = '" + getNumeroConsultas() + "'" +
                "|";
    }

}