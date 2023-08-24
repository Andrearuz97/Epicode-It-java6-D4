package andrearuzittu.EpicodeItjava6D4.adapter;

import java.lang.ProcessHandle.Info;
import java.util.Date;

import javax.sql.DataSource;

public class Adapter implements DataSource {
	private Info info;

	public Adapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		Date dataDiNascita = info.getDataDiNascita();
		Date today = new Date();
		long diff = today.getTime() - dataDiNascita.getTime();
		int years = (int) (diff / (1000L * 60 * 60 * 24 * 365));
		return years;
	}
}
