fun main() {
    val map = HashMap<Char, String>();
    map['a'] = "@"
    map['b'] = "8"
    map['c'] = "("
    map['d'] = "|)"
    map['e'] = "3"
    map['f'] = "#"
    map['g'] = "6"
    map['h'] = "[-]"
    map['i'] = "|"
    map['j'] = "_|"
    map['k'] = "|<"
    map['l'] = "1"
    map['m'] = "[]\\/[]"
    map['n'] = "[]\\[]"
    map['o'] = "0"
    map['p'] = "|D"
    map['q'] = "(,)"
    map['r'] = "|Z"
    map['s'] = "$"
    map['t'] = "']['"
    map['u'] = "|_|"
    map['v'] = "\\/"
    map['w'] = "\\/\\/"
    map['x'] = "}{"
    map['y'] = "`/"
    map['z'] = "2"

    val input = readLine()!!.toLowerCase().toCharArray()
    var sb = StringBuilder()
    for (c in input) {
        if (map.containsKey(c))
            sb.append(map.get(c))
        else
            sb.append(c.toString())
    }
    println(sb.toString())
}