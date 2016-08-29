package model;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

/**
 * Created by Shawan on 5/2/2016.
 */


    /*Header Class*/
public class Header {

    private static Rectangle rectangle1;
    private static Text text;
    private static Line line1;
    private static CustomButton quit;


    public Group head() {

        rectangle1 = new Rectangle(500,180);
        rectangle1.setFill(Paint.valueOf("#a0e71e"));

        text = new Text(81,104,"   Bar Dodger Beta");
        text.setFont(Font.font("Halo3",40));

        quit = new CustomButton(200,130,"Quit Game",20);
        quit.setOnAction(e->{
            System.exit(1); // check here
        });

        line1 = new Line(0,180,500,180);

        Group root = new Group();
        root.getChildren().addAll(rectangle1,quit,text,line1);

        return root;
    }
}