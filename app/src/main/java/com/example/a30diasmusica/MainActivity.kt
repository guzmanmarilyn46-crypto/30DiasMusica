package com.example.a30diasmusica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30diasmusica.data.Datasource
import com.example.a30diasmusica.model.Musica
import com.example.a30diasmusica.ui.theme._30diasMusicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30diasMusicaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CancionesApp()
                }
            }
        }
    }
}

@Composable
fun CancionesApp() {
    CancionList(
        cancionList = Datasource().loadAnimale(),
    )
}

@Composable
fun CancionList(cancionList: List<Musica>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(cancionList) { cancion ->
            CancionCard(
                cancion = cancion,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun CancionCard(cancion: Musica, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(cancion.imageResourceId),
                contentDescription = stringResource(cancion.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(cancion.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Preview
@Composable
private fun CancionCardPreview() {
    _30diasMusicaTheme {
        // Asumiendo que tienes una canción de ejemplo para el preview
        // CancionCard(Cancion(R.string.cancion1, R.drawable.image1))
    }
}