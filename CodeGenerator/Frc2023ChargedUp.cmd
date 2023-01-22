create Frc2023ChargedUp.dat
y
field add matchNumber int
field add teamNumber int
field add alliance str
field add matchType str
field add leftCommunity bool
field add preloaded str
field add autoScoredLow int
field add autoScoredMed int
field add autoScoredHigh int
field add autoEngagedDockedState str
field flag add matchNumber match_num
field flag add matchNumber must_be_filled
field flag add teamNumber team_num
field flag add teamNumber must_be_filled
field flag add alliance alliance_type
field flag add matchType match_type
field add fouls int
field add techFouls int
field add yellowCard1 bool
field add yellowCard2 bool
field add finalAllianceScore int
field add finalWLT str
field add notes str
csv map 1 matchNumber
csv map 2 teamNumber
csv map 3 matchType
csv map 4 alliance
csv map 5 leftCommunity
csv map 6 preloaded
csv map 7 autoScoredLow
csv map 8 autoScoredMed
csv map 9 autoScoredHigh
csv map 10 autoEngagedDockedState
csv map 22 fouls
csv map 23 techFouls
csv map 26 yellowCard1
csv map 27 yellowCard2
csv map 28 finalAllianceScore
csv map 29 finalWLT
csv map 32 notes
page add Autonomous AutonomousFragment fragment_autonomous_page 1
page add Teleoperated TeleOpFragment fragment_teleop_page 2
page add Endgame EndgameFragment fragment_endgame_page 3
wp set AutonomousFragment
elements add matchNum edittext matchNumber
elements add teamNum edittext teamNumber
elements add spectatingTeamSpinner spinner alliance
elements add matchTypeSpinner spinner matchType
elements add leftCommunityCB checkbox leftCommunity
elements add preloadedSpinner spinner preloaded
elements add autoScoredLowSpinner numberpicker autoScoredLow
elements add autoScoredMedSpinner numberpicker autoScoredMed
elements add autoScoredHighSpinner numberpicker autoScoredHigh
elements add autoEngagedDockedStateSpinner spinner autoEngagedDockedState
wp set TeleOpFragment
elements add foulsCounter numberpicker fouls
elements add techFoulsCounter numberpicker techFouls
wp set EndgameFragment
elements add finalAllianceScoreInt edittext finalAllianceScore
elements add finalLWTSpinner spinner finalWLT
elements add notesET edittext notes
appinfo set csv_header "matchNumber,teamNumber,matchType,alliance,taxied,quintet,breakdown,autonomousRobotLowGoal,autonomousRobotHighGoal,autonomousHumanLowGoal,autonomousHumanHighGoal,teleopPlaystyle,terminalMissed,terminalLowGoal,terminalHighGoal,launchpadMissed,launchpadLowGoal,launchpadHighGoal,otherMissed,otherLowGoal,otherHighGoal,fouls,techFouls,hang,blockedHang,yellowCard1,yellowCard2,finalAllianceScore,finalWinLossTie,cargoBonus,hangBonus,notes"
appinfo set year_number 2023
generatecode

