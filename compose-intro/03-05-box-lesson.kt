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

// ----

@Composable
fun RoundInitials(initials: String) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.circle),
                contentDescription = null,
            )
            Text(
                text = initials
            )
        }
    }
}

// ----

@Composable
fun RoundInitials(initials: String) {
    Box(
        modifier = Modifier.padding(vertical = 16.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.circle),
            contentDescription = null,
        )
        Text(
            text = initials
        )
    }
}

@Composable
fun BoxTask() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray)
    ) {
        RoundInitials("АБ")
    }
}

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun Task1Preview() {
    BoxTask()
}
