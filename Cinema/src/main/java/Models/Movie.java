package Models;

import java.util.Collection;
import java.util.Date;

enum MovieType {
    _3D,
    _2D,
    _4D
}

//Igbal
public class Movie {
    private int id;
    private String movieName;
    private Collection<Categoty> categories;
    private long durationMinutes;
    private Language language;
    private Date releaseDate;
    private Date endDate;
    private Author author;
    private Collection<Actor> actors;
    private Collection<Prize> prizes;
    private Collection<MovieType> movieType;
    private double rating;
    private Trailer trailer;
}
