import pandas as pd

data = pd.read_csv("User_Pass.csv")

print(data["Usernames"])
print("*****************************")
print(data["Usernames"][1] + " - " +  data["Passwords"][1])
print("*****************************")
data.sort_values("Usernames")
print(data)
print("*****************************")
data.sort_values("Usernames", ascending=True)
print(data)