package br.com.ddmsoftware.testimagewithtext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmoraes on 22/06/2017.
 */

public class Author {

    public String authorName;
    public String authorBio;

    public String getAuthorName() {

        return authorName;
    }

    public void setAuthorName(String authorName) {

        this.authorName = authorName;
    }



    Author(String authorName, String authorBio) {
        this.authorName = authorName;
        this.authorBio = authorBio;
    }

    Author() {
        super();
    }




    public void initializeData() {

        List<Author> authors = new ArrayList<>();

        authors.add(new Author("Platão","Platão e um filósofo."));
        authors.add(new Author("Albert Einstein","Einstein e um filósofo."));
        authors.add(new Author("Confúcio","Confúcio e um filósofo."));
    }
}
