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

public class AutonomousFragment extends AbstractPageFragment
{
    private EditText matchNum;
    private EditText teamNum;
    private Spinner spectatingTeamSpinner;
    private Spinner matchTypeSpinner;
    private CheckBox leftCommunityCB;
    private Spinner preloadedSpinner;
    private NumberPicker autoScoredLowSpinner;
    private NumberPicker autoScoredMedSpinner;
    private NumberPicker autoScoredHighSpinner;
    private Spinner autoEngagedDockedStateSpinner;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_autonomous_page, container, false);
        matchNum = (EditText) view.findViewById(R.id.matchNum);
        teamNum = (EditText) view.findViewById(R.id.teamNum);
        spectatingTeamSpinner = (Spinner) view.findViewById(R.id.spectatingTeamSpinner);
        matchTypeSpinner = (Spinner) view.findViewById(R.id.matchTypeSpinner);
        leftCommunityCB = (CheckBox) view.findViewById(R.id.leftCommunityCB);
        preloadedSpinner = (Spinner) view.findViewById(R.id.preloadedSpinner);
        autoScoredLowSpinner = (NumberPicker) view.findViewById(R.id.autoScoredLowSpinner);
        autoScoredMedSpinner = (NumberPicker) view.findViewById(R.id.autoScoredMedSpinner);
        autoScoredHighSpinner = (NumberPicker) view.findViewById(R.id.autoScoredHighSpinner);
        autoEngagedDockedStateSpinner = (Spinner) view.findViewById(R.id.autoEngagedDockedStateSpinner);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
        if (fieldData.has("matchNumber")) {
            UIUtils.setEditTextValue(matchNum, fieldData.getInt("matchNumber"));
        }
        if (fieldData.has("teamNumber")) {
            UIUtils.setEditTextValue(teamNum, fieldData.getInt("teamNumber"));
        }
        if (fieldData.has("alliance")) {
            UIUtils.setSpinnerByTextValue(spectatingTeamSpinner, fieldData.getString("alliance"));
        }
        if (fieldData.has("matchType")) {
            UIUtils.setSpinnerByTextValue(matchTypeSpinner, fieldData.getString("matchType"));
        }
        if (fieldData.has("leftCommunity")) {
            UIUtils.setCheckbox(leftCommunityCB, fieldData.getBoolean("leftCommunity"));
        }
        if (fieldData.has("preloaded")) {
            UIUtils.setSpinnerByTextValue(preloadedSpinner, fieldData.getString("preloaded"));
        }
        if (fieldData.has("autoScoredLow")) {
            UIUtils.setNumberPickerVal(autoScoredLowSpinner, fieldData.getInt("autoScoredLow"));
        }
        if (fieldData.has("autoScoredMed")) {
            UIUtils.setNumberPickerVal(autoScoredMedSpinner, fieldData.getInt("autoScoredMed"));
        }
        if (fieldData.has("autoScoredHigh")) {
            UIUtils.setNumberPickerVal(autoScoredHighSpinner, fieldData.getInt("autoScoredHigh"));
        }
        if (fieldData.has("autoEngagedDockedState")) {
            UIUtils.setSpinnerByTextValue(autoEngagedDockedStateSpinner, fieldData.getString("autoEngagedDockedState"));
        }
    }

    @Override
    public JSONObject getFields()
    {
        try
        {
            JSONObject data = new JSONObject();
            if (!UIUtils.isEditTextEmpty(matchNum)) {
                data.put("matchNumber", Integer.parseInt(UIUtils.getEditTextValue(matchNum)));
            } else {
                UIUtils.launchPopUpMessage(getContext(), "Error", "matchNum cannot be empty!");
                return null;
            }
            if (!UIUtils.isEditTextEmpty(teamNum)) {
                data.put("teamNumber", Integer.parseInt(UIUtils.getEditTextValue(teamNum)));
            } else {
                UIUtils.launchPopUpMessage(getContext(), "Error", "teamNum cannot be empty!");
                return null;
            }
            data.put("alliance", spectatingTeamSpinner.getSelectedItem().toString());
            data.put("matchType", matchTypeSpinner.getSelectedItem().toString());
            data.put("leftCommunity", leftCommunityCB.isChecked());
            data.put("preloaded", preloadedSpinner.getSelectedItem().toString());
            data.put("autoScoredLow", autoScoredLowSpinner.getValue());
            data.put("autoScoredMed", autoScoredMedSpinner.getValue());
            data.put("autoScoredHigh", autoScoredHighSpinner.getValue());
            data.put("autoEngagedDockedState", autoEngagedDockedStateSpinner.getSelectedItem().toString());
            return data;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
