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
    private CheckBox teleopScoredConesCB;
    private CheckBox teleopScoredCubesCB;
    private NumberPicker teleopGoalsLowPicker;
    private NumberPicker teleopGoalsMedPicker;
    private NumberPicker teleopGoalsHighPicker;
    private NumberPicker teleopLinksPicker;
    private Spinner teleopPlaystyleSpinner;
    private NumberPicker foulsCounter;
    private NumberPicker techFoulsCounter;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_teleop_page, container, false);
        teleopScoredConesCB = (CheckBox) view.findViewById(R.id.teleopScoredConesCB);
        teleopScoredCubesCB = (CheckBox) view.findViewById(R.id.teleopScoredCubesCB);
        teleopGoalsLowPicker = (NumberPicker) view.findViewById(R.id.teleopGoalsLowPicker);
        teleopGoalsMedPicker = (NumberPicker) view.findViewById(R.id.teleopGoalsMedPicker);
        teleopGoalsHighPicker = (NumberPicker) view.findViewById(R.id.teleopGoalsHighPicker);
        teleopLinksPicker = (NumberPicker) view.findViewById(R.id.teleopLinksPicker);
        teleopPlaystyleSpinner = (Spinner) view.findViewById(R.id.teleopPlaystyleSpinner);
        foulsCounter = (NumberPicker) view.findViewById(R.id.foulsCounter);
        techFoulsCounter = (NumberPicker) view.findViewById(R.id.techFoulsCounter);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
        if (fieldData.has("teleopScoredCones")) {
            UIUtils.setCheckbox(teleopScoredConesCB, fieldData.getBoolean("teleopScoredCones"));
        }
        if (fieldData.has("teleopScoredCubes")) {
            UIUtils.setCheckbox(teleopScoredCubesCB, fieldData.getBoolean("teleopScoredCubes"));
        }
        if (fieldData.has("teleopGoalsLow")) {
            UIUtils.setNumberPickerVal(teleopGoalsLowPicker, fieldData.getInt("teleopGoalsLow"));
        }
        if (fieldData.has("teleopGoalsMed")) {
            UIUtils.setNumberPickerVal(teleopGoalsMedPicker, fieldData.getInt("teleopGoalsMed"));
        }
        if (fieldData.has("teleopGoalsHigh")) {
            UIUtils.setNumberPickerVal(teleopGoalsHighPicker, fieldData.getInt("teleopGoalsHigh"));
        }
        if (fieldData.has("teleopLinks")) {
            UIUtils.setNumberPickerVal(teleopLinksPicker, fieldData.getInt("teleopLinks"));
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
            data.put("teleopScoredCones", teleopScoredConesCB.isChecked());
            data.put("teleopScoredCubes", teleopScoredCubesCB.isChecked());
            data.put("teleopGoalsLow", teleopGoalsLowPicker.getValue());
            data.put("teleopGoalsMed", teleopGoalsMedPicker.getValue());
            data.put("teleopGoalsHigh", teleopGoalsHighPicker.getValue());
            data.put("teleopLinks", teleopLinksPicker.getValue());
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
