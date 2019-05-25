package groovy

class Car2 {
    final year
    private milse = 0
//相当于构造方法
    Car2(theCar) { year = theCar }

    def getMilse() {
        println("getMilse  called")
        milse
    }

    private void setMilse(milse) {
        throw new IllegalAccessException("you're not allowed to change milse")
    }

    def drive(dist) {
        if (dist > 0) milse += dist
    }

}

def car = new Car2(2012)
println("year:$car.year")
println "milse: $car.milse"
println("Driving")
car.drive(10)
println("milse:$car.milse")

try {
    print "can i set the year?"
    car.year = 1900
} catch (ReadOnlyPropertyException ex) {
    println(ex.message)
}

try {
    print "can i set the milse?"
    car.milse = 12
} catch (IllegalAccessException ex) {
    println(ex.message)
}