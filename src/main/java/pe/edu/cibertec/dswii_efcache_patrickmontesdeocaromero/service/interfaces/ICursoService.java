package pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.service.interfaces;

import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.model.Curso;

import java.util.List;

public interface ICursoService {

    List<Curso> getCursosByFacultad(int facultadId);
    Double getPromedioCreditosByFacultad(int facultadId);

}
