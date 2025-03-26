package com.example.jetpackcurriculumcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcurriculumcompose.ui.theme.JetpackCurriculumComposeTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun App() {
    LazyColumn(
        modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "My Photo",
                modifier = Modifier.fillMaxWidth().height(400.dp)
            )
            Text(
                text = "Ernest",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = "Informació de contacte", color = Color.White, fontSize = 20.sp)

            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ){
                item{

                    Text(text = "Ernest ", color = Color.White)
                    Text(text = "Hosta ", color = Color.White)
                    Text(text = "Vidal ", color = Color.White)
                }
            }

            Text(text = "ehosta.dam@institutcampalans.net", color = Color.White)

            Text(text = "https://github.com/MagnusKomet", color = Color.White)
        }
    }
}