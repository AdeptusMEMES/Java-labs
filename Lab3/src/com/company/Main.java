package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AudioFile audio1 = new AudioFile("song1");
        AudioFile audio2 = new AudioFile("some sounds");
        AudioFile audio3 = new AudioFile("silence");

        GraphFile g1 = new GraphFile("the image");
        GraphFile g2 = new GraphFile("flowher");
        GraphFile g3 = new GraphFile("color of magic");

        TextFile txt1 = new TextFile("notes");
        TextFile txt2 = new TextFile("document");
        TextFile txt3 = new TextFile("test");

        AudioFile audio4 = new AudioFile("out1");
        AudioFile audio5 = new AudioFile("out2");

        GraphFile g4 = new GraphFile("out3");

        Catalog texts = new Catalog("texts");
        texts.add(txt1);
        texts.add(txt2);
        texts.add(txt3);

        Catalog audios = new Catalog("audios");
        audios.add(audio1);
        audios.add(audio2);
        audios.add(audio3);

        Catalog graphs = new Catalog("graphics");
        graphs.add(g1);
        graphs.add(g2);
        graphs.add(g3);

        Catalog notImg = new Catalog("not images");
        notImg.add(texts);
        notImg.add(audios);
        notImg.add(g4);
        notImg.add(audio5);

        Catalog generalCatalog = new Catalog("Root");
        generalCatalog.add(notImg);
        generalCatalog.add(graphs);
        generalCatalog.add(audio4);

        generalCatalog.prnt(0);
	// write your code here
    }
}
