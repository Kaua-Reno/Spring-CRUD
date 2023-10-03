package br.gov.sp.fatec.projetospring20231.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "emp_empregado")
public class Empregado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_nome_completo")
    private String nome;

    @Column(name = "emp_ctps")
    private Long ctps;

    @Column(name = "emp_data_hora_cadastro")
    private LocalDateTime data;

    @Column(name = "emp_email")
    private String email;

    @Column(name = "emp_carga_horaria")
    private Float carga;

    public Empregado() {}

    public Empregado(String nome, Long ctps, LocalDateTime data, String email, Float carga) {
        this();
        this.nome = nome;
        this.ctps = ctps;
        this.data = data;    
        this.email = email;
        this.carga = carga;
    }

    public Long getId() {
    return id;
    }
    public void setId(Long id) {
    this.id = id;
    }
    public String getNome() {
    return nome;
    }
    public void setNome(String nome) {
    this.nome = nome;
    }
    public Long getCtps() {
    return ctps;
    }
    public void setCtps(Long ctps) {
    this.ctps = ctps;
    }
    public LocalDateTime getData() {
    return data;
    }
    public void setData(LocalDateTime data) {
    this.data = data;
    }
    public String getEmail() {
    return email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    public Float getCarga() {
    return carga;
    }
    public void setCarga(Float carga) {
    this.carga = carga;
    }
}

