package ru.yandex.practicum.calculator // пакет calculator

class WorkCalculator {
    var workingHours: Int = 8 // теперь переменная доступна в любом классе

    fun calculate(workDays: Int): Int { // метод также доступен в любом классе и пакете
        return workDays * workingHours
    }
}

// ----

package ru.yandex.practicum.calendar // пакет calendar

// импортировали класс WorkCalculator из пакета calculator.
// ключевое слово `import` нужно, чтобы использовать классы, методы или переменные внутри другого класса.
// Современные IDE умеют делать это автоматически, и вам нет необходимости писать их вручную.
import ru.yandex.practicum.calculator.WorkCalculator

object Main {

    fun main(args: Array<String>) {
        val calculator: WorkCalculator = WorkCalculator()
        val daysJanuary = 15

        // без препятствий вызвали метод calculate
        println("Рабочие часы за январь: " + calculator.calculate(daysJanuary))

        // смогли обратиться к переменной workingHours
        println("Один день - " + calculator.workingHours + " часов.")
    }
}

// ----

Рабочие часы за январь: 120
Один день - 8 часов.

// ----

package ru.yandex.practicum.calculator

class WorkCalculator {
    private val workingHours = 8 // теперь переменная доступна только в этом классе

    private fun calculate(workDays: Int): Int { //метод тоже доступен только здесь
        return workDays * workingHours // обращаемся к переменной внутри её класса
    }
}

// ----

package ru.yandex.practicum

import ru.yandex.practicum.calculator.WorkCalculator

object Main {

    fun main(args: Array<String>) {
        val calculator: WorkCalculator = WorkCalculator()
        // здесь произойдёт ошибка компиляции - нет доступа к методу
        calculator.calculate(10)
        // переменная workingHours не доступна
        println("Рабочие часы: " + calculator.workingHours)
    }
}

// ----

package ru.yandex.practicum.calculator

internal class WorkCalculator {
    private val workingHours = 8

    internal fun calculate(workDays: Int): Int { // модификатор по умолчанию
        return workDays * workingHours
    }
}

// ----

package ru.yandex.practicum.calculator // здесь то же модуль calculator, пакет может и отличаться

internal object Main {
    fun main(args: Array<String>) {
        val calculator = WorkCalculator()
        println(
            "Количество отработанных часов за 29 дней: "
                + calculator.calculate(29)
        ) // метод сработал
    }
}

// ----

Количество отработанных часов за 29 дней: 232

// ----

package ru.yandex.practicum.calendar // здесь другой модуль

internal object Main {
    fun main(args: Array<String>) {
        val calculator = WorkCalculator()
        println(
            "Количество отработанных часов за 29 дней: "
                + calculator.calculate(29) // ошибка доступа
        )
    }
}
