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

    @SerializedName("preloaded")
    public String preloaded;

    @SerializedName("pickedHomeZoneNotes")
    public Boolean pickedHomeZoneNotes;

    @SerializedName("pickedMiddleZoneNotes")
    public Boolean pickedMiddleZoneNotes;

    @SerializedName("scoredSpeakerNotes")
    public Integer scoredSpeakerNotes;

    @SerializedName("scoredAmpNotes")
    public Integer scoredAmpNotes;

    @SerializedName("autoMissedShots")
    public Integer autoMissedShots;

    @SerializedName("providedHumanPlayer")
    public String providedHumanPlayer;

    @SerializedName("amplifiedCount")
    public Integer amplifiedCount;

    @SerializedName("pickedNotesFromFloor")
    public Integer pickedNotesFromFloor;

    @SerializedName("pickedNotesFromWall")
    public Integer pickedNotesFromWall;

    @SerializedName("scoredNotesSpeakerUnamplified")
    public Integer scoredNotesSpeakerUnamplified;

    @SerializedName("scoredNotesSpeakerAmplified")
    public Integer scoredNotesSpeakerAmplified;

    @SerializedName("scoredNotesAmplifier")
    public Integer scoredNotesAmplifier;

    @SerializedName("teleopMissedShots")
    public Integer teleopMissedShots;

    @SerializedName("coopertitionPoint")
    public Boolean coopertitionPoint;

    @SerializedName("teleopPlaystyle")
    public String teleopPlaystyle;

    @SerializedName("fouls")
    public Integer fouls;

    @SerializedName("techFouls")
    public Integer techFouls;

    @SerializedName("finalState")
    public String finalState;

    @SerializedName("trapPoint")
    public Boolean trapPoint;

    @SerializedName("harmonized")
    public Boolean harmonized;

    @SerializedName("highNote")
    public Boolean highNote;

    @SerializedName("melody")
    public Boolean melody;

    @SerializedName("ensemble")
    public Boolean ensemble;

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
        CsvOrder csvOrder = new CsvOrder(matchNumber,teamNumber,matchType,alliance,leftStartingZone,preloaded,pickedHomeZoneNotes,pickedMiddleZoneNotes,scoredSpeakerNotes,scoredAmpNotes,autoMissedShots,providedHumanPlayer,amplifiedCount,pickedNotesFromFloor,pickedNotesFromWall,scoredNotesSpeakerUnamplified,scoredNotesSpeakerAmplified,scoredNotesAmplifier,teleopMissedShots,coopertitionPoint,teleopPlaystyle,fouls,techFouls,finalState,trapPoint,harmonized,highNote,melody,ensemble,robotBrokeDown,yellowCard1,yellowCard2,finalAllianceScore,finalWLT,notes);
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

