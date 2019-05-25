package groovy

//groovy的for循环写法
for (i in 0..3){
    println("好困鸭")
}
//for循环的写法2
0.upto(3){
    println("$it")
}
//for循环的写法3
3.times {
    println("$it")
}
println("@@@@@@@@@@@")

/***
 * 选择在循环是跳过一些值
 * 10是最大值，3是叠加数
 */
0.step(10,3){
    println("$it")
}

