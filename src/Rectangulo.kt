class Rectangulo(color: String, val base:Double, val altura:Double):Figura(color) {

    override fun area(): Double {
        return base * altura
    }

    override fun perimetro(): Double {
        return (base * 2) + (altura * 2)
    }
}