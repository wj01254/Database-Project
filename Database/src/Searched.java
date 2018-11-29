import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Searched {
	static public void start (Stage stage) throws Exception{
	Stage stage2 = new Stage();
	stage2.setTitle("Searched Student");
	Button Exit = new Button("Exit");
	Exit.setLayoutX(250);
	Exit.setLayoutY(250);
	Exit.setOnAction(new EventHandler<ActionEvent> () {
		@Override
		public void handle(ActionEvent e) {
			System.exit(0);
		}
	});
	Pane Searched = new Pane();
	Searched.getChildren().addAll(Exit);
	Scene added = new Scene(Searched,325,300);
	stage2.setScene(added);
	stage2.show();
}

}
