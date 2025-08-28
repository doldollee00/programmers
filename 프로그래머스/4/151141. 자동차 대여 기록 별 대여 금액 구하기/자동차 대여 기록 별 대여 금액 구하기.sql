WITH RENTAL_HISTORY AS (select HISTORY_ID, CAR_ID,
                               DATEDIFF(END_DATE, START_DATE) + 1 AS DATES,
                               CASE WHEN DATEDIFF(end_date, start_date) + 1 >= 90 THEN '90일 이상'
                                    WHEN DATEDIFF(end_date, start_date) + 1 >= 30 THEN '30일 이상'
                                    WHEN DATEDIFF(end_date, start_date) + 1 >= 7 THEN '7일 이상'
                                    ELSE '7일 미만'
                               END AS DATES_TYPE
                        from CAR_RENTAL_COMPANY_RENTAL_HISTORY)
SELECT h.HISTORY_ID,
       ROUND(h.DATES * c.DAILY_FEE * (1 - IFNULL(DISCOUNT_RATE, 0) / 100), 0) as FEE
from CAR_RENTAL_COMPANY_CAR c 
     LEFT JOIN RENTAL_HISTORY h USING(CAR_ID) 
     LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN p 
     ON c.CAR_TYPE = p.CAR_TYPE AND h.DATES_TYPE = p.DURATION_TYPE
where c.CAR_TYPE = '트럭'
group by h.HISTORY_ID
order by FEE DESC, HISTORY_ID DESC