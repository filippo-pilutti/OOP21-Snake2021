package main.java.com.controller;

import main.java.com.model.GameModel;
import main.java.com.model.Model;

public class Controller {

    private final Model model;
    private boolean isGameOver;
    private boolean isPaused;

    public Controller() {
        this.model = new GameModel();
    }
}
