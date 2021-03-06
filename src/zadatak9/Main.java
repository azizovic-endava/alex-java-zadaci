
package zadatak9;

/**
 * Kreirati projekat Nekretnina na sledeci nacin: Apstraktna klasa Nekretnina
 * koja od atributa ima: - adresu, zonu, kvadraturu i podatke o
 * vlasniku/instancu klase Vlasnik. Vlasnik ima puno ime i prezime, JMBG i broj
 * licne karte. Izvedene klase, Stan i Kuca imaju to String() metod gde se
 * ispisuju sve informacije o nekretnini ukljucujuci Vlasnika i cenu. Cena se
 * racuna po principu kvadratura X zona (I zona 3000, II zona 2000, III zona
 * 1000, IV zona 500e). Kuca ima dodatno polje povrsinaOkucnice. U cenu kuce
 * ulazi i cena okucnice koja se racuna po principu (povrsinaOkucnice X Zona X
 * 15%). Stan ima dva dodatna polja, povrsinaPodruma i povrsinaTerase. U cenu
 * Stana ulazi i cena podruma i terase ((povrsinaPodruma + povrsinaTerase) X
 * Zona X 33%). Napraviti Main klasu i u njoj kreirati instance klase Nekretnina
 * i napraviti objekte izvedenih klasa sa proizvoljnim argumentima. Ispisati
 * String reprezentaciju objekata - toString().
 * 
 * @author Aleksandar.Zizovic
 */

public class Main {

	public static void main(String[] args) {

		try {
			Vlasnik vlasnik1 = new Vlasnik("Petar Petrovic", "2110991783444", "006677676");
			Vlasnik vlasnik2 = new Vlasnik("Ivan Ivanovic", "2110991783555", "006677434");

			Nekretnina kuca = new Kuca("Svetog Nikole 10", 2, 76.0, vlasnik1, 100.0);
			Nekretnina stan = new Stan("Cirila i Metodija 33", 3, 44.0, vlasnik2, 10.0, 7.0);

			System.out.println(kuca.toString());
			System.out.println(stan.toString());
		} catch (IllegalArgumentException exception) {
			exception.printStackTrace();
		}

	}
}
