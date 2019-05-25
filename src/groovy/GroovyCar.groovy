package groovy

class Car1 {
    def milse = 0
    final year
//相当于构造方法
    Car1(theCar) { year = theCar }
}

def car = new Car1(2008)
println("year:$car.year")
println("milse:$car.milse")
println("setting milse")
car.milse = 25
println("milse: $car.milse")