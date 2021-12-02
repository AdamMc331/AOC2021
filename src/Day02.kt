fun main() {
    fun part1(input: List<String>): Int {
        val commands = input.map { it.split(" ") }

        var horizontalPosition = 0
        var verticalPosition = 0

        commands.forEach { (com, amt) ->
            when (com) {
                "forward" -> {
                    horizontalPosition += amt.toInt()
                }
                "down" -> {
                    verticalPosition += amt.toInt()
                }
                "up" -> {
                    verticalPosition -= amt.toInt()
                }
            }
        }

        return horizontalPosition * verticalPosition
    }

    fun part2(input: List<String>): Int {
        val commands = input.map { it.split(" ") }

        var horizontalPosition = 0
        var verticalPosition = 0
        var aim = 0

        commands.forEach { (com, amt) ->
            when (com) {
                "forward" -> {
                    horizontalPosition += amt.toInt()
                    verticalPosition += (aim * amt.toInt())
                }
                "down" -> {
                    aim += amt.toInt()
                }
                "up" -> {
                    aim -= amt.toInt()
                }
            }
        }

        return horizontalPosition * verticalPosition
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
