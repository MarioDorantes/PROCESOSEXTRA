/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;

/**
 *
 * @author gabrielflores
 */
public class PlanDeCurso {
        
    String curso;
    String nombrePlan;
    String fechaInicio;
    String fechaFin;
    String temas;
    String fechaTemas; 
    String nombreActividades;
    
    public PlanDeCurso (String curso, String nombrePlan, String fechaInicio, String fechaFin, String temas, String fechaTemas, String nombreActividades) {
        this.curso = curso;
        this.nombrePlan = nombrePlan;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.temas = temas;
        this.fechaTemas = fechaTemas;
        this.nombreActividades = nombreActividades;
    }

    public PlanDeCurso() {
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public String getNombrePlan(){
        return nombrePlan;
    }
    
    public void setNombrePlan (String nombrePlan){
        this.nombrePlan = nombrePlan;
    }
    
    public String getFechaInicio(){
        return fechaInicio;
    }
    
    public void setFechaInicio(String fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    
    public String getFechaFin(){
        return fechaFin;
    }
    
    public void setFechaFin(String fechaFin){
        this.fechaFin = fechaFin;
    }
    
    public String getTemas(){
        return temas;
    }
    
    public void setTemas(String temas){
        this.temas = temas;
    }
    
    public String getFechaTemas(){
        return fechaTemas;
    }
    
    public void setFechaTemas(String fechaTemas){
        this.fechaTemas = fechaTemas;
    }
    
    public String getNombreActividades(){
        return nombreActividades;
    }
    
    public void setNombreActividades(String nombreActividades){
        this.nombreActividades = nombreActividades;
    }
        
}
