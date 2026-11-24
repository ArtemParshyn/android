class Post(
    val authorName: String,
    var text: String,
    var likeCount: Int
) {
    fun like(isSuperLike: Boolean): Int {
        if (isSuperLike) {
            likeCount += 2
        } else {
            likeCount++
        }
        return likeCount
    }

    fun edit(text: String, isAppend: Boolean) {
        if (isAppend) {
            this.text += text
        } else {
            this.text = text
        }
    }
}
