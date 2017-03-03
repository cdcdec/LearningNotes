# oracle

- 根据mac地址查找某一用户;

  select USERID,MACNO from TB_MCTM_USER_TERMINAL where macno='9009170680b3';

- 根据macno删除某条记录

  DELETE FROM TB_MCTM_USER_TERMINAL WHERE macno = '9009170680b3';
