// Editor 1 (data class State, плохой подход)
import kotlin.random.Random

data class State(
    val content: String?,
    val error: String?,
    val isLoading: Boolean
)

class UserScreen {

    fun render(state: State) {
        if (state.content != null) {
            println("Показываем контент: ${state.content}")
        }

        if (state.error != null) {
            println("Показываем ошибку: ${state.error}")
        }
        if (state.isLoading) {
            println("Показываем загрузку")
        }
    }
}

class ContentDownloader(private val userScreen: UserScreen) {

    fun downloadContent() {
        val state = when (Random.nextInt(3)) {
            0 -> State(
                content = "Кот Борис",
                error = null,
                isLoading = false
            )
            1 -> State(
                content = null,
                error = null,
                isLoading = true
            )
            else -> State(
                content = null,
                error = "Похоже, злые бурундуки отключили нам интернет",
                isLoading = false
            )
        }

        userScreen.render(state)
    }
}

fun main() {
    val contentDownloader = ContentDownloader(UserScreen())
    for (i in 0..5)
        contentDownloader.downloadContent()
}
// ----

// невозможное состояние
State(
    content = "Кот Борис",
    error = "Похоже, злые бурундуки отключили нам интернет",
    isLoading = true
)
// ----

sealed interface State
// ----

sealed interface State {
    // каждый класс внутри sealed interface отражает отдельно состояние нашего экрана
    data class Data(val content: String) : State
    data class Error(val error: String) : State
    object Loading : State
}
// ----

// Editor 2 (sealed подход)
import kotlin.random.Random

sealed interface State {

    // помним, что в Kotlin нет ключевых слов extends и implements, вместо них используется двоеточие ":"
    data class Data(val content: String) : State
    data class Error(val error: String) : State
    object Loading : State
}

class UserScreen {

    fun render(state: State) {
        when (state) {
            is State.Data -> println("Показываем контент: ${state.content}")
            is State.Error -> println("Показываем ошибку: ${state.error}")
            is State.Loading -> println("Показываем загрузку")
        }
    }
}

class ContentDownloader(private val userScreen: UserScreen) {

    fun downloadContent() {
        val state = when (Random.nextInt(3)) {
            0 -> State.Data("Кот Борис")
            1 -> State.Loading
            else -> State.Error("Похоже, злые бурундуки отключили нам интернет")
        }

        userScreen.render(state)
    }
}

fun main() {
    val contentDownloader = ContentDownloader(UserScreen())
    for (i in 0..10)
        contentDownloader.downloadContent()
}
// ----

fun render(state: State) {
    when (state) {
        is State.Data -> println("Показываем контент: ${state.content}")
        is State.Error -> println("Показываем ошибку: ${state.error}")
        is State.Loading -> println("Показываем загрузку")
        // оператор `else` не требуется, потому что мы покрыли все возможные случаи
    }
}
