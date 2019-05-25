package groovy
//if的另一种写法
def foo(str){
  //if (str!=null){str.reverse()}
    str?.reverse()
}
println foo("evil")
println(foo(null))