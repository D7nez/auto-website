
package javafxapplication7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application  {
    Ford ford = new Ford();
    Mazda mazda = new Mazda();
    Nissan nissan = new Nissan();
    Toyota toyota = new Toyota();
    TextField t1;
    TextField t2;
    TextField t3;
    
    @Override
    public void start(Stage stage) throws IOException {
        
        BorderPane pane = new BorderPane();
        GridPane gp1 = new GridPane();
        gp1.setHgap(10);
        gp1.setVgap(10);
        gp1.setAlignment(Pos.CENTER);
        Label log = new Label("login");
        log.setCache(true);
        log.setFont(Font.font(null, FontWeight.BOLD, 32));
        gp1.add(log, 0, 0);
        Label l11 = new Label("User Name");
        gp1.add(l11, 0, 1);
        TextField t11 = new TextField();
        gp1.add(t11, 1, 1);
        Label l22 = new Label("Password");
        gp1.add(l22, 0, 2);
        PasswordField pff = new PasswordField();
        gp1.add(pff, 1, 2);
        TextField t22 = new TextField();
        gp1.add(t22, 1, 1);
        Button bt1 = new Button("Next");
        pane.getChildren().add(bt1);
        gp1.add(bt1, 1, 3);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Stage stage1 = new Stage();
        stage1.setTitle("Car");
        stage1.setMaxWidth(250);
        stage1.setMaxHeight(400);
        bt1.setOnAction((ActionEvent e) -> {
             HBox hb = new HBox();
        
        hb.setAlignment(Pos.TOP_LEFT);
             
        ImageView img1 = new ImageView("image/Cx.png");
        img1.setFitWidth(200);
        img1.setFitHeight(200);

        ImageView img2 = new ImageView("image/C.png");
        img2.setFitWidth(200);
        img2.setFitHeight(200);
        
        ImageView img3 = new ImageView("image/FE.png");
        img3.setFitWidth(200);
        img3.setFitHeight(200);
        
        ImageView img4 = new ImageView("image/M.png");
        img4.setFitWidth(200);
        img4.setFitHeight(200);  
        
        Label l1 = new Label("the brand name : "+ mazda.getBrand() + "\n" + "car name : " + mazda.getcarName() + "\n" + "car model : " +mazda.getModel() +"\n" + "car color : "+mazda.getColor() +"\n" + "cylinder : "+mazda.getCylinder() +"\n"
                + "horsePower : "+mazda.getHorsePower() +"\n" + "fuelTankCapacity : "+ mazda.getFuelTankCapacity());
        l1.setGraphic(img1);
        l1.setFont(new Font("Cambria", 32));
        l1.setContentDisplay(ContentDisplay.TOP);
        l1.setCache(true);
        l1.setFont(Font.font(null, FontWeight.BOLD, 15));

        Label l2 = new Label("the brand name : "+toyota.getBrand() + "\n" + "car name : "+toyota.getcarName() + "\n" + "car model : "+toyota.getModel() +"\n" + "car color : "+toyota.getColor() +"\n"
                + "cylinder : "+ toyota.getCylinder()+"\n" + "horsePower : "+toyota.getHorsePower()+"\n" + "fuelTankCapacity : " + toyota.getFuelTankCapacity());
        l2.setGraphic(img2);
        l2.setContentDisplay(ContentDisplay.TOP);
        l2.setCache(true);
        l2.setFont(Font.font(null, FontWeight.BOLD, 15));

        Label l3 = new Label("the brand name : "+ford.getBrand()+"\n" + "car name : "+ford.getcarName()+"\n" + "car model : "+ford.getModel() +"\n" + "car color : "+ford.getColor()+"\n" + "cylinder : "+ford.getCylinder()+"\n"
                + "horsePower : "+ford.getHorsePower()+"\n" + "fuelTankCapacity : " + ford.getFuelTankCapacity());
        l3.setGraphic(img3);
        l3.setContentDisplay(ContentDisplay.TOP);
        l3.setCache(true);
        l3.setFont(Font.font(null, FontWeight.BOLD, 15));

        Label l4 = new Label("the brand name : "+nissan.getBrand()+"\n" + "car name : "+nissan.getcarName() +"\n" + "car model : "+nissan.getModel()+"\n" + "car color : "+nissan.getColor()+"\n" + "cylinder : "+nissan.getCylinder()+"\n"
                + "horsePower : "+nissan.getHorsePower()+"\n" + "fuelTankCapacity : " + nissan.getFuelTankCapacity());
        l4.setGraphic(img4);
        l4.setContentDisplay(ContentDisplay.TOP);
        l4.setCache(true);
        l4.setFont(Font.font(null, FontWeight.BOLD, 15));
        
        HBox b = new HBox(30);
        b.setPadding(new Insets(5, 5, 5, 5)); 
    
        RadioButton bC1 = new RadioButton("Buy");
        bC1.setTranslateX(-1250);
        bC1.setTranslateY(380);
        RadioButton bC2 = new RadioButton("Buy");
        bC2.setTranslateX(-1100);
        bC2.setTranslateY(380);
        RadioButton bC3 = new RadioButton("Buy");
        bC3.setTranslateX(-950);
        bC3.setTranslateY(380);
        RadioButton bC4 = new RadioButton("Buy");
        bC4.setTranslateX(-800);
        bC4.setTranslateY(380);

        ToggleGroup group = new ToggleGroup();
        bC1.setToggleGroup(group);
        bC2.setToggleGroup(group);
        bC3.setToggleGroup(group);
        bC4.setToggleGroup(group);
        
        
        Label bc = new Label("Bank card");
        bc.setTranslateX(200);
        bc.setTranslateY(120);
        bc.setFont(Font.font(null, FontWeight.SEMI_BOLD, 32));
        
        GridPane gp = new GridPane();
        gp.setTranslateX(-20);
        gp.setTranslateY(150);

        gp.setHgap(30);
        gp.setVgap(30);

        Label ccn = new Label("Credit Card Number");
        gp.add(ccn, 0, 1);
         this.t1 = new TextField();
        gp.add(t1, 1, 1);
        Label ed = new Label("Expiry Date");
        gp.add(ed, 0, 2);
        this.t2 = new TextField();
        gp.add(t2, 1, 2);
        Label cvv = new Label("CVV");
        gp.add(cvv, 0, 3);
        this.t3 = new TextField();
        gp.add(t3, 1, 1);
        TextField t4 = new TextField();
        gp.add(t4, 1, 3);
        Button bt = new Button("Ok");
                 gp.add(bt, 1, 4);
                 
        bt.setOnAction((ActionEvent x) ->{
        VBox v = new VBox(10);
        Text text = new Text(50, 50,"Completed purchase! \n       Thank you");
        v.getChildren().add(text);
        text.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        
        v.setAlignment(Pos.CENTER);
        
        Scene ss2 = new Scene(v, 400, 200);
        stage.setScene(ss2);
        stage.setTitle("Car");
        stage.show();
        });
        
        hb.getChildren().addAll(img1, img2, img3, img4, l1, l2, l3, l4 , bc, gp);
        hb.getChildren().addAll(bC1 ,bC2 ,bC3 ,bC4);
        
        
        Scene scene = new Scene(hb, 1500, 600);
        scene.setFill(Color.web("#c48381"));
        stage.setScene(scene);
        stage.setTitle("Car");
        stage.show();  
        });
        
            
        Scene s = new Scene(gp1, 400, 200);
        s.setFill(Color.web("#81c483"));
        stage.setScene(s);
        stage.setTitle("Car");
        stage.show();
        
        wUserInfo(t11 , pff , t1 , t2 , t3);
        
    }     
       public static void wUserInfo(TextField t11 , PasswordField pff , TextField t1 ,TextField t2 , TextField t3) throws IOException {
       FileWriter file = new FileWriter("UserInfo.txt");
        try (PrintWriter out = new PrintWriter(file))
        {
            out.write("User name : " + t11 + "\n");
            out.write("User Password : " + pff + "\n");
            out.write("Credit Card Number : " + t1 + "\n");
            out.write("Expiry Date : " + t2 + "\n");
            out.write("CVV : " + t3 + "\n");
            out.write("---------------------------------------------------------------------------------------");
        }
        
        catch (Exception e)
        {
            
        }
        
    }
       
    public static void main(String[] args) {
        launch(args);
    }
}