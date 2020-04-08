import javax.swing.JOptionPane;
public class TesteAtribuicao{
   public static void main(String [] args){
      String nome;
      String boleana;
      int idade;
      boolean pratica;
      
      
      nome = JOptionPane.showInputDialog("digite o nome do professor");
      idade = Integer.parseInt(JOptionPane.showInputDialog("digite a idade do professor"));
      Professor professor = new Professor(nome, idade);
      
      
      nome = JOptionPane.showInputDialog("digite o nome da disciplina");
      boleana = JOptionPane.showInputDialog("digite sim caso a disciplina seja pratica");
      pratica = boleana.equals("sim");
      Disciplina disciplina = new Disciplina(nome, pratica);
         
      Atribuicao atribuicao = new Atribuicao(professor, disciplina);
      
      JOptionPane.showMessageDialog(null, atribuicao.getDados());   
   }
}
