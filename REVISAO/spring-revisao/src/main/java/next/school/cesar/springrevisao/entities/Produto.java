package next.school.cesar.springrevisao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduto;
    private String nome;
    private double preco;
    private int quantidade;

    @ManyToOne
    private Categoria categoria;



}
