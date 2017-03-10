# oracle

- 根据mac地址查找某一用户;

  select USERID,MACNO from TB_MCTM_USER_TERMINAL where macno='9009170680b3';

- 根据macno删除某条记录

  DELETE FROM TB_MCTM_USER_TERMINAL WHERE macno = '9009170680b3';

- 根据用户名查询

```txt
  select userno,password,macno,TERMINALID,TER_LOGINNO,USERCODE,username,C_USERINFO.platlevel as c_platlevel,TB_MCTM_USER_TERMINAL.platlevel as t_platlevel from C_USERINFO,TB_MCTM_USER_TERMINAL where C_USERINFO.userno=TB_MCTM_USER_TERMINAL.userid and userno='iFaboo_TY_MPAD022';
```
