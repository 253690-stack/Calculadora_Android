package com.upchiapas.kt_template

class CalculadoraManager {

    fun sumar(txt1: String, txt2: String): String {
        val n1 = txt1.toDoubleOrNull()
        val n2 = txt2.toDoubleOrNull()
        return if (n1 != null && n2 != null) {
            "Resultado: ${n1 + n2}"
        } else {
            "Ingresa números válidos"
        }
    }

    fun restar(txt1: String, txt2: String): String {
        val n1 = txt1.toDoubleOrNull()
        val n2 = txt2.toDoubleOrNull()
        return if (n1 != null && n2 != null) {
            "Resultado: ${n1 - n2}"
        } else {
            "Ingresa números válidos"
        }
    }

    fun multiplicar(txt1: String, txt2: String): String {
        val n1 = txt1.toDoubleOrNull()
        val n2 = txt2.toDoubleOrNull()
        return if (n1 != null && n2 != null) {
            "Resultado: ${n1 * n2}"
        } else {
            "Ingresa un numero valido"
        }
    }

    fun dividir(txt1: String, txt2: String): String {
        val n1 = txt1.toDoubleOrNull()
        val n2 = txt2.toDoubleOrNull()
        return if (n1 != null && n2 != null) {
            if (n2 == 0.0) {
                "Error"
            } else {
                "Resultado: ${n1 / n2}"
            }
        } else {
            "Ingresa números válidos"
        }
    }
    }

