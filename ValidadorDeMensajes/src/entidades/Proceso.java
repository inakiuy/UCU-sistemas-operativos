/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Inaki
 */
public class Proceso implements IProceso {

    /**
     * Atributes *****************************************************
     */
    private String nombre;
    private String tipo;
    private LinkedList<Integer> comportamiento;
    private Boolean EntradaSalida; 
    private Long tiempoDeLlegada;
    private int prioridad;
    
    // End Atributes *************************************

      
    /**
     * Constructors ****************************************************
     */
    /**
     * Constructor basico
     *
     * @param pnombre
     * @param ptipo
     */
    public Proceso(String pnombre, String ptipo) {
        this.nombre = pnombre;
        this.tipo = ptipo;
    }

    /**
     * Constructor con comportamiento
     *
     * @param pnombre
     * @param ptipo
     * @param pComportamiento
     * @param ptiempoDeLlegada
     */
    public Proceso(String pnombre, String ptipo, String pComportamiento, Long ptiempoDeLlegada) {
        this.nombre = pnombre;
        this.tipo = ptipo;
        this.comportamiento = new LinkedList();
        String[] datos_comportamiento = pComportamiento.split(",");
        for (String dato : datos_comportamiento) {
            comportamiento.add(Integer.parseInt(dato));
        }
        this.tiempoDeLlegada = ptiempoDeLlegada;
        this.prioridad = 3;                     // Prioridad 3 por defecto.
        this.EntradaSalida = false;             //El primer valor no es una E/S
        
    }

    // End Constructors ***********************************
    
    
    /**
     * Methods ****************************************************
     */
    // End Methods ****************************************    
    
    
    /**
     * Getters and Setters ****************************************************
     */
    /**
     * @return the nombre
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the tipo
     */
    @Override
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the comportamiento
     */
    @Override
    public LinkedList getComportamiento() {
        return comportamiento;
    }

    /**
     * @return the tiempoDeLlegada
     */
    @Override
    public Long getTiempoDeLlegada() {
        return tiempoDeLlegada;
    }
    // End Getters and Setters ****************************    

    @Override
    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    @Override
    public Boolean getEntradaSalida() {
        return EntradaSalida;
    }

    @Override
    public void setEntradaSalida() {
        this.EntradaSalida = ! EntradaSalida;
    }
}
