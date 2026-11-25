Text(
        text = stringResource(id = R.string.hello_android)
    )
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
