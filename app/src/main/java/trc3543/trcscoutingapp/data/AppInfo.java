package trc3543.trcscoutingapp.data;

import trc3543.trcscoutingapp.fragments.*;

public class AppInfo
{
    //
    // General app settings.
    //
    public static final String DATA_FOLDER_NAME = "TrcScoutingApp";
    public static final String SETTINGS_FILENAME = "app_settings.json";
    public static final String CSV_HEADER = "Match Number,Team Number,Match Type,Alliance,Left Starting Zone,Auto Trough,Auto L2 Branch,Auto L3 Branch,Auto L4 Branch,Auto Processor,Auto Net,Auto Missed Coral,Auto Missed Algae,Teleop Trough,Teleop Picked From Floor,Teleop Picked From Station,Teleop L2,Teleop L3,Teleop L4,Teleop Human Net,Teleop Removed Algae,Teleop Processor,Teleop Net,Teleop Missed Coral,Teleop Missed Algae Processor,Teleop Missed Algae Net,Minor Foul,Major Foul,Coop Bonus,Playstyle,Final State,Shallow Cage Attempt,Deep Cage Attempt,Auto RP,Coral RP,Barge RP,Robot Broke Down,Yellow Card 1,Yellow Card 2,Final Alliance Score,Final WLT,Notes";
    public static final String VERSION_NUMBER = "1.4.0-frc";
    public static final int YEAR_NUMBER = 2025;

    //
    // SetMatchInfo and child Fragment settings.
    //
    public static final int NUM_PAGES = 4;
    public static final String[] TAB_NAMES = {"Autonomous","Teleoperated","Endgame","Help"};
    public static final Class<?>[] FRAGMENT_CLASSES = {AutonomousFragment.class,TeleOpFragment.class,EndgameFragment.class,HelpFragment.class};
}
