package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void include(Film f){
//        totalTime +=f.getDurationInMinutes();
//    }
//    public void include(Series s){
//        totalTime +=s.getDurationInMinutes();
//    }
    public void include(Title title){
        this.totalTime += title.getDurationInMinutes();
    }
}
