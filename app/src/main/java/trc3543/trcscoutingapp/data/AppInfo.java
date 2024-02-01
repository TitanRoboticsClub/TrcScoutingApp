package trc3543.trcscoutingapp.data;

import trc3543.trcscoutingapp.fragments.*;

public class AppInfo
{
    //
    // General app settings.
    //
    public static final String DATA_FOLDER_NAME = "TrcScoutingApp";
    public static final String SETTINGS_FILENAME = "app_settings.json";
    public static final String CSV_HEADER = "matchNumber,teamNumber,matchType,alliance,leftStartingZone,preloaded,pickedHomeZoneNotes,pickedMiddleZoneNotes,scoredSpeakerNotes,scoredAmpNotes,providedHumanPlayer,amplifiedCount,pickedNotesFromFloor,pickedNotesFromWall,scoredNotesSpeakerUnamplified,scoredNotesSpeakerAmplified,scoredNotesAmplifier,coopertitionPoint,teleopPlaystyle,fouls,techFouls,finalState,trapPoint,harmonized,highNote,melody,ensemble,robotBrokeDown,yellowCard1,yellowCard2,finalAllianceScore,finalWLT,notes";
    public static final String VERSION_NUMBER = "1.4.0-frc";
    public static final int YEAR_NUMBER = 2024;

    //
    // SetMatchInfo and child Fragment settings.
    //
    public static final int NUM_PAGES = 4;
    public static final String[] TAB_NAMES = {"Autonomous","Teleoperated","Endgame","Help"};
    public static final Class<?>[] FRAGMENT_CLASSES = {AutonomousFragment.class,TeleOpFragment.class,EndgameFragment.class,HelpFragment.class};
}
