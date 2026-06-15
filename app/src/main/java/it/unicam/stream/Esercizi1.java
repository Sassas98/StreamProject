package it.unicam.stream;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Esercizi1 {

    private List<Studente> studenti() {
        return List.of(
            new Studente(1, "Anna", "Computer Science", 2022, true),
            new Studente(2, "Luca", "Computer Science", 2021, true),
            new Studente(3, "Marco", "Mathematics", 2022, true),
            new Studente(4, "Giulia", "Physics", 2020, false),
            new Studente(5, "Sara", "Mathematics", 2021, true),
            new Studente(6, "Davide", "Computer Science", 2023, true)
        );
    }

    private List<Esame> esami() {
        return List.of(
            new Esame(1, "Programming", 12, 30, true, LocalDate.of(2023, 6, 20)),
            new Esame(1, "Algorithms", 9, 28, false, LocalDate.of(2024, 2, 10)),
            new Esame(1, "Databases", 6, 27, false, LocalDate.of(2024, 6, 5)),
            new Esame(1, "Operating Systems", 9, 29, false, LocalDate.of(2024, 7, 10)),
            new Esame(1, "Software Engineering", 6, 30, true, LocalDate.of(2025, 1, 15)),

            new Esame(2, "Programming", 12, 24, false, LocalDate.of(2022, 7, 15)),
            new Esame(2, "Algorithms", 9, 21, false, LocalDate.of(2023, 1, 18)),
            new Esame(2, "Databases", 6, 18, false, LocalDate.of(2023, 9, 12)),
            new Esame(2, "Networks", 9, 23, false, LocalDate.of(2024, 2, 20)),
            new Esame(2, "Operating Systems", 9, 20, false, LocalDate.of(2024, 6, 25)),

            new Esame(3, "Analysis", 12, 30, false, LocalDate.of(2023, 3, 1)),
            new Esame(3, "Geometry", 9, 29, true, LocalDate.of(2023, 7, 8)),
            new Esame(3, "Programming", 6, 26, false, LocalDate.of(2024, 1, 22)),
            new Esame(3, "Algebra", 6, 28, false, LocalDate.of(2024, 5, 3)),
            new Esame(3, "Probability", 9, 30, true, LocalDate.of(2024, 9, 17)),

            new Esame(4, "Physics I", 12, 25, false, LocalDate.of(2021, 6, 30)),
            new Esame(4, "Analysis", 12, 18, false, LocalDate.of(2021, 9, 15)),
            new Esame(4, "Laboratory", 6, 22, false, LocalDate.of(2022, 1, 10)),
            new Esame(4, "Optics", 9, 24, false, LocalDate.of(2022, 7, 22)),

            new Esame(5, "Analysis", 12, 27, false, LocalDate.of(2022, 12, 12)),
            new Esame(5, "Geometry", 9, 30, true, LocalDate.of(2023, 5, 20)),
            new Esame(5, "Statistics", 6, 24, false, LocalDate.of(2024, 3, 10)),
            new Esame(5, "Algebra", 6, 26, false, LocalDate.of(2024, 5, 18)),
            new Esame(5, "Probability", 9, 28, false, LocalDate.of(2024, 10, 4)),
            new Esame(5, "Databases", 6, 25, false, LocalDate.of(2025, 2, 11)),

            new Esame(6, "Programming", 12, 19, false, LocalDate.of(2024, 7, 1)),
            new Esame(6, "Algorithms", 9, 22, false, LocalDate.of(2025, 1, 30)),
            new Esame(6, "Databases", 6, 20, false, LocalDate.of(2025, 6, 9)),
            new Esame(6, "Networks", 9, 21, false, LocalDate.of(2025, 9, 15)),
            new Esame(6, "Web Development", 6, 27, false, LocalDate.of(2026, 2, 21))
        );
    }

    /**
     * Restituisce la classifica degli studenti attivi ordinata per media pesata decrescente.
     *
     * Ogni elemento della lista deve contenere il nome dello studente, il corso di laurea,
     * il numero totale di CFU ottenuti e la media pesata calcolata sugli esami sostenuti.
     *
     * @return una lista di libretti studente ordinata per media pesata decrescente
     */
    public List<LibrettoStudente> classificaStudentiAttiviPerMediaPesata() {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce una mappa che associa ogni studente attivo alla lista dei suoi esami.
     *
     * La lista degli esami di ogni studente deve essere ordinata dal più recente al meno recente.
     *
     * @return una mappa studente attivo -> lista dei suoi esami ordinati per data decrescente
     */
    public Map<Studente, List<Esame>> esamiOrdinatiPerStudenteAttivo() {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce le statistiche dei corsi di laurea considerando solo gli studenti attivi.
     *
     * Per ogni corso di laurea devono essere indicati il numero di studenti attivi,
     * i CFU totali ottenuti dagli studenti del corso, la media pesata complessiva
     * e il numero totale di lodi ottenute.
     *
     * @return una lista di statistiche, una per ogni corso di laurea
     */
    public List<StatisticheCorso> statistichePerCorsoDiLaurea() {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce un report sugli esami più facili e più difficili.
     *
     * Il report deve contenere i tre esami con media voto più alta e i tre esami
     * con media voto più bassa. Per ogni esame devono essere indicati il numero
     * di volte in cui è stato sostenuto, il voto medio, il voto massimo, il voto minimo
     * e il numero di lodi.
     *
     * @return un report contenente la top 3 degli esami con media più alta e la top 3 degli esami con media più bassa
     */
    public ReportDifficoltaEsami esamiPiuFaciliEPiuDifficili() {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce il report finale degli studenti attivi.
     *
     * Per ogni studente attivo devono essere indicati nome, corso di laurea,
     * CFU totali, media pesata e stato dello studente.
     *
     * Lo stato deve essere:
     * EXCELLENT se la media è almeno 28 e i CFU sono almeno 24;
     * GOOD se la media è almeno 25 e i CFU sono almeno 18;
     * REGULAR se la media è almeno 18 e i CFU sono almeno 18;
     * BEHIND se i CFU sono meno di 18.
     *
     * @return una lista di report studente
     */
    public List<ReportStudente> reportSegreteriaStudentiAttivi() {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce gli studenti attivi a cui manca almeno un esame obbligatorio.
     *
     * Gli esami obbligatori sono Programming, Algorithms e Databases.
     * Per ogni studente restituito devono essere indicati nome, corso di laurea
     * ed esami obbligatori mancanti.
     *
     * @return una lista di studenti con i rispettivi esami obbligatori mancanti
     */
    public List<EsamiMancanti> esamiObbligatoriMancantiStudentiAttivi() {
        throw new UnsupportedOperationException();
    }

    public record Studente(int id,
        String nome,
        String corso,
        int annoIscrizione,
        boolean attivo
    ) {}

    public record Esame( int idStudente,
        String nome,
        int crediti,
        int voto,
        boolean lode,
        LocalDate data
    ) {}

    public record LibrettoStudente(
        String nome,
        String corsoDiLaurea,
        int cfuTotali,
        double mediaPesata
    ) {}

    public record StatisticheCorso(
        String corsoDiLaurea,
        long studentiAttivi,
        int cfuTotali,
        double mediaPesataComplessiva,
        long numeroLodi
    ) {}

    public record StatisticheEsame(
        String nomeEsame,
        long numeroSostenimenti,
        double votoMedio,
        int votoMassimo,
        int votoMinimo,
        long numeroLodi
    ) {}

    public record ReportDifficoltaEsami(
        List<StatisticheEsame> treEsamiConMediaPiuAlta,
        List<StatisticheEsame> treEsamiConMediaPiuBassa
    ) {}

    public record ReportStudente(
        String nome,
        String corsoDiLaurea,
        int cfuTotali,
        double mediaPesata,
        String stato
    ) {}

    public record EsamiMancanti(
        String nomeStudente,
        String corsoDiLaurea,
        Set<String> esamiMancanti
    ) {}
}