package com.example.jetpackcurriculumcompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Space
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityOptionsCompat.BackgroundActivityStartMode
import com.example.jetpackcurriculumcompose.ui.theme.JetpackCurriculumComposeTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewContainer()
        }
    }
}


@Preview
@Composable
fun ViewContainer() {
    Scaffold(
        topBar = { Toolbar()},
        content = {padding -> // Captura el padding
            Content(modifier = Modifier.padding(padding))},
        floatingActionButton = {FAB()},
        floatingActionButtonPosition = FabPosition.End
    )
}

@Composable
fun FAB(){
    val context = LocalContext.current
    FloatingActionButton(onClick = {
        Toast.makeText(context,"Funcionalitat en construcció", Toast.LENGTH_SHORT).show()
    }){
        Text(text = "o")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Toolbar(){
    TopAppBar(
        title = { Text( text = "Ernest")}
    )
}

@Composable
fun Content(modifier: Modifier = Modifier) {
    var counterC by rememberSaveable { mutableIntStateOf(0) }
    var counterK by rememberSaveable { mutableIntStateOf(0) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        item {

            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "My Photo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .padding(top = 100.dp)
            )

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(top = 8.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.c_sharp),
                    contentDescription = "C# logo",
                    modifier = Modifier
                        .size(70.dp)
                        .clickable { counterC++ }
                )

                Text(
                    text = counterC.toString(),
                    color = Color.White,
                    fontSize = 32.sp,
                    modifier = Modifier.padding(start = 4.dp, top = 45.dp)
                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    text = counterK.toString(),
                    color = Color.White,
                    fontSize = 32.sp,
                    modifier = Modifier.padding(end = 10.dp, top = 45.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.kotlin),
                    contentDescription = "Kotlin logo",
                    modifier = Modifier
                        .size(70.dp)
                        .clickable { counterK++ }
                )


            }



            Text(
                text = "Ernest",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = "Informació de contacte", color = Color.White, fontSize = 20.sp)

            Text(text = "Ernest Hosta Vidal", color = Color.White)
            
            Text(text = "ehosta.dam@institutcampalans.net", color = Color.White)

            Text(text = "https://github.com/MagnusKomet", color = Color.White)





            
            
        }
    }
}