package com.deluxefive.Dizelectricos.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "carritoCompras")
public class CarritoCompras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcarritoCompras")
    private int idcarritoCompras;

    @Column(name = "cantidadP", nullable = false, columnDefinition = "INT(10) ZEROFILL")
    private int cantidadP;

    @Column(name = "descuentoP", nullable = false)
    private double descuentoP;

    @Column(name = "totalP", nullable = false)
    private double totalP;

    @ManyToOne
    @JoinColumn(name = "Usuario_idUsuario", referencedColumnName = "idUsuarioC")
    private Usuario usuario;

    // Constructor, getters, and setters

    public CarritoCompras() {
        // Default constructor
    }

    public CarritoCompras(int cantidadP, double descuentoP, double totalP, Usuario usuario) {
        this.cantidadP = cantidadP;
        this.descuentoP = descuentoP;
        this.totalP = totalP;
        this.usuario = usuario;
    }

    // Getters and Setters

    public int getIdcarritoCompras() {
        return idcarritoCompras;
    }

    public void setIdcarritoCompras(int idcarritoCompras) {
        this.idcarritoCompras = idcarritoCompras;
    }

    public int getCantidadP() {
        return cantidadP;
    }

    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    public double getDescuentoP() {
        return descuentoP;
    }

    public void setDescuentoP(double descuentoP) {
        this.descuentoP = descuentoP;
    }

    public double getTotalP() {
        return totalP;
    }

    public void setTotalP(double totalP) {
        this.totalP = totalP;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
