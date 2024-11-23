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
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "viagem")

public class Viagem {
    public Viagem(int i, String string, long l, long m, String string2, int j, int k) {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cidadeOrigem", nullable = false)
    private String cidadeOrigem;

    @Column(name = "dataSaida", nullable = false)
    private Long dataSaida;

    @Column(name = "horarioSaida", nullable = false)
    private Long horarioSaida;

    @Column(name = "cidadeDestino", nullable = false)
    private String cidadeDestino;

    @Column(name = "dataChegada", nullable = false)
    private Long dataChegada;

    @Column(name = "horarioPrevistoChegada", nullable = false)
    private Long horarioPrevistoChegada;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_onibus", nullable = false)
    private Onibus onibus;
}