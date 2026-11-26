data class Commit(
    val tree: Tree,
    val previousCommit: Commit?
)

interface SnapshotPart

data class Tree(
    val tree: Map<String, SnapshotPart>
) : SnapshotPart

data class Blob(
    val content: List<Byte>
) : SnapshotPart

fun main() {
    val firstTree = Tree(
        mapOf(
            "text.txt" to Blob("Привет, мир".toByteArray().toList())
        )
    )
    val firstCommit = Commit(firstTree, null)

    val secondTree = Tree(
        mapOf(
            "text.txt" to Blob("Привет, мир".toByteArray().toList()),
            "advanced_git.txt" to Blob("Привет, второй коммит".toByteArray().toList())
        )
    )
    val repository = Commit(secondTree, firstCommit)

    println(repository)
}
