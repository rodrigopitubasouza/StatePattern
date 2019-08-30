/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formacao;


/**
 *
 * @author ice
 */
public class Trancado implements IAlunoEstado {

    @Override
    public void matricular(Aluno aluno) {
        System.out.println("O aluno pode ser matriculado.");
        aluno.setEstado(new Matriculado());
    }

    @Override
    public void trancar(Aluno aluno) {
        System.out.println("O aluno já esta trancado.");
    }

    @Override
    public void formar(Aluno aluno) {
        System.out.println("O aluno não pode formar.");
    }

    @Override
    public void desistir(Aluno aluno) {
        System.out.println("O aluno não pode desistir.");    
    }

    @Override
    public void jubilar(Aluno aluno) {
        System.out.println("O aluno pode ser jubilado.");   
        aluno.setEstado(new Jubilado());
    }
    
}
