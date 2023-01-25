package dev.adress.solid.lsp.refactored;

public class AustraliaOpenCourt extends Court implements HardCourt{
    public void cleanHardCourt() {
        throw new IllegalArgumentException("Clean hard court AustraliaOpen");
    }
}
