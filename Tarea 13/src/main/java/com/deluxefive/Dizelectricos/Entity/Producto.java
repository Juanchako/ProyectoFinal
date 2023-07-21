package com.deluxefive.Dizelectricos.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto", schema = "dizelectricrosdb")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private int idProducto;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "carritoCompras_idcarritoCompras", referencedColumnName = "idcarritoCompras"),
            @JoinColumn(name = "carritoCompras_Usuario_idUsuario", referencedColumnName = "Usuario_idUsuario")
    })
    private CarritoCompras carritoCompras;

    @ManyToOne
    @JoinColumn(name = "AgregaProductoAd_idAgregarProducto", referencedColumnName = "idAgregarProducto")
    private AgregaProductoAd agregaProductoAd;

    // Constructor, getters, and setters

    public Producto() {
        // Default constructor
    }

    public Producto(CarritoCompras carritoCompras, AgregaProductoAd agregaProductoAd) {
        this.carritoCompras = carritoCompras;
        this.agregaProductoAd = agregaProductoAd;
    }

    // Getters and Setters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public CarritoCompras getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(CarritoCompras carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    public AgregaProductoAd getAgregaProductoAd() {
        return agregaProductoAd;
    }

    public void setAgregaProductoAd(AgregaProductoAd agregaProductoAd) {
        this.agregaProductoAd = agregaProductoAd;
    }
}
