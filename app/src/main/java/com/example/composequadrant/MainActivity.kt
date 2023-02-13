package com.example.composequadrant

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}
@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposeQuadrantFunc(
                title = stringResource(R.string.title_text),
                content = stringResource(R.string.content_text),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            ComposeQuadrantFunc(
                title = stringResource(R.string.second_title),
                content = stringResource(R.string.second_content),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposeQuadrantFunc(
                title = stringResource(R.string.third_title),
                content = stringResource(R.string.third_content),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            ComposeQuadrantFunc(
                title = stringResource(R.string.forth_title),
                content = stringResource(R.string.forth_content),
                backgroundColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposeQuadrantFunc(
    modifier: Modifier = Modifier,
    title: String,
    content: String,
    backgroundColor: Color,

    ) {
    Column(modifier = modifier
        .background(backgroundColor)
        .fillMaxSize()
        .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 12.dp)
        )
        Text(text = content,
            textAlign = TextAlign.Justify
        )

    }
}



@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}