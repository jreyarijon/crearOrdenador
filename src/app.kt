fun main(){
        var miComputadora = Ordenador(Cpu(2,5),Raton(), Screen("Samsung", 15))
    println(miComputadora.cpu)
    println("${miComputadora.cpu} tiene un ratón ${miComputadora.raton}")
    println(miComputadora.toString())

    var ratonSorpresa = Raton("Ay")
    println(ratonSorpresa.tipo)

    var miComp = Ordenador(Cpu(2,5), Raton("blue"), Screen("Samsung",15))
    miComp.memoria = 4000
}