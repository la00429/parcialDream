# 📌 Sistema de Registro y Análisis de Sueños Lúcidos  

Este proyecto es una **aplicación web con Spring Boot y Thymeleaf**, diseñada para ayudar a terapeutas a registrar y analizar los sueños lúcidos de sus pacientes. Se basa en **patrones creacionales** para ofrecer una arquitectura flexible y eficiente.  

---

## 🛠️ Tecnologías Utilizadas  
- **Java 17**  
- **Spring Boot 3**  
- **Thymeleaf** para la interfaz web  
- **Spring Data JPA** para la persistencia  
- **H2 Database** para pruebas en memoria  
- **Maven** como gestor de dependencias  

---

## 📂 Estructura del Proyecto  
```
📂 sistema-suenos-lucidos/
 ├── 📂 src/main/java/com/example/suenos/
 │     ├── config/               # Configuración global (Singleton)
 │     │     ├── ClinicalConfig.java
 │     ├── controllers/          # Manejo de vistas con Thymeleaf
 │     │     ├── MainController.java
 │     │     ├── DreamAnalysisController.java
 │     ├── models/               # Entidades y modelos de datos
 │     │     ├── Dream.java
 │     │     ├── Patient.java
 │     │     ├── Therapist.java
 │     │     ├── Psychologist.java
 │     │     ├── AnalysisResult.java
 │     ├── services/             # Lógica de negocio y patrones creacionales
 │     │     ├── DreamService.java
 │     │     ├── AnalysisService.java
 │     ├── factories/            # Implementación de Factory Method y Abstract Factory
 │     │     ├── DreamRepositoryFactory.java
 │     │     ├── HistoryFactory.java
 │     │     ├── TemporalFactory.java
 │     ├── prototype/            # Implementación de Prototype Pattern
 │     │     ├── IPrototype.java
 │     │     ├── DreamListImp.java
 │     ├── objectpool/           # Implementación de Object Pool
 │     │     ├── AnalyzerPool.java
 │     ├── utils/                # Clases auxiliares
 │     │     ├── SystemSettings.java
 │     ├── builder/              # Implementación de Builder Pattern
 │     │     ├── DreamReport.java
 │     │     ├── DreamReportBuilder.java
 │     ├── analysis/             # Implementación de Abstract Analysis
 │     │     ├── Analysis.java
 │     │     ├── AbstractAnalysis.java
 │     │     ├── SymbolicalAnalysis.java
 │     │     ├── EmotionalAnalysis.java
 │     │     ├── StaticalAnalysis.java
 │     │     ├── CognitiveAnalysis.java
 │     ├── MainApp.java          # Clase principal (Spring Boot)
 ├── 📂 src/main/resources/
 │     ├── templates/            # Vistas Thymeleaf
 │     │     ├── index.html
 │     │     ├── dream-analysis.html
 │     ├── application.properties  # Configuración de Spring Boot
 ├── pom.xml                     # Dependencias con Maven
```

---

## 🔹 Patrones de Diseño Implementados  
✔ **Factory Method:** Creación dinámica de repositorios de sueños (`DreamRepositoryFactory`).  
✔ **Abstract Factory:** Selección de enfoques terapéuticos (`TherapeuticApproachFactory`).  
✔ **Singleton:** Configuración clínica centralizada (`ClinicalConfig`).  
✔ **Object Pool:** Reutilización eficiente de analizadores (`AnalyzerPool`).  
✔ **Builder:** Creación de informes personalizados (`DreamReportBuilder`).  
✔ **Prototype:** Clonación de sueños (`DreamListImp`).  

---

## 🚀 Instalación y Ejecución  

### 1️⃣ **Clonar el repositorio**  
```bash
git clone https://github.com/TU_USUARIO/sistema-suenos-lucidos.git
cd sistema-suenos-lucidos
```

### 2️⃣ **Configurar el entorno**  
Asegúrate de tener **Java 17** y **Maven** instalados.  

### 3️⃣ **Ejecutar la aplicación**  
```bash
mvn spring-boot:run
```
Luego, acceda en su navegador a `http://localhost:8080`.

---
