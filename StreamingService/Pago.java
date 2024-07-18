
/**
 * Write a description of class Pago here.
 * 
 * @author (IssRael) 
 * @version (1.0)
 */
public class Pago
{
    int codigo;
    String Cliente, servicio, fecha, tipoPago;
    double monto;
    /**
     * Constructor for objects of class Pago
     */
    public Pago(int codigo, String cliente, String servicio, String fecha, String tipoPago, double monto)
    {
        this.codigo= codigo;
        this.Cliente= Cliente;
        this.servicio= servicio;
        this.fecha= fecha;
        this.tipoPago= tipoPago;
        this.monto= monto;
    }
    
    //Seters y Geters
    /**
     * Metodo set Codigo
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
     * Metodo set Servicio
     *  
     * @param  <servicio> de servicio String
     * @return  void 
     */
    public void setServicio(String servicio)
    {
        this.servicio= servicio;
    }
    /**
     * Metodo getServicio
     * 
     * @return  String
     */
    public String getServicio()
    {
        return this.servicio;
    }
    
    /**
     * Metodo set Fecha
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
     * Metodo set TipoPago
     *  
     * @param  <tipoPago> de tipoPago String
     * @return  void 
     */
    public void setTipoPago(String tipoPago)
    {
        this.tipoPago= tipoPago;
    }
    /**
     * Metodo getTipoPago
     * 
     * @return  String
     */
    public String getTipoPago()
    {
        return this.tipoPago;
    }
    
    /**
     * Metodo set Monto
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
