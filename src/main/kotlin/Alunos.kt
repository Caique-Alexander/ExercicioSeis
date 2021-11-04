class Alunos (var nome: String?,
              var sobrenome: String?,
              var registro: Int) {


    var media = 0.0
    var ano = 0

    constructor(nome: String?, sobrenome: String?,
                registro: Int, media: Double) : this(nome, sobrenome, registro){
                this.media = media
            }
    constructor(nome: String?, sobrenome: String?,
                registro: Int, media: Double, ano: Int) : this(nome, sobrenome, registro, media){
                this.ano = ano
            }

    fun nomeCompleto(){

    println("Nome completo do aluno: $nome $sobrenome.")

    }

    val aprovado: Boolean
        get() {

            return media >= 60

        }

    fun passaDeAnoSeAprovado(){
        if (aprovado) {
            ano += 1
            println("Parabéns, você passou de ano!")
        }else
            println("Reprovado.")

    }

}

