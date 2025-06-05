-- session > New Connection 세션 추가하기 (scott과 system을 번갈아가며 쓸 수 있음)

select * from DBA_TAVLES; 

select * from DBA_USERS where USERNAME = 'SCOTT';

-- 권한 부여하기(SQL*PLUS)
sqlplus SYSTEM/oracle 
grant create synonym to SCOTT;
grant create public synonym to SCOTT;

-- SYSTEN 사용자로 접속 후 사용자 생성하기 (SQL*PULS)
create user orclstudy identified by oracle;
-- 계정 생성 완료. 그러나 데이터베이스에 연결하는 권한 CREATE SESSION 권한을 부여받지 못함. CRANT문으로 권한 부여해야 함.

-- SYSTEM 사용자로 접속 후 ORASTUDY 사용자에게 권한 부여하기
grant create session to orclstudy;

-- 사용자 정보 조회 데이터 사전
select * from all_users where username = 'ORCLSTUDY';
select * from dba_users where username = 'ORCLSTUDY';
select * from dba_objects where owner = 'ORCLSTUDY';

-- 사용자 정보 (패스워드) 변경하기
alter user orclstudy identified by ORCL;

-- 사용자 삭제하기
drop user orclstudy; -- 사용자가 접속 중이라면 삭제할 수 없음

-- 오라클 사용자와 객체 모두 삭제
drop user orclstudy cascade; -- 사용자 스키마에 객체가 있을 경우 사용자와 객체를 모두 삭제함

-- orclstudy 계정에 세션 접속 권한 부여
grant create session to orclstudy;
-- GRANT문 작성 : grant [시스템 권한] to [사용자 이름/롤(Role)이름/public] [with admin option];
-- [시스템 권한]: 오라클 데이터베이스에서 제공하는 시스템 권한을 지정. 한 번에 여러 종류의 권한을 부여하려면 쉼표로 구분하여 권한 이름을 여러 개 작성.(필수)
-- [사용자 이름/롤(Role)이름/public] : 권한을 부여하려는 대상 지정. 사용자 이름을 지정해줄 수도 있고, 소개할 롤을 지정할 수도 있음. 여러개 적용 시 쉼표로 구분. public은 모두 부여.
-- [with admin option] : 현재 grant문을 통해 부여받은 권한을 다른 사용자에게 부여할 수 있는 권리 주기. 현재 사용자가 권한이 사라져도 권한을 재부여한 다른 사용자의 권한은 유지됨.

-- SYSTEN 사용자로 접속 후 사용자 생성하기 (SQL*PULS)
create user orclstudy identified by oracle;

-- 사용자 권한 부여하기
grant resource, create session, create table to orclstudy; 
-- orclstudy 사용자로 데이터베이스 접속과 테이블 생성이 가능해짐. 

-- RESOURCE 키워드 : 오라클 데이터베이스에서 제공하는 롤 중 하나. 롤은 여러 권한을 하나의 이름으로 묶어 권한 부여 작업을 간편하게 함. 
-- GRANT문에 RESOURCE를 지정하지 않으면 사용자에게 테이블 생성 권한을 부여해도 CREATE문으로 테이블을 생성할 수 없거나 생성해도 INSERT문에서 오류 발생.
-- RESOURCE 롤에는 사용자를 생성할 때 사용 테이블 스페이스의 영역을 무제한으로 사용 가능하게 해주는 권한이 포함되어 있음.
-- 위 권한은 엄밀한 관리가 필요한 경우 적절치 않으므로 사용자를 생성 및 수정할 때 QOUTA절로 사용 영역에 제한을 둔다.
alter user orclstudy quota 2m on users;

-- 시스템 권한 취소 , GRANT 명령어로 부여한 권한 취소는 REVOKE 명령어를 사용한다.
-- revoke [시스템 권한] from [사용자 이름/롤(Role)이름/public]

-- 객체 권한 부여 , GRANT문을 사용한다.
-- grant [객체 권한/ALL PRIVILEGES] on [스키마.객체이름] to [사용자 이름/롤(Role)이름/PUBLIC] [WITH GRANT OPTION];
-- grant [객체 권한/ALL PRIVILEGES] : 권한 지정. 여러 개 부여 시 쉼표로 구분. ALL PRIVILEGES는 객체의 모든 권한을 부여함.(필수)
-- on [스키마.객체이름] : 권한을 부여할 대상 객체를 명시.(필수)
-- to [사용자 이름/롤(Role)이름/PUBLIC] : 권한을 부여하려는 대상 지정. 사용자 이름, 롤을 지정할 수도 있음. 여러 개 적용하려면 쉼표로 구분. PUBLIC은 전체에 부여.
-- [WITH GRANT OPTION] : 현재 GRANT문을 통해 부여받은 권한을 다른 사용자에게 부여할 수 있는 권한도 함께 부여받음. 
-- 현재 권한을 부여받은 사용자의 권한이 사라지면, 다른 사용자에게 재부여된 권한도 함께 사라짐(선택)

-- ORCLSTUDY 사용자에게 TEMP 테이블 권한 부여하기
conn SCOTT/tiger 
create table temp(col1 varchar(20), col2 varchar(20)); 
grant select on temp to orclstudy;
grant insert on temp to orclstudy;


-- ORCL에게 TMEP 테이블의 여러 권한을 한 번에 부여하기
grant select, insert on temp to orclstudy;

-- SYSTEM 계정으로 ROLESTUDY 롤 생성 및 권한 부여하기
conn SYSTEM/oracle 
create role rolestudy; 
grant connect, resource, create view, create synonym to rolestudy;

-- ORCLSTUDY 사용자에게 롤(RIKESTUDY) 부여하기
grant rolestudy to orclstudy;

-- 부여된 롤 취소
revoke rolestudy from orclstudy; 

-- 롤 삭제. 롤을 삭제하면 해당 롤을 부여받은 모든 사용자의 롤이 취소됨.
drop role rolestudy;



-- 연습 문제 1.
create user PREV_HW identified by ORCL;
grant create session to PREV_HW;

drop user PREV_HW;