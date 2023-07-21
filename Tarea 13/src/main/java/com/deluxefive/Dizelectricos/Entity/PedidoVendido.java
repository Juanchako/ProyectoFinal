package com.deluxefive.Dizelectricos.Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PedidoVendido")
public class PedidoVendido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPedido")
    private int idPedido;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaEntregaP", nullable = false)
    private Date fechaEntregaP;

    @ManyToOne
    @JoinColumn(name = "Usuario_idUsuario", referencedColumnName = "idUsuarioC")
    private Usuario usuario;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "carritoCompras_idcarritoCompras", referencedColumnName = "idcarritoCompras"),
            @JoinColumn(name = "carritoCompras_Usuario_idUsuario", referencedColumnName = "Usuario_idUsuario")
    })
    private CarritoCompras carritoCompras;

    @ManyToOne
    @JoinColumn(name = "Administrador_idAdministrador", referencedColumnName = "idAdministrador")
    private Administrador administrador;

    // Constructor, getters, and setters

    public PedidoVendido() {
        // Default constructor
    }

    public PedidoVendido(Date fechaEntregaP, Usuario usuario, CarritoCompras carritoCompras, Administrador administrador) {
        this.fechaEntregaP = fechaEntregaP;
        this.usuario = usuario;
        this.carritoCompras = carritoCompras;
        this.administrador = administrador;
    }

    // Getters and Setters

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaEntregaP() {
        return fechaEntregaP;
    }

    public void setFechaEntregaP(Date fechaEntregaP) {
        this.fechaEntregaP = fechaEntregaP;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public CarritoCompras getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(CarritoCompras carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
