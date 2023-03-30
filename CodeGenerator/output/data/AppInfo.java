package trc3543.trcscoutingapp.data;

import trc3543.trcscoutingapp.fragments.*;

public class AppInfo
{
    //
    // General app settings.
    //
    public static final String DATA_FOLDER_NAME = "TrcScoutingApp";
    public static final String SETTINGS_FILENAME = "app_settings.json";
    public static final String CSV_HEADER = "Match Number,Team Number,Match Type,Alliance,Left Community,Preloaded,Auto Scored Low,Auto Scored Med,Auto Scored High,Auto Engaged Docked State,Teleop Scored Cones,Teleop Scored Cubes,Teleop Goals Low,Teleop Goals Med,Teleop Goals High,Teleop Missed Attempts,Teleop Links,Teleop Playstyle,Fouls,Tech Fouls,Robot Broke Down,Endgame Robot State,Endgame Sustainability Bonus,Endgame Coopertition Bonus,Endgame Activation Bonus,Yellow Card 1,Yellow Card 2,Final Alliance Score,Final WLT,Notes";
    public static final String VERSION_NUMBER = "1.4.0-frc";
    public static final int YEAR_NUMBER = 2023;

    //
    // SetMatchInfo and child Fragment settings.
    //
    public static final int NUM_PAGES = 4;
    public static final String[] TAB_NAMES = {"Autonomous","Teleoperated","Endgame","Help"};
    public static final Class<?>[] FRAGMENT_CLASSES = {AutonomousFragment.class,TeleOpFragment.class,EndgameFragment.class,HelpFragment.class};
}
