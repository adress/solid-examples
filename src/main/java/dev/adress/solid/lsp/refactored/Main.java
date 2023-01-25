package dev.adress.solid.lsp.refactored;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testGrassCourt();
    }

    public static void testGrassCourt() {
        List<IGrassCourt> courts = new ArrayList<IGrassCourt>();
        courts.add(new WinbledonCourt());
        courts.add(new MallorcaOpen());

        for (IGrassCourt court : courts) {
            court.cutGrass(); //works fine
        }
    }
}