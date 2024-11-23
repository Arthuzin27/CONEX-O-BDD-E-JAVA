package br.com.unisales.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@Table(name = "passagem")
public class Passagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "custo", nullable = false)
    private int custo;
    @ManyToOne(targetEntity=Onibus.class, fetch=FetchType.EAGER)
    @JoinColumn(name = "id_vendedor")
    private Vendedor vendedor;
    @JoinColumn(name = "id_assento")
    private Assento assento;
    @JoinColumn(name = "id_viagem")
    private Viagem viagem;
    @JoinColumn(name = "id_passageiro")
    private Passageiro passageiro;

    public Passagem(int id, int custo, int id_vendedor, int id_assento, int id_viagem, int id_passageiro) {
    }

}