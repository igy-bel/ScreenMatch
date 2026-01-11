package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {
        Film myFilm = new Film("O Poderoso Chefão", 1972);
        myFilm.rate(9);
        Film myFilm2 = new Film("Avatar", 2009);
        myFilm2.rate(6);
        Film myFilm3 = new Film("Dogville", 2003);
        myFilm3.rate(10);
        Series mySeries = new Series("Lost", 2004);
        ArrayList<Title> watchlist = new ArrayList<>();
        watchlist.add(myFilm);
        watchlist.add(myFilm2);
        watchlist.add(myFilm3);
        watchlist.add(mySeries);

        for (Title thing: watchlist) {
            System.out.println(thing.getName());
            if (thing instanceof Film film && film.getClassification() > 2) {
                System.out.println("Classificação: " + film.getClassification());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(watchlist);
        System.out.println(watchlist);
        watchlist.sort(Comparator.comparing(Title::getYearOfRelease));
        System.out.println("Ordenando por ano");
        System.out.println(watchlist);

    }
}
