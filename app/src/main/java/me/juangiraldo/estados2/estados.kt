package me.juangiraldo.estados2

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Preview(showSystemUi =  true)
@Composable
fun StateScreen() {
    var dado by remember {mutableStateOf(value = 1) }
    val caradado = when (dado){
        1 -> "⚀"
        2 -> "⚁"
        3 -> "⚂"
        4 -> "⚃"
        5 -> "⚄"
        6 -> "⚅"
        else -> "?"
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("dado:\n $caradado", fontSize = 70.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {
            Log.i("miss-errores", "estoy dando click")
            dado = (1..6).random()
        }) {
            Text("lanzar dado", fontSize = 30.sp)
        }
    }
}