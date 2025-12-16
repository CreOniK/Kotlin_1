fun main() {
    var Zap = ""
    var con = false
    var i = 0
    println(" Введите Запрос")
    Zap =readln()
    if (Zap == "time")
    {
        var sec = 0
        while (!con)
        {
            println(" Введите Количество Секунд!")
            sec =readln().toInt()
            println(agoToText(sec)+"\uD83D\uDD53")
            println()
            i++
            if(i==4){
            println("Хотите Выйти")
            con = readln().toBoolean()
            i=0
            }
        }
    }
}
