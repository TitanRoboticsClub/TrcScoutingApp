create Frc2024Crescendo.dat
y
field add matchNumber int
field add teamNumber int
field add alliance str
field add matchType str
field add leftCommunity bool
field add preloaded str

field flag add matchNumber match_num
field flag add matchNumber must_be_filled
field flag add teamNumber team_num
field flag add teamNumber must_be_filled
field flag add alliance alliance_type
field flag add matchType match_type

field add teleopPlaystyle str
field add fouls int
field add techFouls int

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

csv map 18 teleopPlaystyle
csv map 19 fouls
csv map 20 techFouls
csv map 21 robotBrokeDown
csv map 22 endgameRobotState

csv map 26 yellowCard1
csv map 27 yellowCard2
csv map 28 finalAllianceScore
csv map 29 finalWLT
csv map 30 notes
page add Autonomous AutonomousFragment fragment_autonomous_page 1
page add Teleoperated TeleOpFragment fragment_teleop_page 2
page add Endgame EndgameFragment fragment_endgame_page 3
page add Help HelpFragment fragment_help_page 4
wp set AutonomousFragment
elements add matchNum edittext matchNumber
elements add teamNum edittext teamNumber
elements add spectatingTeamSpinner spinner alliance
elements add matchTypeSpinner spinner matchType
elements add leftCommunityCB checkbox leftCommunity
elements add preloadedSpinner spinner preloaded

wp set TeleOpFragment

elements add teleopPlaystyleSpinner spinner teleopPlaystyle
elements add foulsCounter numberpicker fouls
elements add techFoulsCounter numberpicker techFouls

wp set EndgameFragment
elements add robotBrokeDownCB checkbox robotBrokeDown
elements add endgameRobotStateSpinner spinner endgameRobotState

elements add yellowCard1CB checkbox yellowCard1
elements add yellowCard2CB checkbox yellowCard2
elements add finalAllianceScoreInt edittext finalAllianceScore
elements add finalLWTSpinner spinner finalWLT
elements add notesET edittext notes
appinfo set csv_header ""
appinfo set year_number 2024
generatecode

