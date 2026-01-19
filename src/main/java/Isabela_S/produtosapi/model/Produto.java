package Isabela_S.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto") //mapeamento da entidade "produto"
public class Produto {

    @Id
    @Column(name = "id") //mapear coluna no banco de dados
    private String id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "marca")
    private String marca;

    @Column(name = "preco")
    private Double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String descricao) {
        this.marca = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }
}
