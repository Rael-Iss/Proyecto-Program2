
/**
 * Write a description of class Factura here.
 * 
 * @author (IssRael) 
 * @version (1.0)
 */
public class Factura
{
    private int codigo;
    private String Cliente, fecha;
    private double total;
    /**
     * Constructor for objects of class Factura
     */
    public Factura(int codigo, String Cliente, String fecha, double total)
    {
        this.codigo= codigo;
        this.Cliente= Cliente;
        this.fecha= fecha;
        this.total= total;
    }
    
    //Seters y Geters
    /**
     * Metodo set codigo
     *  
     * @param  <codigo> de codigo int
     * @return  void 
     */
    public void setCodigo(int codigo)
    {
        this.codigo= codigo;
    }
    /**
     * Metodo getCodigo
     * 
     * @return  int
     */
    public int getCodigo()
    {
        return this.codigo;
    }
    
    /**
     * Metodo set Cliente
     *  
     * @param  <cliente> de cliente String
     * @return  void 
     */
    public void setCliente(String Cliente)
    {
        this.Cliente= Cliente;
    }
    /**
     * Metodo getCliente
     * 
     * @return  String
     */
    public String getCliente()
    {
        return this.Cliente;
    }
    
    /**
     * Metodo set fecha
     *  
     * @param  <fecha> de fecha String
     * @return  void 
     */
    public void setFecha(String fecha)
    {
        this.fecha= fecha;
    }
    /**
     * Metodo getFecha
     * 
     * @return  String
     */
    public String getFecha()
    {
        return this.fecha;
    }
    
    /**
     * Metodo setTotal
     *  
     * @param  <total> de total double
     * @return  void 
     */
    public void setTotal(double total)
    {
        this.total= total;
    }
    /**
     * Metodo getTotal
     * 
     * @return  double
     */
    public double getTotal()
    {
        return this.total;
    }
}
