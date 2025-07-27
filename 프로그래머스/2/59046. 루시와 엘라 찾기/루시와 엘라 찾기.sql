SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
from ANIMAL_INS
where NAME like 'Lucy' OR 
      NAME like 'Pickle' OR 
      NAME like 'Ella' OR 
      NAME like 'Rogan' OR 
      NAME like 'Sabrina' OR 
      NAME like 'Mitty'
order by ANIMAL_ID ASC;