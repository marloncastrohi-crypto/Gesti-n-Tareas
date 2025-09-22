package com.example.tareas.service;

import com.example.tareas.model.Tarea;
import com.example.tareas.model.Estado;
import com.example.tareas.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TareaService {
    private final TareaRepository repository;

    public TareaService(TareaRepository repository) {
        this.repository = repository;
    }

    public List<Tarea> listarTareas() {
        return repository.findAll();
    }

    public Optional<Tarea> obtenerTarea(Long id) {
        return repository.findById(id);
    }

    public Tarea crearTarea(Tarea tarea) {
        return repository.save(tarea);
    }

    public Tarea actualizarTarea(Long id, Tarea tarea) {
        return repository.findById(id).map(t -> {
            t.setTitulo(tarea.getTitulo());
            t.setDescripcion(tarea.getDescripcion());
            t.setFechaVencimiento(tarea.getFechaVencimiento());
            t.setPrioridad(tarea.getPrioridad());
            t.setEstado(tarea.getEstado());
            return repository.save(t);
        }).orElseThrow(() -> new RuntimeException("Tarea no encontrada"));
    }

    public void eliminarTarea(Long id) {
        repository.deleteById(id);
    }

    public List<Tarea> listarPorEstado(Estado estado) {
        return repository.findByEstado(estado);
    }

    public List<Tarea> listarAntesDe(LocalDate fecha) {
        return repository.findByFechaVencimientoBefore(fecha);
    }
}
