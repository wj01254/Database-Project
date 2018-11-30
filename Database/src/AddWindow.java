import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddWindow extends Stage {

	static public void start(Stage stage) throws Exception {
		Stage stage1 = new Stage();
		// fill the stage
		stage1.setTitle("Add A Student");
		Text FirstName = new Text("First Name: ");
		FirstName.setLayoutX(20);
		FirstName.setLayoutY(30);
		TextField FName = new TextField();
		FName.setLayoutX(125);
		FName.setLayoutY(10);
		
		Text LastName = new Text("Last Name: ");
		LastName.setLayoutX(20);
		LastName.setLayoutY(80);
		TextField LName = new TextField();
		LName.setLayoutX(125);
		LName.setLayoutY(60);
		
		Text studentID = new Text("Student ID: ");
		studentID.setLayoutX(20);
		studentID.setLayoutY(125);
		TextField ID = new TextField();
		ID.setLayoutX(125);
		ID.setLayoutY(105);
		Text Address = new Text("Address");
		Address.setLayoutX(20);
		Address.setLayoutY(165);
		TextField AID = new TextField();
		AID.setLayoutX(125);
		AID.setLayoutY(145);
		Text DOB = new Text("Date of Birth: ");
		DOB.setLayoutX(20);
		DOB.setLayoutY(205);
		TextField DOBID = new TextField();
		DOBID.setLayoutX(125);
		DOBID.setLayoutY(185);
		Text Year = new Text("Year: ");
		Year.setLayoutX(20);
		Year.setLayoutY(255);
		TextField YID = new TextField();
		YID.setLayoutX(125);
		YID.setLayoutY(235);
		Button Add = new Button("Add");
		Add.setLayoutX(150);
		Add.setLayoutY(300);
		Add.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {

				DBAccess db = new DBAccess();
				db.Write("Insert into \"Student\" (StudentID, FirstName, LastName, Year, School, DOB, Address) Values('"+ ID.getText()+"', '"+ FName.getText() +"',"
						+ " '"+ LName.getText() +"',"
						+ " '"+YID.getText()+"',"
						+ "\"GSU\", '"+ DOBID.getText()+ "', \"'" + AID.getText() + "'\" )" );
				
					System.out.println("Added");

			}
		});

		Button Exit = new Button("Exit");
		Exit.setLayoutX(250);
		Exit.setLayoutY(300);
		Exit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		Pane Addwindow = new Pane();
		Addwindow.getChildren().addAll(FirstName, FName, LastName, LName, studentID, ID, Address, AID, DOB, DOBID, Year, YID, Add,
				Exit);
		Scene added = new Scene(Addwindow, 400, 350);
		stage1.setScene(added);
		stage1.show();
		// if(addbtn.getText().equals("Clicked")) addbtn.setText("Add");
		// else addbtn.setText("Clicked");

	}
}