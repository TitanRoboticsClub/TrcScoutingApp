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
    private CheckBox initLineCrossedCB;
    private CheckBox quintetCB;
    private NumberPicker autoRobotLowGoalCounter;
    private NumberPicker autoRobotHighGoalCounter;
    private NumberPicker autoHumanLowGoalCounter;
    private NumberPicker autoHumanHighGoalCounter;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_autonomous_page, container, false);
        matchNum = (EditText) view.findViewById(R.id.matchNum);
        teamNum = (EditText) view.findViewById(R.id.teamNum);
        spectatingTeamSpinner = (Spinner) view.findViewById(R.id.spectatingTeamSpinner);
        matchTypeSpinner = (Spinner) view.findViewById(R.id.matchTypeSpinner);
        initLineCrossedCB = (CheckBox) view.findViewById(R.id.initLineCrossedCB);
        quintetCB = (CheckBox) view.findViewById(R.id.quintetCB);
        autoRobotLowGoalCounter = (NumberPicker) view.findViewById(R.id.autoRobotLowGoalCounter);
        autoRobotHighGoalCounter = (NumberPicker) view.findViewById(R.id.autoRobotHighGoalCounter);
        autoHumanLowGoalCounter = (NumberPicker) view.findViewById(R.id.autoHumanLowGoalCounter);
        autoHumanHighGoalCounter = (NumberPicker) view.findViewById(R.id.autoHumanHighGoalCounter);
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
        if (fieldData.has("taxied")) {
            UIUtils.setCheckbox(initLineCrossedCB, fieldData.getBoolean("taxied"));
        }
        if (fieldData.has("quintet")) {
            UIUtils.setCheckbox(quintetCB, fieldData.getBoolean("quintet"));
        }
        if (fieldData.has("autoRobotLowGoal")) {
            UIUtils.setNumberPickerVal(autoRobotLowGoalCounter, fieldData.getInt("autoRobotLowGoal"));
        }
        if (fieldData.has("autoRobotHighGoal")) {
            UIUtils.setNumberPickerVal(autoRobotHighGoalCounter, fieldData.getInt("autoRobotHighGoal"));
        }
        if (fieldData.has("autoHumanLowGoal")) {
            UIUtils.setNumberPickerVal(autoHumanLowGoalCounter, fieldData.getInt("autoHumanLowGoal"));
        }
        if (fieldData.has("autoHumanHighGoal")) {
            UIUtils.setNumberPickerVal(autoHumanHighGoalCounter, fieldData.getInt("autoHumanHighGoal"));
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
            data.put("taxied", initLineCrossedCB.isChecked());
            data.put("quintet", quintetCB.isChecked());
            data.put("autoRobotLowGoal", autoRobotLowGoalCounter.getValue());
            data.put("autoRobotHighGoal", autoRobotHighGoalCounter.getValue());
            data.put("autoHumanLowGoal", autoHumanLowGoalCounter.getValue());
            data.put("autoHumanHighGoal", autoHumanHighGoalCounter.getValue());
            return data;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
