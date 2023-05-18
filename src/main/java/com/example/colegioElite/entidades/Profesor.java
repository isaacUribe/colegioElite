package com.example.colegioElite.entidades;

public class Profesor {

    private Integer id;
    private String nombre;
    private Integer escalafon;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, Integer escalafon) {
        this.id = id;
        this.nombre = nombre;
        this.escalafon = escalafon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(Integer escalafon) {
        this.escalafon = escalafon;
    }
}
