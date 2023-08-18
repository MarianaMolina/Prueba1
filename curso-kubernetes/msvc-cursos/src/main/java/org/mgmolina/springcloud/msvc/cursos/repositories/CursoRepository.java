package org.mgmolina.springcloud.msvc.cursos.repositories;

import org.mgmolina.springcloud.msvc.cursos.models.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
