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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.font.FontWeight
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
                AlbumesSencillos()
                AnimoGeneros()
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
            .fillMaxWidth()
            .padding(start = 10.dp, top = 10.dp, end = 10.dp),
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
                fontWeight = FontWeight.Bold,
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
            .height(110.dp)
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
                .align(Alignment.BottomStart)
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
                .align(Alignment.BottomEnd)
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

@Preview
@Composable
fun AlbumesSencillos(){
    Column(
    ){
        Row (
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Albumes y sencillos nuevos",
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Arrow Right",
                tint = Color.White,
                modifier = Modifier
                    .size(20.dp)
            )
        }
        Spacer(modifier = Modifier.size(10.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly

        ){
            Column(
            ){
                Image(
                    painter = painterResource(R.drawable.thenewabnormal),
                    contentDescription = "The New Abnormal Cover",
                    modifier= Modifier
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .size(90.dp)
                )
                Text(
                    text = "The New Abnormal",
                    color=Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(start = 10.dp, top = 5.dp),
                )
                Text(
                    text = "Album • The Strokes",
                    color= colorResource(R.color.albumartist),
                    fontWeight = FontWeight.Light,
                    fontSize = 9.sp,
                    modifier = Modifier
                        .padding(start=10.dp)
                )

            }

            Column(
            ){
                Image(
                    painter = painterResource(R.drawable.elcirculo),
                    contentDescription = "El Circulo Cover",
                    modifier= Modifier
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .size(90.dp)
                )
                Text(
                    text = "El Circulo",
                    color=Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(start = 10.dp, top = 5.dp),
                )
                Text(
                    text = "Album • Kase.O",
                    color= colorResource(R.color.albumartist),
                    fontWeight = FontWeight.Light,
                    fontSize = 9.sp,
                    modifier = Modifier
                        .padding(start=10.dp)
                )

            }
            Column(
            ){
                Image(
                    painter = painterResource(R.drawable.mrmorale),
                    contentDescription = "Mr. Morale and The Big Steppers Cover",
                    modifier= Modifier
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .size(90.dp)
                )
                Text(
                    text = "Mr. Morale & The Big Steppers",
                    color=Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(start = 10.dp, top = 5.dp),
                )
                Text(
                    text = "Album • Kendrick Lamar",
                    color= colorResource(R.color.albumartist),
                    fontWeight = FontWeight.Light,
                    fontSize = 9.sp,
                    modifier = Modifier
                        .padding(start=10.dp)
                )

            }

        }
    }
}

@Preview
@Composable
fun AnimoGeneros(){
    //Para que el texto quede arriba de la fila
    Column (){
        Row (
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Albumes y sencillos nuevos",
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Arrow Right",
                tint = Color.White,
                modifier = Modifier
                    .size(20.dp)
            )
        }
        LazyRow {
            items(1) {
                //Primera columna de elementos
                Column (modifier = Modifier
                    .padding(start = 20.dp)
                    .height(110.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ){
                    //Elemento Hip-Hop
                    Row (
                        modifier = Modifier
                            .clip(RoundedCornerShape(3.dp))
                            .background(color = Color.DarkGray)
                            .width(130.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .background(color = Color.Green)
                                .size(3.dp, 27.dp)
                                .fillMaxHeight()
                        ){

                        }
                        Text(text = "Hip-Hop", fontSize = 12.sp, color = Color.White, modifier = Modifier.padding(5.dp))
                    }
                    //Elemento Para sentirse bien
                    Row (
                        modifier = Modifier
                            .clip(RoundedCornerShape(3.dp))
                            .background(color = Color.DarkGray)
                            .width(130.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .background(color = Color.Red)
                                .size(3.dp, 27.dp)
                                .fillMaxHeight()
                        ){

                        }
                        Text(text = "Para sentirse bien", fontSize = 12.sp, color = Color.White, modifier = Modifier.padding(5.dp))
                    }
                    //Elemento Rock en español
                    Row (
                        modifier = Modifier
                            .clip(RoundedCornerShape(3.dp))
                            .background(color = Color.DarkGray)
                            .width(130.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .background(color = Color.Yellow)
                                .size(3.dp, 27.dp)
                                .fillMaxHeight()
                        ){

                        }
                        Text(text = "Rock en español", color = Color.White, fontSize = 12.sp,modifier = Modifier.padding(5.dp))
                    }
                }
                //Segunda columna de elementos
                Column (modifier = Modifier
                    .padding(start = 20.dp)
                    .height(110.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ){
                    //Elemento Relajación
                    Row (
                        modifier = Modifier
                            .clip(RoundedCornerShape(3.dp))
                            .background(color = Color.DarkGray)
                            .width(130.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .background(color = Color.Blue)
                                .size(3.dp, 27.dp)
                                .fillMaxHeight()
                        ){

                        }
                        Text(text = "Relajación", fontSize = 12.sp, color = Color.White, modifier = Modifier.padding(5.dp))
                    }
                    //Elemento Para el Camino
                    Row (
                        modifier = Modifier
                            .clip(RoundedCornerShape(3.dp))
                            .background(color = Color.DarkGray)
                            .width(130.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .background(color = Color.Cyan)
                                .size(3.dp, 27.dp)
                                .fillMaxHeight()
                        ){

                        }
                        Text(text = "Para el camino", fontSize = 12.sp, color = Color.White, modifier = Modifier.padding(5.dp))
                    }
                    //Elemento Ejercicio
                    Row (
                        modifier = Modifier
                            .clip(RoundedCornerShape(3.dp))
                            .background(color = Color.DarkGray)
                            .width(130.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .background(color = colorResource(R.color.purple_200))
                                .size(3.dp, 27.dp)
                                .fillMaxHeight()
                        ){

                        }
                        Text(text = "Ejercicio", fontSize = 12.sp, color = Color.White, modifier = Modifier.padding(5.dp))
                    }
                }
                //Tercer columna de elementos
                Column (modifier = Modifier
                    .padding(start = 20.dp)
                    .height(110.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ){
                    //Elemento Felicidad
                    Row (
                        modifier = Modifier
                            .clip(RoundedCornerShape(3.dp))
                            .background(color = Color.DarkGray)
                            .width(130.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .background(color = Color.Yellow)
                                .size(3.dp, 27.dp)
                                .fillMaxHeight()
                        ){

                        }
                        Text(text = "Felicidad", fontSize = 12.sp, color = Color.White, modifier = Modifier.padding(5.dp))
                    }
                    //Elemento Chill
                    Row (
                        modifier = Modifier
                            .clip(RoundedCornerShape(3.dp))
                            .background(color = Color.DarkGray)
                            .width(130.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .background(color = Color.Magenta)
                                .size(3.dp, 27.dp)
                                .fillMaxHeight()
                        ){

                        }
                        Text(text = "Chill", fontSize = 12.sp, color = Color.White, modifier = Modifier.padding(5.dp))
                    }
                    //Elemento Jazz
                    Row (
                        modifier = Modifier
                            .clip(RoundedCornerShape(3.dp))
                            .background(color = Color.DarkGray)
                            .width(130.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .background(color = Color.Red)
                                .size(3.dp, 27.dp)
                                .fillMaxHeight()
                        ){

                        }
                        Text(text = "Jazz", fontSize = 12.sp, color = Color.White, modifier = Modifier.padding(5.dp))
                    }
                }
            }
        }

    }

    }




