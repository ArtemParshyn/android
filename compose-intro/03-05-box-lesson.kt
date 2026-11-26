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

data class Contact(
    val name: String, //Имя
    val surname: String? = null, //Отчество
    val familyName: String, //Фамилия
    val phone: String, //Телефон
    val address: String //Адрес
)
// ----

@Composable
fun ContactColumn(contact: Contact) {
    Column {
        Text("Имя: ${contact.name}")
        Text("Отчество: ${contact.surname.orEmpty()}")
        Text("Фамилия: ${contact.familyName}")
        Text("Мобильный телефон: ${contact.phone}")
        Text("Адрес: ${contact.address}")
    }
}
// ----

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun ContactColumnPreview() {
    ContactColumn(
        contact = Contact(
            name = "Евгений",
            surname = "Андреевич",
            familyName = "Лукашин",
            phone = "+7 495 495 95 95",
            address = "г. Москва, 3-я улица Строителей, д. 25, кв. 12"
        )
    )
}
// ----

@Composable
fun ContactColumn(contact: Contact) {
   Column(
      modifier = Modifier.fillMaxWidth(),
      horizontalAlignment = Alignment.CenterHorizontally
   ) {
      Text("Имя: ${contact.name}")
      Text("Отчество: ${contact.surname.orEmpty()}")
      Text("Фамилия: ${contact.familyName}")
      Text("Мобильный телефон: ${contact.phone}")
      Text("Адрес: ${contact.address}")
   }
}
// ----

Column {
        Text("Фиксированный размер", modifier = Modifier.background(Color.Red))
        Text("Занимает 1/3", modifier = Modifier.weight(1f).background(Color.Green))
        Text("Занимает 2/3", modifier = Modifier.weight(2f).background(Color.Blue))
    }
