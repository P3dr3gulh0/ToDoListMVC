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
                JOptionPane.showMessageDialog(null, "Tarefa concluída, ","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public ArrayList<TarefaModel> listar() {
        return tarefas;
    }

}
