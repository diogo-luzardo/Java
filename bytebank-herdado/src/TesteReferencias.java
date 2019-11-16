
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000.0);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		ControleBonificao controle = new ControleBonificao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	}
}
