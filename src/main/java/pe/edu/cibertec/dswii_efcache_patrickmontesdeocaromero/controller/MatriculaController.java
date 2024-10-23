package pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.model.Matricula;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.service.implementation.MatriculaService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/matriculas")
public class MatriculaController {

    private final MatriculaService matriculaService;


    @GetMapping("/estudiante/{estudianteId}")
    public List<Matricula> getMatriculasByEstudiante(@PathVariable int estudianteId) {
        return matriculaService.getMatriculasByEstudiante(estudianteId);
    }

}
