field add matchNumber int
field add teamNumber int
field add alliance str
field add matchType str
field flag add matchNumber match_num
field flag add matchNumber must_be_filled
field flag add teamNumber team_num
field flag add teamNumber must_be_filled
field flag add alliance alliance_type
field flag add matchType match_type
field add taxied bool
field add quintet bool
field add breakdown bool
field add autoRobotLowGoal int
field add autoRobotHighGoal int
field add autoHumanLowGoal bool
field add autoHumanHighGoal bool
field add teleopPlaystyle str
field add terminalMissed int
field add terminalLowGoal int
field add terminalHighGoal int
field add launchpadMissed int
field add launchpadLowGoal int
field add launchpadHighGoal int
field add otherMissed int
field add otherLowGoal int
field add otherHighGoal int
field add fouls int
field add techFouls int
field add hang str
field add blockedHang bool
field add yellowCard1 bool
field add yellowCard2 bool
field add finalAllianceScore int
field add finalWLT str
field add cargoBonus bool
field add hangBonus bool
field add notes str
csv map 1 matchNumber
csv map 2 teamNumber
csv map 3 matchType
csv map 4 alliance
csv map 5 taxied
csv map 6 quintet
csv map 7 breakdown
csv map 8 autoRobotLowGoal
csv map 9 autoRobotHighGoal
csv map 10 autoHumanLowGoal
csv map 11 autoHumanHighGoal
csv map 12 teleopPlaystyle
csv map 13 terminalMissed
csv map 14 terminalLowGoal
csv map 15 terminalHighGoal
csv map 16 launchpadMissed
csv map 17 launchpadLowGoal
csv map 18 launchpadHighGoal
csv map 19 otherMissed
csv map 20 otherLowGoal
csv map 21 otherHighGoal
csv map 22 fouls
csv map 23 techFouls
csv map 24 hang
csv map 25 blockedHang
csv map 26 yellowCard1
csv map 27 yellowCard2
csv map 28 finalAllianceScore
csv map 29 finalWLT
csv map 30 cargoBonus
csv map 31 hangBonus
csv map 32 notes
page add Autonomous AutonomousFragment fragment_autonomous_page 1
page add Teleoperated TeleOpFragment fragment_teleop_page 2
page add Endgame EndgameFragment fragment_endgame_page 3
wp set AutonomousFragment
elements add matchNum edittext matchNumber
elements add teamNum edittext teamNumber
elements add spectatingTeamSpinner spinner alliance
elements add matchTypeSpinner spinner matchType
elements add initLineCrossedCB checkbox taxied
elements add quintetCB checkbox quintet
elements add autoRobotLowGoalCounter numberpicker autoRobotLowGoal
elements add autoRobotHighGoalCounter numberpicker autoRobotHighGoal
elements add autoHumanLowGoalCounter numberpicker autoHumanLowGoal
elements add autoHumanHighGoalCounter numberpicker autoHumanHighGoal
wp set TeleOpFragment
elements add playStyleSpinner spinner teleopPlaystyle
elements add terminalMissedCounter numberpicker terminalMissed
elements add terminalLowGoalCounter numberpicker terminalLowGoal
elements add terminalHighGoalCounter numberpicker terminalHighGoal
elements add launchpadMissedCounter numberpicker launchpadMissed
elements add launchpadLowGoalCounter numberpicker launchpadLowGoal
elements add launchpadHighGoalCounter numberpicker launchpadHighGoal
elements add otherMissedCounter numberpicker otherMissed
elements add otherLowGoalCounter numberpicker otherLowGoal
elements add otherHighGoalCounter numberpicker otherHighGoal
elements add foulsCounter numberpicker fouls
elements add techFoulsCounter numberpicker techFouls
wp set EndgameFragment
elements add breakdownCB checkbox breakdown 
elements add hangSpinner spinner hang
elements add blockedHangCB checkbox blockedHang
elements add yellowCard1CB checkbox yellowCard1 bool
elements add yellowCard2CB checkbox yellowCard2 bool
elements add finalAllianceScoreInt edittext finalAllianceScore
elements add finalLWTSpinner spinner finalWLT
elements add cargoBonusCB checkbox cargoBonus
elements add hangBonusCB checkbox hangBonus
elements add notesET edittext notes
appinfo set csv_header "matchNumber,teamNumber,matchType,alliance,taxied,quintet,breakdown,automnomousRobotLowGoal,autonomousRobotHighGoal,autonomousHumanLowGoal,autonomousHumanHighGoal,teleopPlaystyle,terminalMissed,terminalLowGoal,terminalHighGoal,launchpadMissed,launchpadLowGoal,launchpadHighGoal,otherMissed,otherLowGoal,otherHighGoal,fouls,techFouls,hang,blockedHang,yellowCard1,yellowCard2,finalAllianceScore,finalWinLossTie,cargoBonus,hangBonus,notes"
appinfo set year_number 2022