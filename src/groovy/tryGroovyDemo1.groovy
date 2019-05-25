package groovy

def openFile(def fileName){
    new FileInputStream(fileName)
}
//异常处理和捕获
try {
    openFile("nonexistentfile")
} catch (FileNotFoundException f) {
    println("Oops:"+f)
}