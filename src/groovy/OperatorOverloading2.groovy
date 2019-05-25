import static Math.random as rand
import groovy.lang.ExpandoMetaClass as EMC


double value=rand()
def metaClass=new EMC(Integer)
assert metaClass.getClass().name=="groovy.lang.ExpandoMetaClass"


def receiveVarArgs(int a, int ... b) {
    println("you passed $a and $b")
}

def receiveArray(int a, int[] b) {
    println("you passed $a and $b")
}
receiveVarArgs(1,2,3,4,5)
receiveArray(1,2,3,4,5)

