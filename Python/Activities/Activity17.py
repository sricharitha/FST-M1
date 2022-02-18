import pandas as pd
data = {
    "Usernames" : ["admin", "Charles", "Deku"],
    "Passwords" : ["Password", "Charl13", "AllMight"]
}

dataframe = pd.DataFrame(data)
dataframe.to_csv("User_Pass.csv", index=False)