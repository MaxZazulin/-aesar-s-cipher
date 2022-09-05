/* Author      : Maxim Zazulin */
fun cipher(data: Array<Int>, shift: Int): Array<Int> {
    val buffer = IntArray(size = shift)
    for (i in 0 until shift) {
        buffer[i] = data[i]
    }
    for (h in 0..data.size - 1 - shift) {
        data[h] = data[h + shift]
    }
    for (j in 0 until shift) {
        data[data.size - shift + j] = buffer[j]
    }
    return data
}
fun main() {
    var data: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    data = cipher(data, 3)
    data.forEach { name -> print(name) }
}
