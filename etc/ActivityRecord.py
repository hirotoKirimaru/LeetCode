import json
import math
import sys
import datetime

json_days = open('wakatime.json', 'r')
json_load = json.load(json_days)

if len(sys.argv) < 3:
    print('パラメータが必要です')
    print('例')
    print('python ファイル名 開始日 終了日（開始日は含むが終了日は含まない）')

    now = datetime.datetime.now()
    start_date = f"{now:%Y-%m-%d}"
    end_date = f"{now:%Y-%m-%d}"

    # print('python ActivityRecord.py 2021-02-01 2021-03-01')
    # TODO: いい感じにしたい
    print('python ActivityRecord.py {0} {1}'.format(start_date, end_date))
    
    exit()

start_date = sys.argv[1]
end_date = sys.argv[2]

# print(json_load)
# hours = 0;
# minutes = 0;
# seconds = 0;
total_seconds = 0;
for day in json_load['days']:
    date = day['date']
    if start_date <= date < end_date:
        for category in day['categories']:
            # hours += category['hours']
            # minutes += category['minutes']
            # seconds += category['seconds']
            hours = math.floor(category['total_seconds'] /60/60)
            minutes = math.floor((category['total_seconds'] - (hours*60*60))/60)
            seconds = math.floor((category['total_seconds'] - (hours*60*60) - (minutes * 60)))
            
            print(date , ':', hours, '時間',minutes, '分', seconds, '秒')
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