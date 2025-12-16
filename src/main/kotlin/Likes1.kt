fun main()
{

    println("Введите число Лайков")
    var like = readln().toInt()
    if (like == null)
    {
        like=0
    }
    println(Likes(like))
}
fun Likes(like: Int): String {
    val last1D = (like % 10).toInt()

    if (last1D in  12..14)
    {
       return "$like лайкoв"
    }
    return if (last1D in 2..4  )
    {
        "$like лайка"
    }
    else when (last1D)
    {
        1 -> "$like лайк"
        else -> "$like лайков"
    }
}
