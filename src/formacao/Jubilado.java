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
public class Jubilado implements IAlunoEstado {

    @Override
    public void matricular(Aluno aluno) {
        System.out.println("O aluno não pode ser matriculado.");
    }

    @Override
    public void trancar(Aluno aluno) {
        System.out.println("O aluno não pode trancar.");
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
        System.out.println("O aluno já está jubilado.");    
    }
    
}
