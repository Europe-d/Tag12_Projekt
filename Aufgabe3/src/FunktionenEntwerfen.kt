




fun main() {
    ersteListe()
    println(eineFunktion())
    zehn5()
    zehn2()
    welcome()
    test3()
}




fun eineFunktion(): String {
    return "Das ist eine Funktion!"
}



//todo Schreibe eine Funktion mit passendem Rückgabewert, die 5 zurückgibt.

fun zehn5() : Int {

    var zahl = 5

    var ergebnis = zahl
    println(ergebnis)

    return ergebnis




}

//todo Schreibe eine Funktion mit passendem Rückgabewert, die 6.234 zurückgibt.

fun zehn2() : Double {

    var zahl1 = 6.234

    var ergebnis1 = zahl1
    println(ergebnis1)

    return ergebnis1
}

// todo Schreibe eine Funktion mit passendem Rückgabewert, die "Hallo" zurückgibt.


fun welcome() : String {

    var sagt = "Hallo"


    println(sagt)

    return sagt
}

//todo Schreibe eine Funktion, die eine Liste vom Typ String zurückgibt. Die Liste ist dabei initial (also zu Begin) mit folgenden Werten gefüllt:

fun ersteListe() : String {

    var sagt : List<String> = listOf("Hallo","Welt","!")


    println(sagt)

    return sagt.toString()
}

//todo Schreibe eine Funktion, die eine MutableMap zurückgibt. Der Key der MutableMap ist vom Typ String, der Wert der MutableMap ist vom Typ Boolean.
// Die MutableMap ist dabei initial (also zu Begin) mit folgenden Paaren gefüllt:
//
//"Lernen wir die Sprache FranzÃ¶sisch?" -> false
//"Lernen wir die Sprache Kotlin?" -> true

fun test3() : String {

    var test2: MutableList<Boolean> = mutableListOf(true)
    var erste = "Lernen wir die Sprache Franzaesisch?"
    var erste2 = "Lernen wir die Sprache Kotlin?"

    println(erste.isEmpty())
    println(erste2.isNotEmpty())

    return erste
    return erste2

}

