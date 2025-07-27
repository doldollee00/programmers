SELECT ORDER_ID, PRODUCT_ID, substr(OUT_DATE, 1, 10),
        CASE 
        WHEN OUT_DATE < '2022-05-02' THEN '출고완료' 
        WHEN OUT_DATE is null THEN '출고미정'
        ELSE '출고대기' END as '출고여부'
from FOOD_ORDER
order by ORDER_ID ASC