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
    private CheckBox didShallowCageAttemptCB;
    private CheckBox didDeepCageAttemptCB;
    private CheckBox autoRPCB;
    private CheckBox coralRPCB;
    private CheckBox bargeRPCB;
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
        didShallowCageAttemptCB = (CheckBox) view.findViewById(R.id.didShallowCageAttemptCB);
        didDeepCageAttemptCB = (CheckBox) view.findViewById(R.id.didDeepCageAttemptCB);
        autoRPCB = (CheckBox) view.findViewById(R.id.autoRPCB);
        coralRPCB = (CheckBox) view.findViewById(R.id.coralRPCB);
        bargeRPCB = (CheckBox) view.findViewById(R.id.bargeRPCB);
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
        if (fieldData.has("didShallowCageAttempt")) {
            UIUtils.setCheckbox(didShallowCageAttemptCB, fieldData.getBoolean("didShallowCageAttempt"));
        }
        if (fieldData.has("didDeepCageAttempt")) {
            UIUtils.setCheckbox(didDeepCageAttemptCB, fieldData.getBoolean("didDeepCageAttempt"));
        }
        if (fieldData.has("autoRP")) {
            UIUtils.setCheckbox(autoRPCB, fieldData.getBoolean("autoRP"));
        }
        if (fieldData.has("coralRP")) {
            UIUtils.setCheckbox(coralRPCB, fieldData.getBoolean("coralRP"));
        }
        if (fieldData.has("bargeRP")) {
            UIUtils.setCheckbox(bargeRPCB, fieldData.getBoolean("bargeRP"));
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
            data.put("didShallowCageAttempt", didShallowCageAttemptCB.isChecked());
            data.put("didDeepCageAttempt", didDeepCageAttemptCB.isChecked());
            data.put("autoRP", autoRPCB.isChecked());
            data.put("coralRP", coralRPCB.isChecked());
            data.put("bargeRP", bargeRPCB.isChecked());
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
