class Casa {
	String cor;
	Porta[] portas;
	int totalDePortas;

	void pintaCasa(String s) {
		System.out.println("A casa era " + this.cor);
		this.cor = s;
		System.out.printf("Agora está %s!\n", this.cor);
	}

	void adicionaPorta(Porta p) {
		this.portas[totalDePortas] = p;
		this.totalDePortas = this.totalDePortas + 1;
	}

	int getTotalDePortas() {
		return this.totalDePortas;
	}	

	int quantasPortasEstaoAbertas() {
		int quantidade = 0;
		for (int i = 0; i < this.totalDePortas; i++) {	
			if (this.portas[i].estaAberta())
				quantidade++;
		}
		return quantidade;
	}
}

class Porta {
	
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;

	void abre(){
		this.aberta = true;
		//System.out.println("A porta foi aberta!");
	}

	void fecha(){
		this.aberta = false;
		//System.out.println("A porta foi fechada!");
	}

	void pintaPorta(String s){
		System.out.println("A porta era " + this.cor);
		this.cor = s;
		System.out.printf("Agora está %s!\n", this.cor);

	}
	
	boolean estaAberta() {
		if(this.aberta)
			return true;
		return false;
	}
}

class ProgramaPorta {
	public static void main(String[] args) {

		Casa casa = new Casa();
		casa.portas = new Porta[4];

		Porta porta1 = new Porta();
		
		porta1.cor = "Azul";
		porta1.pintaPorta("Verde");

		if(porta1.estaAberta())
			porta1.fecha();
		else
			porta1.abre();

		if(porta1.estaAberta())
			System.out.println("A porta está aberta!");
		else
			System.out.println("A porta não está aberta!");
		
		Porta porta2 = new Porta();
		Porta porta3 = new Porta();
		Porta porta4 = new Porta();
		
		porta2.cor = "Vermelha";
		porta2.pintaPorta("Amarela");
		
		porta3.cor = "Azul";
		
		porta4.cor = "Preta";
		casa.adicionaPorta(porta1);
		casa.adicionaPorta(porta2);
		casa.adicionaPorta(porta3);
		casa.adicionaPorta(porta4);

		System.out.printf("Há %d portas abertas na casa!\n", casa.quantasPortasEstaoAbertas());
		System.out.printf("Há %d portas nesta casa!\n", casa.getTotalDePortas());

	}
}