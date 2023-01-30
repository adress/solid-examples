# Principios Solid

Este repositorio es un resumen del curso de Udemy [Principios SOLID - Mejora la Calidad de tu Código](https://www.udemy.com/course/principios-solid-mejora-la-calidad-de-tu-codigo/) 


SOLID busca un bajo acoplamiento y una alta cohesión
- **Acoplamiento:**
    Es la forma y nivel de independencia entre componentes de software 
- **Cohesión:**
    EL grado en el que los elementos de un módulo permanecen juntos

<hr style="border:2px solid gray">

### Principio de responsabilidad única (SPR)
Una clase debe tener una y solo una razón para cambiar.

### Principio abierto cerrado (OCP)
Una clase debe estar abierta para extenderse y cerrada para mordicarse.

### Principio de Sustitución de Liskov (LSP)
Cualquier clase que sea hija de una clase padre debería poder usarse en lugar de su padre sin ningún comportamiento inesperado (Una clase debe implementar más funcionalidades no restringirlas).

### Principio de segregación de interfaces
Ninguna clase debe implementar métodos que no use

### Principio de inversión de dependencias (DIP)
Las clases de alto nivel no deben depender de clases de bajo nivel.

Las abstracciones no deben depender de los detalles. Los detalles deben depender de las abstracciones
