package br.com.exer14.principioDIP;

public class Armazenamento {
	MecanismoArmazenamento disk;
	
	public Armazenamento(MecanismoArmazenamento disk) {
		this.disk = disk;
	}
	
	public String getDados() {
		return disk.getDados();
	}

}
