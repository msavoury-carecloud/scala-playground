/**
  * Simple test app
  */
object First extends App {

  println("Hello World")

  alpha("Marcos")

  def alpha(str:String) = {
    println(s"Hello ${str}")
  }

}
