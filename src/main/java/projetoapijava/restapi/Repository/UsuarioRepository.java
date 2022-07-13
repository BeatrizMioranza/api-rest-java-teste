package projetoapijava.restapi.Repository;

import org.springframework.data.repository.CrudRepository;
import projetoapijava.restapi.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository <UsuarioModel, Integer>{
}
