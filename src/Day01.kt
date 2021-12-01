fun main() {
    /**
     * Given an [input] that is a list of ints, window them so that we have pairs of two and count
     * the number of times there was an increase.
     */
    fun countIncreases(input: List<Int>): Int {
        val steps = input.windowed(size = 2)

        return steps.count { (first, second) ->
            second > first
        }
    }

    fun part1(input: List<String>): Int {
        // Convert to numbers
        val inputNums = input.map { it.toInt() }

        // If the second number is bigger than the first, we have an increase.
        return countIncreases(inputNums)
    }

    fun part2(input: List<String>): Int {
        // Convert to numbers
        val inputNums = input.map { it.toInt() }

        // Split into groups of three, and get sums.
        val sums = inputNums.windowed(size = 3).map { it.sum() }

        // If the second number is bigger than the first, we have an increase.
        return countIncreases(sums)
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
