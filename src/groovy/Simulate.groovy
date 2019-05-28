package groovy

class Equipment {
    def calculator

    Equipment(calc) { calculator = calc }

    def simulate() {
        println("Running simulation")
        calculator()//可能还会发送参数
    }
}

def eql = new Equipment({ println("calculator 1") })
def aCalculator = {println("Calculator 2")}
def eq2 = new Equipment(aCalculator)
def eq3 = new Equipment(aCalculator)
eql.simulate()
eq2.simulate()
eq3.simulate()
