//Permite agendar, listar, cancelar citas.
package servicio;

import modelo.Medico;
import modelo.Paciente;
import modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios;

    public UsuarioService() {
        usuarios = new ArrayList<>();
    }

    public boolean registrarUsuario(Usuario usuario) {
        for (Usuario u : usuarios){
            if(u.getCorreo().equalsIgnoreCase(usuario.getCorreo())){
                return false;
            }
        }
        usuarios.add(usuario);
        return true;
    }

    public Usuario iniciarSesion(String correo, String contrasena) {
        for (Usuario u : usuarios) {
            if (u.getCorreo().equalsIgnoreCase(correo) && u.getContrasena().equals(contrasena)) {
                return u;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
