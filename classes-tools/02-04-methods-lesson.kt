class Post(
    val authorName: String,
    val text: String,
    val likeCount: Int
)

// ----

fun названиеМетода(аргументы): ТипВозвращаемогоЗначения {
    // Тело метода
}

// ----

var name: String = ""
get() { ... }
set(value) { ... }

// ----

fun like(isSuperLike: Boolean) {
    // Какой-то код, который выполняется при лайке
}

// ----

class Post(
    val authorName: String,
    val text: String,
    var likeCount: Int
) {
    fun like(isSuperLike: Boolean) {
        if (isSuperLike) {
            likeCount += 2
        } else {
            likeCount++
        }
    }
}

// ----

fun like(isSuperLike: Boolean): Unit {
    // Какой-то код
}

// ----

fun like(isSuperLike: Boolean) = 10

// ----

fun like(isSuperLike: Boolean): Int {
    if (isSuperLike) {
        likeCount += 2
    } else {
        likeCount++
    }
    return likeCount
}

// ----

val post = Post("Друг Иван", "Хей, крутое приложение!", 2)
val likesCountAfterPress = post.like(false)
// Вывод программы: У нашего поста теперь 3 лайка
println("У нашего поста теперь $likesCountAfterPress лайка")
