with recursive time
as (
    select 0 as hour
    union all
    select hour + 1
    from time
    where hour < 23
)

select t.hour as HOUR, count(animal_id) as COUNT
from time t left join (
    select *, hour(DATETIME) hour
    from ANIMAL_OUTS 
) o on t.hour = o.hour 
group by t.hour
order by t.hour