fun main()
{
    var sum = 0
    val postoan = false
    println("Введите сумму покупки")
    var SumBye = readln().toInt()
    sum = (SumBye - Skid(SumBye))
    if (postoan == true)
    {
        println(sum - sum*0.01)
        println("Сумма скидки:"+Skid(SumBye))
    }else
    {
        println(sum)
        println("Сумма скидки: "+Skid(SumBye))
    }
}
fun Skid(SumBye: Int): Int
{

    if (SumBye in 0..1000)
        return 0
    if (SumBye in 1001..10000)
        return 100
    if (SumBye > 10001)
        return (SumBye * 0.05 ).toInt()
    else
        return 0}