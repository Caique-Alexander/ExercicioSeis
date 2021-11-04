package Cursos

import Alunos.Alunos

class Cursos (private val nomeDoCurso: String?,
              private var nomeDoProfessor: String?,
              private var serie: Int){

    val listaEstudantesMatriculados = mutableListOf<Alunos?>()

    fun mostrarAlunos(){
        for(i in listaEstudantesMatriculados){
            println(i?.nome)
        }
    }

    fun cadastrar(alunos: Alunos?){
        listaEstudantesMatriculados.add(alunos)
        println("Aluno cadastrado com sucesso!")
    }

    fun cadastrar(alunos: Array<Alunos?>?){
        if (alunos != null){
            for(i in alunos){
                listaEstudantesMatriculados.add(i)
            }
        }
        println("Alunos cadastrados com sucesso!")
    }

    fun removerAluno(alunos: Alunos){
        if(listaEstudantesMatriculados.contains(alunos)){
            listaEstudantesMatriculados.remove(alunos)
            println("Aluno removido com sucesso!")
        }else{
            println("Esse aluno não existe na lista")
        }
    }

    fun numAlunosCadastrados(){
        println("O número de alunos cadastrados no curso é" +
                "${listaEstudantesMatriculados.size}")
    }

    fun melhorMedia(){
        var melhorMedia = listaEstudantesMatriculados[0]?.media
        for(i in listaEstudantesMatriculados){
            if(i?.media!!>melhorMedia!!){
                melhorMedia=i.media
            }
        }
        println("A maior média desse curso é $melhorMedia")
    }

    fun verificarAluno(alunos: Alunos){
        if(listaEstudantesMatriculados.contains(alunos)){
            println("Aluno existe na lista")
        }else{
            throw Exception("O aluno não existe")
        }
    }



}