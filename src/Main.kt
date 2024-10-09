fun main() {
//public visibility modifier
    val cat = Cat(
        name = ""
    )
    cat.name

    //private
    //cat.age
    //protected
    //cat.age

    val data = check(name = "Nimra" , age = 20)

    //val data2 = data.copy(name = "")
   // data2.name
    val (name , age) = data
    println(name)
    println(age)

}

interface Animal {
    val name : String
    fun sound()
    fun eat() {
        println("animal have a sound")
    }
    fun test() {}

}

  interface B {
      fun test()
    //fun test(){}
  }
interface C {
    fun test1()
}
open class Cat(override val name : String) : Animal , B ,  C {
   // private val age : Int = 0
   protected open val age : Int = 0
    override fun sound() {
        println("cat has meow sound")
    }

    override fun test() {
        super<Animal>.test()
       // super<B>.test()
    }



    override fun test1() {
        println("C test")
    }

}
//protected class
class Test (name:String) : Cat(name) {
    val data = super.age
}
data class check(val name : String , val age : Int) {

}