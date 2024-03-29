package projetoapijava.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoapijava.restapi.Repository.UsuarioRepository;
import projetoapijava.restapi.model.UsuarioModel;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping (path = "/api/usuario/{codigo}")
    public ResponseEntity consultar( @PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar (@RequestBody UsuarioModel usuario){
        return repository.save(usuario);
    }
}
