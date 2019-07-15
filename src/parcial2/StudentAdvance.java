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
public class StudentAdvance extends AdvanceTicket{
    private int idestudiante;
    private String colegio;
    public StudentAdvance(double precio, int id, int idestudiante,String institucion) {
        super(precio, id);
        this.precio=precio;
        this.id = id;
        this.colegio = institucion;
        this.idestudiante = idestudiante;        
    }
    @Override
    public double getprecio() {
        
        
        return precio;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
    
    
    
    
}
