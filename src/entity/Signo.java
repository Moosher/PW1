package entity;

/**
 * @author fernando.felix
 *
 */
public class Signo {

	private int diaInicio;
	private int mesInicio;
	private int diaFim;
	private int mesFim;

	public Signo(int mesInicio, int diaInicio, int mesFim, int diaFim) {
		this.mesFim = mesFim;
		this.mesInicio = mesInicio;
		this.diaFim = diaFim;
		this.diaInicio = diaInicio;

	}

	public int getDiaInicio() {
		return this.diaInicio;
	}

	public void setDiaInicio(int diaInicio) {
		this.diaInicio = diaInicio;
	}

	public int getMesInicio() {
		return this.mesInicio;
	}

	public void setMesInicio(int mesInicio) {
		this.mesInicio = mesInicio;
	}

	public int getDiaFim() {
		return this.diaFim;
	}

	public void setDiaFim(int diaFim) {
		this.diaFim = diaFim;
	}

	public int getMesFim() {
		return this.mesFim;
	}

	public void setMesFim(int mesFim) {
		this.mesFim = mesFim;
	}

}
