package pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.model.Curso;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    List<Curso> findByFacultadId(int facultadId);

    @Query("SELECT AVG(c.creditos) FROM Curso c WHERE c.facultad.id = ?1")
    Double findAvgCreditosByFacultad(int facultadId);

}
