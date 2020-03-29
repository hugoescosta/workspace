package estacio.pgii.data11032020;

public class TestaPessoas {
	public static void main(String[] args) {
	    Pessoa[] pessoas = {
	      new Pessoa("Ana", 1), 
	      new Pessoa("Benedito", 2), 
	      new Pessoa("Carla", 1),
	      new Pessoa("João",3), 
	      new Pessoa("Igor", 4), 
	      new Pessoa("Maria", 5)
	    };
	    BancoPessoas banco = new BancoPessoas();
	    for(Pessoa p: pessoas)
	      try{
	          banco.adicionar(p.id, p);
	      }catch(PessoaException e){
	          System.out.println(e.getPessoa().nome+"::"+e.getMessage());
	      }

	    try{
	       pessoas[0].addDepenente(pessoas[4]);
	       pessoas[0].addDepenente(pessoas[5]);
	       pessoas[1].addDepenente(pessoas[4]);
	    }catch(PessoaException e){
	       System.out.println(e.getPessoa().nome+"::"+e.getMessage());
	    }
	        
	    try{
	       banco.remover(2);
	       banco.remover(1);
	    }catch(PessoaException e){
	       System.out.println(e.getPessoa().nome+"::"+e.getMessage());
	    }
	    banco.listar();
	  }
}
