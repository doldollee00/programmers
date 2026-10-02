select count(*) as FISH_COUNT
from FISH_INFO
where SUBSTRING(TIME, 1, 4) = '2021'
