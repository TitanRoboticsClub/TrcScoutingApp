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
    private EditText finalAllianceScoreInt;
    private Spinner finalLWTSpinner;
    private EditText notesET;

    @Override
    public void instantiateViews(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_endgame_page, container, false);
        finalAllianceScoreInt = (EditText) view.findViewById(R.id.finalAllianceScoreInt);
        finalLWTSpinner = (Spinner) view.findViewById(R.id.finalLWTSpinner);
        notesET = (EditText) view.findViewById(R.id.notesET);
    }

    @Override
    public void setFields(JSONObject fieldData) throws JSONException
    {
        if (fieldData.has("finalAllianceScore")) {
            UIUtils.setEditTextValue(finalAllianceScoreInt, fieldData.getInt("finalAllianceScore"));
        }
        if (fieldData.has("finalWLT")) {
            UIUtils.setSpinnerByTextValue(finalLWTSpinner, fieldData.getString("finalWLT"));
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
            data.put("finalAllianceScore", Integer.parseInt(UIUtils.getEditTextValue(finalAllianceScoreInt)));
            data.put("finalWLT", finalLWTSpinner.getSelectedItem().toString());
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
