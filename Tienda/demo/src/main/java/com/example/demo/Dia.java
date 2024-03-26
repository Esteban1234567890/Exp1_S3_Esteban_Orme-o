package com.example.demo;

public class Dia {
    
    private String nombreDia;
    private int totalVentas;

    
    public Dia(String nombreDia, int totalVentas) {
        this.nombreDia = nombreDia;
        this.totalVentas = totalVentas;
    }

    public Dia(){
        
    }

    public String getNombreDia() {
        return nombreDia;
    }
    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }
    public int getTotalVentas() {
        return totalVentas;
    }
    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

}
