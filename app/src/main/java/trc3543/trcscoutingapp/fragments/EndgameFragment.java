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
    private Spinner finalStateSpinner;
    private CheckBox trapPointCB;
    private CheckBox harmonizedCB;
    private CheckBox highNoteCB;
    private CheckBox melodyCB;
    private CheckBox ensembleCB;
    private CheckBox robotBrokeDownCB;
    private CheckBox yellowCard1CB;
    private CheckBox yellowCard2CB;
    private EditText finalAllianceScoreInt;
    private Spinner finalLWTSpinner;
    private EditText notesET;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_endgame_page, container, false);
        finalStateSpinner = (Spinner) view.findViewById(R.id.finalStateSpinner);
        trapPointCB = (CheckBox) view.findViewById(R.id.trapPointCB);
        harmonizedCB = (CheckBox) view.findViewById(R.id.harmonizedCB);
        highNoteCB = (CheckBox) view.findViewById(R.id.highNoteCB);
        melodyCB = (CheckBox) view.findViewById(R.id.melodyCB);
        ensembleCB = (CheckBox) view.findViewById(R.id.ensembleCB);
        robotBrokeDownCB = (CheckBox) view.findViewById(R.id.robotBrokeDownCB);
        yellowCard1CB = (CheckBox) view.findViewById(R.id.yellowCard1CB);
        yellowCard2CB = (CheckBox) view.findViewById(R.id.yellowCard2CB);
        finalAllianceScoreInt = (EditText) view.findViewById(R.id.finalAllianceScoreInt);
        finalLWTSpinner = (Spinner) view.findViewById(R.id.finalLWTSpinner);
        notesET = (EditText) view.findViewById(R.id.notesET);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
        if (fieldData.has("finalState")) {
            UIUtils.setSpinnerByTextValue(finalStateSpinner, fieldData.getString("finalState"));
        }
        if (fieldData.has("trapPoint")) {
            UIUtils.setCheckbox(trapPointCB, fieldData.getBoolean("trapPoint"));
        }
        if (fieldData.has("harmonized")) {
            UIUtils.setCheckbox(harmonizedCB, fieldData.getBoolean("harmonized"));
        }
        if (fieldData.has("highNote")) {
            UIUtils.setCheckbox(highNoteCB, fieldData.getBoolean("highNote"));
        }
        if (fieldData.has("melody")) {
            UIUtils.setCheckbox(melodyCB, fieldData.getBoolean("melody"));
        }
        if (fieldData.has("ensemble")) {
            UIUtils.setCheckbox(ensembleCB, fieldData.getBoolean("ensemble"));
        }
        if (fieldData.has("robotBrokeDown")) {
            UIUtils.setCheckbox(robotBrokeDownCB, fieldData.getBoolean("robotBrokeDown"));
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
            data.put("finalState", finalStateSpinner.getSelectedItem().toString());
            data.put("trapPoint", trapPointCB.isChecked());
            data.put("harmonized", harmonizedCB.isChecked());
            data.put("highNote", highNoteCB.isChecked());
            data.put("melody", melodyCB.isChecked());
            data.put("ensemble", ensembleCB.isChecked());
            data.put("robotBrokeDown", robotBrokeDownCB.isChecked());
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
