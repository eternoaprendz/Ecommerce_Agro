package br.integrado.Tech_academy4.controller;

import br.integrado.Tech_academy4.dto.UsuarioRequestDTO;
import br.integrado.Tech_academy4.model.Usuario;
import br.integrado.Tech_academy4.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> usuarios = this.repository.findAll();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody UsuarioRequestDTO dto) {
        if (dto.nome().isEmpty()) {
            return ResponseEntity.status(428).build();
        }

        Usuario usuario = new Usuario();
        usuario.setNome(dto.nome());

        this.repository.save(usuario);
        return ResponseEntity.ok(usuario);
    }

}
