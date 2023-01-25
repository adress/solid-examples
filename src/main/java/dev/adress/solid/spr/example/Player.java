package dev.adress.solid.spr.example;

public class Player {
    int id;
    String name;
    int win;
    int lose;
    String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    Double winPercentage(Player player) {
        return Double.valueOf(player.getWin() / (player.getWin() + player.getLose()));
    }

    Double lostPercentage(Player player) {
        return  0.0;
    }

    void savePlayer(Player player){
        //guarda jugador
    }

    void deletePlayer(Player player){
        //elimina jugador
    }

    void showPlayerHD(Player player){

    }

    void showPlayerNormal(Player player){

    }
}

