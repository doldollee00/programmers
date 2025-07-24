SELECT PT_NAME, PT_NO, GEND_CD, AGE, 
        if(TLNO is Null, 'NONE', TLNO) as 'TLNO'
from PATIENT 
where GEND_CD like 'W' AND AGE between 1 AND 12
order by AGE DESC, PT_NAME ASC