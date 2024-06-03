package be.odisee.gemiddeldeoplossing;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GetallenController {
    private GetallenVerzameling deVerzameling;
    /** Bewaart een verwijzing naar het model dat in de Application class staat. Zo kunnen meerdere controllers dezelfde data gebruiken
     * @param model de getallenverzameling
     */
    public void setModel(GetallenVerzameling model) {
        deVerzameling = model;
    }

    @FXML
    private Label lblGemiddelde;
    @FXML
    private TextField txtGetal;

    @FXML
    protected void onAddClick() {
        try {
            deVerzameling.add(Integer.parseInt(txtGetal.getText()));
            lblGemiddelde.setText(""+deVerzameling.gemiddelde());
        }
        catch (NumberFormatException e) {
            lblGemiddelde.setText("Foute invoer");
        }
    }
}