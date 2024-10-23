package pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.model.Curso;
import pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero.service.implementation.CursoService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    @GetMapping("/facultad/{facultadId}")
    public List<Curso> getCursosByFacultad(@PathVariable int facultadId) {
        return cursoService.getCursosByFacultad(facultadId);
    }

    @GetMapping("/promedio/facultad/{facultadId}")
    public Double getPromedioCreditosByFacultad(@PathVariable int facultadId) {
        return cursoService.getPromedioCreditosByFacultad(facultadId);
    }

}
