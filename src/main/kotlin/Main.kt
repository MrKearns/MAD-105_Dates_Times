import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main() {

    // ----------- TODAY"S DATE & FORMATTING ----------

    var today = LocalDate.now()
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    var formattedToday = today.format(formatter)


    // ---------- LAST FULL MOON ----------

    val lastFullMoon: LocalDate = LocalDate.of(2023, 2, 5)

    // Next full from last

    var lastPlus30 = lastFullMoon.plusDays(30)

    // calculate the number of days from today till next full moon

    var daysToNextFullMoon = today.until(lastPlus30, ChronoUnit.DAYS)

    // add DAYS TILL to TODAY

    var nextFullDate = today.plusDays(daysToNextFullMoon).format(formatter)

    // ---------- PRINT STATEMENTS ----------

    println("Today is $formattedToday")

    println("The next full moon is in: $daysToNextFullMoon ($nextFullDate)")

}