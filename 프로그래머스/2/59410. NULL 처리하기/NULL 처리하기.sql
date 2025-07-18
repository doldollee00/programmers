SELECT ANIMAL_TYPE, 
       if(NAME is NULL, 'No name', NAME),
       SEX_UPON_INTAKE
from ANIMAL_INS 
order by ANIMAL_ID ASC