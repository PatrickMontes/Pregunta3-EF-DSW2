package pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.service.interfaces;

import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.model.Matricula;
import java.util.List;

public interface IMatriculaService {

    List<Matricula> getMatriculasByEstudiante(int estudianteId);

}
