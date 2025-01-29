create Frc2025Reefscape.dat
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

field add teleopTrough int
field add teleopPickedFromFloor int
field add teleopPickedFromStation int
field add teleopL2 int
field add teleopL3 int
field add teleopL4 int
field add teleopProcessor int
field add teleopNet int
field add teleopMissedCoral int
field add teleopMissedAlgae int
field add minorFoul int
field add majorFoul int
field add coopBonus bool
field add playstyle str 


field add finalState str
field add didShallowCageAttempt bool
field add didDeepCageAttempt bool
field add autoRP bool
field add coralRP bool
field add bargeRP bool
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
csv map 10 teleopTrough
csv map 11 teleopPickedFromFloor
csv map 12 teleopPickedFromStation
csv map 13 teleopL2
csv map 14 teleopL3
csv map 15 teleopL4
csv map 16 teleopProcessor
csv map 17 teleopNet
csv map 18 teleopMissedCoral
csv map 19 teleopMissedAlgae
csv map 20 minorFoul
csv map 21 majorFoul
csv map 22 coopBonus
csv map 23 playstyle
csv map 24 finalState
csv map 25 didShallowCageAttempt
csv map 26 didDeepCageAttempt
csv map 27 autoRP
csv map 28 coralRP
csv map 29 bargeRP
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
elements add teleopTroughCounter numberpicker teleopTrough
elements add teleopL2Counter numberpicker teleopL2
elements add teleopL3Counter numberpicker teleopL3
elements add teleopL4Counter numberpicker teleopL4
elements add teleopProcessorCounter numberpicker teleopProcessor
elements add teleopNetCounter numberpicker teleopNet
elements add teleopMissedCoralCounter numberpicker teleopMissedCoral
elements add teleopMissedAlgaeCounter numberpicker teleopMissedAlgae
elements add minorFoulCounter numberpicker minorFoul
elements add majorFoulCounter numberpicker majorFoul
elements add hasCoopBonus checkbox coopBonus
elements add playstyleType spinner playstyle
wp set EndgameFragment
elements add finalStateSpinner spinner finalState
elements add didShallowCageAttemptCB checkbox didShallowCageAttempt
elements add didDeepCageAttemptCB checkbox didDeepCageAttempt
elements add autoRPCB checkbox autoRP
elements add coralRPCB checkbox coralRP
elements add bargeRPCB checkbox bargeRP
elements add robotBrokeDownCB checkbox robotBrokeDown
elements add yellowCard1CB checkbox yellowCard1
elements add yellowCard2CB checkbox yellowCard2
elements add finalAllianceScoreInt edittext finalAllianceScore
elements add finalLWTSpinner spinner finalWLT
elements add notesET edittext notes
appinfo set csv_header "Match Number,Team Number,Match Type,Alliance,Left Starting Zone,Preloaded,Picked Up Home Notes,Picked Up Middle Notes,Auto Speaker Notes,Auto Amp Notes,Auto Missed Shots,providedHumanPlayer,Amplified Count,Pickup from Floor,Pickup from Source,Teleop Scored Speaker Unamplified,Teleop Scored Speaker Amplified,Teleop Scored Amplifier,Teleop Missed Shots,Coopertition Bonus,Teleop Playstyle,Fouls,Tech Fouls,Endgame Robot State,Endgame Scored Trap,Harmonized,highNote,Melody,Ensemble,Robot Broke Down,Yellow Card 1,Yellow Card 2,Final Alliance Score,Final WLT,Notes"
appinfo set year_number 2025
generatecode

