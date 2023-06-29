
public class Dipendente {

	// Proprietà
	public static double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario = 30;
	private LivelloType livello;
	private DipartimentoType dipartimento;

	// Costruttori
	public Dipendente(String matricola, DipartimentoType dipartimento) {
		this.matricola = matricola;
		this.stipendio = stipendioBase;
		this.dipartimento = dipartimento;
		this.livello = LivelloType.OPERAIO;
	}

	public Dipendente(String matricola, LivelloType livello, DipartimentoType dipartimento) {
		this.matricola = matricola;
		this.livello = livello;
		this.dipartimento = dipartimento;

		switch (livello) {
		case OPERAIO:
			this.stipendio = stipendioBase;
			this.importoOrarioStraordinario = 30;
			break;
		case IMPIEGATO:
			this.stipendio = stipendioBase * 1.2;
			this.importoOrarioStraordinario = 30 * 1.2;
			break;
		case QUADRO:
			this.stipendio = stipendioBase * 1.5;
			this.importoOrarioStraordinario = 30 * 1.5;
			break;
		case DIRIGENTE:
			this.stipendio = stipendioBase * 2;
			this.importoOrarioStraordinario = 30 * 2;
			break;
		}

	}

	// Getter and Setter
	public String getMatricola() {
		return matricola;
	}

	public LivelloType getLivello() {
		return livello;
	}

	public DipartimentoType getDipartimento() {
		return dipartimento;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setDipartimento(DipartimentoType dipartimento) {
		this.dipartimento = dipartimento;
	}

	public void setInmportoStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	// Metodi

	public String stampaDatiDipendente() {
		return "Dati Dipendente: [Matricola: " + matricola + ", Stipendio: " + stipendio
				+ ", Importo orario Straordinario: " + importoOrarioStraordinario + ", Livello: " + livello
				+ ", Dipartimento: " + dipartimento + "]";
	}

	public LivelloType promuovi() {
		switch (livello) {
		case OPERAIO:
			livello = LivelloType.IMPIEGATO;
			stipendio = stipendioBase * 1.2;
			this.importoOrarioStraordinario = 30 * 1.2;
			break;
		case IMPIEGATO:
			livello = LivelloType.QUADRO;
			stipendio = stipendioBase * 1.5;
			this.importoOrarioStraordinario = 30 * 1.5;
			break;
		case QUADRO:
			livello = LivelloType.DIRIGENTE;
			stipendio = stipendioBase * 2;
			this.importoOrarioStraordinario = 30 * 2;
		case DIRIGENTE:
			System.err.println(
					"Non è possibile essere promossi oltre la Dirigenza. Per miracoli contattare enti religiosi.");
			break;
		}
		return livello;
	}

	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.stipendio;
	}

	public static double calcolaPaga(Dipendente dipendente, int orarioStraordinario) {
		return (dipendente.getImportoStraordinario() * orarioStraordinario) + dipendente.stipendio;
	}

}
