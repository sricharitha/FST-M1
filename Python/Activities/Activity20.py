import pandas as pd

dataframe = pd.read_excel("Test.xlsx")

print(dataframe.shape)
print("*****************")
print(dataframe["Email"])
print("*****************")
print(dataframe.sort_values("FirstName"))