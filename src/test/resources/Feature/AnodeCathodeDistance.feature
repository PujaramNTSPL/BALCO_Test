Feature: Entry Forms Navigation

Scenario: Open ACD Form

Given User is in the Balco LogBook Application
When User enter valid Username
And User enter valid Password
And User clicks on Login button
And User clicks Entry Forms
And User clicks Process Control
And User clicks Anode Cathode Distance
And User selects ACD date
And User selects shift
And User selects plant
And User selects room
And User selects section
And User selects measurement time "06" and "30"
And User selects pot number "1101"
And User enters ACD value "15"
And User submits the form