package Dominio;

import java.util.Date;


public class AvanceDeCurso {
        
    String nombrePlan;
    String fechaAvance;
    String temasAbordados;
    String temasPorVer;
    String actividadesRealizadas;
    String actividadesPorRealizar;
    String porcentajeAvance;
    
    public AvanceDeCurso(){}

    public AvanceDeCurso(String nombrePlan, String fechaAvance, String temasAbordados, String temasPorVer, String actividadesRealizadas, String actividadesPorRealizar, String porcentajeAvance) {
        this.nombrePlan = nombrePlan;
        this.fechaAvance = fechaAvance;
        this.temasAbordados = temasAbordados;
        this.temasPorVer = temasPorVer;
        this.actividadesRealizadas = actividadesRealizadas;
        this.actividadesPorRealizar = actividadesPorRealizar;
        this.porcentajeAvance = porcentajeAvance;
    }
    
    public String getNombrePlan(){
        return nombrePlan;
    }
    
    public void setNombrePlan(String nombrePlan){
        this.nombrePlan = nombrePlan;
    }
    
    public String getFechaAvance(){
        return fechaAvance;
    }
    
    public void setFechaAvance(String fechaAvance){
        this.fechaAvance = fechaAvance;
    }
    
    public String getTemasAbordados(){
        return temasAbordados;
    }
    
    public void setTemasAbordados(String temasAbordados){
        this.temasAbordados = temasAbordados;
    }
    
    public String getTemasPorVer(){
        return temasPorVer;
    }
    
    public void setTemasPorVer(String temasPorVer){
        this.temasPorVer = temasPorVer;
    }
    
    public String getActividadesRealizadas(){
        return actividadesRealizadas;
    }
    
    public void setActividadesRealizadas(String actividadesRealizadas){
        this.actividadesRealizadas = actividadesRealizadas;
    }
    
    public String getActividadesPorRealizar(){
        return actividadesPorRealizar;
    }
    
    public void setActividadesPorRealizar(String actividadesPorRealizar){
        this.actividadesPorRealizar = actividadesPorRealizar;
    }
    
    public String getPorcentajeAvance(){
        return porcentajeAvance;
    }
    
    public void setPorcentajeAvance(String porcentajeAvance){
        this.porcentajeAvance = porcentajeAvance;
    }
        
}
