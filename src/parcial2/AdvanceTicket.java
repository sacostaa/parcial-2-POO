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
public class AdvanceTicket extends Ticket{

    public AdvanceTicket(double precio, int id) {
        super(precio, id);
        this.precio=precio;
        this.id = id;
    }

    @Override
    public double getprecio() {
        
        return precio;
    }
    
}
