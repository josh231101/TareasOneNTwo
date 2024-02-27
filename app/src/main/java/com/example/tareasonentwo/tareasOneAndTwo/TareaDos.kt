package com.example.tareasonentwo.tareasOneAndTwo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tareasonentwo.checkWroteNumber


@Preview(showBackground = true)
@Composable
fun ArithmeticScreen() {
    var numberOne: Double by remember {
        mutableStateOf(0.0)
    }
    var numberTwo: Double by remember {
        mutableStateOf(0.0)
    }
    var numberThree: Double by remember {
        mutableStateOf(0.0)
    }
    var resultado: String by remember {
        mutableStateOf("")
    }
    var message: String by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Mayores y menores", fontSize = 32.sp, modifier = Modifier.padding(20.dp))
        TextField(value = numberOne.toString(), onValueChange = {
            numberOne = checkWroteNumber(it)
        }, label= {
            Text(text = "Cantidad 1:")
        }, placeholder =  {
            Text(text = "Porfavor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.ThumbUp, contentDescription = "Icon")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        TextField(value = numberTwo.toString(), onValueChange = {
            numberTwo = checkWroteNumber(it)
        }, label= {
            Text(text = "Cantidad 2:")
        }, placeholder =  {
            Text(text = "Porfavor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.ThumbUp, contentDescription = "Icon")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        TextField(value = numberThree.toString(), onValueChange = {
            numberThree = checkWroteNumber(it)
        }, label= {
            Text(text = "Cantidad 3:")
        }, placeholder =  {
            Text(text = "Porfavor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.ThumbUp, contentDescription = "Icon")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = {
           var list = listOf(numberOne, numberTwo, numberThree)
            var min = list.min()
            var max = list.max()
            message = "El número menor es ${min} y el número mayor es ${max}"
        }) {
            Text(text = "Calcular mayores y menores")
        }
        Text(text = resultado)
        Text(text = message)

    }
}

@Preview(showBackground = true)
@Composable
fun Averages() {
    var numberOne: Double by remember {
        mutableStateOf(0.0)
    }
    var numberTwo: Double by remember {
        mutableStateOf(0.0)
    }
    var numberThree: Double by remember {
        mutableStateOf(0.0)
    }
    var resultado: String by remember {
        mutableStateOf("")
    }
    var message: String by remember {
        mutableStateOf("")
    }
    var average: Double by remember {
        mutableStateOf(0.0)
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Mi promedio", fontSize = 32.sp, modifier = Modifier.padding(20.dp))
        TextField(value = numberOne.toString(), onValueChange = {
            numberOne = checkWroteNumber(it)
        }, label= {
            Text(text = "Cantidad 1:")
        }, placeholder =  {
            Text(text = "Porfavor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.ThumbUp, contentDescription = "Icon")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        TextField(value = numberTwo.toString(), onValueChange = {
            numberTwo = checkWroteNumber(it)
        }, label= {
            Text(text = "Cantidad 2:")
        }, placeholder =  {
            Text(text = "Porfavor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.ThumbUp, contentDescription = "Icon")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        TextField(value = numberThree.toString(), onValueChange = {
            numberThree = checkWroteNumber(it)
        }, label= {
            Text(text = "Cantidad 3:")
        }, placeholder =  {
            Text(text = "Porfavor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.ThumbUp, contentDescription = "Icon")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = {
            average = (numberOne + numberTwo + numberThree)/3
            if (average < 7.0) {
                message = "El alumno repetirá el semestre"
            }
            else if (average < 8.5) {
                message= "Has perdido 5% de beca"
            }
            else if (average >= 8.5){
                message = "Felicidades eres un estudiante de honor"
            }
            resultado = "Promedio: ${average}"
        }) {
            Text(text = "Calcular promedio")
        }
        Text(text = resultado)
        Text(text = message)

    }
}
