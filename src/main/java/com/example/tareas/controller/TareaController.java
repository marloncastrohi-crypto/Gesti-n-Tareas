package com.example.tareas.controller;

import com.example.tareas.model.Tarea;
import com.example.tareas.model.Estado;
import com.example.tareas.service.TareaService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {
    private final TareaService service;

    public TareaController(TareaService service) {
        this.service = service;
    }

    @PostMapping
    public Tarea crear(@RequestBody Tarea tarea) {
        return service.crearTarea(tarea);
    }

    @GetMapping
    public List<Tarea> listar() {
        return service.listarTareas();
    }

    @GetMapping("/{id}")
    public Tarea obtener(@PathVariable Long id) {
        return service.obtenerTarea(id).orElseThrow(() -> new RuntimeException("No encontrada"));
    }

    @PutMapping("/{id}")
    public Tarea actualizar(@PathVariable Long id, @RequestBody Tarea tarea) {
        return service.actualizarTarea(id, tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminarTarea(id);
    }

    @GetMapping("/estado/{estado}")
    public List<Tarea> filtrarPorEstado(@PathVariable Estado estado) {
        return service.listarPorEstado(estado);
    }

    @GetMapping("/antesDe/{fecha}")
    public List<Tarea> filtrarPorFecha(@PathVariable String fecha) {
        return service.listarAntesDe(LocalDate.parse(fecha));
    }
}
