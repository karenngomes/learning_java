class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();

	void pintaCasa(String s) {
		System.out.println("A casa era " + this.cor);
		this.cor = s;
		System.out.printf("Agora está %s!\n", this.cor);
	}

	int quantasPortasEstaoAbertas() {
		int quantidade = 0;
		if (this.porta1.estaAberta())
			quantidade++;
		if (this.porta2.estaAberta())
			quantidade++;
		if (this.porta3.estaAberta())
			quantidade++;
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

		Casa casa1 = new Casa();
		
		casa1.porta1.abre();
		//casa1.porta2.abre();
		casa1.porta3.abre();

		System.out.printf("Há %d portas abertas na casa!\n", casa1.quantasPortasEstaoAbertas());

	}
}