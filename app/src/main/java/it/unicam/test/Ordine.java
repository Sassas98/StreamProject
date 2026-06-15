package it.unicam.test;

import java.util.List;

public record Ordine(
            int id,
            String cliente,
            List<RigaOrdine> righe,
            StatoOrdine stato
    ) {}