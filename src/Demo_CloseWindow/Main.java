package Demo_CloseWindow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Scene scene1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("关闭窗口");
        stage.setOnCloseRequest(e -> {
            e.consume();
            boolean b = AlertWindow.display("测试窗口", "是否关闭窗口");
            if (b == true) {
                stage.close();
            }
        });
        button.setOnMouseClicked(e -> {
            boolean b = AlertWindow.display("测试窗口", "是否关闭窗口");
            if (b == true) {
                stage.close();
            }
        });

        VBox vBox = new VBox();
        vBox.getChildren().add(button);

        scene1 = new Scene(vBox, 200, 200);

        stage.setTitle("Main");
        stage.setScene(scene1);
        stage.show();
    }
}
