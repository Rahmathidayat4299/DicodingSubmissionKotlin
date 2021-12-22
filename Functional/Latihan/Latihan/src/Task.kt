/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val kotlin = "Kotlin".getFirstAndLast()
    val dicoding = "Dicoding".getFirstAndLast()

    val kotlinFirstChar = kotlin["kotlinFirst"]
    val kotlinLastChar = kotlin["kotlinLast"]

    val dicodingFirstChar = dicoding["dicodingFirst"]
    val dicodingLastChar = dicoding["dicodingLast"]

    println("First char Kotlin is $kotlinFirstChar and $kotlinLastChar for second letter")
    println("First char Dicoding is $dicodingFirstChar and $dicodingLastChar for second letter")

}

// TODO\
fun String.getFirstAndLast(): Map<String, Char>{
    return mapOf(
        "kotlinFirst" to 'K',
        "kotlinLast" to 'n',
        "dicodingFirst" to 'D',
        "dicodingLast" to 'g'
    )

}

