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
