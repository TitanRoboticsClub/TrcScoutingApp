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
    private NumberPicker teleopTroughCounter;
    private NumberPicker teleopL2Counter;
    private NumberPicker teleopL3Counter;
    private NumberPicker teleopL4Counter;
    private NumberPicker teleopProcessorCounter;
    private NumberPicker teleopNetCounter;
    private NumberPicker teleopMissedCoralCounter;
    private NumberPicker teleopMissedAlgaeCounter;
    private NumberPicker minorFoulCounter;
    private NumberPicker majorFoulCounter;
    private CheckBox hasCoopBonus;
    private Spinner playstyleType;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_teleop_page, container, false);
        teleopTroughCounter = (NumberPicker) view.findViewById(R.id.teleopTroughCounter);
        teleopL2Counter = (NumberPicker) view.findViewById(R.id.teleopL2Counter);
        teleopL3Counter = (NumberPicker) view.findViewById(R.id.teleopL3Counter);
        teleopL4Counter = (NumberPicker) view.findViewById(R.id.teleopL4Counter);
        teleopProcessorCounter = (NumberPicker) view.findViewById(R.id.teleopProcessorCounter);
        teleopNetCounter = (NumberPicker) view.findViewById(R.id.teleopNetCounter);
        teleopMissedCoralCounter = (NumberPicker) view.findViewById(R.id.teleopMissedCoralCounter);
        teleopMissedAlgaeCounter = (NumberPicker) view.findViewById(R.id.teleopMissedAlgaeCounter);
        minorFoulCounter = (NumberPicker) view.findViewById(R.id.minorFoulCounter);
        majorFoulCounter = (NumberPicker) view.findViewById(R.id.majorFoulCounter);
        hasCoopBonus = (CheckBox) view.findViewById(R.id.hasCoopBonus);
        playstyleType = (Spinner) view.findViewById(R.id.playstyleType);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
        if (fieldData.has("teleopTrough")) {
            UIUtils.setNumberPickerVal(teleopTroughCounter, fieldData.getInt("teleopTrough"));
        }
        if (fieldData.has("teleopL2")) {
            UIUtils.setNumberPickerVal(teleopL2Counter, fieldData.getInt("teleopL2"));
        }
        if (fieldData.has("teleopL3")) {
            UIUtils.setNumberPickerVal(teleopL3Counter, fieldData.getInt("teleopL3"));
        }
        if (fieldData.has("teleopL4")) {
            UIUtils.setNumberPickerVal(teleopL4Counter, fieldData.getInt("teleopL4"));
        }
        if (fieldData.has("teleopProcessor")) {
            UIUtils.setNumberPickerVal(teleopProcessorCounter, fieldData.getInt("teleopProcessor"));
        }
        if (fieldData.has("teleopNet")) {
            UIUtils.setNumberPickerVal(teleopNetCounter, fieldData.getInt("teleopNet"));
        }
        if (fieldData.has("teleopMissedCoral")) {
            UIUtils.setNumberPickerVal(teleopMissedCoralCounter, fieldData.getInt("teleopMissedCoral"));
        }
        if (fieldData.has("teleopMissedAlgae")) {
            UIUtils.setNumberPickerVal(teleopMissedAlgaeCounter, fieldData.getInt("teleopMissedAlgae"));
        }
        if (fieldData.has("minorFoul")) {
            UIUtils.setNumberPickerVal(minorFoulCounter, fieldData.getInt("minorFoul"));
        }
        if (fieldData.has("majorFoul")) {
            UIUtils.setNumberPickerVal(majorFoulCounter, fieldData.getInt("majorFoul"));
        }
        if (fieldData.has("coopBonus")) {
            UIUtils.setCheckbox(hasCoopBonus, fieldData.getBoolean("coopBonus"));
        }
        if (fieldData.has("playstyle")) {
            UIUtils.setSpinnerByTextValue(playstyleType, fieldData.getString("playstyle"));
        }
    }

    @Override
    public JSONObject getFields()
    {
        try
        {
            JSONObject data = new JSONObject();
            data.put("teleopTrough", teleopTroughCounter.getValue());
            data.put("teleopL2", teleopL2Counter.getValue());
            data.put("teleopL3", teleopL3Counter.getValue());
            data.put("teleopL4", teleopL4Counter.getValue());
            data.put("teleopProcessor", teleopProcessorCounter.getValue());
            data.put("teleopNet", teleopNetCounter.getValue());
            data.put("teleopMissedCoral", teleopMissedCoralCounter.getValue());
            data.put("teleopMissedAlgae", teleopMissedAlgaeCounter.getValue());
            data.put("minorFoul", minorFoulCounter.getValue());
            data.put("majorFoul", majorFoulCounter.getValue());
            data.put("coopBonus", hasCoopBonus.isChecked());
            data.put("playstyle", playstyleType.getSelectedItem().toString());
            return data;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
