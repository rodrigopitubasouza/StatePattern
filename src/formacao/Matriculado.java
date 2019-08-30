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
public class Matriculado implements IAlunoEstado{

    @Override
    public void matricular(Aluno aluno) {
        System.out.println("O aluno já esta matriculado.");
    }

    @Override
    public void trancar(Aluno aluno) {
        System.out.println("O aluno pode trancar.");
        aluno.setEstado(new Trancado());
    }

    @Override
    public void formar(Aluno aluno) {
        System.out.println("O aluno pode formar.");
        aluno.setEstado(new Formado());
    }

    @Override
    public void desistir(Aluno aluno) {
        System.out.println("O aluno pode desistir.");    
        aluno.setEstado(new Desistente());
    }

    @Override
    public void jubilar(Aluno aluno) {
        System.out.println("O aluno pode ser jubilado.");
        aluno.setEstado(new Jubilado());
    }
    
}
