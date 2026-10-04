package com.upchiapas.kt_template

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.upchiapas.kt_template.ui.theme.Kt_templateTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kt_templateTheme {
                CalculadoraScreen()
            }
        }
    }
}

@Composable
fun CalculadoraScreen(){

    val manager = remember{ CalculadoraManager() }

    var num1Texto by remember{ mutableStateOf("")}
    var num2Texto by remember{ mutableStateOf("")}
    var resultadoTexto by remember { mutableStateOf("Resultado: ")}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Calculadora chingona", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = num1Texto,
            onValueChange = { num1Texto = it },
            placeholder = { Text("Primer Número") },
            singleLine = true
        )

        Spacer(modifier = Modifier.height(12.dp))

        TextField(
            value = num2Texto,
            onValueChange = { num2Texto = it },
            placeholder = { Text("Segundo Numero") },
            singleLine = true
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

        Button(onClick = {
            resultadoTexto = manager.sumar(num1Texto, num2Texto)
        }) {
            Text("+")
        }

        Button(onClick = {
            resultadoTexto = manager.restar(num1Texto, num2Texto)
        }) {
            Text("-")
        }

        Button(onClick = {
            resultadoTexto = manager.multiplicar(num1Texto, num2Texto)
        }) {
            Text("*")
        }

        Button(onClick = {
            resultadoTexto = manager.dividir(num1Texto, num2Texto)
        }) {
            Text("/")
        }
    }
        Spacer(modifier = Modifier.height(25.dp))

        Text(text = resultadoTexto, fontSize = 20.sp)

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {
            num1Texto = ""
            num2Texto = ""
            resultadoTexto = "Resultado: "
        }) {
            Text("Limpiar")
        }
    }
}