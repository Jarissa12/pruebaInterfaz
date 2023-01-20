package com.example.hellowork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hellowork.ui.theme.HelloworkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloworkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.secondary
                ) {
                    View()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun View(){
    Ocupacion()
}
@Composable
fun Ocupacion() {

    Column(modifier = Modifier
        .fillMaxSize()
        ) {

        Spacer(modifier = Modifier.padding(110.dp))
        Text(

            text = "Registro de ocupaciones  ",
            fontSize = 15.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.padding(20.dp))

        var text by remember()
        {
            mutableStateOf("")

        }
        TextField(

            value = " Descripción    ",
            onValueChange = { text=it },
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
        )

        TextField(

            value = "Salario ",
            onValueChange = { text=it },
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
        )
        Spacer(modifier = Modifier.padding(10.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .height(64.dp)
                .padding(5.dp)
                .fillMaxSize()
                .width(50.dp),
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFD5A20AA),
                contentColor = Color.White,
                disabledContentColor = Color.White,
            )
        ){
            Image(
                painter = painterResource(id = R.drawable.guardar),
                contentDescription = "Header",
                modifier = Modifier
            )

            Text(

                text = " Guardar",
                fontSize = 15.sp,
                textAlign = TextAlign.Center ,modifier = Modifier
            )


        }

    }

}







