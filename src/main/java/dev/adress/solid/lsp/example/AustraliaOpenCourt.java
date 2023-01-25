package dev.adress.solid.lsp.example;

public class AustraliaOpenCourt extends Court{
    @Override
    public void cutGrass() {
        //esta cancha no tiene pasto
        throw new IllegalArgumentException("Pista dura sin cesped");
    }
}
