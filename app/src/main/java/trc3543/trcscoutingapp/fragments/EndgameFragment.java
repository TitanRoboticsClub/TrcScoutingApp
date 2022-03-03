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

public class EndgameFragment extends AbstractPageFragment
{
    private CheckBox breakdownCB;
    private Spinner hangSpinner;
    private CheckBox blockedHangCB;
    private CheckBox yellowCard1CB;
    private CheckBox yellowCard2CB;
    private EditText finalAllianceScoreInt;
    private Spinner finalLWTSpinner;
    private CheckBox cargoBonusCB;
    private CheckBox hangBonusCB;
    private EditText notesET;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_endgame_page, container, false);
        breakdownCB = (CheckBox) view.findViewById(R.id.breakdownCB);
        hangSpinner = (Spinner) view.findViewById(R.id.hangSpinner);
        blockedHangCB = (CheckBox) view.findViewById(R.id.blockedHangCB);
        yellowCard1CB = (CheckBox) view.findViewById(R.id.yellowCard1CB);
        yellowCard2CB = (CheckBox) view.findViewById(R.id.yellowCard2CB);
        finalAllianceScoreInt = (EditText) view.findViewById(R.id.finalAllianceScoreInt);
        finalLWTSpinner = (Spinner) view.findViewById(R.id.finalLWTSpinner);
        cargoBonusCB = (CheckBox) view.findViewById(R.id.cargoBonusCB);
        hangBonusCB = (CheckBox) view.findViewById(R.id.hangBonusCB);
        notesET = (EditText) view.findViewById(R.id.notesET);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
        if (fieldData.has("breakdown")) {
            UIUtils.setCheckbox(breakdownCB, fieldData.getBoolean("breakdown"));
        }
        if (fieldData.has("hang")) {
            UIUtils.setSpinnerByTextValue(hangSpinner, fieldData.getString("hang"));
        }
        if (fieldData.has("blockedHang")) {
            UIUtils.setCheckbox(blockedHangCB, fieldData.getBoolean("blockedHang"));
        }
        if (fieldData.has("yellowCard1")) {
            UIUtils.setCheckbox(yellowCard1CB, fieldData.getBoolean("yellowCard1"));
        }
        if (fieldData.has("yellowCard2")) {
            UIUtils.setCheckbox(yellowCard2CB, fieldData.getBoolean("yellowCard2"));
        }
        if (fieldData.has("finalAllianceScore")) {
            UIUtils.setEditTextValue(finalAllianceScoreInt, fieldData.getInt("finalAllianceScore"));
        }
        if (fieldData.has("finalWLT")) {
            UIUtils.setSpinnerByTextValue(finalLWTSpinner, fieldData.getString("finalWLT"));
        }
        if (fieldData.has("cargoBonus")) {
            UIUtils.setCheckbox(cargoBonusCB, fieldData.getBoolean("cargoBonus"));
        }
        if (fieldData.has("hangBonus")) {
            UIUtils.setCheckbox(hangBonusCB, fieldData.getBoolean("hangBonus"));
        }
        if (fieldData.has("notes")) {
            UIUtils.setEditTextValue(notesET, fieldData.getString("notes"));
        }
    }

    @Override
    public JSONObject getFields()
    {
        try
        {
            JSONObject data = new JSONObject();
            data.put("breakdown", breakdownCB.isChecked());
            data.put("hang", hangSpinner.getSelectedItem().toString());
            data.put("blockedHang", blockedHangCB.isChecked());
            data.put("yellowCard1", yellowCard1CB.isChecked());
            data.put("yellowCard2", yellowCard2CB.isChecked());
            data.put("finalAllianceScore", Integer.parseInt(UIUtils.getEditTextValue(finalAllianceScoreInt)));
            data.put("finalWLT", finalLWTSpinner.getSelectedItem().toString());
            data.put("cargoBonus", cargoBonusCB.isChecked());
            data.put("hangBonus", hangBonusCB.isChecked());
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
