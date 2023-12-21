package br.com.sagaassistidos.title.rate;

public class RecomendationFilter {

    public void recomendationFilter(Classification classify) {
        if (classify.getClassification() >= 5) {
            System.out.println("Altamente recomendado!");
        } else if (classify.getClassification() >= 4) {
            System.out.println("Recomendado!");
        } else if (classify.getClassification() >= 3){
            System.out.println("Pouco recomendado!");
        } else {
            System.out.println("Não recomendado!");
        }
    }
}
