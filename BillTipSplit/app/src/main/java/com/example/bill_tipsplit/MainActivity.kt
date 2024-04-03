  package com.example.bill_tipsplit

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.bill_tipsplit.components.InputField
import com.example.bill_tipsplit.ui.theme.BillTipSplitTheme
import com.example.bill_tipsplit.widgets.RoundIconButton

  @ExperimentalComposeUiApi

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                // Text(text = "Hello")
                TopHeader()
                MainContent()
            }
        }
    }
}

  @Composable
  fun MyApp(content: @Composable () -> Unit) {
      BillTipSplitTheme {
          // A surface container using the 'background' color from the theme
          Surface(
              modifier = Modifier.fillMaxSize(),
              color = MaterialTheme.colorScheme.background
          ) {
              content()

          }
      }
  }

// @Preview
@Composable
fun TopHeader(totalPerPerson: Double = 0.0) {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp)
        //    .clip(shape = RoundedCornerShape(corner = CornerSize(12.dp)))
        .clip(shape = CircleShape.copy(all = CornerSize(12.dp))) // same as above
        ,color = Color(0xFFE9D7F7)
    ) {
        Column (
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val total = "%.2f".format(totalPerPerson)
            Text(text = "Total per person",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold
            )
            Text(text = "$total Rs",
                style  = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }

}




  @OptIn(ExperimentalComposeUiApi::class)

  @Composable
  fun MainContent() {

      BillForm() { billAmt ->
          Log.d("AMT", "MainContent: $billAmt.toInt()")

      }

  }


@Preview
@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun BillForm(modifier: Modifier = Modifier,
             onValChange: (String) -> Unit = {}
            ) {
    val totalBillState = remember {
        mutableStateOf("")

    }
    val validState = remember(totalBillState.value) {
        totalBillState.value.trim().isNotEmpty()

    }
    val keyboardController = LocalSoftwareKeyboardController.current
    Surface(modifier = Modifier
        .padding(2.dp)
        .fillMaxWidth()
        ,shape = RoundedCornerShape(corner = CornerSize(8.dp))
        ,border = BorderStroke(width = 2.dp, color = Color.LightGray)
    ) {
        Column(modifier = Modifier
            .padding(6.dp)
        , verticalArrangement = Arrangement.Top
        , horizontalAlignment = Alignment.Start) {

            InputField(
                valueState = totalBillState,
                labelId = "Total bill",
                enabled = true,
                isSingleLine = true,
                onAction = KeyboardActions {
                    if (!validState) return@KeyboardActions
                    onValChange(totalBillState.value.trim())

                    keyboardController?.hide()
                }
            )

//        if(validState) {
            Row(modifier = Modifier
                .padding(3.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Text(text = "Split",
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.width(120.dp))

                Row(modifier = Modifier
                    .padding(horizontal = 3.dp)
                , horizontalArrangement = Arrangement.End) {

                    RoundIconButton(imageVector = Icons.Default.Remove,
                        onClick = { Log.d("Icon", "BillForm: Remove") })

                    Text(text = "3",modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 9.dp, end = 9.dp)
                    )

                    RoundIconButton( imageVector = Icons.Default.Add,
                        onClick = { Log.d("Icon", "BillForm: Add") })

                }
            }
            // Tip Row
            Row {
                Text(text = "Tip",
                    modifier = Modifier.align(alignment = Alignment.CenterVertically)
                )

                Spa  cer(modifier = Modifier.width(200.dp))

                Text(text = "33.33",
                    modifier = Modifier.align(alignment = Alignment.CenterVertically)
                )

            }




//        }else {
//            Box() {}
//        }

        }

    }

}

// @Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BillTipSplitTheme {
        MyApp {
            Text(text = "hello again")
        }
    }
}