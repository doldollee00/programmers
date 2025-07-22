SELECT DR_NAME, DR_ID, MCDP_CD, 
        substr(HIRE_YMD, 1, 10) as 'HIRE_YMD'
from DOCTOR 
where MCDP_CD like 'CS' OR MCDP_CD like 'GS'
order by HIRE_YMD DESC, DR_NAME ASC;