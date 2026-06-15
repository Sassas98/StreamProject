package it.unicam.test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GestoreNegozio {

    private final List<Prodotto> prodotti;
    private final List<Ordine> ordini;

    public GestoreNegozio(List<Prodotto> prodotti, List<Ordine> ordini) {
        this.prodotti = prodotti;
        this.ordini = ordini;
    }

    public List<Prodotto> prodottiDisponibili() {
        return prodotti.stream()
                .filter(prodotto -> prodotto.giacenza() > 0)
                .toList();
    }

    public Optional<Prodotto> cercaProdottoPerId(int id) {
        return prodotti.stream()
                .filter(prodotto -> prodotto.id() == id)
                .findFirst();
    }

    public List<Prodotto> prodottiPerCategoria(String categoria) {
        return prodotti.stream()
                .filter(prodotto -> prodotto.categoria().equals(categoria))
                .toList();
    }

    public List<Prodotto> prodottiSottoPrezzo(double prezzoMassimo) {
        return prodotti.stream()
                .filter(prodotto -> prodotto.prezzo() < prezzoMassimo)
                .toList();
    }

    public double totaleOrdine(Ordine ordine) {
        return ordine.righe().stream()
                .mapToDouble(riga -> {
                    Prodotto prodotto = cercaProdottoPerId(riga.prodottoId()).orElseThrow();
                    return prodotto.prezzo() * riga.quantita();
                })
                .sum();
    }

    public double totaleOrdineConSpedizione(Ordine ordine) {
        double totale = totaleOrdine(ordine);

        if (totale > 100) {
            return totale;
        }

        return totale + 7.99;
    }

    public double applicaSconto(double importo, double percentuale) {
        return importo - importo * percentuale / 100;
    }

    public List<Ordine> ordiniPagati() {
        return ordini.stream()
                .filter(ordine -> ordine.stato() == StatoOrdine.PAGATO)
                .toList();
    }

    public List<Ordine> ordiniDaSpedire() {
        return ordini.stream()
                .filter(ordine -> ordine.stato() == StatoOrdine.PAGATO || ordine.stato() == StatoOrdine.SPEDITO)
                .toList();
    }

    public double totaleSpesoDaCliente(String cliente) {
        return ordini.stream()
                .filter(ordine -> ordine.cliente().equals(cliente))
                .filter(ordine -> ordine.stato() != StatoOrdine.ANNULLATO)
                .mapToDouble(this::totaleOrdine)
                .sum();
    }

    public boolean ordineEvadibile(Ordine ordine) {
        return ordine.righe().stream()
                .allMatch(riga -> {
                    Prodotto prodotto = cercaProdottoPerId(riga.prodottoId()).orElseThrow();
                    return prodotto.giacenza() >= riga.quantita();
                });
    }

    public Optional<Prodotto> prodottoPiuCostosoDisponibile() {
        return prodotti.stream()
                .filter(prodotto -> prodotto.giacenza() > 0)
                .max(Comparator.comparing(Prodotto::prezzo));
    }

    public int numeroPezziVenduti() {
        return ordini.stream()
                .filter(ordine -> ordine.stato() != StatoOrdine.ANNULLATO)
                .flatMap(ordine -> ordine.righe().stream())
                .mapToInt(RigaOrdine::quantita)
                .sum();
    }
}