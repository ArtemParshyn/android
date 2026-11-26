@Preview(name = "portrait", showSystemUi = true)
@Composable

fun ButtonPreview() {
    Button(
        onClick = { Log.d("ButtonPreview","Кнопка нажата") },
        content = { Text("Нажми меня") },
    )
}

// ----

@Preview(name = "portrait", showSystemUi = true)
@Composable

fun ButtonPreview() {
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = { Log.d("ButtonPreview","Кнопка нажата") },
        enabled = true,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Gray),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp),
        colors = ButtonDefaults.buttonColors(Color.LightGray),
        content = {Text(text = "Нажми на меня", color = Color.Black)}
    )
}
