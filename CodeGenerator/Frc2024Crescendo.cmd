create Frc2024Crescendo.dat
y
field add matchNumber int
field add teamNumber int
field add alliance str
field add matchType str
field add leftStartingZone bool
field add preloaded str
field add pickedHomeZoneNotes bool
field add pickedMiddleZoneNotes bool
field add scoredSpeakerNotes int
field add scoredAmpNotes int
field add autoMissedShots int
field add providedHumanPlayer str
field add amplifiedCount int
field add pickedNotesFromFloor int
field add pickedNotesFromWall int
field add scoredNotesSpeakerUnamplified int
field add scoredNotesSpeakerAmplified int
field add scoredNotesAmplifier int
field add teleopMissedShots int
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
csv map 11 autoMissedShots
csv map 12 providedHumanPlayer
csv map 13 amplifiedCount
csv map 14 pickedNotesFromFloor
csv map 15 pickedNotesFromWall
csv map 16 scoredNotesSpeakerUnamplified
csv map 17 scoredNotesSpeakerAmplified
csv map 18 scoredNotesAmplifier
csv map 19 teleopMissedShots
csv map 20 coopertitionPoint
csv map 21 teleopPlaystyle
csv map 22 fouls
csv map 23 techFouls
csv map 24 finalState
csv map 25 trapPoint
csv map 26 harmonized
csv map 27 highNote
csv map 28 melody
csv map 29 ensemble
csv map 30 robotBrokeDown
csv map 31 yellowCard1
csv map 32 yellowCard2
csv map 33 finalAllianceScore
csv map 34 finalWLT
csv map 35 notes
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
elements add pickedHomeZoneNotesCB checkbox pickedHomeZoneNotes
elements add pickedMiddleZoneNotesCB checkbox pickedMiddleZoneNotes
elements add scoredSpeakerNotesCounter numberpicker scoredSpeakerNotes
elements add scoredAmpNotesCounter numberpicker scoredAmpNotes
elements add autoMissedShotsCounter numberpicker autoMissedShots
wp set TeleOpFragment
elements add providedHumanPlayerSpinner spinner providedHumanPlayer
elements add amplifiedCountCounter numberpicker amplifiedCount
elements add pickedNotesFromFloorCounter numberpicker pickedNotesFromFloor
elements add pickedNotesFromWallCounter numberpicker pickedNotesFromWall
elements add scoredNotesSpeakerUnamplifiedCounter numberpicker scoredNotesSpeakerUnamplified
elements add scoredNotesSpeakerAmplifiedCounter numberpicker scoredNotesSpeakerAmplified
elements add scoredNotesAmplifierCounter numberpicker scoredNotesAmplifier
elements add teleopMissedShotsCounter numberpicker teleopMissedShots
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
appinfo set csv_header "Match Number,Team Number,Match Type,Alliance,Left Starting Zone,Preloaded,Picked Up Home Notes,Picked Up Middle Notes,Auto Speaker Notes,Auto Amp Notes,Auto Missed Shots,providedHumanPlayer,Amplified Count,Pickup from Floor,Pickup from Source,Teleop Scored Speaker Unamplified,Teleop Scored Speaker Amplified,Teleop Scored Amplifier,Teleop Missed Shots,Coopertition Bonus,Teleop Playstyle,Fouls,Tech Fouls,Endgame Robot State,Endgame Scored Trap,Harmonized,highNote,Melody,Ensemble,Robot Broke Down,Yellow Card 1,Yellow Card 2,Final Alliance Score,Final WLT,Notes"
appinfo set year_number 2024
generatecode

