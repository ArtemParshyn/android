@Preview(name = "portrait", showSystemUi = true)
@Composable
fun TextPreview(){
    Text("Hello, Android!")
}
// ----

<resources>
    ... другие строки
    <string name="hello_android">Hello, Android!</string>
</resources>
// ----

Text(
        text = stringResource(id = R.string.hello_android)
    )
// ----

Скопировать код

KOTLIN

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun TextPreview(){
    Text("Hello, Android!")
}
// ----

Скопировать код

KOTLIN
// ----

Скопировать код

XML

<resources>
    ... другие строки
    <string name="hello_android">Hello, Android!</string>
</resources>
// ----

Скопировать код

KOTLIN

Text(
        text = stringResource(id = R.string.hello_android)
    )
// ----

Text(
    text = "Hello, Android!",
    style = TextStyle(
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic
        )
)
// ----

<resources>
    ...
    <string name="jetpack_text">Jetpack Compose — это современный набор инструментов для создания пользовательского интерфейса (UI) на Android, разработанный Google.</string>
    ...
</resources>
// ----

Text(
        text = stringResource(R.string.jetpack_text),
        style = TextStyle(
            color = Color.Green,
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
        ),
        textAlign = TextAlign.Center
    )
// ----

Text(
        text = stringResource(R.string.jetpack_text),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
// ----

Text(
       text = stringResource(R.string.jetpack_text),
        style = TextStyle(
            color = Color.Black,
            background = Color.Green,
            fontSize = 24.sp,
            textIndent = TextIndent(48.sp)
        ),
        textDecoration = TextDecoration.Underline
    )
// ----

Text(
            text = stringResource(id = R.string.jetpack_text),
            style = MaterialTheme.typography.h2
        )
// ----

Скопировать код

KOTLIN

Text(
    text = "Hello, Android!",
    style = TextStyle(
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic
        )
)
// ----

Скопировать код<resources>
    ...
    <string name="jetpack_text">Jetpack Compose — это современный набор инструментов для создания пользовательского интерфейса (UI) на Android, разработанный Google.</string>
    ...
</resources>
// ----

Скопировать код
Text(
        text = stringResource(R.string.jetpack_text),
        style = TextStyle(
            color = Color.Green,
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
        ),
        textAlign = TextAlign.Center
    )
// ----

Скопировать код
Text(
        text = stringResource(R.string.jetpack_text),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
// ----

Скопировать код
Text(
       text = stringResource(R.string.jetpack_text),
        style = TextStyle(
            color = Color.Black,
            background = Color.Green,
            fontSize = 24.sp,
            textIndent = TextIndent(48.sp)
        ),
        textDecoration = TextDecoration.Underline
    )
// ----

Скопировать код

KOTLIN

Text(
            text = stringResource(id = R.string.jetpack_text),
            style = MaterialTheme.typography.h2
        )
// ----

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun ImagePreview() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
    )
}
// ----

<resources>
…
    <string name="standard_icon">Стандартная иконка</string>
…
</resources>
// ----

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun ImagePreview() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = stringResource(id = R.string.standard_icon)
    )
}
// ----

<resources>
    <string name="app_name">Practicum Project</string>
</resources>
// ----

<resources>
    <string name="app_name">Practicum Project</string>
    <string name="title_hello">Привет, Практикум</string>
</resources>
// ----

Text(stringResource(R.string.title_hello))
