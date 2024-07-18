
/**
 * Write a description of class DBA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class DBA {
    // Usuario
    public static void setUsuario(Usuario u) {
        DB.registrarUsuario(u);
    }

    public static boolean existeUsuario(Usuario us) {
        for (int i = 0; i < DB.iu; i++) {
            if (us.getUsuario().equals(DB.usuario[i].getUsuario()) && us.getPass().equals(DB.usuario[i].getPass())) {
                return true;
            }
        }
        return false;
    }

    // Cliente
    public static void setCliente(Cliente c) {
        DB.registrarCliente(c);
    }

    public static Cliente buscarClienteCodigo(String codigo) {
        for (int i = 0; i < DB.ic; i++) {
            if (DB.cliente[i].getCodigo().equals(codigo)) {
                return DB.cliente[i];
            }
        }
        return null;
    }

    public static boolean eliminarClienteCodigo(String codigo) {
        return DB.eliminarClienteCodigo(codigo);
    }

    public static boolean actualizarClienteCodigo(String codigo, Cliente nuevoCliente) {
        return DB.actualizarClienteCodigo(codigo, nuevoCliente);
    }

    // Servicio
    public static void setServicio(Servicio s) {
        DB.registrarServicio(s);
    }

    public static Servicio buscarServicioCodigo(String codigo) {
        for (int i = 0; i < DB.is; i++) {
            if (DB.servicio[i].getCodigo().equals(codigo)) {
                return DB.servicio[i];
            }
        }
        return null;
    }

    // Suscripción
    public static void setSuscripcion(Suscripcion sus) {
        DB.registrarSuscripcion(sus);
    }

    public static Suscripcion buscarSuscripcionCodigo(int codigo) {
        return DB.buscarSuscripcionCodigo(codigo);
    }

    public static boolean pagarSuscripcion(int codigo) {
        return DB.pagarSuscripcion(codigo);
    }
}


