/* For this simple and fun challenge I needed to create an Infinite/Boundless Century Counter
This counter will take a year as an input and return which Century the year belongs to */

fun century(number: Int): Int {
    var century = 1 // century counter
    var counter = 0 // counter starts at 0
    
    for(i in 1..number){            // this will repeat itself until the number was reached
        if(counter - 100 == 0){     // if 100 years have passed...
            century++               // increment century by 1
            counter = counter - 100   // return counter to 0
        }
        counter++                   // counter starts to count from 0 again
    }
    return century
}
