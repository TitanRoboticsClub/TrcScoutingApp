package trc3543.trcscoutingapp.data;

import trc3543.trcscoutingapp.fragments.*;

public class AppInfo
{
    //
    // General app settings.
    //
    public static final String DATA_FOLDER_NAME = "TrcScoutingApp";
    public static final String SETTINGS_FILENAME = "app_settings.json";
    public static final String CSV_HEADER = "matchNumber,teamNumber,matchType,alliance,taxied,quintet,breakdown,autonomousRobotLowGoal,autonomousRobotHighGoal,autonomousHumanLowGoal,autonomousHumanHighGoal,teleopPlaystyle,terminalMissed,terminalLowGoal,terminalHighGoal,launchpadMissed,launchpadLowGoal,launchpadHighGoal,otherMissed,otherLowGoal,otherHighGoal,fouls,techFouls,hang,blockedHang,yellowCard1,yellowCard2,finalAllianceScore,finalWinLossTie,cargoBonus,hangBonus,notes";
    public static final String VERSION_NUMBER = "1.4.0-frc";
    public static final int YEAR_NUMBER = 2023;

    //
    // SetMatchInfo and child Fragment settings.
    //
    public static final int NUM_PAGES = 3;
    public static final String[] TAB_NAMES = {"Autonomous","Teleoperated","Endgame"};
    public static final Class<?>[] FRAGMENT_CLASSES = {AutonomousFragment.class,TeleOpFragment.class,EndgameFragment.class};
}
