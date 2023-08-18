package org.mgmolina.springcloud.msvc.usuarios.services;

import org.mgmolina.springcloud.msvc.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> Listar();
    Optional<Usuario> porId(Long id);
    Usuario guardar(Usuario usuario);
    void eliminar(Long id);

    List<Usuario> ListarPorIds(Iterable<Long> ids);

    Optional<Usuario> porEmail(String email);

    boolean existePorEmail(String email);



}
