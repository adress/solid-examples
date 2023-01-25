package dev.adress.solid.lsp.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testCourt();
    }

    public static void testCourt() {
        List<Court> courts = new ArrayList<Court>();
        courts.add(new WinbledonCourt());
        courts.add(new RolandGarrosCourt());
        courts.add(new AustraliaOpenCourt());

        for (Court court : courts) {
            court.cutGrass(); //throw exception
        }
    }
}