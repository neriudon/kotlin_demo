/**
 * main function.
 */
fun main(args: Array<String>) {
    println("Hello World!")
    println(max(5, 10))
    println(maxShort(5, 10))
    println(maxMoreShort(5, 10))
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
