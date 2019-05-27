package groovy

def pickEven(n, block) {
    for (int i = 2; i <= n; i += 2) {
        block(i)
    }
}

//pickEven(10, { println(it) })
//pickEven(10){println(it)}
//pickEven(10){evenNumber ->println(evenNumber)}

//求1到某个特定的数N之间所有偶数的和
total = 0
pickEven(10) { total += it }
println("sum of even numbers from 1 to 10 is ${total}")

//求1到某个特定的数N之间所有偶数的积
total = 1
pickEven(10) { total *= it }
println("sum of even numbers from 1 to 10 is ${total}")

//求1到某个特定的数N之间所有偶数的和squared << i**2
total = []
pickEven(10) { total << it**2 }
println("sum of even numbers from 1 to 10 is ${total}")
