package trc3543.trcscoutingapp.data;

import trc3543.trcscoutingapp.fragments.*;

public class AppInfo
{
    //
    // General app settings.
    //
    public static final String DATA_FOLDER_NAME = "TrcScoutingApp";
    public static final String SETTINGS_FILENAME = "app_settings.json";
    public static final String CSV_HEADER = "Match Number,Team Number,Match Type,Alliance,Left Starting Zone,Preloaded,Picked Up Home Notes,Picked Up Middle Notes,Auto Speaker Notes,Auto Amp Notes,Auto Missed Shots,providedHumanPlayer,Amplified Count,Pickup from Floor,Pickup from Source,Teleop Scored Speaker Unamplified,Teleop Scored Speaker Amplified,Teleop Scored Amplifier,Teleop Missed Shots,Coopertition Bonus,Teleop Playstyle,Fouls,Tech Fouls,Engame Robot State,Endgame Scored Trap,Harmonized,highNote,Melody,Ensemble,Robot Broke Down,Yellow Card 1,Yellow Card 2,Final Alliance Score,Final WLT,Notes";
    public static final String VERSION_NUMBER = "1.4.0-frc";
    public static final int YEAR_NUMBER = 2024;

    //
    // SetMatchInfo and child Fragment settings.
    //
    public static final int NUM_PAGES = 4;
    public static final String[] TAB_NAMES = {"Autonomous","Teleoperated","Endgame","Help"};
    public static final Class<?>[] FRAGMENT_CLASSES = {AutonomousFragment.class,TeleOpFragment.class,EndgameFragment.class,HelpFragment.class};
}
