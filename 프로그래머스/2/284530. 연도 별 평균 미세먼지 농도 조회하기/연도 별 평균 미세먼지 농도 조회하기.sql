WITH PM as (
    select LOCATION2, YEAR(YM) as "YEAR", PM_VAL1, PM_VAL2
    from AIR_POLLUTION
    where LOCATION2 = "수원"
)

select YEAR, 
        ROUND(AVG(PM_VAL1), 2) as "PM10",
        ROUND(AVG(PM_VAL2), 2) as "PM2.5"
from PM
group by YEAR
order by YEAR ASC