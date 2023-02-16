package trc3543.trcscoutingapp.fragments;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.travijuu.numberpicker.library.*;

import org.json.JSONException;
import org.json.JSONObject;

import trc3543.trcscoutingapp.R;
import trc3543.trcscoutingapp.uiutil.UIUtils;

public class EndgameFragment extends AbstractPageFragment
{
    private CheckBox robotBrokeDownCB;
    private Spinner endgameRobotStateSpinner;
    private CheckBox endgameSustainabilityBonusCB;
    private CheckBox endgameCoopertitionBonusCB;
    private CheckBox endgameActivationBonusCB;
    private CheckBox yellowCard1CB;
    private CheckBox yellowCard2CB;
    private EditText finalAllianceScoreInt;
    private Spinner finalLWTSpinner;
    private EditText notesET;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_endgame_page, container, false);
        robotBrokeDownCB = (CheckBox) view.findViewById(R.id.robotBrokeDownCB);
        endgameRobotStateSpinner = (Spinner) view.findViewById(R.id.endgameRobotStateSpinner);
        endgameSustainabilityBonusCB = (CheckBox) view.findViewById(R.id.endgameSustainabilityBonusCB);
        endgameCoopertitionBonusCB = (CheckBox) view.findViewById(R.id.endgameCoopertitionBonusCB);
        endgameActivationBonusCB = (CheckBox) view.findViewById(R.id.endgameActivationBonusCB);
        yellowCard1CB = (CheckBox) view.findViewById(R.id.yellowCard1CB);
        yellowCard2CB = (CheckBox) view.findViewById(R.id.yellowCard2CB);
        finalAllianceScoreInt = (EditText) view.findViewById(R.id.finalAllianceScoreInt);
        finalLWTSpinner = (Spinner) view.findViewById(R.id.finalLWTSpinner);
        notesET = (EditText) view.findViewById(R.id.notesET);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
        if (fieldData.has("robotBrokeDown")) {
            UIUtils.setCheckbox(robotBrokeDownCB, fieldData.getBoolean("robotBrokeDown"));
        }
        if (fieldData.has("endgameRobotState")) {
            UIUtils.setSpinnerByTextValue(endgameRobotStateSpinner, fieldData.getString("endgameRobotState"));
        }
        if (fieldData.has("endgameSustainabilityBonus")) {
            UIUtils.setCheckbox(endgameSustainabilityBonusCB, fieldData.getBoolean("endgameSustainabilityBonus"));
        }
        if (fieldData.has("endgameCoopertitionBonus")) {
            UIUtils.setCheckbox(endgameCoopertitionBonusCB, fieldData.getBoolean("endgameCoopertitionBonus"));
        }
        if (fieldData.has("endgameActivationBonus")) {
            UIUtils.setCheckbox(endgameActivationBonusCB, fieldData.getBoolean("endgameActivationBonus"));
        }
        if (fieldData.has("yellowCard1")) {
            UIUtils.setCheckbox(yellowCard1CB, fieldData.getBoolean("yellowCard1"));
        }
        if (fieldData.has("yellowCard2")) {
            UIUtils.setCheckbox(yellowCard2CB, fieldData.getBoolean("yellowCard2"));
        }
        if (fieldData.has("finalAllianceScore")) {
            UIUtils.setEditTextValue(finalAllianceScoreInt, fieldData.getInt("finalAllianceScore"));
        }
        if (fieldData.has("finalWLT")) {
            UIUtils.setSpinnerByTextValue(finalLWTSpinner, fieldData.getString("finalWLT"));
        }
        if (fieldData.has("notes")) {
            UIUtils.setEditTextValue(notesET, fieldData.getString("notes"));
        }
    }

    @Override
    public JSONObject getFields()
    {
        try
        {
            JSONObject data = new JSONObject();
            data.put("robotBrokeDown", robotBrokeDownCB.isChecked());
            data.put("endgameRobotState", endgameRobotStateSpinner.getSelectedItem().toString());
            data.put("endgameSustainabilityBonus", endgameSustainabilityBonusCB.isChecked());
            data.put("endgameCoopertitionBonus", endgameCoopertitionBonusCB.isChecked());
            data.put("endgameActivationBonus", endgameActivationBonusCB.isChecked());
            data.put("yellowCard1", yellowCard1CB.isChecked());
            data.put("yellowCard2", yellowCard2CB.isChecked());
            data.put("finalAllianceScore", Integer.parseInt(UIUtils.getEditTextValue(finalAllianceScoreInt)));
            data.put("finalWLT", finalLWTSpinner.getSelectedItem().toString());
            data.put("notes", UIUtils.getEditTextValue(notesET));
            return data;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
