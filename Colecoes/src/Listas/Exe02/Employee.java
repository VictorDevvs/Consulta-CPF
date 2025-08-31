package Listas.Exe02;

public class Employee {

    enum status {ACTIVE, INACTIVE}

    private String nome;
    private status status;

    public Employee(String nome, Employee.status status) {
        this.nome = nome;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public status getStatus() {
        return status;
    }
}
