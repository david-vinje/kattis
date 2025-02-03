fun main() {
  val n = Integer.parseInt(readLine())
  var count = 0
  for (i in 1..n) {
    val line = readLine()!!.toLowerCase()
    if (line.contains("rose") || line.contains("pink"))
      count++
  }
  if (count > 0)
    println(count)
  else
    println("I must watch Star Wars with my daughter")
}