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
    private Spinner preloadedSpinner;
    private NumberPicker pickedHomeZoneNotesCounter;
    private NumberPicker pickedMiddleZoneNotesCounter;
    private NumberPicker scoredSpeakerNotesCounter;
    private NumberPicker scoredAmpNotesCounter;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_autonomous_page, container, false);
        matchNum = (EditText) view.findViewById(R.id.matchNum);
        teamNum = (EditText) view.findViewById(R.id.teamNum);
        spectatingTeamSpinner = (Spinner) view.findViewById(R.id.spectatingTeamSpinner);
        matchTypeSpinner = (Spinner) view.findViewById(R.id.matchTypeSpinner);
        leftStartingZoneCB = (CheckBox) view.findViewById(R.id.leftStartingZoneCB);
        preloadedSpinner = (Spinner) view.findViewById(R.id.preloadedSpinner);
        pickedHomeZoneNotesCounter = (NumberPicker) view.findViewById(R.id.pickedHomeZoneNotesCounter);
        pickedMiddleZoneNotesCounter = (NumberPicker) view.findViewById(R.id.pickedMiddleZoneNotesCounter);
        scoredSpeakerNotesCounter = (NumberPicker) view.findViewById(R.id.scoredSpeakerNotesCounter);
        scoredAmpNotesCounter = (NumberPicker) view.findViewById(R.id.scoredAmpNotesCounter);
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
        if (fieldData.has("preloaded")) {
            UIUtils.setSpinnerByTextValue(preloadedSpinner, fieldData.getString("preloaded"));
        }
        if (fieldData.has("pickedHomeZoneNotes")) {
            UIUtils.setNumberPickerVal(pickedHomeZoneNotesCounter, fieldData.getInt("pickedHomeZoneNotes"));
        }
        if (fieldData.has("pickedMiddleZoneNotes")) {
            UIUtils.setNumberPickerVal(pickedMiddleZoneNotesCounter, fieldData.getInt("pickedMiddleZoneNotes"));
        }
        if (fieldData.has("scoredSpeakerNotes")) {
            UIUtils.setNumberPickerVal(scoredSpeakerNotesCounter, fieldData.getInt("scoredSpeakerNotes"));
        }
        if (fieldData.has("scoredAmpNotes")) {
            UIUtils.setNumberPickerVal(scoredAmpNotesCounter, fieldData.getInt("scoredAmpNotes"));
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
            data.put("preloaded", preloadedSpinner.getSelectedItem().toString());
            data.put("pickedHomeZoneNotes", pickedHomeZoneNotesCounter.getValue());
            data.put("pickedMiddleZoneNotes", pickedMiddleZoneNotesCounter.getValue());
            data.put("scoredSpeakerNotes", scoredSpeakerNotesCounter.getValue());
            data.put("scoredAmpNotes", scoredAmpNotesCounter.getValue());
            return data;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
