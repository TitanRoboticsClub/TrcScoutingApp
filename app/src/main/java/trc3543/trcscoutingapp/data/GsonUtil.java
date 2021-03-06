package trc3543.trcscoutingapp.data;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class GsonUtil
{
    public static ArrayList<MatchInfo> JSONArrayToMatchInfoList(JSONArray input) throws JSONException
    {
        ArrayList<MatchInfo> toReturn = new ArrayList<MatchInfo>();
        for (int i = 0; i < input.length(); i++)
        {
            toReturn.add(JSONObjectToMatchInfo(input.getJSONObject(i)));
        }
        return toReturn;
    }

    public static JSONArray MatchInfoListToJSONArray(List<MatchInfo> input) throws JSONException
    {
        JSONArray toReturn = new JSONArray();
        for (MatchInfo matchInfo : input)
        {
            toReturn.put(MatchInfoToJSONObject(matchInfo));
        }
        return toReturn;
    }

    public static MatchInfo JSONObjectToMatchInfo(JSONObject input)
    {
        Gson gson = new Gson();
        MatchInfo toReturn = gson.fromJson(input.toString(), MatchInfo.class);
        return toReturn;
    }

    public static JSONObject MatchInfoToJSONObject(MatchInfo input) throws JSONException
    {
        Gson gson = new Gson();
        String jsonString = gson.toJson(input);
        JSONObject request = new JSONObject(jsonString);
        return request;
    }

}
