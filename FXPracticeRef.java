import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXPracticeRef extends Application {

  public void start(Stage stage){
    Group root = new Group();
    Scene scene = new Scene(root, 300, 120, Color.LIGHTGREEN);
    double sceneWidth = scene.getWidth();
    double sceneHeight = scene.getHeight();

    Text hello = new Text(sceneWidth - 250, sceneHeight - 70, "Hello World!");
    Text question = new Text(sceneWidth - 180, sceneHeight - 40, "How's it going?");
    Rectangle box = new Rectangle(sceneWidth - 280, sceneHeight - 100, 120, 50);

    box.setStroke(Color.BLUE);
    box.setFill(null);

    root.getChildren().addAll(hello, question, box);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
