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

public class TeleOpFragment extends AbstractPageFragment
{
    private CheckBox providedHumanPlayerCB;
    private NumberPicker amplifiedCountCounter;
    private NumberPicker pickedNotesFromFloorCounter;
    private NumberPicker pickedNotesFromWallCounter;
    private NumberPicker scoredNotesSpeakerUnamplifiedCounter;
    private NumberPicker scoredNotesSpeakerAmplifiedCounter;
    private NumberPicker scoredNotesAmplifierCounter;
    private CheckBox coopertitionPointCB;
    private Spinner teleopPlaystyleSpinner;
    private NumberPicker foulsCounter;
    private NumberPicker techFoulsCounter;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_teleop_page, container, false);
        providedHumanPlayerCB = (CheckBox) view.findViewById(R.id.providedHumanPlayerCB);
        amplifiedCountCounter = (NumberPicker) view.findViewById(R.id.amplifiedCountCounter);
        pickedNotesFromFloorCounter = (NumberPicker) view.findViewById(R.id.pickedNotesFromFloorCounter);
        pickedNotesFromWallCounter = (NumberPicker) view.findViewById(R.id.pickedNotesFromWallCounter);
        scoredNotesSpeakerUnamplifiedCounter = (NumberPicker) view.findViewById(R.id.scoredNotesSpeakerUnamplifiedCounter);
        scoredNotesSpeakerAmplifiedCounter = (NumberPicker) view.findViewById(R.id.scoredNotesSpeakerAmplifiedCounter);
        scoredNotesAmplifierCounter = (NumberPicker) view.findViewById(R.id.scoredNotesAmplifierCounter);
        coopertitionPointCB = (CheckBox) view.findViewById(R.id.coopertitionPointCB);
        teleopPlaystyleSpinner = (Spinner) view.findViewById(R.id.teleopPlaystyleSpinner);
        foulsCounter = (NumberPicker) view.findViewById(R.id.foulsCounter);
        techFoulsCounter = (NumberPicker) view.findViewById(R.id.techFoulsCounter);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
        if (fieldData.has("providedHumanPlayer")) {
            UIUtils.setCheckbox(providedHumanPlayerCB, fieldData.getBoolean("providedHumanPlayer"));
        }
        if (fieldData.has("amplifiedCount")) {
            UIUtils.setNumberPickerVal(amplifiedCountCounter, fieldData.getInt("amplifiedCount"));
        }
        if (fieldData.has("pickedNotesFromFloor")) {
            UIUtils.setNumberPickerVal(pickedNotesFromFloorCounter, fieldData.getInt("pickedNotesFromFloor"));
        }
        if (fieldData.has("pickedNotesFromWall")) {
            UIUtils.setNumberPickerVal(pickedNotesFromWallCounter, fieldData.getInt("pickedNotesFromWall"));
        }
        if (fieldData.has("scoredNotesSpeakerUnamplified")) {
            UIUtils.setNumberPickerVal(scoredNotesSpeakerUnamplifiedCounter, fieldData.getInt("scoredNotesSpeakerUnamplified"));
        }
        if (fieldData.has("scoredNotesSpeakerAmplified")) {
            UIUtils.setNumberPickerVal(scoredNotesSpeakerAmplifiedCounter, fieldData.getInt("scoredNotesSpeakerAmplified"));
        }
        if (fieldData.has("scoredNotesAmplifier")) {
            UIUtils.setNumberPickerVal(scoredNotesAmplifierCounter, fieldData.getInt("scoredNotesAmplifier"));
        }
        if (fieldData.has("coopertitionPoint")) {
            UIUtils.setCheckbox(coopertitionPointCB, fieldData.getBoolean("coopertitionPoint"));
        }
        if (fieldData.has("teleopPlaystyle")) {
            UIUtils.setSpinnerByTextValue(teleopPlaystyleSpinner, fieldData.getString("teleopPlaystyle"));
        }
        if (fieldData.has("fouls")) {
            UIUtils.setNumberPickerVal(foulsCounter, fieldData.getInt("fouls"));
        }
        if (fieldData.has("techFouls")) {
            UIUtils.setNumberPickerVal(techFoulsCounter, fieldData.getInt("techFouls"));
        }
    }

    @Override
    public JSONObject getFields()
    {
        try
        {
            JSONObject data = new JSONObject();
            data.put("providedHumanPlayer", providedHumanPlayerCB.isChecked());
            data.put("amplifiedCount", amplifiedCountCounter.getValue());
            data.put("pickedNotesFromFloor", pickedNotesFromFloorCounter.getValue());
            data.put("pickedNotesFromWall", pickedNotesFromWallCounter.getValue());
            data.put("scoredNotesSpeakerUnamplified", scoredNotesSpeakerUnamplifiedCounter.getValue());
            data.put("scoredNotesSpeakerAmplified", scoredNotesSpeakerAmplifiedCounter.getValue());
            data.put("scoredNotesAmplifier", scoredNotesAmplifierCounter.getValue());
            data.put("coopertitionPoint", coopertitionPointCB.isChecked());
            data.put("teleopPlaystyle", teleopPlaystyleSpinner.getSelectedItem().toString());
            data.put("fouls", foulsCounter.getValue());
            data.put("techFouls", techFoulsCounter.getValue());
            return data;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
