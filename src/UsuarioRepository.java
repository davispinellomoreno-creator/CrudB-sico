import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }
    public  boolean validarEmail(String email){
        for (Usuario u : usuarios ){
            if(u.getEmail().equalsIgnoreCase(email)){
                return true;
            }
        }
        return false;
    }
}


