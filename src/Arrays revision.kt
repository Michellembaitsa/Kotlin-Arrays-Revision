fun main(){
names()
    
}
fun names(){
    var namesArray= arrayOf("Bethlehem","Jerusalem","Egypt","Canaan","Gomora","Eden","Nazareth","Gethsemani")
    namesArray.set(4,"Galileo") //add element to a specific index.
    var namesArray2=namesArray.plus("Ninevah") //create a new array to modify the elements.
    println(namesArray)
    var name=namesArray2.indexOf("Egypt")


    var names=namesArray.sorted() //Arranging a list in ascending order(sorting)
    println(names)
    names.forEach{names-> //looping through arrays.
        println(names)
    }


}