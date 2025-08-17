select b.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY, sum(b.price * s.sum_sales) as TOTAL_SALES
from BOOK b 
    JOIN AUTHOR a ON b.AUTHOR_ID = a.AUTHOR_ID
    JOIN (
        SELECT BOOK_ID, sum(sales) as sum_sales
        from BOOK_SALES
        where SALES_DATE like '2022-01%'
        group by BOOK_ID
        ) s ON b.BOOK_ID = s.BOOK_ID
GROUP BY b.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY
ORDER BY b.AUTHOR_ID, b.CATEGORY DESC