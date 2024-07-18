/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario{
    private String usuario, pass;
    public Usuario(String usuario, String pass)
    {
        this.usuario = usuario;
        this.pass = pass;
    }
    
    /**
     * Metodo setUsuario
     *  
     * @param  <usuario> de usuario String
     * @return  void 
     */
    public void setUsuario(String usuario)
    {
        this.usuario= usuario;
    }
    /**
     * Metodo getusuario
     * 
     * @return  String
     */
    public String getUsuario()
    {
        return this.usuario;
    }
    
    /**
     * Metodo setPass
     *  
     * @param  <pass> de pass String
     * @return  void 
     */
    public void setPass(String pass)
    {
        this.pass= pass;
    }
    /**
     * Metodo getPass
     * 
     * @return  String
     */
    public String getPass()
    {
        return this.pass;
    }
}