package it.unicam.stream;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import it.unicam.stream.Esercizi2.Cliente;

public class Esercizi2 {

    private List<Cliente> clienti() {
        return List.of(
            new Cliente(1, "Anna", "Ancona", 2020, true),
            new Cliente(2, "Luca", "Macerata", 2021, false),
            new Cliente(3, "Marco", "Camerino", 2019, true),
            new Cliente(4, "Giulia", "Fermo", 2022, false),
            new Cliente(5, "Sara", "Ancona", 2023, true),
            new Cliente(6, "Davide", "Macerata", 2020, false),
            new Cliente(7, "Elena", "Ascoli Piceno", 2021, true),
            new Cliente(8, "Francesco", "Civitanova Marche", 2024, false)
        );
    }

    private List<Ordine> ordini() {
        return List.of(
            new Ordine(1, "ORD-001", "Books", 45.90, true, LocalDate.of(2023, 3, 12)),
            new Ordine(1, "ORD-002", "Tech", 899.99, true, LocalDate.of(2023, 7, 20)),
            new Ordine(1, "ORD-003", "Games", 69.99, false, LocalDate.of(2024, 1, 15)),
            new Ordine(1, "ORD-004", "Home", 120.00, true, LocalDate.of(2024, 5, 10)),

            new Ordine(2, "ORD-005", "Books", 32.50, true, LocalDate.of(2022, 11, 5)),
            new Ordine(2, "ORD-006", "Games", 59.99, true, LocalDate.of(2023, 2, 18)),
            new Ordine(2, "ORD-007", "Tech", 249.90, false, LocalDate.of(2024, 8, 2)),

            new Ordine(3, "ORD-008", "Tech", 1299.00, true, LocalDate.of(2021, 6, 30)),
            new Ordine(3, "ORD-009", "Tech", 699.00, true, LocalDate.of(2022, 9, 14)),
            new Ordine(3, "ORD-010", "Books", 85.00, true, LocalDate.of(2023, 12, 1)),
            new Ordine(3, "ORD-011", "Home", 210.00, true, LocalDate.of(2024, 4, 9)),

            new Ordine(4, "ORD-012", "Home", 75.00, false, LocalDate.of(2023, 1, 22)),
            new Ordine(4, "ORD-013", "Books", 18.90, true, LocalDate.of(2023, 10, 7)),
            new Ordine(4, "ORD-014", "Games", 39.99, true, LocalDate.of(2024, 3, 3)),

            new Ordine(5, "ORD-015", "Tech", 499.99, true, LocalDate.of(2024, 2, 14)),
            new Ordine(5, "ORD-016", "Books", 64.90, true, LocalDate.of(2024, 6, 1)),
            new Ordine(5, "ORD-017", "Home", 149.99, false, LocalDate.of(2024, 9, 19)),
            new Ordine(5, "ORD-018", "Games", 89.99, true, LocalDate.of(2025, 1, 11)),

            new Ordine(6, "ORD-019", "Books", 22.00, true, LocalDate.of(2021, 4, 4)),
            new Ordine(6, "ORD-020", "Home", 340.00, true, LocalDate.of(2022, 8, 28)),
            new Ordine(6, "ORD-021", "Tech", 159.90, true, LocalDate.of(2023, 5, 16)),

            new Ordine(7, "ORD-022", "Games", 129.99, true, LocalDate.of(2023, 7, 7)),
            new Ordine(7, "ORD-023", "Tech", 999.99, true, LocalDate.of(2024, 2, 25)),
            new Ordine(7, "ORD-024", "Books", 44.90, false, LocalDate.of(2024, 7, 13)),
            new Ordine(7, "ORD-025", "Home", 260.00, true, LocalDate.of(2025, 3, 5)),

            new Ordine(8, "ORD-026", "Books", 15.90, true, LocalDate.of(2024, 10, 10)),
            new Ordine(8, "ORD-027", "Games", 79.99, false, LocalDate.of(2025, 1, 30)),
            new Ordine(8, "ORD-028", "Tech", 349.99, true, LocalDate.of(2025, 4, 21))
        );
    }

