fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println("Good ${if (args[0].toInt() < 12) "morning" else "night"}, Kotlin")
    }
}