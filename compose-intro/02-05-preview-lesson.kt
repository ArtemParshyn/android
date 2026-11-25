class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
     MyApplicationTheme {
        Greeting("Android")
    }
}
// ----

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun TextPreview(){
    Text("Hello, Android!")
}
// ----

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun TextPreview() {
    Text(
        modifier = Modifier.width(120.dp).height(60.dp),
        text = stringResource(R.string.jetpack_text),
    )
}
// ----

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun TextPreview() {
    Text(
        modifier = Modifier.size(width = 120.dp, height = 60.dp),
        text = stringResource(R.string.jetpack_text),
    )
}
// ----

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun TextPreview() {
    Text(
        modifier = Modifier
            .size(width = 120.dp, height = 60.dp)
            .background(Color.LightGray),
        text = stringResource(R.string.jetpack_text),
    )
}
// ----

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun TextPreview() {
    Text(
        modifier = Modifier
            .size(width = 240.dp, height = 80.dp)
            .background(Color.LightGray),
        text = stringResource(R.string.jetpack_text),
        style = TextStyle(
            color = Color.Black,
            background = Color.Green,
            fontSize = 24.sp
        )
    )
}
