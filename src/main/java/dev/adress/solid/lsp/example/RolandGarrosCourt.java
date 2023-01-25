package dev.adress.solid.lsp.example;

public class RolandGarrosCourt extends Court {
    @Override
    public void cutGrass() {
        //esta cancha no tiene pasto
        throw new IllegalArgumentException("Tierra sin cesped");
    }
}
