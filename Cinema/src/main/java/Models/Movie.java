package Models;

import java.util.Collection;
import java.util.Date;

//Igbal
public class Movie {
    private int id;
    private String movieName;
    private Collection<Categoty> categoties;
    private long duration;
    private Language language;
    private Date publishDate;
    private Collection<MovieType> movieType;

}
