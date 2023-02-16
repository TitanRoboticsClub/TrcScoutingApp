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
field add teleopGoalsLow int
field add teleopGoalsMed int
field add teleopGoalsHigh int
field add teleopLinks int
field add teleopPlaystyle str
field add fouls int
field add techFouls int
field add endgameRobotState str
field add endgameSustainabilityBonus bool
field add endgameCoopertitionBonus bool
field add endgameActivationBonus bool
field add robotBrokeDown bool
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
csv map 11 teleopGoalsLow
csv map 12 teleopGoalsMed
csv map 13 teleopGoalsHigh
csv map 14 teleopLinks
csv map 15 teleopPlaystyle
csv map 22 fouls
csv map 23 techFouls
csv map 24 robotBrokeDown
csv map 25 endgameRobotState
csv map 26 endgameSustainabilityBonus
csv map 27 endgameCoopertitionBonus
csv map 28 endgameActivationBonus
csv map 29 yellowCard1
csv map 30 yellowCard2
csv map 31 finalAllianceScore
csv map 32 finalWLT
csv map 33 notes
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
elements add teleopGoalsLowPicker numberpicker teleopGoalsLow
elements add teleopGoalsMedPicker numberpicker teleopGoalsMed
elements add teleopGoalsHighPicker numberpicker teleopGoalsHigh
elements add teleopLinksPicker numberpicker teleopLinks
elements add teleopPlaystyleSpinner spinner teleopPlaystyle
elements add foulsCounter numberpicker fouls
elements add techFoulsCounter numberpicker techFouls
wp set EndgameFragment
elements add robotBrokeDownCB checkbox robotBrokeDown
elements add endgameRobotStateSpinner spinner endgameRobotState
elements add endgameSustainabilityBonusCB checkbox endgameSustainabilityBonus
elements add endgameCoopertitionBonusCB checkbox endgameCoopertitionBonus
elements add endgameActivationBonusCB checkbox endgameActivationBonus
elements add yellowCard1CB checkbox yellowCard1
elements add yellowCard2CB checkbox yellowCard2
elements add finalAllianceScoreInt edittext finalAllianceScore
elements add finalLWTSpinner spinner finalWLT
elements add notesET edittext notes
appinfo set csv_header "Match Number,Team Number,Match Type,Alliance,Left Community,Preloaded,Auto Scored Low,Auto Scored Med,Auto Scored High,Auto Engaged Docked State,Teleop Goals Low,Teleop Goals Med,Teleop Goals High,Teleop Links,Teleop Playstyle,Fouls,Tech Fouls,Robot Broke Down,Endgame Parked,Endgame Docked,Endgame Engaged,Endgame Sustainability Bonus,Endgame Coopertition Bonus,Endgame Activation Bonus,Final Alliance Score,Final WLT,Notes"
appinfo set year_number 2023
generatecode

