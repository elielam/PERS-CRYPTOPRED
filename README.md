# Personal-CryptoPred
Simple Blockfolio with trading api monitoring &amp; analyzing.

# Architecture
- Dashboard
  - Model
    - Class (Correspond to JSON Object)
    - Component
  - Controller
    - Manager (Second entry point of app , manage all dashboard action)
  - View
    - Component (JPanel)
    - Tabbed (JTabbedPanel)
    - Frame (JFrame)
    
# Context
This app have three main functions.
First a dashboard who permit the user to see some currency Exchange Rates, to consult markets Summary, a blockfolio who provide acces to your wallet (not real but view) and an Analyse screen who give us the result of mathematical equation of the second app package.
The second app package analyse data from different trading api and provide trading pronostic.
The tird app package retrieve data from api and provide them at the second app.

