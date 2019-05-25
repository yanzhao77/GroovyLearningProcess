package groovy

def splitName(fullName){
    fullName.split(" ")
}
def (firstName,lastName)=splitName("james Bond")
println("$lastName,$firstName,$lastName")

def name1="Thomson"
def name2="Thompson"
println("$name1 and $name2")
(name1,name2)=[name2,name1]
println("$name1 and $name2")

def (String cat,String mouse)=['tom','jerry','spike','tyke']
println("$cat and $mouse")

def(first,second,third)=['tom','jerry']
println("$first $second $third")

def(firsts,int s)=["ccc"]
println("$firsts $s")