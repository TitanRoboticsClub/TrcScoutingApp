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
    private CheckBox leftStartingZoneCB;
    private NumberPicker autoTroughCounter;
    private NumberPicker autoL2branchCounter;
    private NumberPicker autoL3branchCounter;
    private NumberPicker autoL4branchCounter;
    private NumberPicker autoProcessorCounter;
    private NumberPicker autoNet;
    private NumberPicker autoMissedAlgae;
    private NumberPicker autoMissedCoral;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_autonomous_page, container, false);
        matchNum = (EditText) view.findViewById(R.id.matchNum);
        teamNum = (EditText) view.findViewById(R.id.teamNum);
        spectatingTeamSpinner = (Spinner) view.findViewById(R.id.spectatingTeamSpinner);
        matchTypeSpinner = (Spinner) view.findViewById(R.id.matchTypeSpinner);
        leftStartingZoneCB = (CheckBox) view.findViewById(R.id.leftStartingZoneCB);
        autoTroughCounter = (NumberPicker) view.findViewById(R.id.autoTroughCounter);
        autoL2branchCounter = (NumberPicker) view.findViewById(R.id.autoL2branchCounter);
        autoL3branchCounter = (NumberPicker) view.findViewById(R.id.autoL3branchCounter);
        autoL4branchCounter = (NumberPicker) view.findViewById(R.id.autoL4branchCounter);
        autoProcessorCounter = (NumberPicker) view.findViewById(R.id.autoProcessorCounter);
        autoNet = (NumberPicker) view.findViewById(R.id.autoNet);
        autoMissedAlgae = (NumberPicker) view.findViewById(R.id.autoMissedAlgae);
        autoMissedCoral = (NumberPicker) view.findViewById(R.id.autoMissedCoral);
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
        if (fieldData.has("leftStartingZone")) {
            UIUtils.setCheckbox(leftStartingZoneCB, fieldData.getBoolean("leftStartingZone"));
        }
        if (fieldData.has("autoTrough")) {
            UIUtils.setNumberPickerVal(autoTroughCounter, fieldData.getInt("autoTrough"));
        }
        if (fieldData.has("autoL2branch")) {
            UIUtils.setNumberPickerVal(autoL2branchCounter, fieldData.getInt("autoL2branch"));
        }
        if (fieldData.has("autoL3branch")) {
            UIUtils.setNumberPickerVal(autoL3branchCounter, fieldData.getInt("autoL3branch"));
        }
        if (fieldData.has("autoL4branch")) {
            UIUtils.setNumberPickerVal(autoL4branchCounter, fieldData.getInt("autoL4branch"));
        }
        if (fieldData.has("autoProcessor")) {
            UIUtils.setNumberPickerVal(autoProcessorCounter, fieldData.getInt("autoProcessor"));
        }
        if (fieldData.has("autoNet")) {
            UIUtils.setNumberPickerVal(autoNet, fieldData.getInt("autoNet"));
        }
        if (fieldData.has("autoMissedAlgae")) {
            UIUtils.setNumberPickerVal(autoMissedAlgae, fieldData.getInt("autoMissedAlgae"));
        }
        if (fieldData.has("autoMissedCoral")) {
            UIUtils.setNumberPickerVal(autoMissedCoral, fieldData.getInt("autoMissedCoral"));
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
            data.put("leftStartingZone", leftStartingZoneCB.isChecked());
            data.put("autoTrough", autoTroughCounter.getValue());
            data.put("autoL2branch", autoL2branchCounter.getValue());
            data.put("autoL3branch", autoL3branchCounter.getValue());
            data.put("autoL4branch", autoL4branchCounter.getValue());
            data.put("autoProcessor", autoProcessorCounter.getValue());
            data.put("autoNet", autoNet.getValue());
            data.put("autoMissedAlgae", autoMissedAlgae.getValue());
            data.put("autoMissedCoral", autoMissedCoral.getValue());
            return data;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
