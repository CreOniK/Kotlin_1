
fun main() {
    var Thk = true
    var Ehe =""
    var Cards =""
    do {
        println(" Введите свою карту!")
        Cards = readln().toString()
        println(" Введите cумму перевода!")
        val amount = readln().toDouble()

        println(amount * CalculetedSum(Cards, amount))
        println("Еще 1 перевод?")
        Ehe = readln()
        if (Ehe == "да")
        {
            Thk = true
        }else
        {
            Thk = false
        }

    }while ( Thk)
}
fun CalculetedSum(Cards:String,amount: Double): Double
{
    if (amount <= 0)
    {
        println("⚠️ Ошибка! Сумма перевода должна быть больше 0 рублей.")
        return 0.0
    }
    if (amount >300 && amount <75000 && (Cards == "Mastercard" || Cards =="Maestro"))
    {
        return 0.0
    }else
    {
        return 0.006
    }
    if (amount >35  && (Cards == "Visa"|| Cards == "Мир"))
    {
        return 0.0075
    }

}
