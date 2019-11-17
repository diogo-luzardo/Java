
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000.0);
		
			
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer designer = new Designer();
		designer.setNome("Diogo");
		designer.setSalario(2800.0);
		
		ControleBonificao controle = new ControleBonificao();
		controle.registra(gerente);
		controle.registra(ev);
		controle.registra(designer);
		
		
		System.out.println(controle.getSoma());
	}
}
