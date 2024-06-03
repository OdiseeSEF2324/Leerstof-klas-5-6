package be.odisee.gemiddeldeoplossing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GetallenApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GetallenApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        ((GetallenController)fxmlLoader.getController()).setModel(mijnGetallen); //give the data of the model to the controller
    }

    /* Bewaar 1 instance van dit (deel van) het model voor de hele applicatie zodat iedereen dezelfde data gebruikt.*/
    private GetallenVerzameling mijnGetallen=new GetallenVerzameling();

    public static void main(String[] args) {
        launch();
    }
}