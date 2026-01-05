package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifiable;

public class Film extends Title implements Classifiable {
    String director;

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getYearOfRelease() + ")";
    }
}
