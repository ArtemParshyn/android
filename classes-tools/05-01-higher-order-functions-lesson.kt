fun main() {
    val catDownloader = CatDownloader()
    val newCat = catDownloader.downloadCat()
}

class CatDownloader {
    fun downloadCat(): Cat {
        // загружает фотографии котиков из интернета
    }
}

class Cat(val name: String)
// ----

// передаем в аргументы функцию onSuccess

fun downloadCat(
    onSuccess: () -> Unit // выполнить при успешной загрузке фотографий котиков
) {
    // загружает фотографии котиков из интернета
}
// ----

fun downloadCat(
    onSuccess: (Cat) -> Unit, // теперь функция onSuccess принимает на вход один параметр типа Cat
    onError: () -> Unit
) {
    // загружает фотографии котиков из интернета
}
// ----

fun downloadCat(
    onSuccess: (cat: Cat) -> Unit, 
    onError: () -> Unit
) {
    // загружает котиков из интернета
}
// ----

class CatDownloader {

    fun downloadCat(
        onSuccess: (Cat) -> Unit,
        onError: (String) -> Unit
    ) {
        val cat: Cat? = getCatFromInternet()

        if (cat != null) {
            onSuccess.invoke(cat) // вызываем функцию с помощью метода invoke() и передаём в нее объект cat
        } else {
            onError("Упс, что-то пошло не так при загрузке котеек.") // вызываем функцию, используя просто круглые скобки (), в которые передаём строку с сообщением
        }

    }

    // добавим немного случайности и имитируем ситуацию, когда фотография котика не может быть загружена
    private fun getCatFromInternet(): Cat? {
        return if (Random.nextBoolean()) Cat("Борис") else null
    }
}
// ----

fun main() {
    val catDownloader = CatDownloader()

    catDownloader.downloadCat(
        // используем именованные параметры, чтобы код был более понятен
        onSuccess = { cat -> println("Кот ${cat.name} загружен успешно") }, // в фигурных скобках указываем параметры и тот код, который должен выполниться при успешной загрузке фотографий котиков
        onError = { error -> println(error) } // в фигурных скобках указываем код, который выполнится в случае ошибки
    )
}
