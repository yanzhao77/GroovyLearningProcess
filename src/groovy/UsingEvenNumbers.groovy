package groovy
//求1到某个特定的数N之间所有偶数的和
def sum(n) {
    total = 0
    for (int i = 2; i <= n; i += 2) {
        total += i
    }
    total
}

println("sum of even numbers from 1 to 10 is ${sum(10)}")

//求1到某个特定的数N之间所有偶数的积
def product(n) {
    prod = 1
    for (int i = 2; i <= n; i += 2) {
        prod *= i
    }
    prod
}

println("sum of even numbers from 1 to 10 is ${product(10)}")

//求1到某个特定的数N之间所有偶数的平方所组成的集合
def sqr(n) {
    squared = []
    for (int i = 2; i <= n; i += 2) {
        squared << i**2
    }
    squared
}
println("sum of even numbers from 1 to 10 is ${sqr(10)}")

