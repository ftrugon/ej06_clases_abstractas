class Triangulo(color: String, val lado1:Double,val lado2:Double,val lado3:Double,val altura:Double,val base:Double): Figura(color) {

    override fun area(): Double {
        return base * altura
    }

    override fun perimetro(): Double {
        return lado1 + lado2 + lado3
    }
}