package estacio.pgii.data11032020;

import java.util.ArrayList;

public class Pessoa {
	private final ArrayList<Pessoa> dependentes = new ArrayList<>();
	    
    public String nome;
    public int id;
    public Pessoa responsavel = null;

    public Pessoa(String nome, int id) {
	     this.nome = nome;
	     this.id = id;
	}
	    
	public void addDepenente(Pessoa p) throws PessoaException{
		if(p.responsavel != null){
	       throw new PessoaException(p,"Esta pessoa já tem um responsável");
	    }
		dependentes.add(p);
		p.responsavel = this;
	}
	// somente retorna se o arraylist não estiver vazio    
	public boolean temDependentes(){
	     return dependentes.size() > 0;
	}
    
	public void removeDependente(Pessoa p){
	    dependentes.remove(p);
	    p.responsavel = null;
	}
	    
	public void listarDependentes(){
	    dependentes.forEach((p) -> { System.out.println(p.nome); });
	}
}
