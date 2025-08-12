SELECT HISTORY_ID, 
        CAR_ID, 
        substr(START_DATE,1,10) as "START_DATE", 
        substr(END_DATE,1,10) as "END_DATE", 
        if(DATEDIFF(END_DATE, START_DATE)+1 >= 30, "장기 대여", "단기 대여") as "RENT_TYPE"
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where START_DATE like '2022-09%'
order by HISTORY_ID DESC