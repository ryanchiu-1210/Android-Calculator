package com.example.calculator

import android.icu.util.Output
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Colors
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatorTheme {
                Greeting()
                }
            }
        }
    }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {
    var currentstring by remember{ mutableStateOf("")}//目前數值but字串
    var currentvalue by remember{ mutableStateOf(0)}//目前數值
    var display by remember { mutableStateOf("test") }//顯示

    Scaffold(modifier=Modifier
        .fillMaxSize(),
        containerColor = Color.Black,
        topBar = {
            TopAppBar(
                title = { Text("", fontSize = 50.sp) },
                colors=TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black,
                    titleContentColor = Color.White
                )
            )
        }
    ){innerPadding->
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(innerPadding)
            .padding(10.dp)
        ){
            TextField(modifier=Modifier
                .fillMaxWidth()
                .padding(10.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Black,
                    unfocusedContainerColor = Color.Black,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                value=display,
                textStyle = TextStyle(
                    fontSize = 50.sp, color = Color.White,
                    textAlign = TextAlign.End
                ),
                onValueChange = {},
                readOnly = true,
            )
            Spacer(modifier=Modifier.height(150.dp))
            //第一排按鈕
            Row(
                modifier=Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ){
                //清除按鈕
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.Red
                    )
                ) {
                    Text("C", fontSize = 30.sp)
                }
                //backspace按鈕
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.Red
                    )
                ) {
                    Text("⌫", fontSize = 26.sp)
                }
                //percent button
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("%", fontSize = 30.sp)
                }
                //除
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF333333),
                        contentColor = Color.White
                    )
                ) {
                    Text("÷", fontSize = 30.sp)
                }
            }
            //第二排按鈕
            Row(
                modifier=Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ){
                //7
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("7", fontSize = 30.sp)
                }
                //8
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("8", fontSize = 30.sp)
                }
                //9
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("9", fontSize = 30.sp)
                }
                //乘
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF333333),
                        contentColor = Color.White
                    )
                ) {
                    Text("×", fontSize = 30.sp)
                }
            }
            //第三排
            Row(
                modifier=Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ){
                //4
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("4", fontSize = 30.sp)
                }
                //5
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("5", fontSize = 30.sp)
                }
                //6
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("6", fontSize = 30.sp)
                }
                //minus
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF333333),
                        contentColor = Color.White
                    )
                ) {
                    Text("-", fontSize = 30.sp)
                }
            }


            //第四排
            Row(
                modifier=Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ){
                //4
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("1", fontSize = 30.sp)
                }
                //5
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("2", fontSize = 30.sp)
                }
                //6
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("3", fontSize = 30.sp)
                }
                //minus
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF333333),
                        contentColor = Color.White
                    )
                ) {
                    Text("+", fontSize = 30.sp)
                }
            }

            //第5排
            Row(
                modifier=Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ){
                //4
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("00", fontSize = 28.sp)
                }
                //5
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text("0", fontSize = 30.sp)
                }
                //6
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF222222),
                        contentColor = Color.White
                    )
                ) {
                    Text(".", fontSize = 30.sp)
                }
                //minus
                Button(
                    onClick = {
                        display=""
                        currentvalue=0
                    },
                    modifier=Modifier
                        .padding(5.dp)
                        .aspectRatio(1f)
                        .weight(1f),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF555555),
                        contentColor = Color.White
                    )
                ) {
                    Text("=", fontSize = 30.sp)
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculatorTheme {
        Greeting()
    }
}