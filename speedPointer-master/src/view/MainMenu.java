package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.CycleMethod;
import model.CustomButton;
import model.Header;

/**
 * Created by Shawan
 */
public class MainMenu extends Application{
    private Header header;
    private Rectangle rectangle1;
    private Rectangle rectangle2;
    private Text text;
    private Stop[] stops;
    private LinearGradient linearGradient;
    private Line line1;
    private Line line2;
    private CustomButton playonline;
    private CustomButton playoffline;
    private Scene scene;

    public static void main(String[] args){
        launch(args);
    }
@Override
    public void start(Stage stage) {


        /*header rectangle1*/

            header = new Header();

        /*body rectangle2*/
            stage.setTitle("Bar Dodger Beta_V 1.0");
            stops = new Stop[]{new Stop(1, Color.WHITE), new Stop(0, Color.web("#a0e71e"))};
            linearGradient = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE, stops);
            rectangle1 = new Rectangle(0, 181, 500, 338);
            rectangle1.setFill(linearGradient);

            //button 1
            playonline = new CustomButton(150, 248, "Online Mode", 24);
            playonline.setPrefWidth(220);
            playonline.setPrefHeight(68);

            //button2
            playoffline = new CustomButton(150, 358, "Go Offline", 24);
            playoffline.setPrefWidth(220);
            playoffline.setPrefHeight(68);

        /*footer rectangle3*/
            line2 = new Line(0, 520, 500, 520);
            rectangle2 = new Rectangle(0, 521, 500, 80);
            rectangle2.setFill(Paint.valueOf("123"));

        /* stage & scene */

            Group root = new Group(header.head(),rectangle1, playonline, playoffline, line2, rectangle2);
            scene = new Scene(root, 500, 600);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

            playonline.setOnAction(e -> {
                ((Node) (e.getSource())).getScene().getWindow().hide();
                 new Login();
            });

            playoffline.setOnAction(e -> {
                ((Node) (e.getSource())).getScene().getWindow().hide();
                 new GameMenuOffline();
            });

        }
}
