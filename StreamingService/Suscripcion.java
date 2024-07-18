
/**
 * Write a description of class Suscripcion here.
 * 
 * @author (IssRael) 
 * @version (1.0)
 */
public class Suscripcion
{
    private int codigo;
    private String CCliente, CServicio, fechaInicio, fechaCobro;
    private boolean pagada;
    /**
     * Constructor for objects of class Suscripciones
     */
    public Suscripcion(int codigo, String CCliente, String CServicio, String fechaInicio, String fechaCobro)
    {
        this.codigo= codigo;
        this.CCliente= CCliente;
        this.CServicio= CServicio;
        this.fechaInicio= fechaInicio;
        this.fechaCobro= fechaCobro;
        this.pagada= false;
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
     * Metodo set CCliente
     *  
     * @param  <CCliente> de CCliente String
     * @return  void 
     */
    public void setCCliente(String CCliente)
    {
        this.CCliente= CCliente;
    }
    /**
     * Metodo getCCliente
     * 
     * @return  String
     */
    public String getCCliente()
    {
        return this.CCliente;
    }
    
    /**
     * Metodo set CServicio
     *  
     * @param  <Servicio> de CServicio String
     * @return  void 
     */
    public void setCServicio(String CServicio)
    {
        this.CServicio= CServicio;
    }
    /**
     * Metodo getCServicio
     * 
     * @return  String
     */
    public String getCServicio()
    {
        return this.CServicio;
    }
    
    /**
     * Metodo set FechaInicio
     *  
     * @param  <fechaInicio> de fechaInicio String
     * @return  void 
     */
    public void setFechaInicio(String fechaInicio)
    {
        this.fechaInicio= fechaInicio;
    }
    /**
     * Metodo getFechaInicio
     * 
     * @return  String
     */
    public String getFechaInicio()
    {
        return this.fechaInicio;
    }
    
    /**
     * Metodo set fechaCobro
     *  
     * @param  <fechaCobro> de fechaCobro String
     * @return  void 
     */
    public void setFechaCobro(String fechaCobro)
    {
        this.fechaCobro= fechaCobro;
    }
    /**
     * Metodo getFechaCobro
     * 
     * @return  String
     */
    public String getFechaCobro()
    {
        return this.fechaCobro;
    }
    
    /**
     * Metodo set pagada
     *  
     * @param  <pagada> de pagada boolean
     * @return  void 
     */
    public void setPagada(boolean pagada)
    {
        this.pagada= pagada;
    }
    /**
     * Metodo getPagada
     * 
     * @return  boolean
     */
    public boolean getPagada()
    {
        return this.pagada;
    }
}
