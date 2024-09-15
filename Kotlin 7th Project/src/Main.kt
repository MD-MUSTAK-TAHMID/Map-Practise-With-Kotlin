fun main() {
//    val mail :List<Int> = listOf(43,4343,4,34343,44334,43,4 )
    val names: MutableList<String> = mutableListOf("Tahmid", "Sumon", "Nafiul", "Atik", "Samun")

    names.add("Arosh")
    names.add(0, "fff")
    names[0]= "Rajdib"
    names[0]= "Rajdib"
    names[0]= "Rajdib"
    names[0]= "Rajdib"

    for (name in names){
        println(name)
    }
    println(names)
    println(names[5])
}