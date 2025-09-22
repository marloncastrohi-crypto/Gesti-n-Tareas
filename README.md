📝 Taller Grupal – CRUD de Tareas

Este proyecto es una aplicación de gestión de tareas desarrollada con Spring Boot y PostgreSQL. Implementa las funcionalidades básicas de un CRUD (Crear, Leer, Actualizar, Eliminar) para administrar tareas. El objetivo principal es aplicar conceptos de Programación Orientada a Objetos (POO) en Java y seguir el patrón de diseño MVC (Modelo, Vista, Controlador), mientras se utiliza GitHub para la colaboración.

💻 Tecnologías Utilizadas
Java: Lenguaje de programación principal.

Spring Boot: Framework para la construcción de la aplicación.

PostgreSQL: Base de datos relacional para el almacenamiento de las tareas.

JPA (Java Persistence API): Para la gestión de la persistencia de datos.

Postman: Herramienta utilizada para probar los endpoints de la API.

📌 Entidad Tarea
La entidad principal del sistema es Tarea, con las siguientes propiedades:

id: Identificador único (autogenerado).

titulo: String.

descripcion: String.

fechaVencimiento: LocalDate.

prioridad: Enum con valores BAJA, MEDIA, ALTA.

estado: Enum con valores PENDIENTE, EN_PROGRESO, COMPLETADA.

creadaEn: LocalDateTime.

🚀 Funcionalidades de la API
El sistema expone los siguientes endpoints para la gestión de tareas:

Crear tarea: POST /tareas

Listar todas las tareas: GET /tareas

Obtener tarea por ID: GET /tareas/{id}

Actualizar una tarea: PUT /tareas/{id}

Eliminar una tarea: DELETE /tareas/{id}

🔎 Funcionalidades Adicionales (Opcionales)
Filtrar por estado: GET /tareas?estado=...

Filtrar por fecha de vencimiento: GET /tareas?antesDe=...

👥 Contribuyentes
Marlon Estiven Castro Hio
