SELECT ANIMAL_ID, NAME, 
        substr(DATETIME, 1, 10) as '날짜'
from ANIMAL_INS 
order by ANIMAL_ID ASC;