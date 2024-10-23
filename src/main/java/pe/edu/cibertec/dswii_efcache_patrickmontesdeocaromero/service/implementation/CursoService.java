package pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.model.Curso;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.repository.CursoRepository;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.service.interfaces.ICursoService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoService implements ICursoService {

    private final CursoRepository cursoRepository;


    @Override
    @Cacheable(value = "cursosPorFacultad", key = "#facultadId")
    public List<Curso> getCursosByFacultad(int facultadId) {
        return this.cursoRepository.findByFacultadId(facultadId);
    }

    @Override
    @Cacheable(value = "promedioCreditosPorFacultad", key = "#facultadId")
    public Double getPromedioCreditosByFacultad(int facultadId) {
        return this.cursoRepository.findAvgCreditosByFacultad(facultadId);
    }
}
