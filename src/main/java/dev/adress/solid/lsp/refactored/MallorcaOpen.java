package dev.adress.solid.lsp.refactored;

public class MallorcaOpen extends Court implements IGrassCourt{
    @Override
    public void cutGrass() {
        System.out.println("Cortando cesped Mallorca");
    }
}
