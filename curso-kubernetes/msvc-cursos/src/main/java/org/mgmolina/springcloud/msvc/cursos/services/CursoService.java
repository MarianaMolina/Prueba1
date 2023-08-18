package org.mgmolina.springcloud.msvc.cursos.services;

import org.mgmolina.springcloud.msvc.cursos.models.Usuario;
import org.mgmolina.springcloud.msvc.cursos.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);

    Optional<Curso> porIdConUsuarios(Long id);

    //Metodos relaiconados al cliente API rest, tendran comunicacion con el otro servicio
    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);

    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> eliminarUsuario(Usuario usuario, Long cursoId);



}
