package pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.model.Matricula;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

    List<Matricula> findByEstudianteId(int estudianteId);

}
