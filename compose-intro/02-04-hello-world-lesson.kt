class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorld()
        }
    }

    @Composable
    private fun HelloWorld() {
        Text("Hello, world!")
    }
}
// ----

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {Hello(name = null)}
    }

    @Composable
    fun Hello(name: String?)
    {
        name
            ?.let{Text("Hello, $name !")}
            ?:Text("Имя не задано")
    }

}
// ----

<resources>
    ... другие строки
    <string name="hello_android">Hello, Android!</string>
</resources>
// ----

Text(
    text = "Hello, Android!",
    style = TextStyle(
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic
        )
)
