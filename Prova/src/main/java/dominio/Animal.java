package dominio;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

public class Animal {

    private int id;
    private String nome;
    private LocalDate dataDeNascimento;
    private char sexo;
    private String especie;
    public Animal (){

    }

    public Animal(int id, String nome, LocalDate dataDeNascimento, char sexo, String especie) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.especie = especie;
    }

    public int getId() {
        id = 2;
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        nome = "Mel";
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {

        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public char getSexo() {
        sexo = 'F';
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        especie = "Gato";
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && sexo == animal.sexo && Objects.equals(nome, animal.nome) && Objects.equals(dataDeNascimento, animal.dataDeNascimento) && Objects.equals(especie, animal.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dataDeNascimento, sexo, especie);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", sexo=" + sexo +
                ", especie='" + especie + '\'' +
                '}';
    }
}
