package groovy

def log(x, base = 10) {
    Math.log(x) / Math.log(base)
}

println(log(1024))
println(log(1024, 10))
println(log(1024, 2))

def task(name,String[] details){
    println("$name -$details")
}
task("call","123-456-7890")
task("call","123-456-7890","231-546-0987")
task("call")