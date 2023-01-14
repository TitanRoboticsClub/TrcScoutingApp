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
    private NumberPicker foulsCounter;
    private NumberPicker techFoulsCounter;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_teleop_page, container, false);
        foulsCounter = (NumberPicker) view.findViewById(R.id.foulsCounter);
        techFoulsCounter = (NumberPicker) view.findViewById(R.id.techFoulsCounter);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
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
