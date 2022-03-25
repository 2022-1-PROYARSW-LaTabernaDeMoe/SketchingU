package SketchingU.SketchingU.Dao;

import SketchingU.SketchingU.Model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario,Long> {
    Usuario findByUsuario(String usuario);
}
