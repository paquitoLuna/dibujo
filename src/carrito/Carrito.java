/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Path;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;


/**
 *
 * @author zS18014498
 */
public class Carrito extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //ROOT NODE 
        Group root = new Group(); 
        
        //Street Lines
        Line InStreet1 = new Line(0,300,1000,300); 
        InStreet1.setStroke(Color.BROWN);
        InStreet1.setStrokeWidth(10);
        
        Line InStreet2 = new Line(0,400,1000,400);
        InStreet2.setStroke(Color.WHITE);
        InStreet2.setStrokeWidth(10);
        InStreet2.setStrokeLineCap(StrokeLineCap.BUTT);
        InStreet2.getStrokeDashArray().addAll(20d, 40d);
        InStreet2.setStrokeDashOffset(0);
        
        
        Line InStreet3 = new Line(0,500,1000,500); 
        InStreet3.setStroke(Color.BROWN);
        InStreet3.setStrokeWidth(10);
        
        //Car Shape 
        Path pathCar = new Path(); 
        
        MoveTo start = new MoveTo(); 
        start.setX(170);
        start.setY(300);
        
        LineTo lineCar1 = new LineTo(); 
        lineCar1.setX(170);
        lineCar1.setY(300);
        
        LineTo lineCar2 = new LineTo(); 
        lineCar2.setX(170);
        lineCar2.setY(200);
        
        
        CubicCurveTo cubicCar1 = new CubicCurveTo(); 
        cubicCar1.setX(270);
        cubicCar1.setY(170);
        cubicCar1.setControlX1(150);
        cubicCar1.setControlY1(185);
        cubicCar1.setControlX2(180);
        cubicCar1.setControlY2(160);
        
        CubicCurveTo cubicCar2 = new CubicCurveTo(); 
        cubicCar2.setX(680);
        cubicCar2.setY(170);
        cubicCar2.setControlX1(330);
        cubicCar2.setControlY1(10);
        cubicCar2.setControlX2(620);
        cubicCar2.setControlY2(10);
        
        LineTo lineCar3 = new LineTo(); 
        lineCar3.setX(740);
        lineCar3.setY(170);
        
        CubicCurveTo cubicCar3 = new CubicCurveTo(); 
        cubicCar3.setX(890);
        cubicCar3.setY(300);
        cubicCar3.setControlX1(810);
        cubicCar3.setControlY1(180);
        cubicCar3.setControlX2(890);
        cubicCar3.setControlY2(230);
        
        LineTo lineCar4 = new LineTo(); 
        lineCar4.setX(250);
        lineCar4.setY(300); 
        
        
        //Define A Linear gradient color for CAR
        LinearGradient carLinearGradient = new LinearGradient(
                        0.0,
                        0.0,
                        0.0,
                        1.0,
                        true,
                        CycleMethod.NO_CYCLE,
                        new Stop(0f,Color.WHITE),
                        new Stop(0.3f, Color.BLUE), 
                        new Stop(.75f, Color.WHITE), 
                        new Stop(1.0f, Color.BLUE));
        
        pathCar.setFill(carLinearGradient);
        pathCar.setStrokeWidth(5);
        
        //Window 1 
        
        Path window1 = new Path(); 
        
        MoveTo window1Start = new MoveTo(); 
        window1Start.setX(425);//sin cambios
        window1Start.setY(155);//sin cambios
        
        LineTo window1Line1 = new LineTo(); 
        window1Line1.setX(425);//fijo
        window1Line1.setY(65);//rijo
        
        CubicCurveTo cubicWindow1 = new CubicCurveTo(); 
        cubicWindow1.setX(270);
        cubicWindow1.setY(170);
        cubicWindow1.setControlX1(150);
        cubicWindow1.setControlY1(150);
        cubicWindow1.setControlX2(500);
        cubicWindow1.setControlY2(200);
        
        LineTo window1Line2 = new LineTo();
        window1Line2.setX(500);
        window1Line2.setY(300);
        
        window1.getElements().addAll(window1Start, window1Line1, cubicWindow1, window1Line2);
        
        //Window 2
        
      
        
        Path window2 = new Path(); 
        
        MoveTo window2Start = new MoveTo(); 
        window2Start.setX(170);
        window2Start.setY(300);
        
        LineTo window2Line1 = new LineTo(); 
        window2Line1.setX(170);
        window2Line1.setY(300);
        
        CubicCurveTo cubicWindow2 = new CubicCurveTo(); 
        cubicWindow2.setX(890);
        cubicWindow2.setY(300);
        cubicWindow2.setControlX1(810);
        cubicWindow2.setControlY1(55);//fijp
        cubicWindow2.setControlX2(655);//fijo
        cubicWindow2.setControlY2(100);//fijo
        
        LineTo window2Line2 = new LineTo();
        window2Line2.setX(465);//sin cambios
        window2Line2.setY(155);//sin cambios
        
        window2.getElements().addAll(window2Start, window2Line1, cubicWindow2, window2Line2);
        
        //Define Linear Gradient for Windows
        LinearGradient windowLinearGradient = new LinearGradient(
                        .5f,
                        0f,
                        .5f,
                        1f,
                        true,
                        CycleMethod.NO_CYCLE,
                        new Stop(.1f, Color.WHITE),
                        new Stop(.5f, Color.SKYBLUE),
                        new Stop(.6f, Color.WHITE),
                        new Stop(.9f, Color.SKYBLUE));
        
        //Set the Gradients as Fill
        window1.setFill(windowLinearGradient);
        window2.setFill(windowLinearGradient);
        
        
        //Door Handle
        Rectangle handle = new Rectangle(); 
        handle.setX(480); 
        handle.setY(170);
        handle.setWidth(30);
        handle.setHeight(15);
        
        //Line
        Line carLine1 = new Line(); 
        carLine1.setStartX(445);
        carLine1.setStartY(60);
        carLine1.setEndX(445);
        carLine1.setEndY(270);
        carLine1.setStrokeWidth(4);
        carLine1.setStrokeLineCap(StrokeLineCap.ROUND);
        
        
        
        
        //-------Wheels---------
        
        //wheel 1 
        
        
        //Tire 1 
        Ellipse tire1 = new Ellipse(320, 300, 150/2, 150/2); 
        tire1.setFill(Color.BLACK);
        tire1.setStrokeWidth(10);
        
        //Rim 1 
        Ellipse rim1 = new Ellipse(320,300,125/2, 125/2);
        rim1.setFill(Color.SILVER);
        
        //Hub1
        Ellipse hub1 = new Ellipse(320, 300, 40/2, 40/2); 
        hub1.setFill(Color.BLACK);
        
        
        //----------RIM HOLES----------
        
        //Hole 1 
        Path hole1 = new Path(); 
        
        MoveTo holeStart1 = new MoveTo(); 
        holeStart1.setX(310);
        holeStart1.setY(275);
        
        QuadCurveTo quad1Hole1 = new QuadCurveTo(); 
        quad1Hole1.setX(330);
        quad1Hole1.setY(275);
        quad1Hole1.setControlX(320);
        quad1Hole1.setControlY(265);
        
        LineTo line1Hole1 = new LineTo(); 
        line1Hole1.setX(335);
        line1Hole1.setY(250);
        
        QuadCurveTo quad2Hole1 = new QuadCurveTo(); 
        quad2Hole1.setX(305);
        quad2Hole1.setY(250);
        quad2Hole1.setControlX(320);
        quad2Hole1.setControlY(240);
        
        LineTo line2Hole1 = new LineTo(); 
        line2Hole1.setX(310);
        line2Hole1.setY(275);
        
        hole1.getElements().addAll(holeStart1, quad1Hole1, line1Hole1, quad2Hole1, line2Hole1);
        hole1.setFill(Color.WHITE);
        
        //Hole 2
        Path hole2 = new Path(); 
        
        MoveTo holeStart2 = new MoveTo(); 
        holeStart2.setX(345); 
        holeStart2.setY(290);
        
        QuadCurveTo quad1Hole2 = new QuadCurveTo(); 
        quad1Hole2.setX(345);
        quad1Hole2.setY(310);
        quad1Hole2.setControlX(355);
        quad1Hole2.setControlY(300);
        
        LineTo line1Hole2 = new LineTo(); 
        line1Hole2.setX(370);
        line1Hole2.setY(315);
        
        QuadCurveTo quad2Hole2 = new QuadCurveTo(); 
        quad2Hole2.setX(370);
        quad2Hole2.setY(285);
        quad2Hole2.setControlX(380);
        quad2Hole2.setControlY(300);
        
        LineTo line2Hole2 = new LineTo(); 
        line2Hole2.setX(345);
        line2Hole2.setY(290);
     
        hole2.getElements().addAll(holeStart2, quad1Hole2, line1Hole2, quad2Hole2, line2Hole2);
        hole2.setFill(Color.WHITE);
        
        //Hole 3 
           Path hole3 = new Path(); 
        
        MoveTo holeStart3 = new MoveTo(); 
        holeStart3.setX(330);
        holeStart3.setY(325);
        
        QuadCurveTo quad1Hole3 = new QuadCurveTo(); 
        quad1Hole3.setX(310);
        quad1Hole3.setY(325);
        quad1Hole3.setControlX(320);
        quad1Hole3.setControlY(335);
        
        LineTo line1Hole3 = new LineTo(); 
        line1Hole3.setX(305);
        line1Hole3.setY(350);
        
        QuadCurveTo quad2Hole3 = new QuadCurveTo(); 
        quad2Hole3.setX(335);
        quad2Hole3.setY(350);
        quad2Hole3.setControlX(320);
        quad2Hole3.setControlY(360);
        
        LineTo line2Hole3 = new LineTo(); 
        line2Hole3.setX(330);
        line2Hole3.setY(325);
        
        hole1.getElements().addAll(holeStart3, quad1Hole3, line1Hole3, quad2Hole3, line2Hole3);
        hole1.setFill(Color.WHITE);
        
        //Hole 4 
           Path hole4 = new Path(); 
        
        MoveTo holeStart4 = new MoveTo(); 
        holeStart4.setX(295);
        holeStart4.setY(310);
        
        QuadCurveTo quad1Hole4 = new QuadCurveTo(); 
        quad1Hole4.setX(295);
        quad1Hole4.setY(290);
        quad1Hole4.setControlX(285);
        quad1Hole4.setControlY(300);
        
        LineTo line1Hole4 = new LineTo(); 
        line1Hole4.setX(270);
        line1Hole4.setY(285);
        
        QuadCurveTo quad2Hole4 = new QuadCurveTo(); 
        quad2Hole4.setX(270);
        quad2Hole4.setY(315);
        quad2Hole4.setControlX(260);
        quad2Hole4.setControlY(300);
        
        LineTo line2Hole4 = new LineTo(); 
        line2Hole4.setX(295);
        line2Hole4.setY(310);
        
        hole4.getElements().addAll(holeStart4, quad1Hole4, line1Hole4, quad2Hole4, line2Hole4);
        hole4.setFill(Color.WHITE);
        
        //Subtract Holes and Hub from the Rim 
        Shape wheell = Path.subtract(Path.subtract(Path.subtract(Path.subtract(Path.subtract(rim1, hub1),
                                    hole1), hole2), hole3), hole4);
        
        //Wheel 2
        
        //Tire 2
        Ellipse tire2 = new Ellipse(
                650, 
                300, 
                150/2, 
                150/2); 
        tire2.setFill(Color.BLACK);
        tire2.setStrokeWidth(10);
        
        //Rim 2
        Ellipse rim2 = new Ellipse(
                650,
                300,
                125/2, 
                125/2);
        rim2.setFill(Color.SILVER);
        
        //Hub2
        Ellipse hub2 = new Ellipse(
                650, 
                300, 
                40/2, 
                40/2); 
        hub2.setFill(Color.BLACK);
        
        //--------RIM HOLES-------
        
        //hole1
           Path hole5 = new Path(); 
        
        MoveTo holeStart5 = new MoveTo(); 
        holeStart5.setX(640);
        holeStart5.setY(275);
        
        QuadCurveTo quad1Hole5 = new QuadCurveTo(); 
        quad1Hole5.setX(660);
        quad1Hole5.setY(275);
        quad1Hole5.setControlX(650);
        quad1Hole5.setControlY(265);
        
        LineTo line1Hole5 = new LineTo(); 
        line1Hole5.setX(665);
        line1Hole5.setY(250);
        
        QuadCurveTo quad2Hole5 = new QuadCurveTo(); 
        quad2Hole5.setX(635);
        quad2Hole5.setY(250);
        quad2Hole5.setControlX(650);
        quad2Hole5.setControlY(240);
        
        LineTo line2Hole5 = new LineTo(); 
        line2Hole5.setX(640);
        line2Hole5.setY(275);
        
        hole5.getElements().addAll(holeStart5, quad1Hole5, line1Hole5, quad2Hole5, line2Hole5);
        hole5.setFill(Color.WHITE);
        
        //Hole 2 
           Path hole6 = new Path(); 
        
        MoveTo holeStart6 = new MoveTo(); 
        holeStart6.setX(675);
        holeStart6.setY(290);
        
        QuadCurveTo quad1Hole6 = new QuadCurveTo(); 
        quad1Hole6.setX(675);
        quad1Hole6.setY(310);
        quad1Hole6.setControlX(685);
        quad1Hole6.setControlY(300);
        
        LineTo line1Hole6 = new LineTo(); 
        line1Hole6.setX(700);
        line1Hole6.setY(315);
        
        QuadCurveTo quad2Hole6 = new QuadCurveTo(); 
        quad2Hole6.setX(700);
        quad2Hole6.setY(285);
        quad2Hole6.setControlX(710);
        quad2Hole6.setControlY(300);
        
        LineTo line2Hole6 = new LineTo(); 
        line2Hole6.setX(675);
        line2Hole6.setY(290);
        
        hole6.getElements().addAll(holeStart6, quad1Hole6, line1Hole6, quad2Hole6, line2Hole6);
        hole6.setFill(Color.WHITE);
        
        //hole 3 
        
        Path hole7 = new Path(); 
        
        MoveTo holeStart7 = new MoveTo(); 
        holeStart7.setX(660);
        holeStart7.setY(325);
        
        QuadCurveTo quad1Hole7 = new QuadCurveTo(); 
        quad1Hole7.setX(640);
        quad1Hole7.setY(325);
        quad1Hole7.setControlX(650);
        quad1Hole7.setControlY(335);
        
        LineTo line1Hole7 = new LineTo(); 
        line1Hole7.setX(635);//635
        line1Hole7.setY(350);
        
        QuadCurveTo quad2Hole7 = new QuadCurveTo(); 
        quad2Hole7.setX(665);
        quad2Hole7.setY(350);
        quad2Hole7.setControlX(650);
        quad2Hole7.setControlY(360);
        
        LineTo line2Hole7 = new LineTo(); 
        line2Hole7.setX(660);
        line2Hole7.setY(325);
        
        hole7.getElements().addAll(holeStart7, quad1Hole7, line1Hole7, quad2Hole7, line2Hole7);
        hole7.setFill(Color.WHITE);
        
        //hole 4 
        Path hole8 = new Path(); 
        
        MoveTo holeStart8 = new MoveTo(); 
        holeStart8.setX(625);
        holeStart8.setY(310);
        
        QuadCurveTo quad1Hole8 = new QuadCurveTo(); 
        quad1Hole8.setX(625);
        quad1Hole8.setY(290);
        quad1Hole8.setControlX(615);
        quad1Hole8.setControlY(300);
        
        LineTo line1Hole8 = new LineTo(); 
        line1Hole8.setX(600);
        line1Hole8.setY(285);
        
        QuadCurveTo quad2Hole8 = new QuadCurveTo(); 
        quad2Hole8.setX(600);
        quad2Hole8.setY(315);
        quad2Hole8.setControlX(590);
        quad2Hole8.setControlY(300);
        
        LineTo line2Hole8 = new LineTo(); 
        line2Hole8.setX(625);
        line2Hole8.setY(310);
        
        hole8.getElements().addAll(holeStart8, quad1Hole8, line1Hole8, quad2Hole8, line2Hole8);
        hole8.setFill(Color.WHITE);
        
        //Subtract Holes and Hub from the Rim
        
        Shape wheel2 = Path.subtract(Path.subtract(Path.subtract(Path.subtract(Path.subtract(rim2, hub2), 
                                    hole5), hole6), hole7), hole8);
        
        //Define Radial Gradient for Wheels fill color 
        RadialGradient whee1RadialGradient = new RadialGradient(
                        270, 
                        0.8, 
                        0.5,
                        0.5,
                        0.7,
                        true,
                        CycleMethod.NO_CYCLE,
                        new Stop(.5f, Color.WHITE),
                        new Stop (.7f, Color.SILVER),
                        new Stop(.9f, Color.GREY)
        );
        //set Color
        wheell.setFill(whee1RadialGradient); 
        wheel2.setFill(whee1RadialGradient);
        
        //Rotation Button 
        Button btnRotation = new Button("Mover");
        btnRotation.setLayoutX(800); 
        btnRotation.setLayoutY(550);
        btnRotation.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
               wheell.getTransforms().add(new Rotate(20,wheell.getBoundsInParent().getMinX() +
                        (wheell.getBoundsInLocal().getWidth()/2), 
                        wheell.getBoundsInParent().getMinY()+
                       (wheell.getBoundsInLocal().getHeight()/2)));
               
                 wheel2.getTransforms().add(new Rotate(20,wheel2.getBoundsInParent().getMinX() +
                        (wheel2.getBoundsInLocal().getWidth()/2), 
                        wheel2.getBoundsInParent().getMinY()+
                       (wheel2.getBoundsInLocal().getHeight()/2)));
                 
                 InStreet2.setStrokeDashOffset(InStreet2.getStrokeDashOffset() + 10);
            }
        });
        
        //Add all elements to the CAR PATH 
        pathCar.getElements().addAll(start, lineCar1,lineCar2, cubicCar1, cubicCar2,
                                       lineCar3, cubicCar3, lineCar4 );
        
        //Add all Elements to the ROOT NODE 
        
        root.getChildren().addAll(InStreet1, InStreet2, InStreet3, pathCar,carLine1, handle,/*window1window2*/ 
                                     tire1, wheell,tire2, wheel2, btnRotation ); 
        
        //Declare Scene
        Scene scene = new Scene(root, 1000, 600, Color.GRAY); 
        
        //Set Title, Scene and Show
        primaryStage.setTitle("Carrito");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
