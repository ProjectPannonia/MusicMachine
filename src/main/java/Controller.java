import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableView;

public class Controller {
    @FXML
    private ScrollBar scrollbarChangeAuthor;

    @FXML
    private Label labelActualAuthor;

    @FXML
    private Label labelActualAlbum;

    @FXML
    private TableView<?> tableTrackList;

    @FXML
    private Button buttonPlay;

    @FXML
    private Button buttonPause;

    @FXML
    private Button buttonStop;

    @FXML
    private Button buttonPreviousSong;

    @FXML
    private Button buttonNextSong;

    @FXML
    private Button buttonExit;


    @FXML
    public void quit(ActionEvent e) {
        Platform.exit();
    }
}
