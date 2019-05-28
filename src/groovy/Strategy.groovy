package groovy

def totalSelectValues(n, clouse) {
    total = 0
    for (i in 1..n) {
        if (clouse(i)) {
            total += i
            println(total)
        }
    }
    total
}

println("total of even numbers from 1 to 10 is")
println(totalSelectValues(10) {
    it % 2 == 0
})
def isOdd = { it % 2 != 0 }
println("total of odd numbers from 1 to 10 is")
println(totalSelectValues(10,isOdd))

