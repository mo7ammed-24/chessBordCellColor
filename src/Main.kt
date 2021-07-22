fun main() {
    print(chessBoardCellColor("A1","C3"))
}

fun chessBoardCellColor(cell1: String, cell2: String): Boolean {
    if ((cell1[0].toInt() + cell1[1].toInt() + cell2[0].toInt() + cell2[1].toInt()) % 2 == 0) return true else return false}