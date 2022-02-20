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
    private Spinner playStyleSpinner;
    private NumberPicker terminalMissedCounter;
    private NumberPicker terminalLowGoalCounter;
    private NumberPicker terminalHighGoalCounter;
    private NumberPicker launchpadMissedCounter;
    private NumberPicker launchpadLowGoalCounter;
    private NumberPicker launchpadHighGoalCounter;
    private NumberPicker otherMissedCounter;
    private NumberPicker otherLowGoalCounter;
    private NumberPicker otherHighGoalCounter;
    private NumberPicker foulsCounter;
    private NumberPicker techFoulsCounter;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_teleop_page, container, false);
        playStyleSpinner = (Spinner) view.findViewById(R.id.playStyleSpinner);
        terminalMissedCounter = (NumberPicker) view.findViewById(R.id.terminalMissedCounter);
        terminalLowGoalCounter = (NumberPicker) view.findViewById(R.id.terminalLowGoalCounter);
        terminalHighGoalCounter = (NumberPicker) view.findViewById(R.id.terminalHighGoalCounter);
        launchpadMissedCounter = (NumberPicker) view.findViewById(R.id.launchpadMissedCounter);
        launchpadLowGoalCounter = (NumberPicker) view.findViewById(R.id.launchpadLowGoalCounter);
        launchpadHighGoalCounter = (NumberPicker) view.findViewById(R.id.launchpadHighGoalCounter);
        otherMissedCounter = (NumberPicker) view.findViewById(R.id.otherMissedCounter);
        otherLowGoalCounter = (NumberPicker) view.findViewById(R.id.otherLowGoalCounter);
        otherHighGoalCounter = (NumberPicker) view.findViewById(R.id.otherHighGoalCounter);
        foulsCounter = (NumberPicker) view.findViewById(R.id.foulsCounter);
        techFoulsCounter = (NumberPicker) view.findViewById(R.id.techFoulsCounter);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
        if (fieldData.has("teleopPlaystyle")) {
            UIUtils.setSpinnerByTextValue(playStyleSpinner, fieldData.getString("teleopPlaystyle"));
        }
        if (fieldData.has("terminalMissed")) {
            UIUtils.setNumberPickerVal(terminalMissedCounter, fieldData.getInt("terminalMissed"));
        }
        if (fieldData.has("terminalLowGoal")) {
            UIUtils.setNumberPickerVal(terminalLowGoalCounter, fieldData.getInt("terminalLowGoal"));
        }
        if (fieldData.has("terminalHighGoal")) {
            UIUtils.setNumberPickerVal(terminalHighGoalCounter, fieldData.getInt("terminalHighGoal"));
        }
        if (fieldData.has("launchpadMissed")) {
            UIUtils.setNumberPickerVal(launchpadMissedCounter, fieldData.getInt("launchpadMissed"));
        }
        if (fieldData.has("launchpadLowGoal")) {
            UIUtils.setNumberPickerVal(launchpadLowGoalCounter, fieldData.getInt("launchpadLowGoal"));
        }
        if (fieldData.has("launchpadHighGoal")) {
            UIUtils.setNumberPickerVal(launchpadHighGoalCounter, fieldData.getInt("launchpadHighGoal"));
        }
        if (fieldData.has("otherMissed")) {
            UIUtils.setNumberPickerVal(otherMissedCounter, fieldData.getInt("otherMissed"));
        }
        if (fieldData.has("otherLowGoal")) {
            UIUtils.setNumberPickerVal(otherLowGoalCounter, fieldData.getInt("otherLowGoal"));
        }
        if (fieldData.has("otherHighGoal")) {
            UIUtils.setNumberPickerVal(otherHighGoalCounter, fieldData.getInt("otherHighGoal"));
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
            data.put("teleopPlaystyle", playStyleSpinner.getSelectedItem().toString());
            data.put("terminalMissed", terminalMissedCounter.getValue());
            data.put("terminalLowGoal", terminalLowGoalCounter.getValue());
            data.put("terminalHighGoal", terminalHighGoalCounter.getValue());
            data.put("launchpadMissed", launchpadMissedCounter.getValue());
            data.put("launchpadLowGoal", launchpadLowGoalCounter.getValue());
            data.put("launchpadHighGoal", launchpadHighGoalCounter.getValue());
            data.put("otherMissed", otherMissedCounter.getValue());
            data.put("otherLowGoal", otherLowGoalCounter.getValue());
            data.put("otherHighGoal", otherHighGoalCounter.getValue());
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
