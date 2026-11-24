var name = "Барсик"
name = "Мурзик"

// ----

val firstName = "Андрей"
val lastName = "Андроидов"
val fullName = firstName + " " + lastName

println(fullName) // Выведет: Андрей Андроидов

// ----

val language = "Kotlin"
val firstChar = language[0]  // К
val lastChar = language[5]  // n

// ----

val password = "qwerty123"
val passwordLength = password.length

println("Длина пароля: " + passwordLength + " символов") // Выведет: Длина пароля: 9 символов

// ----

val str1 = "Android"
val str2 = "Android"
val str3 = "android"
val str4 = " Android"

println(str1 == str2) // true (содержимое одинаковое)
println(str1 == str3) // false (регистр отличается)
println(str1 == str4) // false (спереди пробел)

// ----

val text = "  Android разработка  "

// Обрезка пробелов в начале и конце
val trimmed = text.trim() // "Android разработка"

// Преобразование регистра
val uppercase = text.uppercase() // "  ANDROID РАЗРАБОТКА  "
val lowercase = text.lowercase() // "  android разработка  "

// Замена подстроки
val replaced = text.replace("Android", "iOS") // "  iOS разработка  "

// Проверка содержания
val containsAndroid = text.contains("Android") // true
val startsWithSpace = text.startsWith(" ") // true
val endsWithSpace = text.endsWith(" ") // true

// Получение подстроки
val substring = text.substring(2, 9) // "Android"

// ----

var text = " Android "
text = text.trim()
val isEqual = text == "android"
println(isEqual)

// ----

println("\$") // $
println("\\") // \
println("слово в \"кавычках\"") // слово в "кавычках"
println("a\nb") // перевод строки: символ b выведется на следующей строке

// ----

val regularPath = "C:\\Program Files\\Android\\Studio" // обычная строка
val rawPath = """C:\Program Files\Android\Studio"""    // raw string

println(regularPath) // C:\Program Files\Android\Studio
println(rawPath)     // C:\Program Files\Android\Studio

// ----

val multilineText = """
    Это многострочный текст.
    Он может содержать несколько строк.
    Все переносы строк сохраняются.
    
    Даже пустые строки сохраняются.
"""

println(multilineText)
