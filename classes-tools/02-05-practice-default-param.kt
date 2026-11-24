fun main() {
    val post: Post = Post(likesCount = 5) // text берётся из значения по умолчанию
    println(post.text) // Вывод должен быть "Привет, Мир!"
}
