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
public interface IAlunoEstado {
    public void matricular(Aluno aluno);
    public void trancar(Aluno aluno);
    public void formar(Aluno aluno);
    public void desistir(Aluno aluno);
    public void jubilar(Aluno aluno);
}
