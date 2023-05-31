package ar.edu.unlp.info.oo2.rw.example;

import ar.edu.unlp.info.oo2.rw.model.*;

public class SimpleGame {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        board.add(new Robot("Twonky", new Caterpillar(), new NuclearPlant(), new BombsSystem()));
        board.add(new Robot("Hammer Bot", new Overcraft(), new NuclearPlant(), new LasersSystem()));
        board.add(new Robot("Lana", new FourByFourWheels(), new NuclearPlant(), new BombsSystem()));
        board.add(new Robot("Taylor", new FourByFourWheels(), new NuclearPlant(), new LasersSystem()));
        board.runForCicles(5);
    }
}
