class OriginalStoryCreator {
    // Тело класса
}
// ----

val first = OriginalStoryCreator()
val second = OriginalStoryCreator()
// ----

object OriginalStoryCreator {

    init {
        writeStory()
    }

    private var isStoryReady: Boolean = false

    private fun writeStory() {
        // очень долгая операция, ведь написать новую историю не так просто
        isStoryReady = true
    }

    fun tellStory() {
        if (isStoryReady) {
            println("Рассказать крутую историю о приключениях")
        } else {
            println("История ещё не дописана, немножечко терпения")
        }
    }
}
// ----

fun main() {
    OriginalStoryCreator.tellStory()
}
// ----

object OriginalStoryCreator {

    const val STORY_SIZE: Int = 100

    // тело класса
}
// ----

interface StoryKeeper // интерфейс — это «договор» о том, что должен уметь объект, подробнее об этом поговорим позже

abstract class Writer // абстрактный класс — это «шаблон» для создания других объектов

object OriginalStoryCreator : Writer(), StoryKeeper { ... }  // объект теперь имеет свойства и Writer, и StoryKeeper
// ----

class Story(
    val text: String,
    val genre: String
) {

    companion object {
        const val GENRE_FANTASY = "Фэнтези"
        const val GENRE_ADVENTURE = "Приключения"
    }
}
// ----

val fantasyStory: Story = Story("Длинная эпическая история про драконов и магию", Story.GENRE_FANTASY)
val adventureStory: Story = Story("История про путешествия в горы за сокровищами инков", Story.GENRE_ADVENTURE)
// ----

// Делаем конструктор приватным — теперь никто не может создать Story напрямую

class Story private constructor(
    val text: String,
    val genre: String
) {

    companion object {
        // Константы теперь приватные — доступны только внутри этого класса
        private const val GENRE_FANTASY = "Фэнтези"
        private const val GENRE_ADVENTURE = "Приключения"

        // Теперь мы можем создавать истории только с использованием этих жанров
        fun createFantasyStory(story: String): Story = Story(story, GENRE_FANTASY)
        fun createAdventureStory(story: String): Story = Story(story, GENRE_ADVENTURE)
    }
}
// ----

val fantasyStory: Story = Story.createFantasyStory("Длинная эпическая история про драконов и магию")
val adventureStory: Story = Story.createAdventureStory("История про путешествия в горы за сокровищами инков")
