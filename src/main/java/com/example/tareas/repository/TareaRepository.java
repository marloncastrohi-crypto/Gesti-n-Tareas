package com.example.tareas.repository;

import com.example.tareas.model.Tarea;
import com.example.tareas.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    List<Tarea> findByEstado(Estado estado);
    List<Tarea> findByFechaVencimientoBefore(LocalDate fecha);
}
