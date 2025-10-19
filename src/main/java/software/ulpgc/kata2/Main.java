package software.ulpgc.kata2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "https://datasets.imdbws.com/title.basics.tsv.gz";
        List<Movie> movies = new RemoteMovieLoader(url, MovieDeserializer::fromTsv).loadAll();
        movies.forEach(System.out::println);
    }
}
