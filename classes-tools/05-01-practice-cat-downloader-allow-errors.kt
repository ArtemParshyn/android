import kotlin.random.Random


fun main() {
    val catDownloader = CatDownloader()

    catDownloader.downloadCat(
        onStart = { println("Загрузчик Котиков начинает работу") },
        onSuccess = { cat -> println("Кот ${cat.name} загружен успешно") },
        onError = { error -> println(error) },
        allowErrors = false
    )
}

class CatDownloader {

    // передаём в аргументы функции onStart, onSuccess и onError, а также флаг allowErrors
    fun downloadCat(
        onStart: () -> Unit,
        onSuccess: (Cat) -> Unit,
        onError: (String) -> Unit,
        allowErrors: Boolean
    ) {
        onStart()

        var cat: Cat? = getCatFromInternet()

        if (!allowErrors) {
            while (cat == null) {
                cat = getCatFromInternet()
            }
        }

        if (cat != null) {
            onSuccess.invoke(cat)
        } else {
            onError("Упс, что-то пошло не так при загрузке котеек.")
        }

    }

    private fun getCatFromInternet(): Cat? {
        return if (Random.nextBoolean()) Cat("Борис") else null
    }
}

class Cat(val name: String)
