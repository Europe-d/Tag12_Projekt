fun main() {
    println(subtrahieren())


    val ergebnis = ersteZahl() * zweiteZahl()
    println(ergebnis)
}

fun subtrahieren(): Int {
    var zahl1 = 28
    var zahl2 = 13
    return zahl1 - zahl2
}


fun lieblingsFarbe(): String {
    val farben: List<String> = listOf("Rot", "Blau", "Gelb", "GrÃ¼n", "Lila", "Pink")
    var meineFarbe: String = farben[farben.size-4]
    return meineFarbe
}

fun ersteZahl(): Int {
    return (20 - 18) * 6
}

fun zweiteZahl(): Int {
    return 25 / 5
}




