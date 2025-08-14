select f.FLAVOR
from FIRST_HALF f INNER JOIN (
    select FLAVOR, sum(TOTAL_ORDER) as TOTAL_ORDER
    from JULY
    group by FLAVOR
) j ON f.FLAVOR = j.FLAVOR
order by f.TOTAL_ORDER + j.TOTAL_ORDER DESC
LIMIT 3

    
