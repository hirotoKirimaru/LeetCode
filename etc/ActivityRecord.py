import json
import math

json_days = open('202101.json', 'r')
json_load = json.load(json_days)

# print(json_load)
# hours = 0;
# minutes = 0;
# seconds = 0;
total_seconds = 0;
for day in json_load['days']:
    for category in day['categories']:
        # hours += category['hours']
        # minutes += category['minutes']
        # seconds += category['seconds']
        total_seconds += category['total_seconds']

# TODO: いいかんじに巨大なCSVから特定の期間を抜き取る

hours = math.floor(total_seconds /60/60)
minutes = math.floor((total_seconds - (hours*60*60))/60)
seconds = math.floor((total_seconds - (hours*60*60) - (minutes * 60)))


# print("時間:" ,hours)
# print("分:" ,minutes)
# print("秒:" ,seconds)
# print("全体秒:" ,total_seconds)

print(hours, '時間',minutes, '分', seconds, '秒')