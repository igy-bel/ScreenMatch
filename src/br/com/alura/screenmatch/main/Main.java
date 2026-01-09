package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculations.RecommendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film("O Poderoso Chefão", 1972);
        myFilm.setDurationInMinutes(175);
        System.out.println("Duração do filme: " + myFilm.getDurationInMinutes());

        myFilm.displayTechnicalSpecifications();
        myFilm.rate(8);
        myFilm.rate(5);
        myFilm.rate(10);
        System.out.println(myFilm.getTotalReviews());
        System.out.println("Média das avaliações: " + myFilm.getAverage());

        Film myFilm2 = new Film("Avatar", 2009);
        myFilm2.setDurationInMinutes(168);

        Series mySeries = new Series("Lost", 2004);
        mySeries.displayTechnicalSpecifications();
        mySeries.setSeasons(6);
        mySeries.setEpisodesPerSeasons(24);
        mySeries.setMinutesPerEpisodes(45);
        System.out.println("Duração da série " + mySeries.getName() + ": " + mySeries.getDurationInMinutes());

        TimeCalculator calculadora = new TimeCalculator();
        calculadora.include(myFilm);
        calculadora.include(myFilm2);
        calculadora.include(mySeries);
        System.out.println(calculadora.getTotalTime());

        RecommendationFilter myFilter = new RecommendationFilter();
        myFilter.filter(myFilm);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(mySeries);
        episode.setViews(300);
        myFilter.filter(episode);

        Film myFilm3 = new Film("Dogville", 2003);
        myFilm3.setDurationInMinutes(200);
        myFilm3.rate(10);

        ArrayList<Film> movieList = new ArrayList<>();
        movieList.add(myFilm);
        movieList.add(myFilm2);
        movieList.add(myFilm3);
        System.out.println("Tamanho da lista: " + movieList.size());
        System.out.println("Primeiro filme: "+ movieList.get(0).getName());
        System.out.println(movieList);
    }
}
