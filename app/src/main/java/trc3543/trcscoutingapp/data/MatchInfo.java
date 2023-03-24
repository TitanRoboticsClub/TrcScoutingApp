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

    @SerializedName("leftCommunity")
    public Boolean leftCommunity;

    @SerializedName("preloaded")
    public String preloaded;

    @SerializedName("autoScoredLow")
    public Integer autoScoredLow;

    @SerializedName("autoScoredMed")
    public Integer autoScoredMed;

    @SerializedName("autoScoredHigh")
    public Integer autoScoredHigh;

    @SerializedName("autoEngagedDockedState")
    public String autoEngagedDockedState;

    @SerializedName("teleopScoredCones")
    public Boolean teleopScoredCones;

    @SerializedName("teleopScoredCubes")
    public Boolean teleopScoredCubes;

    @SerializedName("teleopGoalsLow")
    public Integer teleopGoalsLow;

    @SerializedName("teleopGoalsMed")
    public Integer teleopGoalsMed;

    @SerializedName("teleopGoalsHigh")
    public Integer teleopGoalsHigh;

    @SerializedName("teleopMissedAttempts")
    public Integer teleopMissedAttempts;

    @SerializedName("teleopLinks")
    public Integer teleopLinks;

    @SerializedName("teleopPlaystyle")
    public String teleopPlaystyle;

    @SerializedName("fouls")
    public Integer fouls;

    @SerializedName("techFouls")
    public Integer techFouls;

    @SerializedName("endgameRobotState")
    public String endgameRobotState;

    @SerializedName("endgameSustainabilityBonus")
    public Boolean endgameSustainabilityBonus;

    @SerializedName("endgameCoopertitionBonus")
    public Boolean endgameCoopertitionBonus;

    @SerializedName("endgameActivationBonus")
    public Boolean endgameActivationBonus;

    @SerializedName("robotBrokeDown")
    public Boolean robotBrokeDown;

    @SerializedName("yellowCard1")
    public Boolean yellowCard1;

    @SerializedName("yellowCard2")
    public Boolean yellowCard2;

    @SerializedName("finalAllianceScore")
    public Integer finalAllianceScore;

    @SerializedName("finalWLT")
    public String finalWLT;

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
        CsvOrder csvOrder = new CsvOrder(matchNumber,teamNumber,matchType,alliance,leftCommunity,preloaded,autoScoredLow,autoScoredMed,autoScoredHigh,autoEngagedDockedState,teleopScoredCones,teleopScoredCubes,teleopGoalsLow,teleopGoalsMed,teleopGoalsHigh,teleopMissedAttempts,teleopLinks,teleopPlaystyle,fouls,techFouls,robotBrokeDown,endgameRobotState,endgameSustainabilityBonus,endgameCoopertitionBonus,endgameActivationBonus,yellowCard1,yellowCard2,finalAllianceScore,finalWLT,notes);
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

