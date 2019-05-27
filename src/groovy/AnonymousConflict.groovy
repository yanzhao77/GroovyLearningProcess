package groovy

def calibrator= new Calibrator({
    println("123")
})
def calculation={
    println("456")
}
def calibrator2=new Calibrator(calculation)
