fun main() {

    val caique = Alunos("Caique","Carvalho",
    78767,50.0,2 )
    val maria = Alunos("Maria","da Silva",
        65712,69.0,3 )
    val henrique = Alunos("Henrique","Felipe",
        95436,80.0,4 )
    val rebeca = Alunos("Rebeca","da Silva",
        69812,75.0,5 )
    val cursoIngles = Cursos("Inglês", "Genivaldo",
        1)

    cursoIngles.cadastrar(caique)
    cursoIngles.cadastrar(maria)

    cursoIngles.removerAluno(rebeca)

    val alunos: Array<Alunos?> = arrayOf(henrique, rebeca)

    println(cursoIngles.listaEstudantesMatriculados.size)

    caique.nomeCompleto()
    println(caique.aprovado)
    caique.passaDeAnoSeAprovado()

    cursoIngles.cadastrar(alunos)

    cursoIngles.numAlunosCadastrados()

    cursoIngles.melhorMedia()

    cursoIngles.mostrarAlunos()


}