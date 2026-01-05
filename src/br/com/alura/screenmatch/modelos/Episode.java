package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private Series series;
    private int views;

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        if (views > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
