package groovy

class Man{
    void helpMoveThings(){
        //......
        println "Man's helping"
    }
}
class WoMan{
    void helpMoveThings(){
        //......
        println "WoMan's helping"
    }
}
class Elephant{
    void helpMoveThings(){
        //......
        println "Elephant's helping"
    }
    void eatSugarcane(){
        //....
        println "I' love sugarcanes"
    }
}

def takeHelp(helper) {
    helper.helpMoveThings()

}

takeHelp(new Man())
takeHelp(new WoMan())
takeHelp(new Elephant())

