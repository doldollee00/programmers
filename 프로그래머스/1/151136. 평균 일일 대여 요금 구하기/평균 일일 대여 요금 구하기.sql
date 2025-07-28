SELECT ROUND(sum(DAILY_FEE) / count(*), 0) as 'AVERAGE_FEE'
from CAR_RENTAL_COMPANY_CAR 
where CAR_TYPE like 'SUV'
group by CAR_TYPE

