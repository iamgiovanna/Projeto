package com.example.projeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.projeto.ui.theme.ProjetoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            }
        }
    }

@Composable
fun Projeto(){
    ProjetoTheme {

        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
      Column(
          verticalArrangement = Arrangement.SpaceEvenly,
          horizontalAlignment = Alignment.CenterHorizontally
      ) {

              MenuTopBar()
          Greeting("Android")
      }
        }
    }
}

@Composable
fun Greeting(s: String) {

}

@Preview(showBackground = true, widthDp = 150, heightDp = 200)
@Composable
fun ProjetoPreview(){
    Projeto()
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuTopBar(){
    Scaffold (
        topBar = {
                CenterAlignedTopAppBar(
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = Color.Blue
                    ),
                    title = {
                        Column {
                            Text(text = "JetPack", color = Color.White)
                        }
                    },
                    navigationIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Filled.ArrowBack, tint = Color.White, contentDescription = "")
                        }
                    },
                    actions = {
                        Icon(imageVector = Icons.Filled.MoreVert, tint = Color.White, contentDescription = "" )
                    }
                )
        }
    ){
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(it)){

        }
    }

}
@Preview(showBackground = true, widthDp = 200, heightDp = 100)
@Composable
fun MenuTopBarPreview(){
    MenuTopBar()
}