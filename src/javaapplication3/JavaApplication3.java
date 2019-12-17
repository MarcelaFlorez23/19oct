/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Persona> personas = new ArrayList <Persona>();
       String [] nom = { "ESTUDIANTE", "PROFESOR"};
    
       String resp = (String)JOptionPane.showInputDialog(null, "SELECCIONE UNA OPCION", "seleccione",JOptionPane.DEFAULT_OPTION,null,nom,nom[0]);
           
       }
        
    
  
    private static void printPersonas(List<Persona> personas){
        //este for solo en elementos iterables o recorrer
        for(Persona persona : personas){
            System.out.println(persona.getNombre());
           
            }
        }
     }  

