class AuthorizationType {

    // Чтобы не приходилось создавать объект класса, положим наши константы в объект-компаньон класса
    companion object {
        const val LOGIN = "login"
        const val PHONE_NUMBER = "phone"
        const val EMAIL = "email"
    }
}

// ----

Main.kt:4:9: error: unresolved reference: AuthorizationType

        AuthorizationType.LOGIN -> println("login")

        ^

Main.kt:5:9: error: unresolved reference: AuthorizationType

        AuthorizationType.PHONE_NUMBER -> println("phone")

        ^

Main.kt:6:9: error: unresolved reference: AuthorizationType

        AuthorizationType.EMAIL -> println("email")

        ^

Main.kt:12:25: error: unresolved reference: AuthorizationType

    handleAuthorization(AuthorizationType.EMAIL)

                        ^

Main.kt:13:25: error: unresolved reference: AuthorizationType

    handleAuthorization(AuthorizationType.LOGIN)

                        ^

Error: Unable to access jarfile main.jar

// ----

email
login

Process finished with exit code 0

// ----

enum class AuthorizationType {
// возможные типы перечисляются через запятую
    LOGIN, 
    PHONE_NUMBER,
    EMAIL
}

// ----

fun handleAuthorization(type: AuthorizationType) {
    when (type) {
        AuthorizationType.LOGIN -> println("login")
        AuthorizationType.PHONE_NUMBER -> println("phone")
        AuthorizationType.EMAIL -> println("email")
    }
}

// ----

fun main()  {
    handleAuthorization(AuthorizationType.EMAIL)
    handleAuthorization(AuthorizationType.LOGIN)
    // Ошибка компиляции: случайная строка не подходит
    handleAuthorization("pincode")
}

// ----

fun main()  {
    println(AuthorizationType.PHONE_NUMBER)
    println(AuthorizationType.EMAIL)
    println(AuthorizationType.LOGIN)
}

// ----

PHONE_NUMBER
EMAIL
LOGIN

// ----

fun main()  {
    println(AuthorizationType.PHONE_NUMBER.ordinal) // 1 (второй в списке констант)
    println(AuthorizationType.EMAIL.ordinal) // 2 (третий в списке констант)
    println(AuthorizationType.LOGIN.ordinal) // 0 (первый в списке констант)
}

// ----

1
2
0

// ----

fun main()  {
    println(AuthorizationType.entries)
}

// ----

// Вывод
[LOGIN, PHONE_NUMBER, EMAIL]

// ----

open class LoginType

// Ошибка компиляции: enum не может наследоваться от других классов
enum class AuthorizationType: LoginType {
    LOGIN,
    PHONE_NUMBER,
    EMAIL
}

// ----

enum class AuthorizationType {
    LOGIN,
    PHONE_NUMBER,
    EMAIL
}

// ----

// Ошибка компиляции: классы не могут наследоваться от enum
class PhoneAuthorization: AuthorizationType

// ----

interface Authorizable {
    fun signIn()
}

enum class AuthorizationType: Authorizable {
    LOGIN,
    PHONE_NUMBER,
    EMAIL; 
    
    override fun signIn() {
        when (this) {
            LOGIN -> println("login")
            PHONE_NUMBER -> println("phone")
            EMAIL -> println("email")
        }
    }
}

// ----

enum class AuthorizationType: Authorizable {
    LOGIN,
    PHONE_NUMBER,
    EMAIL,
    PINCODE; 
    
    override fun signIn() {
        // Ошибка компиляции: не хватает обработки PINCODE или ветви else
        when (this) {
            LOGIN -> println("login")
            PHONE_NUMBER -> println("phone")
            EMAIL -> println("email")
            // Необходимо добавить PINCODE
        }
    }
}

// ----

override fun signIn() {
    when (this) {
        LOGIN -> println("Вход по логину и паролю")
        PHONE_NUMBER -> println("Вход по номеру телефона")
        EMAIL -> println("Вход по электронной почте")
        PINCODE -> println("Вход по PIN-коду")  // ✅ Теперь всё в порядке
    }
}

// ----

enum class AuthorizationType: Authorizable {
    LOGIN {
       override fun signIn() {
           println("login")
       }
    },
    PHONE_NUMBER {
        override fun signIn() {
            println("phone")
        } 
    },
    EMAIL {
        override fun signIn() {
            println("email")
        } 
    }
}

// ----

enum class AuthorizationType(val data: String) {
    LOGIN("login"),
    PHONE_NUMBER("phone"),
    EMAIL("email"),
    PINCODE("pincode")
}

fun main()  {
    println(AuthorizationType.LOGIN.data)
    println(AuthorizationType.PHONE_NUMBER.data)
}

// ----

// Вывод
login
phone
