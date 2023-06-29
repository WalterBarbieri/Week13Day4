
public class GestioneDipendenti {

	public static void main(String[] args) {
		Dipendente dipendente1 = new Dipendente("A001", LivelloType.DIRIGENTE, DipartimentoType.VENDITE);
		Dipendente dipendente2 = new Dipendente("Q002", LivelloType.IMPIEGATO, DipartimentoType.AMMINISTRAZIONE);
		Dipendente dipendente3 = new Dipendente("D010", DipartimentoType.PRODUZIONE);
		Dipendente dipendente4 = new Dipendente("D011", DipartimentoType.PRODUZIONE);

		dipendente3.promuovi();
		dipendente2.promuovi();

		Dipendente[] dipendenti = { dipendente1, dipendente2, dipendente3, dipendente4 };
		double totaleStipendi = 0;
		for (Dipendente dipendente : dipendenti) {
			System.out.println(dipendente.stampaDatiDipendente());
			double stipendio = Dipendente.calcolaPaga(dipendente, 5);
			System.out.println(stipendio);
			totaleStipendi += stipendio;
		}
		System.out.println("Totale costo stipendi maggiorati: " + totaleStipendi);
	}
}
