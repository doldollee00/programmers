SELECT substr(PRODUCT_CODE, 1,2) as 'CATEGORY',
        count(*) AS PRODUCT_COUNT
from PRODUCT
group by CATEGORY
order by CATEGORY ASC;
