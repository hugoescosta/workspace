package estacio.pgii.data11032020;

public class PessoaException extends Exception{
    private final Pessoa pessoa;
	    
    public Pessoa getPessoa(){
        return pessoa;
    }
    public PessoaException(Pessoa pessoa, String mensagem){
        super(mensagem);
        this.pessoa = pessoa;
    }
}