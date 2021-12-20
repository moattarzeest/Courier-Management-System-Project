package application;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;


import java.io.IOException;

public class Main extends Application {

	public static mydata mydata1;
    public static Stage stage1;
    public static Username username1;
    public static Pickup pickup1;
    public static Item item1;
    @Override
    public void start(Stage stage) throws IOException
    {
        stage1 = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Logins.fxml"));
       
//        final WebEngine webEngine = new WebEngine(getClass().getResource("googlemap.html").toString());
//        final WebView webView = new WebView(webEngine);
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Courier Management System");
        stage.setScene(scene);
        stage.show();
    }
    public void changeScene(String fxml) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml));
        stage1.setTitle("Courier Management System");
        stage1.setScene(new Scene(fxmlLoader.load()));
        stage1.show();
    }

    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
    }
    public static void main(String[] args) {
        launch();
    }
}