fun main() {
    fun part1(input: List<String>): Int {
        // Convert to numbers
        val inputNums = input.map { it.toInt() }

        // Split into groups of two
        val steps = inputNums.windowed(size = 2)

        // If the second number is bigger than the first, we have an increase.
        return steps.count { (first, second) ->
            second > first
        }
    }

    fun part2(input: List<String>): Int {
        // Convert to numbers
        val inputNums = input.map { it.toInt() }

        // Split into groups of three, and get sums.
        val sums = inputNums.windowed(size = 3).map { it.sum() }

        // Window sums
        val steps = sums.windowed(size = 2)

        // If the second number is bigger than the first, we have an increase.
        return steps.count { (first, second) ->
            second > first
        }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
