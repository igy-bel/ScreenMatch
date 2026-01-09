package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Classifiable;

public class Film extends Title implements Classifiable {
    String director;

    public Film(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

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
