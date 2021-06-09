package br.com.ddm.hogwartshistories

object DisciplinaService {

    fun getDisciplinas (): List<Disciplina> {

        var disciplina = mutableListOf<Disciplina>()

        for (i in 1..10) {
            val d = Disciplina()
            d.nome = "Disciplina $i"
            d.ementa = "Ementa $i"
            d.professor = "Professor $i"
            d.foto = "https://minhabiblioteca.com.br/wp-content/uploads/2014/11/Saladeaula_itapevi-1000x450.jpg"
            disciplina.add(d)
        }
        return disciplina
    }
}