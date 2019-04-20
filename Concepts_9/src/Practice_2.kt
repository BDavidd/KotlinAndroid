fun main()
{
    val fishName = "Tuna"

    when (fishName.length)
    {
        0 -> println("The fish name is empty")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}