    /**
     * Restituisce tutti i clienti che rispettano il criterio ricevuto come parametro.
     *
     * @param criterio condizione da applicare a ogni cliente
     * @return la lista dei clienti per cui il criterio restituisce true
     */
    public List<Cliente> filtraClienti(Predicate<Cliente> criterio) {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce tutti gli ordini che rispettano il criterio ricevuto come parametro.
     *
     * @param criterio condizione da applicare a ogni ordine
     * @return la lista degli ordini per cui il criterio restituisce true
     */
    public List<Ordine> filtraOrdini(Predicate<Ordine> criterio) {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce una lista ottenuta trasformando ogni cliente tramite la funzione ricevuta.
     *
     * @param trasformazione funzione da applicare a ogni cliente
     * @return la lista dei risultati prodotti dalla trasformazione
     * @param <R> tipo del risultato prodotto dalla trasformazione
     */
    public <R> List<R> trasformaClienti(Function<Cliente, R> trasformazione) {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce una lista ottenuta trasformando ogni ordine tramite la funzione ricevuta.
     *
     * @param trasformazione funzione da applicare a ogni ordine
     * @return la lista dei risultati prodotti dalla trasformazione
     * @param <R> tipo del risultato prodotto dalla trasformazione
     */
    public <R> List<R> trasformaOrdini(Function<Ordine, R> trasformazione) {
        throw new UnsupportedOperationException();
    }

    /**
     * Esegue l'azione ricevuta su tutti i clienti che rispettano il criterio indicato.
     *
     * @param criterio condizione da applicare a ogni cliente
     * @param azione azione da eseguire sui clienti selezionati
     */
    public void eseguiAzioneSuClienti(Predicate<Cliente> criterio, Consumer<Cliente> azione) {
        throw new UnsupportedOperationException();
    }

    /**
     * Esegue l'azione ricevuta su tutti gli ordini che rispettano il criterio indicato.
     *
     * @param criterio condizione da applicare a ogni ordine
     * @param azione azione da eseguire sugli ordini selezionati
     */
    public void eseguiAzioneSuOrdini(Predicate<Ordine> criterio, Consumer<Ordine> azione) {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce una lista di ordini generati usando il generatore ricevuto.
     *
     * @param quantita numero di ordini da generare
     * @param generatore generatore degli ordini
     * @return la lista degli ordini generati
     */
    public List<Ordine> generaOrdini(int quantita, Supplier<Ordine> generatore) {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce una lista di clienti generati usando il generatore ricevuto.
     *
     * @param quantita numero di clienti da generare
     * @param generatore generatore dei clienti
     * @return la lista dei clienti generati
     */
    public List<Cliente> generaClienti(int quantita, Supplier<Cliente> generatore) {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce una mappa ottenuta raggruppando gli ordini tramite la funzione ricevuta.
     *
     * @param classificatore funzione che calcola la chiave di raggruppamento di ogni ordine
     * @return una mappa chiave -> lista degli ordini associati alla chiave
     * @param <K> tipo della chiave di raggruppamento
     */
    public <K> Map<K, List<Ordine>> raggruppaOrdini(
            Function<Ordine, K> classificatore
    ) {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce una mappa ottenuta raggruppando i clienti tramite la funzione ricevuta.
     *
     * @param classificatore funzione che calcola la chiave di raggruppamento di ogni cliente
     * @return una mappa chiave -> lista dei clienti associati alla chiave
     * @param <K> tipo della chiave di raggruppamento
     */
    public <K> Map<K, List<Cliente>> raggruppaClienti(
            Function<Cliente, K> classificatore
    ) {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce una valutazione per ogni cliente.
     *
     * Il punteggio di ogni cliente deve essere calcolato tramite il calcolatore ricevuto.
     * L'etichetta della valutazione deve essere calcolata tramite il classificatore ricevuto.
     *
     * @param calcolatorePunteggio funzione che calcola il punteggio di un cliente
     * @param classificatore funzione che trasforma il punteggio in un'etichetta
     * @return la lista delle valutazioni dei clienti
     */
    public List<ValutazioneCliente> valutaClienti(
            CalcolatorePunteggioCliente calcolatorePunteggio,
            ClassificatorePunteggio classificatore
    ) {
        throw new UnsupportedOperationException();
    }

    /**
     * Restituisce una lista di riepiloghi cliente.
     *
     * Per ogni cliente deve essere calcolato il numero di ordini, il totale speso
     * e una descrizione prodotta dalla funzione ricevuta.
     *
     * @param descrittore funzione che costruisce la descrizione del cliente a partire dal cliente e dai suoi ordini
     * @return la lista dei riepiloghi cliente
     */
    public List<RiepilogoCliente> riepiloghiClienti(
            DescrittoreCliente descrittore
    ) {
        throw new UnsupportedOperationException();
    }

    public record Cliente(
        int id,
        String nome,
        String citta,
        int annoRegistrazione,
        boolean premium
    ) {}

    public record Ordine(
        int clienteId,
        String codice,
        String categoria,
        double importo,
        boolean pagato,
        LocalDate data
    ) {}

    public record ReportOrdine(
        String codiceOrdine,
        String nomeCliente,
        String categoria,
        double importoOriginale,
        double importoFinale,
        String descrizione
    ) {}

    public record ValutazioneCliente(
        String nomeCliente,
        double punteggio,
        String etichetta
    ) {}

    public record RiepilogoCliente(
        String nomeCliente,
        String citta,
        int numeroOrdini,
        double totaleSpeso,
        String descrizione
    ) {}

    @FunctionalInterface
    public interface ReportOrdineFactory {
        ReportOrdine crea(Cliente cliente, Ordine ordine, double importoFinale);
    }

    @FunctionalInterface
    public interface CalcolatorePunteggioCliente {
        double calcola(Cliente cliente, List<Ordine> ordini);
    }

    @FunctionalInterface
    public interface ClassificatorePunteggio {
        String classifica(double punteggio);
    }

    @FunctionalInterface
    public interface DescrittoreCliente {
        String descrivi(Cliente cliente, List<Ordine> ordini);
    }
}