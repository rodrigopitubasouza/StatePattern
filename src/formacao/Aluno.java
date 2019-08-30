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
public class Aluno {
    private IAlunoEstado estado;

    public Aluno() {
        this.estado = new Matriculado();
    }

    public Aluno(IAlunoEstado estado) {
        this.estado = estado;
    }

    public IAlunoEstado getEstado() {
        return estado;
    }

    public void setEstado(IAlunoEstado estado) {
        this.estado = estado;
    }
    
    public void matricular() {
        this.estado.matricular(this);
    }
    
    public void jubilar() {
        this.estado.jubilar(this);
    }
    
    public void trancar() {
        this.estado.trancar(this);
    }
    
    public void desistir() {
        this.estado.desistir(this);
    }
    
    public void formar() {
        this.estado.formar(this);
    }
   
    
}
