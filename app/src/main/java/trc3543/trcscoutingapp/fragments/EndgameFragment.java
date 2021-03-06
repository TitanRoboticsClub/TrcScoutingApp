package trc3543.trcscoutingapp.fragments;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import trc3543.trcscoutingapp.R;
import trc3543.trcscoutingapp.uiutil.UIUtils;

import org.json.JSONException;
import org.json.JSONObject;

public class EndgameFragment extends AbstractPageFragment
{
    private CheckBox parkedCB;
    private CheckBox hangingCB;
    private CheckBox supportingCB;
    private CheckBox levelCB;
    private EditText notesET;
    private Button confirmButton;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_endgame_page, container, false);
        parkedCB = (CheckBox) view.findViewById(R.id.endgameParkedCB);
        hangingCB = (CheckBox) view.findViewById(R.id.endgameHangingCB);
        supportingCB = (CheckBox) view.findViewById(R.id.endgameSupportingMechanismCB);
        levelCB = (CheckBox) view.findViewById(R.id.endgameLevelCB);
        notesET = (EditText) view.findViewById(R.id.gameNotes);
        confirmButton = (Button) view.findViewById(R.id.btnConfirm);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
        if (fieldData.has("generatorSwitchParked"))
            UIUtils.setCheckbox(parkedCB, fieldData.getBoolean("generatorSwitchParked"));
        if (fieldData.has("generatorSwitchHanging"))
            UIUtils.setCheckbox(hangingCB, fieldData.getBoolean("generatorSwitchHanging"));
        if (fieldData.has("generatorSwitchSupportingMechanism"))
            UIUtils.setCheckbox(supportingCB, fieldData.getBoolean("generatorSwitchSupportingMechanism"));
        if (fieldData.has("generatorSwitchLevel"))
            UIUtils.setCheckbox(levelCB, fieldData.getBoolean("generatorSwitchLevel"));
        if (fieldData.has("notes"))
            UIUtils.setEditTextValue(notesET, fieldData.getString("notes"));
    }

    @Override
    public JSONObject getFields()
    {
        try
        {
            JSONObject data = new JSONObject();
            data.put("generatorSwitchParked", parkedCB.isChecked());
            data.put("generatorSwitchHanging", hangingCB.isChecked());
            data.put("generatorSwitchSupportingMechanism", supportingCB.isChecked());
            data.put("generatorSwitchLevel", levelCB.isChecked());
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