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

public class AddWindow extends Stage{

	static public void start (Stage stage) throws Exception{
		Stage stage1 = new Stage();
		//fill the stage
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
		Text Address = new Text("Address");
		Address.setLayoutX(20);
		Address.setLayoutY(115);
		TextField AID = new TextField();
		AID.setLayoutX(125);
		AID.setLayoutY(95);
		Text DOB = new Text("Date of Birth: ");
		DOB.setLayoutX(20);
		DOB.setLayoutY(155);
		TextField DOBID = new TextField();
		DOBID.setLayoutX(125);
		DOBID.setLayoutY(135);
		Text Year = new Text("Year: ");
		Year.setLayoutX(20);
		Year.setLayoutY(205);
		TextField YID = new TextField();
		YID.setLayoutX(125);
		YID.setLayoutY(185);
		Button Add = new Button("Add");
		Add.setLayoutX(150);
		Add.setLayoutY(250);
		Add.setOnAction(new EventHandler<ActionEvent> ()  {
			@Override
			public void handle(ActionEvent e) {

				if(e.getSource()==Add) {
					System.out.println("Added");
				}
			}
		});

		Button Exit = new Button("Exit");
		Exit.setLayoutX(250);
		Exit.setLayoutY(250);
		Exit.setOnAction(new EventHandler<ActionEvent> () {
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		Pane Addwindow = new Pane();
		Addwindow.getChildren().addAll(studentName,Name,
				studentID, ID,
				Address, AID,
				DOB,DOBID,
				Year, YID, Add, Exit);
		Scene added = new Scene(Addwindow,350,300);
		stage1.setScene(added);
		stage1.show();
		//if(addbtn.getText().equals("Clicked")) addbtn.setText("Add");
		//else addbtn.setText("Clicked");

	}
}