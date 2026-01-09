package br.com.alura.screenmatch.calculations;

public class RecommendationFilter {

    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4){
            System.out.println("São os queridinhos do momento!");
        } else if (classifiable.getClassification() >=2) {
            System.out.println("Bem avaliado do momento");
        } else {
            System.out.println("Coloque na sua lista pra fazer assistir depois!");
        }
    }
}
