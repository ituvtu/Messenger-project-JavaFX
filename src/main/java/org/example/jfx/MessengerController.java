package org.example.jfx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MessengerController {
    public TextField searchField;
    public Label selectedChatLabel;
    public ListView chatList;
    public ListView messageList;
    public TextField messageField;
    public HBox navBar;
    public Button sendButton;
    public VBox mainContainer;
    public SplitPane mainVertDivider;
    public Label chatListLabel;
    public VBox selectedChat;
    public ImageView userImage;
    public VBox Chats;
    public HBox chatBar;
    public HBox chatListBar;
    public Button backButton;
    public Button forwardButton;
    public Button OptionsAndOther;
    public Button ArrowBack;
    public Button ArrowForward;
    @FXML private Button minimizeButton;
    @FXML private Button maximizeButton;
    @FXML private Button closeButton;

    @FXML
    private void minimizeWindow() {
        Stage stage = (Stage) minimizeButton.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void maximizeWindow() {
        Stage stage = (Stage) maximizeButton.getScene().getWindow();
        if (stage.isMaximized()) {
            stage.setMaximized(false);
        } else {
            stage.setMaximized(true);
        }
    }

    @FXML
    private void closeWindow() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}