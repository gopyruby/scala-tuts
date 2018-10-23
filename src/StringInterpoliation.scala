object StringInterpolation {
  def main(args: Array[String]) {
    val name = "Mark"
    val age = 18.5

    /*
     * Scala supports several types of string concatenation:
     *   1.) plus operator
     *   2.) s-string interpolation
     *     - Interpolates variables within string w/out regard to
     *     the types of the variables
     *   3.) f-string interpolation
     *     - Interpolates variables within string w/ regard to
     *     the types of the variables
     *     - Provides compilation errors if types are mismatched
     *     - Uses keywords d, f, s, etc to identify type
     *   4.) raw string interpolation
     *
     *   Examples shown below are from https://www.youtube.com/watch?v=_tLEX80p5-k
     */

    // Plus operator interpolation
    println(name + " is " + age + " years old")

    // s string interpolation
    println(s"$name is $age years old")
    
    // f string interpolation (type safe)
    println(f"$name%s is $age%f years old")
   
    println(s"Hello\n world")
    
    // raw string interpolation
    println(raw"Hello\n world")
  }
}
