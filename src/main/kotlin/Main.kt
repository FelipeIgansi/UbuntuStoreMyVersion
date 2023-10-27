import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import java.io.File

@Composable
@Preview
fun App() {
    var count by remember { mutableStateOf(0) }
    val image = painterResource("drawable/explore.png")

    MaterialTheme {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(180.dp)
                    .background(
                        Color(
                            red = 235,
                            green = 235,
                            blue = 235
                        )
                    )
                    .padding(10.dp),
                verticalArrangement = Arrangement.Top
            ) {

                OutlinedButton(
                    onClick = { count++ },
                    colors = buttonColors(),
                    border = borderStroke(),
                    shape = cutCornerShape()
                )
                {
                    Icon(
                        painter = image,
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp)
                            .padding(end = 5.dp)
                    )
                    Text("Populares")


                }
                OutlinedButton(
                    onClick = { count++ },
                    colors = buttonColors(),
                    border = borderStroke(),
                    shape = cutCornerShape()
                ) {
                    Text("Categorias")
                }
                OutlinedButton(
                    onClick = { count++ },
                    colors = buttonColors(),
                    border = borderStroke(),
                    shape = cutCornerShape()
                ) {
                    Text("Instalados")
                }
                OutlinedButton(
                    onClick = { count++ },
                    colors = buttonColors(),
                    border = borderStroke(),
                    shape = cutCornerShape()
                ) {
                    Text("Sobre")
                }
            }
            Spacer(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(2.dp)
                    .background(Color.Black)
                    .padding(start = 10.dp, end = 10.dp)
            )
            Text(count.toString())
        }
    }
}

@Composable
private fun cutCornerShape() = CutCornerShape(CornerSize(0))

@Composable
private fun borderStroke() = BorderStroke(color = Color.Transparent, width = 1.dp)

@Composable
private fun buttonColors() = ButtonDefaults.buttonColors(
    contentColor = Color.Black,
    backgroundColor = Color.Transparent,
)

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "App center") {
        App()
    }
}
