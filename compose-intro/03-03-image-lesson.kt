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

@Composable
fun RoundInitials(initials: String) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.circle),
            contentDescription = null,
        )
        Text(initials)
    }
}

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun RoundInitialsPreview() {
    RoundInitials("АБ")
}
// ----

@Composable
fun RoundInitials(initials: String) {
    Box {
        Image(
            modifier = Modifier.align(Alignment.Center),
            painter = painterResource(id = R.drawable.circle),
            contentDescription = null,
        )
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = initials
        )
    }
}
// ----

@Composable
fun RoundInitials(initials: String) {
    Box(
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.circle),
            contentDescription = null,
        )
        Text(
            text = initials
        )
    }
}
