
/**
 * Write a description of class Servicio here.
 * 
 * @author (IssRael) 
 * @version (1.0)
 */
public class Servicio
{
    private String codigo;
    private String nombre, descripcion;
    private double precio;
    /**
     * Constructor for objects of class Servicios
     */
    public Servicio(String codigo, String nombre, double precio, String descripcion)
    {
        this.codigo= codigo;
        this.nombre= nombre;
        this.precio= precio;
        this.descripcion= descripcion;
    }
    
    //Seters y Geters
    /**
     * Metodo set Codigo
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
     * Metodo set Nombre
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
     * Metodo set Precio
     *  
     * @param  <precio> de precio double
     * @return  void 
     */
    public void setPrecio(double precio)
    {
        this.precio= precio;
    }
    /**
     * Metodo getPreico
     * 
     * @return  double
     */
    public double getPrecio()
    {
        return this.precio;
    }
    
    /**
     * Metodo set Descripcion
     *  
     * @param  <descripcion> de descripcion String
     * @return  void 
     */
    public void setDescripcion(String descripcion)
    {
        this.descripcion= descripcion;
    }
    /**
     * Metodo getDescripcion
     * 
     * @return  String
     */
    public String getDescripcion()
    {
        return this.descripcion;
    }
}
