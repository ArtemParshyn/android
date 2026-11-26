val text = "И да пребудет с тобой сила"

fun reverseString(str: String): String {
    val array = str.toCharArray() // конвертируем строку в массив символов Char
    var result = ""
    for (i in array.indices.reversed()) { // итерируемся по массиву в обратном направлении
        result += array[i]
    }
    return result
}

println(text)
println(reverseString(text))
// ----

И да пребудет с тобой сила
алис йобот с тедуберп ад И
// ----

val text = "И да пребудет с тобой сила"

// функция reverse() стала функцией-расширением
fun String.reverse(): String {
    val array = toCharArray()
    var result = ""
    for (i in array.indices.reversed()) {
        result += array[i]
    }
    return result
}

println(text)
// теперь мы можем вызывать функцию reverse(), будто она является функцией класса String
println(text.reverse())
// ----

// вывод остался прежним
И да пребудет с тобой сила
алис йобот с тедуберп ад И
// ----

fun String.printInternal() {
    println(toCharArray()) // toCharArray() — public, поэтому мы можем его использовать
    println("Длина строки = $length") // length — public, поэтому мы можем его использовать
//    println("hash = $hash") // этот код не будет скомпилирован, так как у нас нет доступа к переменной hash
//    println("hash = $value") // этот код не будет скомпилирован, так как у нас нет доступа к переменной value
}

text.printInternal()
// ----

И да пребудет с тобой сила
Длина строки = 26
// ----

@NotNull
public static final String reverse(@NotNull String $this$reverse) {
    Intrinsics.checkNotNullParameter($this$reverse, "<this>");
    boolean var3 = false;
    char[] var10000 = $this$reverse.toCharArray();
    Intrinsics.checkNotNullExpressionValue(var10000, "(this as java.lang.String).toCharArray()");
    char[] array = var10000;
    String result = "";
    int var5 = array.length + -1;
    if (0 <= var5) {
        do {
            int i = var5--;
            result = Intrinsics.stringPlus(result, array[i]);
        } while(0 <= var5);
    }

    return result;
}
// ----

val text: String? = null // null-допустимый тип

fun String.reverse(): String {
    val array = toCharArray()
    var result = ""
    for (i in array.indices.reversed()) {
        result += array[i]
    }
    return result
}

println(text.reverse()) // здесь будет получена ошибка компиляции
// ----

println(text?.reverse())
// ----

val text: String? = null

fun String?.reverse(): String {
    // мы можем проверить объект на null с помощью ключевого слова this
    if (this == null) return "llun"

    val array = toCharArray()
    var result = ""
    for (i in array.indices.reversed()) {
        result += array[i]
    }
    return result
}

println(text.reverse()) // теперь мы можем не использовать безопасный вызов. Наша функция умеет работать с null
// ----

llun
// ----

val text: String = "И да пребудет с тобой сила"

val String.firstWord: String
    get() = this.split(" ")[0]

val String.lastWord: String
    get() {
        val wordsArray = this.split(" ")
        return wordsArray.get(wordsArray.size - 1)
    }

println(text.firstWord)
println(text.lastWord)
// ----

И
сила
// ----

// этот код не скомпилируется
// Extension property cannot be initialized because it has no backing field
val String.firstWorld: String = this.split(" ")[0]
// ----

package com.practicum.yandex.stringext

fun String.reverse(): String { ... }
// ----

package com.practicum.yandex.main

// импортируем функцию в месте вызова
import com.practicum.yandex.stringext.reverse

fun main() {
    val text = "И да пребудет с тобой сила"
    println(text.reverse())
}
