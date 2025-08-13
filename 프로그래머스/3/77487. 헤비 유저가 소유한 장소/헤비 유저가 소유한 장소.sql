SELECT *
from PLACES
where HOST_ID IN (
    select HOST_ID
    from PLACES
    group by HOST_ID
    HAVING count(*) >= 2
    )
order by ID ASC