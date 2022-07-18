package Demo_CloseWindow;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertWindow {
    public static Boolean ansver;

    public static Boolean display(String title, String mc) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        Label label = new Label(mc);

        Button button = new Button("yes");
        Button button1 = new Button("no");
        button.setOnMouseClicked(e -> {
            ansver = true;
            stage.close();
        });
        button1.setOnMouseClicked(e -> {
            ansver = false;
            stage.close();
        });

        VBox vbox = new VBox();
        vbox.getChildren().addAll(label, button, button1);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 100, 100);

        stage.setTitle(title);
        stage.setScene(scene);
        stage.showAndWait();

        return ansver;
    }
}
