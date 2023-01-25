package dev.adress.solid.spr.refactored;

public class PlayerDomain {

    Double winPercentage(Player player) {
        return Double.valueOf(player.getWin() / (player.getWin() + player.getLose()));
    }

    Double lostPercentage(Player player) {
        return 0.0;
    }

}
