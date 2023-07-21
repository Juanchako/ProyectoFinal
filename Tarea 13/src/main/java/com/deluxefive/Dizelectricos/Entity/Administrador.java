package com.deluxefive.Dizelectricos.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAdministrador")
    private int idAdministrador;

    @Column(name = "nombreA", nullable = false)
    private String nombreA;

    @Column(name = "correoA", nullable = false)
    private String correoA;

    @Column(name = "contraseñaA", nullable = false)
    private String contraseñaA;

    @OneToOne
    @JoinColumn(name = "Vendido_idVendido", referencedColumnName = "idVendido")
    private PedidoVendido vendido;

    // Constructor, getters, and setters

    public Administrador() {
        // Default constructor
    }

    public Administrador(String nombreA, String correoA, String contraseñaA, PedidoVendido vendido) {
        this.nombreA = nombreA;
        this.correoA = correoA;
        this.contraseñaA = contraseñaA;
        this.vendido = vendido;
    }

    // Getters and Setters

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getCorreoA() {
        return correoA;
    }

    public void setCorreoA(String correoA) {
        this.correoA = correoA;
    }

    public String getContraseñaA() {
        return contraseñaA;
    }

    public void setContraseñaA(String contraseñaA) {
        this.contraseñaA = contraseñaA;
    }

    public PedidoVendido getVendido() {
        return vendido;
    }

    public void setVendido(PedidoVendido vendido) {
        this.vendido = vendido;
    }
}
