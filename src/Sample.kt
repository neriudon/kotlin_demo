/**
 * main function.
 */
fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Foo"
    println("Hello $name !")
    if (args.isNotEmpty()) println("Hello ${args[0]}!")
    println("Hello ${if (args.isNotEmpty()) args[0] else "Hoge"}!")
    var person = Person("Tom", true)
    person.isMarried = false
    println(person.name + person.isMarried)
}

/**
 * Kotlin class.
 * This class means...
 *
 * <pre>
 *     public class Person{
 *       private final String name;
 *       private boolean isMarried;
 *       Person(String name, boolean isMarried){
 *         this.name = name;
 *         this.isMarried = isMarried;
 *       }
 *       public String getName(){
 *         return name;
 *       }
 *       public boolean isMarried(){
 *         return isMarried;
 *       }
 *       public void setMarried(boolean isMarried){
 *         this.isMarried = isMarried;
 *       }
 *   }
 *   </pre>
 */
class Person(val name :String, var isMarried: Boolean)




fun demo() {
    println("Hello World!")
    println(max(5, 10))
    println(maxShort(5, 10))
    println(maxMoreShort(5, 10))
    // no need to define type
    val x = "hogehoge"
    val y = 1
    val z: Int = 0
    val w = 7.5e6 // this is double
    //val u:Float = 7.5e6 // this is NG
    val flag: Boolean
    if (Math.random() * 2 > 1) {
        flag = true
    } else {
        flag = false
    }
    // flag = true // val can not be changed
    var flag2 = true
    flag2 = false // var chan be changed
    val list = arrayListOf("aaa")
    list.add("bbb")
}

/**
 * compare values.
 */
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

/**
 * write max function more short.
 */
fun maxShort(a: Int, b: Int): Int = if (a > b) a else b

/**
 * write max function more short and omit return value type.
 */
fun maxMoreShort(a: Int, b: Int) = if (a > b) a else b
