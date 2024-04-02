package com.example.intotocompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.intotocompose.ui.theme.IntoToComposeTheme

// Main class-> This is the UI that will be displayed on the mobile screen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntoToComposeTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    // State hosting-> taking a state up the level
    var moneyCounter = remember { // another way of initializing variables
        mutableIntStateOf(0)
    }

    Surface(
        modifier = Modifier
            // covers the whole screen
            .fillMaxHeight()
            .fillMaxWidth(),
        color = Color(0xFF546E7A)
    ) {
        Column( // aligns and arranges the button in the center of the screen
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "$${moneyCounter.value}", //  Adding style to the text "$100"
                style = TextStyle(
                    color = Color.White,
                    fontSize = 30.sp,  // sp->  Recommended size unit for font
                    fontWeight = FontWeight.ExtraBold
                ))
// Spacer function is used to create space between elements (tap button and $100 in this case)
            Spacer(modifier = Modifier.height(120.dp))

            CreateCircle(moneyCounter = moneyCounter.value) {
                newValue -> moneyCounter.value = newValue
            }

            Spacer(modifier = Modifier.height(30.dp))

            if (moneyCounter.value> 25) {
                Text(text = "Lots of money!")
            }
        }

    }
}

// Preview
@Composable
fun CreateCircle(moneyCounter: Int = 0, updateMoneyCounter: (Int)-> Unit) {
    //  initializing a var // var moneyCounter = 0 (old way)

/* *
* another way of initializing variables
*    var moneyCounter by remember { //(Recomposition)
*        mutableIntStateOf(0)
*    }
* */
    Card(
        modifier = Modifier
            .padding(3.dp)
            .size(105.dp)
            .clickable {
//                moneyCounter.value += 1
                updateMoneyCounter(moneyCounter + 1)
            },
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
        Box(// Aligns the text in the button in the center
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
/* *
* In order for us to see changes in our text in any composable function->
* whenever we want to change something inside a composable function->
* we need to redraw that composable function.
* Therefore, the [Text] needs to be redrawn {Recomposition}
* */
            Text(text = "Taps $moneyCounter", modifier = Modifier)

        }
    }
}
@Preview(name = "My project", showBackground = true)
@Composable
fun GreetingPreview() {
    IntoToComposeTheme {
        MyApp()

    }
}