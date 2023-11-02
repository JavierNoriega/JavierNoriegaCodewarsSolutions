/*
My desire with this code is to practice the array to list back and forth, as well as manipulating the list
For the original "Two Oldest Ages" this is not necessary, hence why I name it as "Overcomplicated"
 */

fun main(args: Array<String>) {

    var numArr = arrayOf(1,2,3,85,285)
    var arrToList = mutableListOf<Int>()        // make an empty list that will hold a mutable list copy of the array

    arrToList = numArr.toMutableList()          // copy the array into the mutable list

    var goodList = mutableListOf<Int>()         // make another empty mutable list that will hold the final list


    for(i in numArr){                           // for each iteration of the array...               [
        if(goodList.size == 2){                 // if the final list is holding 2 values Stop
            break
        }
        goodList.add(arrToList.max())           // Add the maximum value to the final list
        arrToList.remove(arrToList.max())       // Remove the maximum value from the copied list    ]
    }

    goodList.sort()                             // Sort the Good List

    var listToArray = goodList.toTypedArray()   // Turn the Good List into an Array

    for(i in listToArray){                      // Print the Array
        println(i)
    }

}
