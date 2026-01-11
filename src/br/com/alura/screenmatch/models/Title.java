package br.com.alura.screenmatch.models;

public class Title implements Comparable<Title> {
    private String name;
    private int yearOfRelease;
    private boolean includedInThePlan;
    private double sumOfRatings;
    private int totalReviews;
    private int durationInMinutes;

    public Title(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public int getTotalReviews(){
        return totalReviews;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void displayTechnicalSpecifications(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearOfRelease);
    }

    public void rate(double grade){
        sumOfRatings += grade;
        totalReviews++;
    }

    public double getAverage(){
        return sumOfRatings / totalReviews;
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }
}