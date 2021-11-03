class Alunos {
    var nome: String? = null
    var sobrenome: String? = null
    var registro = 0
    var media = 0
    var ano = 0

    fun nomeCompleto(){

    println("Nome completo do aluno: $nome $sobrenome.")

    }

    val aprovado: Boolean

    get() {

        if(media >= 60) {

            return true

        } else {

            return false

        }

    }

    fun passaDeAnoSeAprovado(): Int {

        if(media >= 60){

        println("Parabéns, você passou de ano!")

        }

        return 0

    }

}

