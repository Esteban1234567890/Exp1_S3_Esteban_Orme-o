package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VentasController {
    
    private Tienda tienda;
    private List<Tienda> listaProductos;
    
    private List<Dia> dias;
    
    public VentasController(){

        listaProductos = new ArrayList<>();
        listaProductos.add(new Tienda(1,"Galletas de perro", 3000));
        listaProductos.add(new Tienda(2,"Juguete masticable", 5000));
        listaProductos.add(new Tienda(3,"Comida de perro", 4000));
        listaProductos.add(new Tienda(4,"Correa", 1000));
        listaProductos.add(new Tienda(5,"Arnes", 10000));

    }

    @GetMapping("/tienda")
    public List<Tienda> getTiendas() {
        return listaProductos;
    }

    @GetMapping("/tienda/dia")
    public List<Dia> getGananciaSemanal() {
        dias = new ArrayList<>();
        dias.add(new Dia("Lunes", listaProductos.get(2).getPrecio() + listaProductos.get(0).getPrecio()));
        dias.add(new Dia("Martes", listaProductos.get(3).getPrecio() + listaProductos.get(1).getPrecio())); 
        dias.add(new Dia("Miercoles", listaProductos.get(1).getPrecio() + listaProductos.get(3).getPrecio())); 
        dias.add(new Dia("Jueves", listaProductos.get(4).getPrecio() + listaProductos.get(2).getPrecio())); 
        dias.add(new Dia("Viernes", listaProductos.get(3).getPrecio() + listaProductos.get(2).getPrecio())); 
        dias.add(new Dia("Sabado", listaProductos.get(0).getPrecio() + listaProductos.get(4).getPrecio()));
        dias.add(new Dia("Domingo", listaProductos.get(0).getPrecio() + listaProductos.get(1).getPrecio()));        
        
        return dias;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public List<Tienda> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Tienda> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Dia> getDias() {
        return dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }

    

}
