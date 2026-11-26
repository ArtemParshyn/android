val mails: ArrayList<Mail> = ArrayList<EnterpriseMail>() // Ошибка!
// ----

fun copy(source: ArrayList<out Mail>, destination: ArrayList<in Mail>) {
    for (mail in source) {
        destination.add(mail)
    }
}
// ----

val enterpriseMails = arrayListOf(EnterpriseMail(), EnterpriseMail())
val allMails = arrayListOf<Mail>()
// ----

copy(enterpriseMails, allMails)
// ----

abstract class Mail

open class EnterpriseMail : Mail()
class HRMail : EnterpriseMail()
// ----

fun copy(source: ArrayList<out EnterpriseMail>, destination: ArrayList<in EnterpriseMail>) {
    for (m in source) {
        destination.add(m)
    }
}
// ----

class Envelope<T : Mail> (val letter: T, val address: String)
// ----

val postmanBag : ArrayList<Envelope<Mail>> = ArrayList() // сумка почтальона готова принимать конверты с письмами Mail

val env1 = Envelope(EnterpriseMail(), "Baker Street 221b")
val env2 = Envelope(HRMail(), "Омск")
postmanBag.add(env1) // А вот тут IDE сообщит об ошибке
postmanBag.add(env2) // И тут
// ----

class Envelope<out T: Mail> (val letter: T, val address: String)
// ----

val env2 = Envelope(HRMail(), "Омск")
// ----

class MagicBox {
    val items = ArrayList<Any>()

    fun putItem(i: Any) {
        items.add(i)
    }

    fun <T> getItem(): T? {
        for (i in items) {
            if (i is T) { // Ошибка. Нельзя проверить объект на принадлежность к стираемому типу
                return i
            }
        }
        return null
    }
}
// ----

inline fun <reified T> getItem(): T? {
    for (i in items) {
        if (i is T) { // ✅ Теперь работает!
            return i
        }
    }
    return null
}
// ----

inline fun <reified T> findFirstOfType(list: List<Any>): T? {
    for (item in list) {
        if (item is T) return item
    }
    return null
}

fun main() {
    val mixed = listOf(42, "hello", EnterpriseMail())
    val mail = findFirstOfType<EnterpriseMail>(mixed)
    
    println(mail) // Выведет объект EnterpriseMail, если найдёт
}
