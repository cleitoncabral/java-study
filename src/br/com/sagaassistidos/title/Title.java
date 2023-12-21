package br.com.sagaassistidos.title;

public class Title implements Comparable<Title> {
    private String name;
    private int releaseYear;
    private int duration;
    private boolean planIncluded;
    private double review;
    private int totalReviewsCounter = 0;
    private double totalReviews;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReview(double review) {
        this.review = review;
        reviewMovie();
    }

    public void setReleaseYear (int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return this.name;
    }

    public void showTitleDetails() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Nota: " + reviewsScore());
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração: " + duration);
    }

    public void reviewMovie () {
        totalReviews += review;
        totalReviewsCounter++;
    }

    public double reviewsScore() {
        return totalReviews / totalReviewsCounter;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName()) ;
    }
}
