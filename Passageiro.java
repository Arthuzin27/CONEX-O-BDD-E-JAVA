package br.com.unisales.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passageiro")
public class Passageiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;
    @Column(name = "sexo", nullable = false, unique = true)
    private String sexo;
    @Column(name = "cpf", nullable = false, unique = true)
    private Long cpf;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "celular", nullable = false, unique = true)
    private Long celular;
}