package com.deluxefive.Dizelectricos.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoria")
    private int idCategoria;

    @Column(name = "tipoCategoria", nullable = false)
    private String tipoCategoria;

    @ManyToOne
    @JoinColumn(name = "AgregarProductoAd_idAgregarProducto", referencedColumnName = "idAgregarProducto")
    private AgregaProductoAd agregaProductoAd;

    // Constructor, getters, and setters

    public Categoria() {
        // Default constructor
    }

    public Categoria(String tipoCategoria, AgregaProductoAd agregaProductoAd) {
        this.tipoCategoria = tipoCategoria;
        this.agregaProductoAd = agregaProductoAd;
    }

    // Getters and Setters

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public AgregaProductoAd getAgregaProductoAd() {
        return agregaProductoAd;
    }

    public void setAgregaProductoAd(AgregaProductoAd agregaProductoAd) {
        this.agregaProductoAd = agregaProductoAd;
    }
}
