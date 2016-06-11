package negocio;

import accesodato.Coneccion;

public class Habilidad {

    private int habilidad_id;
    private String nombre;
    private String estado;
    Coneccion con;

    public Habilidad() {
        con = new Coneccion();
    }

    public int getHabilidad_id() {
        return habilidad_id;
    }

    public void setHabilidad_id(int habilidad_id) {
        this.habilidad_id = habilidad_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Coneccion getCon() {
        return con;
    }

    public void setCon(Coneccion con) {
        this.con = con;
    }

    
    public void GuardarHabilidad(){
    
    con.setInsertar("insert into Habilidades(nombre,estado) values('"+this.getNombre()+"','activo')  ");
    }
    
    public void BorrarHabilidad(){
    con.setInsertar("update Habilidades  set estado='pasivo' where habilidad_id='"+this.getHabilidad_id() +"'");
    
    }
    
    public void ActualizarHabilidad(){
    con.setInsertar("update Habilidades set nombre='"+this.getNombre() +"',estado='activo' where habilidad_id='"+this.getHabilidad_id() +"' ");
    
    
    }
    
}
