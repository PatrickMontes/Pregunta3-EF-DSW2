package pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {
}
