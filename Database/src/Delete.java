import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Delete extends Stage{

	static public void start (Stage stage) throws Exception{
		Stage stage1 = new Stage();
		stage1.setTitle("Add A Student");
		Text studentName = new Text("Student Name: ");
		studentName.setLayoutX(20);
		studentName.setLayoutY(30);
		TextField Name = new TextField();
		Name.setLayoutX(125);
		Name.setLayoutY(10);
		Text studentID = new Text("Student ID: ");
		studentID.setLayoutX(20);
		studentID.setLayoutY(75);
		TextField ID = new TextField();
		ID.setLayoutX(125);
		ID.setLayoutY(55);
		Button Gone = new Button("Delete");
		Gone.setOnAction(new EventHandler<ActionEvent> () {
			@Override
			public void handle(ActionEvent e) {
			
			//DBAccess db = new DBAccess();
			//db.Write(s);
				System.out.println("Deleted");
			}
		});
		Gone.setLayoutX(150);
		Gone.setLayoutY(250);
		Button Exit = new Button("Exit");
		Exit.setLayoutX(250);
		Exit.setLayoutY(250);
		Exit.setOnAction(new EventHandler<ActionEvent> () {
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		Pane Deleted = new Pane();
		Deleted.getChildren().addAll(studentName,Name,
				studentID, ID,
				Gone, Exit);
		Scene added = new Scene(Deleted,350,300);
		stage1.setScene(added);
		stage1.show();
	}
}