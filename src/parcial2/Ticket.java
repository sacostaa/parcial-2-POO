/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Estudiante
 */
public abstract class Ticket {
    
    protected double precio;
    protected int id;
    
    

    public Ticket (double precio, int id) {
        this.precio = precio;
        this.id = id;
    }
    
    
    
    public abstract double getprecio();

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
    
    
    
    
    
}
