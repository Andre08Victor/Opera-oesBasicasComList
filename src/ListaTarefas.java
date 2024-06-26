import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;
    //método construtor
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();//criação do ArrayList 
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao,false));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();//.size representa a quantidade de elementos dentro de uma List
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas(); //Criação do objeto
        System.out.println("O número total de elementos na lista é " + listaTarefas.obterNumeroTotalTarefas());
        
        listaTarefas.adicionarTarefa("Tarefa 1");//Adicionando uma tarefa 
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é " + listaTarefas.obterNumeroTotalTarefas());
        
        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();


        
    }
}
