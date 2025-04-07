# Sistema de Registro y Análisis de Sueños Lúcidos

Este proyecto es una **aplicación web con Spring Boot y Thymeleaf**, diseñada para el registro y análisis de sueños lúcidos en un entorno de terapia psicológica. Permite a los terapeutas aplicar distintos enfoques analíticos y generar informes personalizados.

## 📌 Características Principales
- Registro de múltiples sueños por paciente.
- Aplicación de métodos de análisis simbólico, emocional, estadístico y cognitivo.
- Generación de informes personalizados con un **Builder Pattern**.
- Duplicación de sueños para análisis sin alterar los originales (**Prototype**).
- Manejo eficiente de analizadores con un **Object Pool**.
- Implementación de distintos enfoques terapéuticos mediante **Abstract Factory**.

## 🛠️ Tecnologías Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Thymeleaf** para vistas dinámicas.
- **Spring Data JPA** para la persistencia de datos.
- **H2 Database** para pruebas en memoria.

## 📂 Estructura del Proyecto
```
📂 sistema-suenos-lucidos/
 ├── 📂 src/main/java/com/example/suenos/
 │     ├── config/              # Configuración global (Singleton)
 │     ├── controllers/         # Manejo de vistas con Thymeleaf
 │     ├── models/              # Entidades y modelos de datos
 │     ├── services/            # Lógica de negocio y patrones creacionales
 │     ├── factories/           # Implementación de Factory y Abstract Factory
 │     ├── utils/               # Object Pool y Prototype
 │     ├── MainApp.java         # Clase principal
 ├── 📂 src/main/resources/
 │     ├── templates/           # Vistas Thymeleaf
 │     ├── application.properties  # Configuración de Spring Boot
 ├── pom.xml                        # Dependencias con Maven
```

## 🚀 Instalación y Ejecución

### 1️⃣ **Clonar el repositorio**
```bash
git clone https://github.com/TU_USUARIO/sistema-suenos-lucidos.git
cd sistema-suenos-lucidos
```

### 2️⃣ **Configurar el entorno**
Instala **Java 17** y **Maven** en tu sistema.

### 3️⃣ **Ejecutar la aplicación**
```bash
mvn spring-boot:run
```
Acceda en su navegador a `http://localhost:8080`.

## 📖 Patrones de Diseño Aplicados
✔ **Factory Method**: Creación de repositorios de sueños.  
✔ **Abstract Factory**: Selección de enfoques terapéuticos y analizadores.  
✔ **Singleton**: Configuración clínica centralizada.  
✔ **Object Pool**: Gestión eficiente de instancias de analizadores.  
✔ **Builder**: Generación de informes personalizados.  
✔ **Prototype**: Duplicación de sueños para pruebas sin alterar los originales.  
