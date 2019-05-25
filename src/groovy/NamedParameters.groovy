package groovy

class Robot {
    def type, height, width

    def access(location, weight, fragile) {
        println "Received fragile? $fragile,weight:$weight,loc:$location"
    }
}

robot = new Robot(type: "arm", width: 10, height: 40)
println "$robot.type,$robot.height,$robot.width"

robot.access(x: 30, y: 20, z: 10, 50, true)
//可以修改参数程序
robot.access(50, true, x: 30, y: 20, z: 10)

