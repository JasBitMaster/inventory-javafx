package app;

import java.io.IOException;

import javafx.fxml.FXML;

// Refs: https://openjfx.io/index.html

public class HomeController {
    @FXML
    private void goHome() throws IOException {
        App.setRoot("home");
    }
}