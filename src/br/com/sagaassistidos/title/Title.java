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

    public Title(TitleConvert myTitleConvert) {
        this.name = myTitleConvert.title();
        this.releaseYear = Integer.parseInt(myTitleConvert.year());
        this.duration = Integer.parseInt(myTitleConvert.runtime().substring(0, 2));
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

    public String showTitleDetails() {
        return "Nome do filme: " + name +
                ", Ano de lançamento: " + releaseYear +
                " Duração: " + duration + " min";

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
