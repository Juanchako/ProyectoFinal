package com.deluxefive.Dizelectricos.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "AgregaProductoAd")
public class AgregaProductoAd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAgregarProducto")
    private int idAgregarProducto;

    @Column(name = "nombreAp", nullable = false)
    private String nombreAp;

    @Column(name = "marcaAp", nullable = false)
    private String marcaAp;

    @Column(name = "precioUnitarioAp", nullable = false)
    private double precioUnitarioAp;

    @Column(name = "cantidadAp", nullable = false, columnDefinition = "INT(10) ZEROFILL")
    private int cantidadAp;

    @Column(name = "descripcionAp", nullable = false)
    private String descripcionAp;

    @Column(name = "descripcionLAp", nullable = false)
    private String descripcionLAp;

    @Column(name = "rutaImagenAp", nullable = false)
    private String rutaImagenAp;

    @Column(name = "nameImagenAp", nullable = false)
    private String nameImagenAp;

    @ManyToOne
    @JoinColumn(name = "Administrador_idAdministrador", referencedColumnName = "idAdministrador")
    private Administrador administrador;

    // Constructor, getters, and setters

    public AgregaProductoAd() {
        // Default constructor
    }

    public AgregaProductoAd(String nombreAp, String marcaAp, double precioUnitarioAp, int cantidadAp,
                            String descripcionAp, String descripcionLAp, String rutaImagenAp,
                            String nameImagenAp, Administrador administrador) {
        this.nombreAp = nombreAp;
        this.marcaAp = marcaAp;
        this.precioUnitarioAp = precioUnitarioAp;
        this.cantidadAp = cantidadAp;
        this.descripcionAp = descripcionAp;
        this.descripcionLAp = descripcionLAp;
        this.rutaImagenAp = rutaImagenAp;
        this.nameImagenAp = nameImagenAp;
        this.administrador = administrador;
    }

    // Getters and Setters

    public int getIdAgregarProducto() {
        return idAgregarProducto;
    }

    public void setIdAgregarProducto(int idAgregarProducto) {
        this.idAgregarProducto = idAgregarProducto;
    }

    public String getNombreAp() {
        return nombreAp;
    }

    public void setNombreAp(String nombreAp) {
        this.nombreAp = nombreAp;
    }

    public String getMarcaAp() {
        return marcaAp;
    }

    public void setMarcaAp(String marcaAp) {
        this.marcaAp = marcaAp;
    }

    public double getPrecioUnitarioAp() {
        return precioUnitarioAp;
    }

    public void setPrecioUnitarioAp(double precioUnitarioAp) {
        this.precioUnitarioAp = precioUnitarioAp;
    }

    public int getCantidadAp() {
        return cantidadAp;
    }

    public void setCantidadAp(int cantidadAp) {
        this.cantidadAp = cantidadAp;
    }

    public String getDescripcionAp() {
        return descripcionAp;
    }

    public void setDescripcionAp(String descripcionAp) {
        this.descripcionAp = descripcionAp;
    }

    public String getDescripcionLAp() {
        return descripcionLAp;
    }

    public void setDescripcionLAp(String descripcionLAp) {
        this.descripcionLAp = descripcionLAp;
    }

    public String getRutaImagenAp() {
        return rutaImagenAp;
    }

    public void setRutaImagenAp(String rutaImagenAp) {
        this.rutaImagenAp = rutaImagenAp;
    }

    public String getNameImagenAp() {
        return nameImagenAp;
    }

    public void setNameImagenAp(String nameImagenAp) {
        this.nameImagenAp = nameImagenAp;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
