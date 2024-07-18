
/**
 * Write a description of class DB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DB {
    public static Usuario[] usuario = new Usuario[100];
    public static int iu = 0;

    public static Cliente[] cliente = new Cliente[100];
    public static int ic = 0;

    public static Servicio[] servicio = new Servicio[100];
    public static int is = 0;

    public static Suscripcion[] suscripcion = new Suscripcion[100];
    public static int isus = 0;

    // Registrar Usuario
    public static void registrarUsuario(Usuario un) {
        usuario[iu] = un;
        iu++;
    }

    // Registrar Cliente
    public static void registrarCliente(Cliente cn) {
        cliente[ic] = cn;
        ic++;
    }

    // Eliminar Cliente por Código
    public static boolean eliminarClienteCodigo(String codigo) {
        for (int i = 0; i < ic; i++) {
            if (cliente[i].getCodigo().equals(codigo)) {
                cliente[i] = cliente[ic - 1];
                cliente[ic - 1] = null;
                ic--;
                return true;
            }
        }
        return false;
    }

    // Actualizar Cliente por Código
    public static boolean actualizarClienteCodigo(String codigo, Cliente nuevoCliente) {
        for (int i = 0; i < ic; i++) {
            if (cliente[i].getCodigo().equals(codigo)) {
                cliente[i] = nuevoCliente;
                return true;
            }
        }
        return false;
    }

    // Registrar Servicio
    public static void registrarServicio(Servicio sn) {
        servicio[is] = sn;
        is++;
    }

    // Registrar Suscripción
    public static void registrarSuscripcion(Suscripcion susn) {
        suscripcion[isus] = susn;
        isus++;
    }

    // Buscar Suscripción por Código
    public static Suscripcion buscarSuscripcionCodigo(int codigo) {
        for (int i = 0; i < isus; i++) {
            if (suscripcion[i].getCodigo() == codigo) {
                return suscripcion[i];
            }
        }
        return null;
    }

    // Pagar Suscripción
    public static boolean pagarSuscripcion(int codigo) {
        Suscripcion suscripcion = buscarSuscripcionCodigo(codigo);
        if (suscripcion != null) {
            suscripcion.setPagada(true);
            return true;
        }
        return false;
    }
}