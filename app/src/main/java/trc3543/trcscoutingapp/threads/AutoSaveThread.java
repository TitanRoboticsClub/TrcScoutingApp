/*
 * Copyright (c) 2017-2019 Titan Robotics Club
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package trc3543.trcscoutingapp.threads;

import android.util.Log;

import java.io.IOException;
import java.util.List;

import trc3543.trcscoutingapp.data.AppSettings;
import trc3543.trcscoutingapp.data.IOUtils;
import trc3543.trcscoutingapp.data.MatchInfo;

public class AutoSaveThread
{
    private AppSettings appSettings;
    private List<MatchInfo> matchList;

    public AutoSaveThread(AppSettings appSettings, List<MatchInfo> matchList)
    {
        Log.d("AutoSave", "Initialized autosave thread.");
        this.appSettings = appSettings;
        this.matchList = matchList;
    }

    public void run()
    {
        boolean done = false;
        for(;;)
        {
            double time = System.currentTimeMillis() / 1000.0;

            if (time % appSettings.autosaveSeconds != 0)
            {
                done = false;
            }

            if (time % appSettings.autosaveSeconds == 0 && !done && appSettings.useAutosave)
            {
                Log.d("AutoSave", "Auto saving at time=" + time);
                String filename = IOUtils.getFileName(appSettings.firstName + "_" + appSettings.lastName);
                try
                {
                    IOUtils.writeContestsToCsv(appSettings, matchList, filename);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                done = true;
            }
        }
    }
}