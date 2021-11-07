package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String nameMovie, String categoryMovie) { //constructor; constructor can have many instances of an object
        this.name = nameMovie;
        this.category = categoryMovie;
    }


    public void setName(String nameMovie) {
        this.name = nameMovie;
    }
    public void setCategory(String categoryMovie) {
        this.category = categoryMovie;
    }

    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }



        //t should have private fields for name and category, and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).
}
