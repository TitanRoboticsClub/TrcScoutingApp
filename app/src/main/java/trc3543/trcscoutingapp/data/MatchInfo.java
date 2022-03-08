package trc3543.trcscoutingapp.data;

import java.io.Serializable;
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class MatchInfo implements Serializable
{
    private static final long serialVersionUID = 1L;

    // misc. variables.
    @SerializedName("uuid")
    public String uuid;

    @SerializedName("matchNumber")
    public Integer matchNumber;

    @SerializedName("teamNumber")
    public Integer teamNumber;

    @SerializedName("alliance")
    public String alliance;

    @SerializedName("matchType")
    public String matchType;

    @SerializedName("taxied")
    public Boolean taxied;

    @SerializedName("quintet")
    public Boolean quintet;

    @SerializedName("breakdown")
    public Boolean breakdown;

    @SerializedName("autoRobotLowGoal")
    public Integer autoRobotLowGoal;

    @SerializedName("autoRobotHighGoal")
    public Integer autoRobotHighGoal;

    @SerializedName("autoHumanLowGoal")
    public Integer autoHumanLowGoal;

    @SerializedName("autoHumanHighGoal")
    public Integer autoHumanHighGoal;

    @SerializedName("teleopPlaystyle")
    public String teleopPlaystyle;

    @SerializedName("terminalMissed")
    public Integer terminalMissed;

    @SerializedName("terminalLowGoal")
    public Integer terminalLowGoal;

    @SerializedName("terminalHighGoal")
    public Integer terminalHighGoal;

    @SerializedName("launchpadMissed")
    public Integer launchpadMissed;

    @SerializedName("launchpadLowGoal")
    public Integer launchpadLowGoal;

    @SerializedName("launchpadHighGoal")
    public Integer launchpadHighGoal;

    @SerializedName("otherMissed")
    public Integer otherMissed;

    @SerializedName("otherLowGoal")
    public Integer otherLowGoal;

    @SerializedName("otherHighGoal")
    public Integer otherHighGoal;

    @SerializedName("fouls")
    public Integer fouls;

    @SerializedName("techFouls")
    public Integer techFouls;

    @SerializedName("hang")
    public String hang;

    @SerializedName("blockedHang")
    public Boolean blockedHang;

    @SerializedName("yellowCard1")
    public Boolean yellowCard1;

    @SerializedName("yellowCard2")
    public Boolean yellowCard2;

    @SerializedName("finalAllianceScore")
    public Integer finalAllianceScore;

    @SerializedName("finalWLT")
    public String finalWLT;

    @SerializedName("cargoBonus")
    public Boolean cargoBonus;

    @SerializedName("hangBonus")
    public Boolean hangBonus;

    @SerializedName("notes")
    public String notes;



    public JSONObject toJSONObject() throws JSONException
    {
        return new JSONObject(new Gson().toJson(this));
    }

    public static MatchInfo fromMultipleJSONObjects(JSONObject... fragmentJSONObjects)
            throws JSONException
    {
        JSONObject head = new JSONObject();

        for (JSONObject fragmentJSONObject : fragmentJSONObjects)
        {
            if (fragmentJSONObject == null)
                continue;
            Iterator<String> keyIterator = fragmentJSONObject.keys();
            while (keyIterator.hasNext()) {
                String key = keyIterator.next();
                Object value = fragmentJSONObject.get(key);
                head.put(key, value);
            }
        }

        Gson gson = new Gson();
        MatchInfo toReturn = gson.fromJson(head.toString(), MatchInfo.class);
        return toReturn;
    }

    private boolean checkAnyNull(Object... args)
    {
        for (Object cur : args)
        {
            if (cur == null)
            {
                return true;
            }
        }
        return false;
    }

    public boolean allNeededFieldsPopulated()
    {
        return !checkAnyNull(matchNumber, teamNumber);
    }

    public String getDisplayString()
    {
        return String.format("Match # %d (%s) Team: %d", matchNumber, matchType, teamNumber);
    }

    public String getCsvString()
    {
        CsvOrder csvOrder = new CsvOrder(matchNumber,teamNumber,matchType,alliance,taxied,quintet,breakdown,autoRobotLowGoal,autoRobotHighGoal,autoHumanLowGoal,autoHumanHighGoal,teleopPlaystyle,terminalMissed,terminalLowGoal,terminalHighGoal,launchpadMissed,launchpadLowGoal,launchpadHighGoal,otherMissed,otherLowGoal,otherHighGoal,fouls,techFouls,hang,blockedHang,yellowCard1,yellowCard2,finalAllianceScore,finalWLT,cargoBonus,hangBonus,notes);
        return csvOrder.csvString;
    }

    @Override
    public String toString()
    {
        return getDisplayString();
    }

    private class CsvOrder
    {
        public String csvString;
        public CsvOrder(Object... params)
        {
            this.csvString = "";
            for (Object s : params)
            {
                if (s != null)
                {
                    boolean isStr = s instanceof String;
                    if (isStr)
                    {
                        this.csvString += "\"";
                    }
                    this.csvString += s.toString();
                    if (isStr)
                    {
                        this.csvString += "\"";
                    }
                }
                this.csvString += ",";
            }
        }
    }
}

