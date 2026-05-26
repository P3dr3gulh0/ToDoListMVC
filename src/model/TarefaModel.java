package model;


public class TarefaModel {
    
    // Atributos
    
    private String nome;
    private boolean concluida;
    
    // Contrutor 

    public TarefaModel(String nome) {
        this.nome = nome;
        this.concluida = concluida = false;
    }    
    
    // Getters and Setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        
        String status = "";
        
        if(concluida == false){
            status = "Pendente";
        }else{
            status = "Concluída";
        }
        
        return "[nome:" + nome + "] [Status: " + status + "]}";
    }
}
