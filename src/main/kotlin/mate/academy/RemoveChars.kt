package mate.academy

fun removeChars(str: String): String {
    return str.length >= 2 str.drop(1).dropLast() : "";
}
