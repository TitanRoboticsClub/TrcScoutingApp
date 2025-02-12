create Frc2025Reefscape.dat
y
field add matchNumber int
field add teamNumber int
field add alliance str
field add matchType str
field add leftStartingZone bool
field add autoTrough int
field add autoL2branch int
field add autoL3branch int
field add autoL4branch int
field add autoProcessor int
field add autoNet int
field add autoMissedCoral int
field add autoMissedAlgae int

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
csv map 6 autoTrough
csv map 7 autoL2branch
csv map 8 autoL3branch
csv map 9 autoL4branch
csv map 10 autoProcessor
csv map 11 autoNet
csv map 12 autoMissedCoral
csv map 13 autoMissedAlgae
csv map 14 teleopTrough
csv map 15 teleopPickedFromFloor
csv map 16 teleopPickedFromStation
csv map 17 teleopL2
csv map 18 teleopL3
csv map 19 teleopL4
csv map 20 teleopProcessor
csv map 21 teleopNet
csv map 22 teleopMissedCoral
csv map 23 teleopMissedAlgae
csv map 24 minorFoul
csv map 25 majorFoul
csv map 26 coopBonus
csv map 27 playstyle
csv map 28 finalState
csv map 29 didShallowCageAttempt
csv map 30 didDeepCageAttempt
csv map 31 autoRP
csv map 32 coralRP
csv map 33 bargeRP
csv map 34 robotBrokeDown
csv map 35 yellowCard1
csv map 36 yellowCard2
csv map 37 finalAllianceScore
csv map 38 finalWLT
csv map 39 notes

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
elements add autoTroughCounter numberpicker autoTrough
elements add autoL2branchCounter numberpicker autoL2branch
elements add autoL3branchCounter numberpicker autoL3branch
elements add autoL4branchCounter numberpicker autoL4branch
elements add autoProcessorCounter numberpicker autoProcessor
elements add autoNet numberpicker autoNet
elements add autoMissedAlgae numberpicker autoMissedAlgae
elements add autoMissedCoral numberpicker autoMissedCoral
wp set TeleOpFragment
elements add teleopPickedFromFloorCounter numberpicker teleopPickedFromFloor
elements add teleopPickedFromStationCounter numberpicker teleopPickedFromStation
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
appinfo set csv_header "Match Number,Team Number,Match Type,Alliance,Left Starting Zone,Auto Trough,Auto L2 Branch,Auto L3 Branch,Auto L4 Branch,Auto Processor,Auto Net,Auto Missed Coral,Auto Missed Algae,Teleop Trough,Teleop Picked From Floor,Teleop Picked From Station,Teleop L2,Teleop L3,Teleop L4,Teleop Processor,Teleop Net,Teleop Missed Coral,Teleop Missed Algae,Minor Foul,Major Foul,Coop Bonus,Playstyle,Final State,Shallow Cage Attempt,Deep Cage Attempt,Auto RP,Coral RP,Barge RP,Robot Broke Down,Yellow Card 1,Yellow Card 2,Final Alliance Score,Final WLT,Notes"
appinfo set year_number 2025
generatecode

