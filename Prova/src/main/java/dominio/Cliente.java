package dominio;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cep;
    private String email;

    private List <Animal> listCliente = new LinkedList<>();
    public Cliente(){
    }

    public Cliente(int id, String nome, String endereco, String telefone, String cep, String email, List<Animal> listCliente) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.email = email;
        this.listCliente = listCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Animal> getListCliente() {
        return listCliente;
    }

    public void setListCliente(List<Animal> listCliente) {
        this.listCliente = listCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id && Objects.equals(nome, cliente.nome) && Objects.equals(endereco, cliente.endereco) && Objects.equals(telefone, cliente.telefone) && Objects.equals(cep, cliente.cep) && Objects.equals(email, cliente.email) && Objects.equals(listCliente, cliente.listCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, endereco, telefone, cep, email, listCliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cep='" + cep + '\'' +
                ", email='" + email + '\'' +
                ", listCliente=" + listCliente +
                '}';
    }
}
