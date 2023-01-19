fun main() {
    doppelterWert()
    wordSpace()
    leute()

    wuerfelwurf()

}

//todo Hier üben wir das Erstellen von Funktionen weiter.


fun doppelterWert(): Int {

    var wert1  = 12

    println(wert1)

    return wert1

}

//todo Wir bauen uns eine kleine Videothek.

fun wordSpace(): Int {
    var wordSpace1 : List<String> = listOf("Star Wars", "Shrek", "Toy Story")
    println("Welcome in unsere Space für diese woche the best movies ist : $wordSpace1")
    println("welche film ausleihen möchte ? \n " +
        "0=Star Wars 1=Shrek 2=Toy Story")

    var warenkorb = readln().toInt()
    println(wordSpace1.get(warenkorb))

    return warenkorb
}



//todo Du kannst dir als Hilfe für diese Aufgabe die Aufgaben aus der zweiten Woche anschauen.

fun leute(): MutableMap<String, Int> {

    var name : MutableMap<String,Int> = mutableMapOf("Herbert" to 46,
    "Gundula" to  85,
    "Franz" to 37
    )
 println("$name")

return name

}

//todo

fun wuerfelwurf() {
    var play: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6)

    println(play.random())


}