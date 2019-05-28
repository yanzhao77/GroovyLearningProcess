package groovy

def tellFortrue(closure) {
    closure new Date("09/20/2012"), "your day is filled with ceremony"
}

tellFortrue() {Date dete, fortrue ->
    println "Fortune for ${dete} is '${fortrue}'"
}
