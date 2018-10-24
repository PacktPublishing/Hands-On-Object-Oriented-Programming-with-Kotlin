package chapter10

fun main(args: Array<String>) {
    "${args.firstOrNull()} ${args.getOrNull(0)}"
}