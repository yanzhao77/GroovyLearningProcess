package groovy

for (ch = "a"; ch < "z"; ch++) {
    println(ch)
}

for (ch in "a".."g"){
    println(ch)
}

lst=["hello"]
lst<<"world"
println(lst)