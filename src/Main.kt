fun main() {
    val circulo = Circulo("Rojo", 5.0)
    val rectangulo = Rectangulo("Azul", 4.0, 6.0)
    val triangulo = Triangulo("Verde", 3.0, 4.0, 5.0,3.0,3.0)

    println("Círculo - Área: ${circulo.area()}, Perímetro: ${circulo.perimetro()}, Color: ${circulo.color}")
    println("Rectángulo - Área: ${rectangulo.area()}, Perímetro: ${rectangulo.perimetro()}, Color: ${rectangulo.color}")
    println("Triángulo - Área: ${triangulo.area()}, Perímetro: ${triangulo.perimetro()}, Color: ${triangulo.color}")
}