fun main() {
    var data : Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8 ,9)
    data = cipher(data, 3)
}

fun cipher(data : Array<Int>, shift : Int): Array<Int> {
    var buffer = arrayOfNulls<Int>(data.size-1)
    for(i in data.indices) {
        if (i == data.size - shift)
            buffer[i] = data[i - data.size]
        else
            buffer[i] = data[i + shift]
    }
    return buffer
}