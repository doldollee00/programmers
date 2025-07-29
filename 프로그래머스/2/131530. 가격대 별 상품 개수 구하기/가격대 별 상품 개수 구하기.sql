SELECT floor(price / 10000) * 10000 as price_group,
        count(*) as products
from PRODUCT
GROUP BY price_group
order by price_group asc