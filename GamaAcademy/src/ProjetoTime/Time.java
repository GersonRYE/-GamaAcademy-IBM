package ProjetoTime;

public class Time {
	private int hora;
	private int min;
	private int seg;

	public Time(int hora, int min, int seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	public Time(int hora, int min) {
		this.hora = hora;
		this.min = min;
		this.seg = 0;
	}

	public Time(int hora) {
		this.hora = hora;
		this.min = 0;
		this.seg = 0;
	}

	public void setTime(int hora, int min, int seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	public void setTime(int hora, int min) {
		this.hora = hora;
		this.min = min;
		this.seg = 0;
	}

	public void setTime(int hora) {
		this.hora = hora;
		this.min = 0;
		this.seg = 0;
	}

	public String exibirHorarioUniversal() {
		return formatarNumero(this.hora) + ":" + formatarNumero(this.min) + ":" + formatarNumero(this.seg);
	}

	public String exibirHorarioPadrao() {
		/*
		 * 4 casos 0h - 12AM 12h - 12PM 01-11 horaAM 13-23 (hora-12)PM
		 */

		String sufixo;
		String horaPadrao;
		if (hora == 0) {
			horaPadrao = "12";
			sufixo = "AM";
		} else if (hora == 12) {
			horaPadrao = "12";
			sufixo = "PM";
		} else if (hora > 0 && hora < 12) {
			horaPadrao = String.valueOf(formatarNumero(hora));
			sufixo = "AM";
		} else {
			horaPadrao = String.valueOf(formatarNumero(hora - 12));
			sufixo = "PM";
		}

		return horaPadrao + ":" + formatarNumero(this.min) + ":" + formatarNumero(this.seg) + sufixo;
	}

	private String formatarNumero(int num) {
		if (num < 10) {
			return "0" + num;
		}
		return String.valueOf(num);
	}

}
