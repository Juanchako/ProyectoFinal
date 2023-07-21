package com.deluxefive.Dizelectricos.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "MedioPago")
public class MedioPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedioPago")
    private int idMedioPago;

    @Column(name = "tipoPago", nullable = false)
    private String tipoPago;

    @Column(name = "numCuenta", nullable = false, columnDefinition = "INT(10) ZEROFILL")
    private int numCuenta;

    @Column(name = "expiracion", nullable = false)
    private Date expiracion;

    @Column(name = "proveedor", nullable = false)
    private String proveedor;

    @ManyToOne
    @JoinColumn(name = "Usuario_idUsuario", referencedColumnName = "idUsuarioC")
    private Usuario usuario;

    @Column(name = "efectivo", nullable = false)
    private double efectivo;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "carritoCompras_idcarritoCompras", referencedColumnName = "idcarritoCompras"),
            @JoinColumn(name = "carritoCompras_Usuario_idUsuario", referencedColumnName = "Usuario_idUsuario")
    })
    private CarritoCompras carritoCompras;

    // Constructor, getters, and setters

    public MedioPago() {
        // Default constructor
    }

    public MedioPago(String tipoPago, int numCuenta, Date expiracion, String proveedor, Usuario usuario,
                     double efectivo, CarritoCompras carritoCompras) {
        this.tipoPago = tipoPago;
        this.numCuenta = numCuenta;
        this.expiracion = expiracion;
        this.proveedor = proveedor;
        this.usuario = usuario;
        this.efectivo = efectivo;
        this.carritoCompras = carritoCompras;
    }

    // Getters and Setters

    public int getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(int idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Date getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(Date expiracion) {
        this.expiracion = expiracion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public CarritoCompras getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(CarritoCompras carritoCompras) {
        this.carritoCompras = carritoCompras;
    }
}
