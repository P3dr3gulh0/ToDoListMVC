package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.TarefaModel;

public class TarefaController {

    ArrayList<TarefaModel> tarefas = new ArrayList<>();

    // Método Adicionar
    public void adicionar(String nome) {
        TarefaModel tarefa = new TarefaModel(nome);
        tarefas.add(tarefa);            
        
    }

    public void concluir(String nome) {
        for (TarefaModel t : tarefas) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                t.setConcluida(true);
            }
        }
    }

    public void remover(String nome) {

        int cont = 0;
        int index = -1;
        for (TarefaModel t : tarefas) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                index = cont;
            }
            cont++;
        }
        if(index != -1){
        tarefas.remove(index);    
        }
        
    }
    
    public int contar(){
        
        int cont = 0;
        
        for (int i = 0; i < tarefas.size(); i++) {
            cont = i+1;
        }
        return cont;
    }
    
    public int validacoesNome(String nome) {
        if ("".equals(nome)) {
            return 1;
        }
        
        for (TarefaModel t : tarefas) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                return 2;
            }
        }
        return 0;
    }

    public ArrayList<TarefaModel> listar() {
        return tarefas;
    }

}
