package groovy

//进行系统级进程交互
println "git help".execute().text
//当在string实例上调用execute（）方法时，groovy创建了一个扩展了java.lang.Process的类的实例，就像java代码中runtime类的exec（）方法所做的那样
println "groovy -v".execute().getClass().name
//调用查看groovy版本号
println("groovy -v".execute().text)
