/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class TicketExpress {
    private static ArrayList<WalkUp> walkups;
    private static ArrayList<AdvanceTicket> advancetickets;
    private static ArrayList<StudentAdvance> studenttickets;

    public TicketExpress() {
        this.walkups = new ArrayList <WalkUp>();
        this.advancetickets = new ArrayList<AdvanceTicket>();
        this.studenttickets = new ArrayList<StudentAdvance>();
    }
    
    public void revisartickets(int id)throws TicketNumberException{
        for (int i = 0; i < walkups.size(); i++) {
            
            if (id == walkups.get(i).getId()) {
                throw new TicketNumberException("id repetido");
            }
        }
            
            for (int i = 0; i < advancetickets.size(); i++) {
                if (id == advancetickets.get(i).getId()) {
                    
                    throw new TicketNumberException("id repetido");
                }
            }
            
            for (int i = 0; i <studenttickets.size(); i++) {
                
                if (id == studenttickets.get(i).getId()) {
                    throw new TicketNumberException("id repetido");
                }
            
        }
            
        
    }
    
    public void  generarticket(String tipo, int id, int diasantes,int idestudiante,String institucion){
        
        
                
                if (tipo.equals("walkup")) {
                    
                    walkups.add(new WalkUp(50,id));
                }
                
                if (tipo.equals("advance")) {
                     if(diasantes>11){
                         
                         advancetickets.add(new AdvanceTicket(30,id));
                     }else{
                         advancetickets.add(new AdvanceTicket(40,id));
                     }
            
                    
                }
                
                if (tipo.equals("student")) {
                     if(diasantes>11){
                         
                         studenttickets.add(new StudentAdvance(15,id,idestudiante,institucion));
                     }else{
                         studenttickets.add(new StudentAdvance(20,id,idestudiante,institucion));
                     }
            
                    
                }
                
                
                
            }
            
        
        
    
    
    public double getpreciotipo(String tipo){
        double preciofin = 0;
        if (tipo.equals("advance")) {
            for (int i = 0; i < advancetickets.size(); i++) {
                preciofin = preciofin + advancetickets.get(i).getPrecio();
            }
            System.out.println("precio de todosl los advancetickets");
        }
        
        if (tipo.equals("student")){
            for (int i = 0; i < studenttickets.size(); i++) {
                preciofin = preciofin + studenttickets.get(i).getprecio();
            }
            System.out.println("precio de todosl los studentAdvance");
        }
        
        if(tipo.equals("walkup")){
            for (int i = 0; i < walkups.size(); i++) {
                preciofin = preciofin + walkups.get(i).getPrecio();
            }
        
        System.out.println("precio de todosl los walkups");
        }
        return preciofin;
    }
    
    public static void main(String[] args) {
        TicketExpress t1 = new TicketExpress();
        
        try{
         
          t1.revisartickets(1);
           t1.generarticket("walkup", 1, 1, 0, ""); 
          }catch(TicketNumberException ex){
            System.out.println("id repetidoid repetido en walkup");
        }
          
          try{
          
          t1.revisartickets(2);
          t1.generarticket("walkup", 2, 1, 0, ""); 
          }catch(TicketNumberException ex){
            System.out.println("id repetidoid repetido en walkup");
        }  
          try{
          
          t1.revisartickets(1);
          t1.generarticket("walkup", 1, 1, 0, ""); 
          }catch(TicketNumberException ex){
            System.out.println("id repetidoid repetido en walkup");
        } 
          
          
           try{
          
          t1.revisartickets(3);
           t1.generarticket("advance", 3, 12, 0, "");
          }catch(TicketNumberException ex){
            System.out.println("id repetido en advance tickets");
        } 
         try{
          
          t1.revisartickets(4);
           t1.generarticket("advance", 4, 2, 0, "");
          }catch(TicketNumberException ex){
            System.out.println("id repetido en advance tickets");
        } 
         
         try{
          
          t1.revisartickets(3);
           t1.generarticket("advance", 3, 12, 0, "");
          }catch(TicketNumberException ex){
            System.out.println("id repetido en advance tickets");
        } 
          
         try{
          
          t1.revisartickets(5);
           t1.generarticket("student", 5, 12, 1, "colegio1");
          }catch(TicketNumberException ex){
            System.out.println("id repetido en student advance");
        }
         
         try{
          
          t1.revisartickets(6);
           t1.generarticket("student", 6, 2, 1, "colegio2");
          }catch(TicketNumberException ex){
            System.out.println("id repetido en student advance");
        }
         try{
          
          t1.revisartickets(5);
           t1.generarticket("student", 5, 12, 1, "colegio3");
          }catch(TicketNumberException ex){
            System.out.println("id repetido en student advance");
        }
         
          
        
          
          
        
        
        System.out.println(t1.getpreciotipo("walkup"));
        System.out.println(t1.getpreciotipo("advance"));
        System.out.println(t1.getpreciotipo("student"));
        
        
        
        
    }
    
}
