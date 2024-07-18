
/**
 * Write a description of class Cliente here.
 * 
 * @author (IssRael) 
 * @version (1.0)
 */
public class Cliente
{
    private String codigo;
    private String nombre, apellido, email, telefono;
    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String codigo, String nombre, String apellido, String email, String telefono)
    {
        this.codigo= codigo;
        this.nombre= nombre;
        this.apellido= apellido;
        this.email= email;
        this.telefono= telefono;
    }
    
    //Seters y Geters
    /**
     * Metodo setCodigo
     *  
     * @param  <codigo> de codigo String
     * @return  void 
     */
    public void setCodigo(String codigo)
    {
        this.codigo= codigo;
    }
    /**
     * Metodo getCodigo
     * 
     * @return  String
     */
    public String getCodigo()
    {
        return this.codigo;
    }
    
    /**
     * Metodo setNombre
     *  
     * @param  <nombre> de nombre String
     * @return  void 
     */
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
    /**
     * Metodo getNombre
     * 
     * @return  String
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * Metodo set Apellido
     *  
     * @param  <apellido> de apellido String
     * @return  void 
     */
    public void setApellido(String apellido)
    {
        this.apellido= apellido;
    }
    /**
     * Metodo getApellido
     * 
     * @return  String
     */
    public String getApellido()
    {
        return this.apellido;
    }
    
    /**
     * Metodo set Email
     *  
     * @param  <email> de email String
     * @return  void 
     */
    public void setEmail(String email)
    {
        this.email= email;
    }
    /**
     * Metodo getEmail
     * 
     * @return  String
     */
    public String getEmail()
    {
        return this.email;
    }
    
    /**
     * Metodo set Telefono
     *  
     * @param  <telefono> de telefono String
     * @return  void 
     */
    public void setTelefono(String telefono)
    {
        this.telefono= telefono;
    }
    /**
     * Metodo getTelefono
     * 
     * @return  String
     */
    public String getTelefono()
    {
        return this.telefono;
    }
}
