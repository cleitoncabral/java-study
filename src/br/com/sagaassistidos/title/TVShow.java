package br.com.sagaassistidos.title;

import br.com.sagaassistidos.title.rate.Classification;

public class TVShow extends Title implements Classification {
    private int season;
    private int episodePerSeason;
    private boolean isActive;
    private int minutesPerEpisode;

    public TVShow(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodePerSeason() {
        return episodePerSeason;
    }

    public void setEpisodePerSeason(int episodePerSeason) {
        this.episodePerSeason = episodePerSeason;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDuration() {
        return season * minutesPerEpisode * episodePerSeason;
    }

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
        return "Serie: " + this.getName() + " Classificação: " + this.getClassification() + " estrelas.";
    }
}
