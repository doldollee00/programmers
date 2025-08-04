SELECT u.USER_ID, u.NICKNAME, 
        CONCAT(u.CITY, " ", u.STREET_ADDRESS1, " ", u.STREET_ADDRESS2) as "전체주소",
        CONCAT(substr(TLNO, 1,3), "-", substr(TLNO, 4,4), "-", substr(TLNO, 8,4)) as "전화번호"
from USED_GOODS_BOARD b INNER JOIN USED_GOODS_USER u ON b.WRITER_ID = u.USER_ID
group by b.WRITER_ID, u.USER_ID
HAVING count(*) >=3
order by USER_ID DESC