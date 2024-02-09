create Frc2024Crescendo.dat
y
field add matchNumber int
field add teamNumber int
field add alliance str
field add matchType str
field add leftStartingZone bool
field add preloaded str
field add pickedHomeZoneNotes int
field add pickedMiddleZoneNotes int
field add scoredSpeakerNotes int
field add scoredAmpNotes int
field add providedHumanPlayer bool
field add amplifiedCount int
field add pickedNotesFromFloor int
field add pickedNotesFromWall int
field add scoredNotesSpeakerUnamplified int
field add scoredNotesSpeakerAmplified int
field add scoredNotesAmplifier int
field add coopertitionPoint bool
field add teleopPlaystyle str
field add fouls int
field add techFouls int
field add finalState str
field add trapPoint bool
field add harmonized bool
field add highNote bool
field add melody bool
field add ensemble bool
field add robotBrokeDown bool
field add yellowCard1 bool
field add yellowCard2 bool
field add finalAllianceScore int
field add finalWLT str
field add notes str
field flag add matchNumber match_num
field flag add matchNumber must_be_filled
field flag add teamNumber team_num
field flag add teamNumber must_be_filled
field flag add alliance alliance_type
field flag add matchType match_type
csv map 1 matchNumber
csv map 2 teamNumber
csv map 3 matchType
csv map 4 alliance
csv map 5 leftStartingZone
csv map 6 preloaded
csv map 7 pickedHomeZoneNotes
csv map 8 pickedMiddleZoneNotes
csv map 9 scoredSpeakerNotes
csv map 10 scoredAmpNotes
csv map 11 providedHumanPlayer
csv map 12 amplifiedCount
csv map 13 pickedNotesFromFloor
csv map 14 pickedNotesFromWall
csv map 15 scoredNotesSpeakerUnamplified
csv map 16 scoredNotesSpeakerAmplified
csv map 17 scoredNotesAmplifier
csv map 18 coopertitionPoint
csv map 19 teleopPlaystyle
csv map 20 fouls
csv map 21 techFouls
csv map 22 finalState
csv map 23 trapPoint
csv map 24 harmonized
csv map 25 highNote
csv map 26 melody
csv map 27 ensemble
csv map 28 robotBrokeDown
csv map 29 yellowCard1
csv map 30 yellowCard2
csv map 31 finalAllianceScore
csv map 32 finalWLT
csv map 33 notes
page add Autonomous AutonomousFragment fragment_autonomous_page 1
page add Teleoperated TeleOpFragment fragment_teleop_page 2
page add Endgame EndgameFragment fragment_endgame_page 3
page add Help HelpFragment fragment_help_page 4
wp set AutonomousFragment
elements add matchNum edittext matchNumber
elements add teamNum edittext teamNumber
elements add spectatingTeamSpinner spinner alliance
elements add matchTypeSpinner spinner matchType
elements add leftStartingZoneCB checkbox leftStartingZone
elements add preloadedSpinner spinner preloaded
elements add pickedHomeZoneNotesCounter numberpicker pickedHomeZoneNotes
elements add pickedMiddleZoneNotesCounter numberpicker pickedMiddleZoneNotes
elements add scoredSpeakerNotesCounter numberpicker scoredSpeakerNotes
elements add scoredAmpNotesCounter numberpicker scoredAmpNotes
wp set TeleOpFragment
elements add providedHumanPlayerCB checkbox providedHumanPlayer
elements add amplifiedCountCounter numberpicker amplifiedCount
elements add pickedNotesFromFloorCounter numberpicker pickedNotesFromFloor
elements add pickedNotesFromWallCounter numberpicker pickedNotesFromWall
elements add scoredNotesSpeakerUnamplifiedCounter numberpicker scoredNotesSpeakerUnamplified
elements add scoredNotesSpeakerAmplifiedCounter numberpicker scoredNotesSpeakerAmplified
elements add scoredNotesAmplifierCounter numberpicker scoredNotesAmplifier
elements add coopertitionPointCB checkbox coopertitionPoint
elements add teleopPlaystyleSpinner spinner teleopPlaystyle
elements add foulsCounter numberpicker fouls
elements add techFoulsCounter numberpicker techFouls
wp set EndgameFragment
elements add finalStateSpinner spinner finalState
elements add trapPointCB checkbox trapPoint
elements add harmonizedCB checkbox harmonized
elements add highNoteCB checkbox highNote
elements add melodyCB checkbox melody
elements add ensembleCB checkbox ensemble
elements add robotBrokeDownCB checkbox robotBrokeDown
elements add yellowCard1CB checkbox yellowCard1
elements add yellowCard2CB checkbox yellowCard2
elements add finalAllianceScoreInt edittext finalAllianceScore
elements add finalLWTSpinner spinner finalWLT
elements add notesET edittext notes
appinfo set csv_header "Match Number,Team Number,Match Type,Alliance,Left Starting Zone,Preloaded,Picked Up Home Notes,Picked Up Middle Notes,Auto Speaker Notes,Auto Amp Notes,providedHumanPlayer,Amplified Count,Pickup from Floor,Pickup from Source,Teleop Scored Speaker Unamplified,Teleop Scored Speaker Amplified,Teleop Scored Amplifier,Coopertition Bonus,Teleop Playstyle,Fouls,Tech Fouls,Engame Robot State,Endgame Scored Trap,Harmonized,highNote,Melody,Ensemble,Robot Broke Down,Yellow Card 1,Yellow Card 2,Final Alliance Score,Final WLT,Notes"
appinfo set year_number 2024
generatecode

