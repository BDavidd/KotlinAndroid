fun main()
{
    val numbers = Array(5) { it + 11 }

    val strings : MutableList<String> = mutableListOf()

    for (number in numbers)
    {
        strings.add(number.toString())
    }
    println(strings)

    val divisibleBySeven : MutableList<Int> = mutableListOf()
    for (number in 7..100 step 7)
    {
        divisibleBySeven.add(number)
    }
    println(divisibleBySeven)
}