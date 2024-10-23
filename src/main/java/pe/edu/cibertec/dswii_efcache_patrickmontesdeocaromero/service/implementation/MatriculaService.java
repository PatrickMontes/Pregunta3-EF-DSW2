package pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.model.Matricula;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.repository.MatriculaRepository;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.service.interfaces.IMatriculaService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatriculaService implements IMatriculaService {

    private final MatriculaRepository matriculaRepository;


    @Override
    @Cacheable(value = "matriculaPorEstudiante", key = "#estudianteId")
    public List<Matricula> getMatriculasByEstudiante(int estudianteId) {
        return this.matriculaRepository.findByEstudianteId(estudianteId);
    }
}
