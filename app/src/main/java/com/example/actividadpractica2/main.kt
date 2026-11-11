package com.example.actividadpractica2

fun main() {
    println(construirReporte())
}

fun construirReporte(): String {
    // REQ-01: información inmutable con val
    val nombreEstudiante: String = "Carlos Pérez"
    val asignatura: String = "Programación para Dispositivos Móviles"

    // REQ-02: notas con var
    var notaCorte1: Double = 4.2
    var notaCorte2: Double = 3.5

    // REQ-03: nota pendiente (nullable)
    var notaCorte3: Double? = null

    // Null Safety con operador Elvis
    val notaFinal3 = notaCorte3 ?: 0.0

    val promedio = calcularPromedio(notaCorte1, notaCorte2, notaFinal3)
    return generarReporte(nombreEstudiante, asignatura, promedio)
}

// REQ-04: función de expresión única
fun calcularPromedio(n1: Double, n2: Double, n3: Double): Double = (n1 + n2 + n3) / 3

// REQ-04: String interpolado con el estado
fun generarReporte(estudiante: String, materia: String, promedio: Double): String {
    val estado = if (promedio >= 3.0) {
        "APROBADO"
    } else {
        "REPROBADO"
    }
    return "Estudiante: $estudiante | Materia: $materia | Promedio: ${String.format("%.2f", promedio)} | Estado: $estado"
}
