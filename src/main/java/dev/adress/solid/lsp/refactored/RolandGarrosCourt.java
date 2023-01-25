package dev.adress.solid.lsp.refactored;

public class RolandGarrosCourt extends Court implements IClayCourt{

    public void changeClay() {
        throw new IllegalArgumentException("Clay RolandGarros");
    }
}
