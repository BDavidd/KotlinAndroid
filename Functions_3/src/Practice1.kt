import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale

fun main()
{
    daysOfWeek()
}

fun daysOfWeek()
{
    println("What day is it today?")

    println(LocalDate.now().dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH))
}