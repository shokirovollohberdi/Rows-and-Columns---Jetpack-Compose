package uz.shokirov.rowsandcolumns_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.shokirov.rowsandcolumns_jetpackcompose.ui.theme.RowsAndColumnsJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowsAndColumnsJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Row(
                        modifier = Modifier
                            .height(500.dp)
                            .width(500.dp)
                            .background(Color.Green), horizontalArrangement = Arrangement.Start
                    ) {
                        CustomItem(weight = 1f)
                        CustomItem(weight = 3f, MaterialTheme.colors.secondary)
                    }
                }
            }
        }
    }
}

/*
colum scope 1part
@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.secondary) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .weight(weight),
        color = color
    ) {

    }
}*/


@Composable
fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RowsAndColumnsJetpackComposeTheme {
        /*
        this is Columns Aligment and Arrangement, Surface
           Column(
               modifier = Modifier.fillMaxSize(),
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.SpaceEvenly
           ) {
               Surface(
                   modifier = Modifier
                       .width(200.dp)
                       .height(50.dp),
                   color = MaterialTheme.colors.primary
               ) {}
               Surface(
                   modifier = Modifier
                       .width(200.dp)
                       .height(50.dp),
                   color = MaterialTheme.colors.primary
               ) {}
               Surface(
                   modifier = Modifier
                       .width(200.dp)
                       .height(50.dp),
                   color = MaterialTheme.colors.primary
               ) {}


           }
           */
        /* - - - - - -- -  -- - - -- -- ---------------------------------------------*/
        /*
          this is weight
          Column(
               modifier = Modifier.fillMaxSize(),
               horizontalAlignment = Alignment.CenterHorizontally
           ) {
               Surface(
                   modifier = Modifier
                       .width(200.dp)
                       .weight(1f),
                   color = MaterialTheme.colors.primary
               ) {}
               Surface(
                   modifier = Modifier
                       .width(200.dp)
                       .weight(3f),
                   color = MaterialTheme.colors.secondary
               ) {}


           }*/
        /* Column(
             modifier = Modifier.fillMaxSize(),
             horizontalAlignment = Alignment.CenterHorizontally
         ) {
             CustomItem(weight = 1f, color = MaterialTheme.colors.primary)
             CustomItem(weight = 3f)
         }*/

        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomItem(weight = 1f)
            CustomItem(weight = 3f, MaterialTheme.colors.secondary)
        }

    }
}