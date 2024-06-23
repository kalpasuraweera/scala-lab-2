@main def main(): Unit = {
    var (a, b, c, d) = (2, 3, 4, 5)
    var k = 4.3f
    var g = 4.0f // g is not given so i took the q1 g value as g

    // Assume d-- returns d and then decrements d
    b -= 1
    println(b*a+c*d)
    d -= 1

    println(a) // As a++ returns a and increments a
    a+=1

    println(-2*(g-k)+c)

    println(c) // As c++  returns c and then c = c++ will be c = c

    c = (c+1)*a
    a += 1
    println(c)

}

