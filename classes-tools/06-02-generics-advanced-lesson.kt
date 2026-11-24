class MailBox<T> {
    var mail: T? = null

    fun putMail(m: T) {
        mail = m
    }
}
// ----

class EnterpriseMail
class PersonalMail
// ----

val enterpriseMailBox: MailBox<EnterpriseMail> = MailBox()
val personalMailBox: MailBox<PersonalMail> = MailBox()
val someEnterpriseMail = EnterpriseMail()
val somePersonalMail = PersonalMail()

enterpriseMailBox.putMail(someEnterpriseMail)
personalMailBox.putMail(somePersonalMail)
// ----

abstract class Mail

interface Sendable

class EnterpriseMail : Mail(), Sendable

class PersonalMail : Mail(), Sendable
// ----

class MailBox<T : Mail> {
    var mail: T? = null

    fun putMail(m: T) {
        mail = m
    }
}
// ----

class MailBox<T> where T : Mail, T : Sendable {
    var mail: T? = null
    
    fun putMail(m: T) {
        mail = m
    }
}
// ----

class MailBox<T : Mail & Sendable> {
    var mail: T? = null
    
    fun putMail(m: T) {
        mail = m
    }
}
// ----

class MailBox<T : Mail, S : Sendable> {
// ...
}
// ----

abstract class Mail {
    abstract fun getType(): String
}

interface Sendable {
    fun getAddress(): String
}

class EnterpriseMail : Mail(), Sendable {
    override fun getType() = "Enterprise"
    override fun getAddress() = "[office@company.com](mailto:office@company.com)"
}

class PersonalMail : Mail(), Sendable {
    override fun getType() = "Personal"
    override fun getAddress() = "[home@user.com](mailto:home@user.com)"
}
// ----

class MailStatistic<T>(t: T) where T : Mail, T : Sendable {
    val type: String
    val address: String

    init {
        type = t.getType()
        address = t.getAddress()
    }
}
// ----

val someMail = EnterpriseMail()
val statistic = MailStatistic(someMail)
// ----

class MailBox<T : Mail & Sendable> {
    var mail: T? = null

    fun putMail(m: T) {
        mail = m
    }

    fun <E : Mail> fromArrayToList(array: Array<E>, list: ArrayList<E>) {
        for (e in array) {
            list.add(e)
        }
    }
}
// ----

val mailArray = arrayOf(PersonalMail(), PersonalMail())
val mailList = ArrayList<PersonalMail>()
val personalMailBox = MailBox<PersonalMail>()

personalMailBox.fromArrayToList(mailArray, mailList)
