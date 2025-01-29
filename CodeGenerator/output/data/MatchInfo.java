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

    @SerializedName("leftStartingZone")
    public Boolean leftStartingZone;

    @SerializedName("autoTrough")
    public Integer autoTrough;

    @SerializedName("autoL2branch")
    public Integer autoL2branch;

    @SerializedName("autoL3branch")
    public Integer autoL3branch;

    @SerializedName("autoL4branch")
    public Integer autoL4branch;

    @SerializedName("autoProcessor")
    public Integer autoProcessor;

    @SerializedName("autoNet")
    public Integer autoNet;

    @SerializedName("autoMissedCoral")
    public Integer autoMissedCoral;

    @SerializedName("autoMissedAlgae")
    public Integer autoMissedAlgae;

    @SerializedName("teleopTrough")
    public Integer teleopTrough;

    @SerializedName("teleopPickedFromFloor")
    public Integer teleopPickedFromFloor;

    @SerializedName("teleopPickedFromStation")
    public Integer teleopPickedFromStation;

    @SerializedName("teleopL2")
    public Integer teleopL2;

    @SerializedName("teleopL3")
    public Integer teleopL3;

    @SerializedName("teleopL4")
    public Integer teleopL4;

    @SerializedName("teleopProcessor")
    public Integer teleopProcessor;

    @SerializedName("teleopNet")
    public Integer teleopNet;

    @SerializedName("teleopMissedCoral")
    public Integer teleopMissedCoral;

    @SerializedName("teleopMissedAlgae")
    public Integer teleopMissedAlgae;

    @SerializedName("minorFoul")
    public Integer minorFoul;

    @SerializedName("majorFoul")
    public Integer majorFoul;

    @SerializedName("coopBonus")
    public Boolean coopBonus;

    @SerializedName("playstyle")
    public String playstyle;

    @SerializedName("finalState")
    public String finalState;

    @SerializedName("didShallowCageAttempt")
    public Boolean didShallowCageAttempt;

    @SerializedName("didDeepCageAttempt")
    public Boolean didDeepCageAttempt;

    @SerializedName("autoRP")
    public Boolean autoRP;

    @SerializedName("coralRP")
    public Boolean coralRP;

    @SerializedName("bargeRP")
    public Boolean bargeRP;

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
        CsvOrder csvOrder = new CsvOrder(matchNumber,teamNumber,matchType,alliance,leftStartingZone,autoTrough,autoL2branch,autoL3branch,autoL4branch,autoProcessor,autoNet,autoMissedCoral,autoMissedAlgae,teleopTrough,teleopPickedFromFloor,teleopPickedFromStation,teleopL2,teleopL3,teleopL4,teleopProcessor,teleopNet,teleopMissedCoral,teleopMissedAlgae,minorFoul,majorFoul,coopBonus,playstyle,finalState,didShallowCageAttempt,didDeepCageAttempt,autoRP,coralRP,bargeRP,robotBrokeDown,yellowCard1,yellowCard2,finalAllianceScore,finalWLT,notes);
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

