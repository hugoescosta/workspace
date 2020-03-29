package estacio.pgii.data11032020;

import java.util.HashMap;

public class BancoPessoas {
	private final HashMap<Integer,Pessoa> repositorio = new HashMap<>();
    
    public Pessoa adicionar(int id, Pessoa value) throws PessoaException {
        if(repositorio.get(id) != null){
          throw new PessoaException(value, "Já existe uma pessoa com este id");
        }
        return repositorio.put(id, value); 
    }
    
    public Pessoa remover(int id) throws PessoaException {
        if(repositorio.get(id).temDependentes()){
          throw new PessoaException(repositorio.get(id), "Esta pessoa tem dependentes");
        }
        return repositorio.remove(id); 
    }
    
    public void listar(){
        for(Pessoa p: repositorio.values()){
            System.out.println(p.nome);
            if(p.temDependentes()){
                System.out.println("--- Dependentes de "+p.nome+" ---");
                p.listarDependentes();
                System.out.println("==================");
            }                
        }        
    }    
}
