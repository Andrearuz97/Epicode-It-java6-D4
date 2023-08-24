package andrearuzittu.EpicodeItjava6D4.adapter;

import javax.sql.DataSource;

public class UserData {
	private String nomeCompleto;
	private int eta;

	public void getData(DataSource ds) {
		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();
	}

	public void displayData() {
		System.out.println("Nome completo: " + nomeCompleto);
		System.out.println("Età: " + eta);
	}
}