package negocio;

import accesodato.Coneccion;

public class Usuario {
    private int usuario_id;
    private String nombre;
    private String passwd;
    private String fecha;
    private String Estado;
    
    
    
    Coneccion con;
    public Usuario() {
    con=new Coneccion();
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Coneccion getCon() {
        return con;
    }

    public void setCon(Coneccion con) {
        this.con = con;
    }
      
    
    public void GuardarUsuario(){
   
       con.setInsertar("insert into usuarios(nombre,passwd,fecha,estado) values('"+this.getNombre()+"','"+this.getPasswd()+"','"+this.getFecha()+"','activo')");
     
    }
    
    public void BorrarUsuario(){
    con.setConsulta("update usuarios  set estado='pasivo' where usuario_id='"+this.getUsuario_id() +"'");
    
    }
    
    public void ActualizarUsuario(){
     
     con.setInsertar("UPDATE usuarios set nombre= '"+this.getNombre()+"',passwd= '"+this.getPasswd()+"',fecha= '"+this.getFecha()+"',estado= 'activo' where usuario_id='"+this.getUsuario_id() +"'");
 
    }
    
    
}