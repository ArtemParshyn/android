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
// ----

@Composable
fun ContactColumn(contact: Contact) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.LightGray)
                .weight(0.25F)
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                style = MaterialTheme.typography.h6,
                text = "${contact.name} ${contact.surname.orEmpty()}")
            Text(
                style = MaterialTheme.typography.h5,
                text = contact.familyName
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(0.75F),
        ) {
            Text("Мобильный телефон: ${contact.phone}")
            Text("Адрес: ${contact.address}")
        }
    }
}
// ----

@Composable
fun ContactColumn(contact: Contact) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.LightGray)
            .padding(8.dp),
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

@Composable
fun Contacts(items: List<Contact>) {
    Column { items.forEach { ContactColumn(it) } }
}

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun ListPreview() {
    Contacts(
        listOf(
            Contact(
                name = "Евгений",
                surname = "Андреевич",
                familyName = "Лукашин",
                phone = "+7 495 495 95 95",
                address = "г. Москва, 3-я улица Строителей, д. 25, кв. 12"
            ),
            Contact(
                name = "Василий",
                surname = "Егорович",
                familyName = "Кузякин",
                phone = " --- ",
                address = "Ивановская область, дер. Крутово, д. 4"
            ),
            Contact(
                name = "Людмила",
                surname = "Прокофьевна",
                familyName = "Калугина",
                phone = "+7 495 788 78 78",
                address = "Москва, Большая Никитская, д. 43, кв. 290"
            )
        )
    )
}
