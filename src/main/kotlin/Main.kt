fun main(args: Array<String>) {

val caique = Alunos()

    caique.nome = "Caique"
    caique.sobrenome = "Carvalho"
    caique.registro = 123456
    caique.media = 60
    caique.ano = 2021

    println(caique.nomeCompleto())

    println(caique.passaDeAnoSeAprovado())

}