package br.com.sagaassistidos.title;

import br.com.sagaassistidos.title.rate.Classification;

public class Movie extends Title implements Classification {
    private String director;
    private int extendedVersion;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public void setExtendedVersion(int extendedVersion) {
        this.extendedVersion = this.getDuration() + extendedVersion;
    }

    public int getExtendedVersion() {
        return extendedVersion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {

        if (reviewsScore() >= 8) {
            return 5;
        } else if (reviewsScore() >= 6) {
            return 4;
        } else if (reviewsScore() >= 4) {
            return 3;
        }
        return 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " Classificação: " + this.getClassification() + " estrelas.";
    }
}
