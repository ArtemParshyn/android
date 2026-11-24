object PiggyBank {

    private val moneyList = ArrayList<Money>() // список монеток/купюр
    private var isBroken: Boolean = false // свойство, определяющее, разбита ли копилка

    fun putMoney(money: Money) {
        if (isBroken) {
            println("Вы разбили копилку, вы больше ничего положить туда не можете")
            return
        }

        moneyList.add(money)
        println("Добавлено в копилку $money")
    }

    fun shake(): Money? {
        if (isBroken) {
            println("Вы разбили копилку, больше оттуда ничего не вытрясти")
            return null
        }

        val iterator = moneyList.iterator()
        while (iterator.hasNext()) {
            val money = iterator.next()
            if (money.isCoin) {
                iterator.remove()
                return money
            }
        }
        return null
    }

    fun smash(): ArrayList<Money> {
        isBroken = true
        val moneys = ArrayList(moneyList)
        moneyList.clear()
        println("Копилка разбита, вы достали оттуда: $moneys")
        return moneys
    }
}

class Money private constructor(
    val amount: Float,
    val isCoin: Boolean
) {

    override fun toString(): String {
        return if (isCoin) {
            if (amount < 1f) {
                "${(amount * 100).toInt()} коп."
            } else {
                "${amount.toInt()} руб."
            }
        } else {
            "${amount.toInt()} руб."
        }
    }

    companion object {
        val coins_10 = Money(0.1f, true)
        val coins_50 = Money(0.5f, true)
        val coins_100 = Money(1f, true)

        val bill_50 = Money(50f, false)
        val bill_100 = Money(100f, false)
        val bill_500 = Money(500f, false)
        val bill_1000 = Money(1000f, false)
    }
}
