import br.com.sagaassistidos.title.Movie;
import br.com.sagaassistidos.title.TVShow;
import br.com.sagaassistidos.title.Title;
import br.com.sagaassistidos.title.rate.RecomendationFilter;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Watchmen", 2010);
        myMovie.setDuration(165);
        myMovie.setReview(8);
        myMovie.setReview(4);
        myMovie.setReview(6.5);
        myMovie.setReview(7);
        myMovie.showTitleDetails();
        myMovie.setExtendedVersion(30);
        System.out.println("Versão Estendida: " + myMovie.getExtendedVersion() + " minutos");

        RecomendationFilter filter = new RecomendationFilter();

        filter.recomendationFilter(myMovie);

        TVShow serie = new TVShow("The big bang theory", 2009);
        serie.setReview(9);
        serie.setActive(false);
        serie.showTitleDetails();
        serie.setEpisodePerSeason(22);
        serie.setSeason(12);
        serie.setMinutesPerEpisode(25);
        System.out.println("Duração completa: " + serie.getDuration());

        System.out.println("Está ativa? " + serie.isActive());

        filter.recomendationFilter(serie);

        ArrayList<Title> movieArrayList = new ArrayList<>();
        movieArrayList.add(myMovie);
        movieArrayList.add(serie);
        System.out.println(movieArrayList);

        Collections.sort((movieArrayList));

        System.out.println(movieArrayList);
    }
}
