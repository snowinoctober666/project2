import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.layout.Border;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import java.awt.*;


public class JavaFXTemplate extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome to KENO");
		Group root = new Group();
		Scene scene = new Scene(root, 700,700);
		Text text = new Text ("Welcome to KENO");
		text.setTextOrigin(VPos.TOP);
		text.setFont(Font.font(null, FontWeight.BOLD,70));

		text.layoutXProperty().bind(scene.widthProperty().subtract(text.prefWidth(-1)).divide(2));
		text.layoutYProperty().bind(scene.widthProperty().subtract(text.prefWidth(-1)).divide(2));
   		root.getChildren().add(text);


		MenuBar welcome = new MenuBar();
		Menu m = new Menu("menu");

		welcome.getMenus().add(m);

	  MenuItem rules = new MenuItem ("display the rules of the game");
	  MenuItem odds = new MenuItem ("display the odds of the game");
	  MenuItem exit = new MenuItem("exit the game");
	  MenuItem play = new MenuItem("Play game");

	  	m.getItems().add(rules);
		m.getItems().add(odds);
		m.getItems().add(exit);
		m.getItems().add(play);

//		MenuItem m1 = new MenuItem("display the rules of the game");
//		MenuItem m2 = new MenuItem();
//		MenuItem m3 = new MenuItem("exit the game");
//		MenuItem m4 = new MenuItem("Play");


		BorderPane p = new BorderPane();
		p.setTop(welcome);
		Scene sc = new Scene(p);
		primaryStage.setScene(sc);
		primaryStage.setWidth(500);
		primaryStage.setHeight(500);

		primaryStage.setScene(sc);  //menu scene
//		primaryStage.setScene(scene);

		primaryStage.show();


	}

}
