package estacio.pgii.data02032020;

import java.util.Comparator;

public class InterfaceOrdena implements Comparator<Aluno> {
	public int compare(Aluno a, Aluno b) {
		return a.matricula - b.matricula;
	}

}
