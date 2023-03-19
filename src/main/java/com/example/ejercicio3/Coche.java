package com.example.ejercicio3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Marca;
    private String Industria;
    private String combustible;

    public Coche() {
    }

    public Coche(Long id, String marca, String industria, String combustible) {
        this.id = id;
        Marca = marca;
        Industria = industria;
        this.combustible = combustible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getIndustria() {
        return Industria;
    }

    public void setIndustria(String industria) {
        Industria = industria;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", Marca='" + Marca + '\'' +
                ", Industria='" + Industria + '\'' +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
