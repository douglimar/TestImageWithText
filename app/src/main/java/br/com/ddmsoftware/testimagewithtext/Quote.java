package br.com.ddmsoftware.testimagewithtext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dmoraes on 22/06/2017.
 */

public class Quote {

    public String author;
    public String quote;
    public int[] quoteFontColor;
    public int authorBackground;


    Quote(String author, String quote, int[] quoteFontColor, int authorBackground) {
        this.author = author;
        this.quote = quote;
        this.quoteFontColor = quoteFontColor;
        this.authorBackground = authorBackground;
    }


    Quote() {

    }

    public List initializeData() {

        Author authors = new Author();

        int[] aColorGray = new int[3];

        aColorGray[0] = 255; aColorGray[1] = 61; aColorGray[2] = 61;

        int[] aColorRed = new int[3];

        aColorRed[0] = 255;// R
        aColorRed[1] = 100;// G
        aColorRed[2] = 100;// B

        int[] aColorWhite = new int[3];

        aColorWhite[0] = 255; //
        aColorWhite[1] = 255;
        aColorWhite[2] = 255;

        int[] aColorBlack = new int[3];

        aColorBlack[0] = 0;
        aColorBlack[1] = 0;
        aColorBlack[2] = 0;

        List<Quote> quotes = new ArrayList<>();

        quotes.add(new Quote("CONFUCIO","A cultura está acima da diferença da condição social.",aColorWhite,R.drawable.confucio));
        quotes.add(new Quote("EINSTEIN","Existe uma coisa que uma longa existência me ensinou: toda a nossa ciência, comparada à realidade, é primitiva e inocente. e, portanto, é o que temos de mais valioso.",aColorBlack,R.drawable.einstein));
        quotes.add(new Quote("PLATÃO","O cansaço físico, mesmo que suportado forçosamente, não prejudica o corpo, enquanto o conhecimento imposto à força não pode permanecer na alma por muito tempo.",aColorRed,R.drawable.platao));

        return quotes;
    };



}
