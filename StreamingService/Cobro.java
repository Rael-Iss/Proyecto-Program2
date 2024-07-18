
/**
 * Write a description of class Cobro here.
 * 
 * @author (IssRael) 
 * @version (1.0)
 */
public class Cobro
{
    private int codigo;
    private String Cliente, fecha;
    private double monto;
    /**
     * Constructor for objects of class Cobros
     */
    public Cobro(int codigo, String Cliente, String fecha, double monto)
    {
        this.codigo= codigo;
        this.Cliente= Cliente;
        this.fecha= fecha;
        this.monto= monto;
    }
    
    //Seters y Geters
    /**
     * Metodo setCodigo
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
     * Metodo setMonto
     *  
     * @param  <monto> de monto double
     * @return  void 
     */
    public void setMonto(double monto)
    {
        this.monto= monto;
    }
    /**
     * Metodo getMonto
     * 
     * @return  double
     */
    public double getMonto()
    {
        return this.monto;
    }
}
