SELECT CART_ID
from CART_PRODUCTS 
where NAME IN ('Milk', 'Yogurt')
group by CART_ID
HAVING count(distinct name) = 2
order by CART_ID
