package com.deluxefive.Dizelectricos.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuarioC")
    private int idUsuarioC;

    @Column(name = "nombreU", nullable = false)
    private String nombreU;

    @Column(name = "barrioU", nullable = false)
    private String barrioU;

    @Column(name = "municipioU", nullable = false)
    private String municipioU;

    @Column(name = "correoU", nullable = false, unique = true)
    private String correoU;

    @Column(name = "telefonoU", nullable = false)
    private String telefonoU;

    @Column(name = "direccionU", nullable = false)
    private String direccionU;

    @Column(name = "contraseñaU", nullable = false, unique = true)
    private String contraseñaU;

    // Constructor, getters, and setters

    public Usuario() {
        // Default constructor
    }

    public Usuario(String nombreU, String barrioU, String municipioU, String correoU, String telefonoU,
                   String direccionU, String contraseñaU) {
        this.nombreU = nombreU;
        this.barrioU = barrioU;
        this.municipioU = municipioU;
        this.correoU = correoU;
        this.telefonoU = telefonoU;
        this.direccionU = direccionU;
        this.contraseñaU = contraseñaU;
    }

    // Getters and Setters

    public int getIdUsuarioC() {
        return idUsuarioC;
    }

    public void setIdUsuarioC(int idUsuarioC) {
        this.idUsuarioC = idUsuarioC;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getBarrioU() {
        return barrioU;
    }

    public void setBarrioU(String barrioU) {
        this.barrioU = barrioU;
    }

    public String getMunicipioU() {
        return municipioU;
    }

    public void setMunicipioU(String municipioU) {
        this.municipioU = municipioU;
    }

    public String getCorreoU() {
        return correoU;
    }

    public void setCorreoU(String correoU) {
        this.correoU = correoU;
    }

    public String getTelefonoU() {
        return telefonoU;
    }

    public void setTelefonoU(String telefonoU) {
        this.telefonoU = telefonoU;
    }

    public String getDireccionU() {
        return direccionU;
    }

    public void setDireccionU(String direccionU) {
        this.direccionU = direccionU;
    }

    public String getContraseñaU() {
        return contraseñaU;
    }

    public void setContraseñaU(String contraseñaU) {
        this.contraseñaU = contraseñaU;
    }
}
