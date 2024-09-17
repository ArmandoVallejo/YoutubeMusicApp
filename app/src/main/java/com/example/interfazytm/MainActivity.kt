package com.example.interfazytm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfazytm.ui.theme.InterfazYTMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            Column (
                modifier = Modifier
                    .background(color = Color.Black)
                    .padding(10.dp)
            ){
                TopBar()
                TopElements()
            }
            
        }
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InterfazYTMTheme {
        Greeting("Android")
    }
}
*/

@Preview
@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween // Distribuye los elementos entre los extremos
    ) {
        Row(
            modifier = Modifier.weight(1f), // Los elementos de la izquierda
            verticalAlignment = Alignment.CenterVertically // Alinea verticalmente al centro
        ) {
            Image(
                painter = painterResource(R.drawable.ytmlogo),
                contentDescription = "YouTube Music Logo",
                modifier = Modifier
                    .size(20.dp)
            )
            Text(
                text = "Music",
                color = Color.White,
                modifier = Modifier
                    .padding(top = 1.dp, start = 2.dp)
            )
        }

        Row(
            modifier = Modifier.weight(1f),
            horizontalArrangement = Arrangement.End, // Alinea elementos a la derecha
            verticalAlignment = Alignment.CenterVertically // Alinea verticalmente al centro
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Color.White,
                modifier = Modifier
                    .size(18.dp)
                    .padding(end = 8.dp) // Agregar un pequeño padding entre los elementos
            )
            Image(
                painter = painterResource(R.drawable.perfil),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .clip(CircleShape) // Haz que la imagen sea circular
                    .size(15.dp) // Cambia el tamaño si lo deseas
            )
        }
    }
}

@Preview
@Composable
fun TopElements(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(170.dp)
    ){
        Column (
            modifier= Modifier
                .clip(RoundedCornerShape(3.dp))
                .background(color = colorResource(R.color.topelementsgray))
                .align(Alignment.TopStart)
                .width(170.dp)
                .padding(10.dp)
        ){
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Color.White,
                modifier = Modifier
                    .size(18.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = "Nuevos lanzamientos",
                color = Color.White,
                fontSize = 10.sp
            )
        }
        Column (
            modifier= Modifier
                .clip(RoundedCornerShape(3.dp))
                .background(color = colorResource(R.color.topelementsgray))
                .align(Alignment.TopEnd)
                .width(180.dp)
                .padding(10.dp)
        ){
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Color.White,
                modifier = Modifier
                    .size(18.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = "Rankings",
                color = Color.White,
                fontSize = 10.sp
            )
        }

        Column (
            modifier= Modifier
                .clip(RoundedCornerShape(3.dp))
                .background(color = colorResource(R.color.topelementsgray))
                .align(Alignment.CenterStart)
                .width(170.dp)
                .padding(10.dp)
        ){
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Color.White,
                modifier = Modifier
                    .size(18.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = "Estados de animo y generos",
                color = Color.White,
                fontSize = 10.sp
            )
        }

        Column (
            modifier= Modifier
                .clip(RoundedCornerShape(3.dp))
                .background(color = colorResource(R.color.topelementsgray))
                .align(Alignment.CenterEnd)
                .width(180.dp)
                .padding(10.dp)
        ){
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Color.White,
                modifier = Modifier
                    .size(18.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = "Podcasts",
                color = Color.White,
                fontSize = 10.sp
            )
        }

    }
}


