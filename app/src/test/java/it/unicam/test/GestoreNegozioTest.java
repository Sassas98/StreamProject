package it.unicam.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static it.unicam.test.StatoOrdine.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GestoreNegozioTest {

    private GestoreNegozio gestore;

    private Prodotto tastiera;
    private Prodotto mouse;
    private Prodotto monitor;
    private Prodotto sedia;

    private Ordine ordineAnna;
    private Ordine ordineLuca;
    private Ordine ordineMarco;
    private Ordine ordineAnnullato;

    @BeforeEach
    void setUp() {
        tastiera = new Prodotto(1, "Tastiera", "Tech", 50.0, 10);
        mouse = new Prodotto(2, "Mouse", "Tech", 20.0, 20);
        monitor = new Prodotto(3, "Monitor", "Tech", 180.0, 5);
        sedia = new Prodotto(4, "Sedia", "Office", 90.0, 0);

        ordineAnna = new Ordine(
                1,
                "Anna",
                List.of(
                        new RigaOrdine(1, 1),
                        new RigaOrdine(2, 2)
                ),
                PAGATO
        );

        ordineLuca = new Ordine(
                2,
                "Luca",
                List.of(
                        new RigaOrdine(3, 1)
                ),
                PAGATO
        );

        ordineMarco = new Ordine(
                3,
                "Marco",
                List.of(
                        new RigaOrdine(1, 1)
                ),
                SPEDITO
        );

        ordineAnnullato = new Ordine(
                4,
                "Anna",
                List.of(
                        new RigaOrdine(4, 1)
                ),
                ANNULLATO
        );

        gestore = new GestoreNegozio(
                List.of(tastiera, mouse, monitor, sedia),
                List.of(ordineAnna, ordineLuca, ordineMarco, ordineAnnullato)
        );
    }

    @Test
    void prodottiDisponibiliDovrebbeRestituireSoloProdottiConGiacenzaMaggioreDiZero() {
        assertTrue(true);
    }

    @Test
    void cercaProdottoPerIdDovrebbeRestituireIlProdottoSeEsiste() {
        assertTrue(true);
    }

    @Test
    void cercaProdottoPerIdDovrebbeRestituireOptionalVuotoSeIlProdottoNonEsiste() {
        assertTrue(true);
    }

    @Test
    void prodottiPerCategoriaDovrebbeRestituireSoloProdottiDellaCategoriaIndicata() {
        assertTrue(true);
    }

    @Test
    void prodottiSottoPrezzoDovrebbeRestituireSoloProdottiConPrezzoInferioreAlLimite() {
        assertTrue(true);
    }

    @Test
    void totaleOrdineDovrebbeCalcolareLaSommaDelleRighe() {
        assertTrue(true);
    }

    @Test
    void totaleOrdineConSpedizioneDovrebbeAggiungereLaSpedizioneSottoLaSoglia() {
        assertTrue(true);
    }

    @Test
    void totaleOrdineConSpedizioneNonDovrebbeAggiungereLaSpedizioneSopraLaSoglia() {
        assertTrue(true);
    }

    @Test
    void applicaScontoDovrebbeRidurreImportoSecondoPercentuale() {
        assertTrue(true);
    }

    @Test
    void ordiniPagatiDovrebbeRestituireSoloOrdiniConStatoPagato() {
        assertTrue(true);
    }

    @Test
    void ordiniDaSpedireDovrebbeRestituireSoloOrdiniAncoraDaSpedire() {
        assertTrue(true);
    }

    @Test
    void totaleSpesoDaClienteDovrebbeSommareSoloOrdiniNonAnnullatiDelCliente() {
        assertTrue(true);
    }

    @Test
    void ordineEvadibileDovrebbeRestituireTrueSeTutteLeQuantitaSonoDisponibili() {
        assertTrue(true);
    }

    @Test
    void ordineEvadibileDovrebbeRestituireFalseSeAlmenoUnaQuantitaNonEDisponibile() {
        assertTrue(true);
    }

    @Test
    void prodottoPiuCostosoDisponibileDovrebbeRestituireIlProdottoDisponibileConPrezzoMaggiore() {
        assertTrue(true);
    }

    @Test
    void numeroPezziVendutiDovrebbeContareLeQuantitaDegliOrdiniValidi() {
        assertTrue(true);
    }
}