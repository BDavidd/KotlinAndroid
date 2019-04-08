fun main()
{
    val noOfFish = 2.plus(71).plus(233).minus(13)
    println("number of fish: $noOfFish")

    val aquariumsDifferentLine = noOfFish.div(30).plus(1)
    println("number of aquariums separately computed: $aquariumsDifferentLine")

    val aquariumsSameLine = 2.plus(71).plus(233).minus(13).div(30).plus(1)
    println("number of aquariums computed in the same line: $aquariumsSameLine")
}