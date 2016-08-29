package view;

/**
 * Created by Shawan
 */

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

public class GameOver {
    private Stage stage;
    //private Text gameovertext;
    private Scene scene;
    private Label gameOverLabel;

    public GameOver(){
        stage = new Stage();
        gameOverLabel = new Label("You are Doomed !");
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        gameOverLabel.setFont(Font.font("Halo3",25));

        /*gameovertext = new Text(8,50,"   Game Over");
        gameovertext.setFont(Font.font("Halo3",25));*/

        //Creating restart and quit button

        Button restart = new Button("Restart");
        restart.setOnAction(e -> {
            ((Node) (e.getSource())).getScene().getWindow().hide();
            //new Level1();
            // level1.setLogedplyer();

        });
        Button quit = new Button("Quit");
        quit.setOnAction(e -> System.exit(1));
        layout.getChildren().addAll(gameOverLabel, restart, quit);

        //Group root = new Group(gameOverLabel);
        scene = new Scene(layout,300,300);
        stage.setScene(scene);
        stage.show();
    }
}


