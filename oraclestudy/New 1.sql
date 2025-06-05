desc emp;       -- emp 테이블 구조 보기
select * from emp; -- emp 테이블 내용 보기

desc dept;      -- dept 테이블 구조 보기
select * from dept; -- dept 테이블 내용 보기

desc bonus;     -- bonus 테이블 구조 보기
select * from bonus; -- bonus 테이블 내용 보기

desc salgrade;  -- salgrade 테이블 구조 보기
select * from salgrade; -- salgrade 테이블 내용 보기


select EMPNO, ENAME, DEPTNO from emp; -- 열을 쉼표로 구분하여 출력하기

select DEPTNO from EMP;

select DISTINCT DEPTNO from emp; -- 열의 중복 데이터 삭제하기

select DISTINCT JOB, DEPTNO from emp; -- 여러개 열을 명시하여 중복 제거

select all job, deptno from emp; -- 직책, 부서 번호 출력

select ename, sal, sal*12+comm, comm from emp; -- 열에 연산식을 사용하여 출력하기

select ename, sal, sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+comm, comm from emp;  -- 곱하기를 사용하지 않고 출력하기

select ename, sal, sal*12+comm as annsal, comm from emp; -- 별칭 사용하여 연간 총 수입 출력
-- 연산 및 가공된 문장 이후 한 칸 띄운 후 'AS' 한 칸 뒤에 별칭 지정

select * from emp order by sal; -- emp테이블을 급여 기준으로 오름차순 정렬
select * from emp order by sal desc; -- emp테이블을 급여 기준으로 내림차순 정렬

select * from emp order by deptno asc, sal desc; -- emp 테이블을 부서번호(오름차순)와 급여(내림차순)으로 정렬
-- 앞에 쓴 deptno가 1순위, sel이 2순위로 정렬

select * from emp; -- emp 테이블의 모든 열 출력하기

select * from emp where deptno = 30; -- 부서번호가 30인 사람만 출력

select * from emp where deptno  = 30 and job = 'SALESMAN'; -- and연산자로 여러개의 조건식 사용 (deptno 30, job salesman)

select * from emp where deptno = 30 or job = 'CLERK'; -- or 연산자로 여러개의 조건식 사용 (deptno 30이거나 job salesman)

select * from emp where sal * 12 = 36000; -- 곱셈 산술 연산자 사용

select * from emp where sal >= 3000; -- 대소 비교 연산자 사용하여 출력

select * from emp where ename >= 'F'; -- 문자를 대소 비교 연산자로 비교. (사원 이름 첫문자가 F거나 F뒤쪽인 경우 출력)

select * from emp where ename <= 'FORZ'; -- 문자열을 대소 연산자로 비교 (사원 이름 끝 글자가 Z거나 Z앞쪽인 경우 출력)

select * from emp where sal != 3000;  -- 등가 비교 연산자 / sal이 3000이면 true, 다를경우 false 반환

select * from emp where sal <> 3000; -- 등가 비교 연산자 / sal이 3000이면 true, 다를경우 false 반환

select * from emp where sal ^= 3000; -- 등가 비교 연산자 / sal이 3000이면 true, 다를경우 false 반환

select * from emp where not sal = 3000; -- 논리 부정 연산자 / not 연산자를 사용하여 출력

select * from emp where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK'; -- OR연산자로 여러개의 조건 만족하는 데이터 출력

select * from emp where job in ('MANAGER', 'SALESMAN', 'CLERK'); -- IN 연산자를 사용하여 출력

select * from emp where job != 'MANAGER' and job <> 'SALESMAN' and job ^= 'CLERK'; -- 등가 비교 연산자와 AND 연산자를 사용해 출력

select * from emp where job not in ('MANAGER', 'SALESMAN', 'CLERK'); -- in연산자와 논리부정 연산자로 더 깔끔하게 출력

select * from emp where sal >= 2000 and sal <= 3000; -- 대소 비교 연산자와 AND 연산자를 사용해 출력

select * from emp where sal between 2000 and 3000; -- between a and b 연산자를 사용하여 깔끔하게 출력

select * from emp where sal not between 2000 and 3000; -- between a and b와 not 연산자를 사용하여 출력

select * from emp where ename like 'S%'; -- LIKE 연산자 / ename값이 대문자 S로 시작하는 데이터 조회

select * from emp where ename like '_L%'; -- 사원 이름의 두 번째 글자가 L인 사원 출력

select * from emp where ename like '%AM%'; -- 사원 이름에 AM이 포함된 사원 출력

select * from emp where ename not like '%AM%'; -- 사원 이름에 AM이 포함되지 않은 데이터 출력

select ename, sal, sal*12+comm as annsal, comm from emp; -- 별칭을 사용하하여 열 이름 출력하기

select * from emp where COMM = null; -- where은 조건식 결과값이 true인 값만 출력해서 null이 들어가면 그냥 출력을 안 해버리게 되어 false인지 null인지 구분 안됨
-- 그래서 이를 구분하기 위하여 is null 연산자를 사용

select * from emp where COMM is null; -- COMM값이 존재하지 않는 데이터만 출력함

select * from emp where mgr is not null; -- MGR 값이 존재하는 데이터만 출력함

select * from emp where sal > null or comm is null; -- or 연산자와 null 연산자 사용하기

select * from emp where sal > null and comm is null; -- and 연산자와 is null 연산자 사용

select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal, deptno from emp where deptno = 20;
-- 집합 연산자(UNIOM)를 사용하여 출력

-- 집합 연산자(UNION)를 사용하여 출력 ( 출력 열 개수가 다를 때 )
-- select EMPNO, ENAME, SAL, DEPTNO from emp where DETPNO = 10 UNION select EMPNO, ENAME, SAL from emp where DEPTNO = 20;
-- 부적절한 식별자로 오류.

-- 집합 연산자(UNION)를 사용하여 출력하기 ( 출력 열의 자료형이 다를 때 )
-- select empno, ename, sal, deptno from emp where deptno = 10 union select ename, empno, deptno, sal from emp where deptno = 20;
-- 오류. 대응하는 식과 같은 데이터 유형이어야 함.

-- 집합 연산자(UNION)를 사용하여 출력 (열 개수와 자료형이 같을 때)
select empno, ename, sal, deptno from emp where deptno = 10 union select sal, job, deptno, sal from emp where deptno = 20;
-- 집합 연산자를 사용할 경우 열 개수와 자료형이 같아야 한다.

-- 집합 연산자(UNION)를 사용하여 출력하기 ( 출력 결과 데이터가 같을 때 )
select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal, deptno from emp where deptno = 10;

-- 집합 연산자(UNION)를 사용하여 출력하기 ( 출력 결과 데이터가 같을 때 , union all )
select empno, ename, sal, deptno from emp where deptno = 10 union all select empno, ename, sal, deptno from emp where deptno = 10;
-- union은 중복 데이터 제거한 상태로 출력, union all은 중복 데이터도 모두 출력하므로 결과값이 다름

-- 집합 연산자(MINUS)를 사용하여 출력하기 , MINUS : 차집합
select empno, ename, sal, deptno from emp minus select empno, ename, sal, deptno from emp where deptno = 10;
-- select문의 결과에서 10번 부서에 있는 사원데이터를 제외한 결과값

-- 집합 연산자(INTERSECT)를 사용하여 출력하기, INTERSECT : 교집합
select empno, ename, sal, deptno from emp intersect select empno, ename, sal, deptno from emp where deptno = 10;
-- select문의 결과값이 같은 데이터만 출력


select empno, job, comm from emp;

select distinct deptno from emp;

select all deptno from emp;

select ename, sal, sal*12+comm as annsal, comm from emp;

select * from emp order by deptno asc, sal desc;

select job from emp;

select all empno as EMPLOYEE_NO, ename as EMPLOYEE_NAME, mgr as MANAGER, sal as SALARY, comm as COMMISSION, deptno as DEPARTMENT_NO from emp order by ename;

select * from emp where deptno = 10 or empno = 7782;

select * from emp where sal*12 = 36000;

select * from emp where sal >= 3000;

select * from emp where job not in ('MANAGER', 'SALESMAN');

select * from emp where sal not between 2000 and 3000;

select * from emp where ename not like '%O%';

select * from emp where ename like '%A%';

select ename, sal, sal*12+comm as annsal, comm from emp;

select * from emp where comm is not null;

select * from emp where deptno = 10 union select * from emp where deptno = 20;

select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal, deptno from emp where deptno = 10;
select empno, ename, sal, deptno from emp where deptno = 10 union ALL select empno, ename, sal, deptno from emp where deptno = 10;

select empno, ename, sal, deptno from emp minus select empno, ename, sal, deptno from emp where deptno = 10;

select empno, ename, sal, deptno from emp intersect select empno, ename, sal, deptno from emp where deptno = 10;

select * from emp where ename like '%S';

select empno, ename, job, sal, deptno from emp where deptno = 30 and job = 'SALESMAN';

select empno, ename, job, sal, deptno from emp where deptno in (20, 30) and sal > 2000;
select empno, ename, job, sal, deptno from emp intersect select empno, ename, job, sal, deptno from emp where deptno in (20, 30) and sal > 2000; 

select * from emp where not sal >= 2000 and sal <= 3000;

select ename, empno, sal, deptno from emp where ename like '%E%' and deptno = 30 and sal not between 1000 and 2000;

select * from emp where comm is null and mgr is not null and job in ('MANAGER', 'CLERK') and ename not like '_L%';
   
select * from emp, dept where emp.deptno = dept.deptno order by empno; -- 열 이름을 비교하는 조건식으로 조인

select * from emp e, dept d where e.deptno = d.deptno order by empno; -- 위 조인식에 별칭을 넣음.

select empno, ename, deptno, dname, loc from emp e, dept d where e.deptno = d.deptno; -- 등가조인 시 주의할 점. 두 테이블의 열 이름을 구분없이 명시하면 오류 발생.

select e.empno, e.ename, d.deptno, d.dname, d.loc from emp e, dept d where e.deptno = d.deptno order by d.deptno, e.empno;
-- 열 이름에 각각의 테이블 명도 같이 붙이자 제대로 실행됨.

-- where 절에 추가로 조건식 넣어 출력하기
select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc from emp e, dept d where e.deptno = d.deptno and sal >= 3000;

-- 연습문제
select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc from emp e, dept D where e.deptno = d.deptno and e.sal <= 2500 and e.empno <= 9999 order by e.empno;
-- emp 별칭 e, dept 별칭 d, 등가 조인, 조건 : 급여 2500이하 사원번호 9999이하를 SQL문 코드로 작성

-- 급여 범위를 지정하는 조건식으로 조인하기 (비등가조인)
select * from emp e, salgrade s where e.sal between s.losal and s.hisal; -- salgrade 테이블에서 losal 값과 hisal 값을 가져와서 조인
-- 비등가조인은 자주 쓰이는 방식은 아님. 그러나 조인 조건이 특정 열의 일치하는 검사 방식 외에도 다른 방식도 사용 가능.


-- 자체조인(self join) : from절에 같은 테이블을 여러 번 명시하되 테이블의 별칭을 다르게 정한다.
select e1.empno, e1.ename, e1.mgr, e2.empno as mge_empno, e2.ename as mgr_ename from emp e1, emp e2 where e1.mgr = e2.empno;
-- select문 내부에서 별칭을 달리 주어 다른 테이블인 것처럼 해서 두 테이블을 조인함.

-- 외부조인 : 두 테이블 간의 조인 수행에서 조인 기준 열의 어느 한쪽이 NULL이어도 강제 출력하는 방식
-- 외부 조인을 사용하지 않는 등가, 자체 조인은 조인 조건에 해당하는 데이터가 존재하는 경우에만 출력함. 때문에 외부 조인과 반대 의미로 내부조인(inner join)이라고 함.
-- 외부조 인은 영문 그대로 아우터조인(outer join)이라고 더 많이 부름.

-- 왼쪽, 오른쪽 외부조인, 좌우 지정하는 법 : 조인 기준 열 중 한쪽에 (+)을 붙임.
select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1, emp e2 where e1.mgr = e2.empno(+) order by e1.empno; -- 왼쪽 외부 조인 사용
select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1, emp e2 where e1.mgr(+) = e2.empno order by e1.empno; -- 오른쪽 외부 조인 사용

-- NATURAL JOIN : 조인 대상 테이블에 이름과 자료형이 같은 열을 찾은 후 그 열을 기준으로 등가 조인을 하는 방식.
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc from emp e natural join dept d order by deptno, e.empno; -- deptno 열을 기준으로 등가 조인됨.

-- JOIN ~ USING JOIN : 자동으로 열을 지정하던 NATURAL조인과 달리 USING 키워드에 조인 기준으로 사용할 열을 명시하여 사용함. 
-- from [table1] join [table2] using [조인에 사용한 기준열], 조인 기준 열로 명시된 열은 select 절에서 테이블 이름을 붙이지 않고 작성.
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc from emp e join dept d using (deptno) where sal >= 3000 order by deptno, e.empno;

-- JOIN ~ ON : 기본 where절에 있는 조건식을 ON 앞에 작성하여 그 밖의 출력행을 걸러내기 위해 where 조건식을 따로 사용하는 방식.
--  from [table1] join [table2] on [조인조건식]
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc from emp e join dept d on (e.deptno = d.deptno) where sal <= 3000 order by e.deptno, empno;

-- OUTER JOIN : 외부 조인에 사용. 다른 SQL-99 방식의 조인과 마찬가지로 where절이 아닌 from절에서 외부 조인을 선언.
-- 왼쪽 외부 조인을 SQL-99로 작성해보기
select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 left outer join emp e2 on (e1.mgr = e2.empno) order by e1.empno;
-- 오른쪽 외부 조인을 SQL-99로 작성해보기
select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 right outer join emp e2 on (e1.mgr = e2.empno) order by e1.empno, mgr_empno;
--전체 외부 조인을 SQL-99로 작성하기
select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 full outer join emp e2 on (e1.mgr = e2.empno) order by e1.empno;
-- SQL-99 방식으로 세 개 이상의 테이블을 조인: from table1, table2, table3 where table1.col = table2.col and table2.col = table.col

-- where 절에 조건식으로 조인하던 방식과 달리 SQL-99 조인은 from절에 특정 키워드를 사용함으로써 테이블을 조인하는 방식이다.
-- 기존 조인 방식보다 더 간략하고 명시적. 여러 테이블을 조인할 때 좋음.

-- 239p Q1. 급여(SAL)가 2000 초과인 사원들의 부서 정보, 사원 정보를 오른쪽과 같이 출력.
-- SQL-99 이전 방식
select d.deptno, d.dname, e.empno, e.ename, e.sal from emp e, dept d where e.deptno = d.deptno and sal > 2000 ;
-- SQL-99 방식
select deptno, d.dname, e.empno, e.ename, e.sal from emp e NATURAL JOIN dept d where sal > 2000 ;


-- INSERT문

-- DEPT 테이블을 복사해서 DEPT_TEMP 테이블 만들기
create table dept_temp as select * from dept;

-- DEPT_TEMP 테이블 전체 열 조회하기
select * from dept_temp;

-- 테이블 삭제 명령어
-- drop table 테이블 이름;

-- 테이블에 데이터를 추가하는 INSERT문
-- insert into 테이블 이름 [(열1, 열2...)] values (열1에 들어갈 데이터, 열2에 들어갈 데이터...);

-- DEPT_TEMP 테이블에 데이터 추가하기
insert into dept_temp (deptno, dname, loc) values (50, 'DATABASE', 'SEOUL');
select * from dept_temp; -- 위 아래 한줄씩 따로 실행하기

-- INSERT 문 오류 발생하는 경우 : INSERT문에서 지정한 열 개수와 각 열에 입력할 데이터 개수가 일치하지 않거나 자료형이 맞지 않는 경우, 열 길이를 초과하는 데이터를 지정하면 오류 발생.
-- 1. 지정한 열보다 입력하는 데이터의 개수가 적음 2. 지정한 열보다 입력하는 데이터의 개수가 많음
-- 3. 숫자 데이터가 들어가야 하는 열에 문자열 데이터 지정. 4. 두자리 숫자까지 허용되는 열에 세자리 이상의 숫자를 지정 등

-- INSERT문에 열 지정 없이 데이터 추가하기
insert into dept_temp values (60, 'NETWORK', 'BUSAN');
select * from dept_temp;
 
-- INSERT문으로 테이블에 NULL값을 집적 입력하는 법과 대상 열을 생략하여 암시적으로 입력하는 방식이 있음.

-- null을 지정하여 입력하기 (직접입력)
insert into dept_temp (deptno, dname, loc) values (70, 'WEB', null);
select * from dept_temp;

-- 빈 공백 문자열로 NULL을 입력하기 (직접 입력)
insert into dept_temp (deptno, dname, loc) values (80, 'MOBILE', '');
select * from dept_temp;

-- 열 데이터를 넣지 않는 방식으로 NULL 데이터 입력하기 (암시적 입력)
insert into dept_temp (deptno, loc) values (90, 'INCHEON');
select * from dept_temp; -- DNAME 열을 INSERT문에서 제외시켜서 자동으로 DNAME에 NULL값이 들어감.

-- 테이블에 날짜 데이터 입력
-- EMP 테이블을 복사해서 EMP_TEMP 테이블 만들기
create table emp_temp as select * from emp where 1 <> 1;
select * from emp_temp;
-- 급하게 테이블을 복사해야 할 때, where에 1 <> 1을 넣어 테이블 양식은 복사하지만 데이터는 복사하지 않는 방법이다.

-- INSERT문으로 날짜 데이터 입력하기 (날짜 사이에 / 입력)
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (9999, '홍길동', 'PRESIDENT', null, '2001/01/01', 5000, 1000, 10);
select * from emp_temp;

-- INSERT문으로 날짜 데이터 입력하기(날짜 사이에 - 입력)
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (1111, '성춘향', 'MANAGER', 9999, '2001/01/01', 4000, NULL, 20);
select * from emp_temp;

-- 날짜 데이터 입력 시 주의점 : 년/월/일 순서와 반대로 일/월/년 순서로 데이터를 입력하면 오류가 발생하고 데이터가 입력되지 않음.

-- TO_DATE 함수를 사용하여 날짜 데이터 입력하기
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (2111, '이순신', 'MANAGER', 9999, TO_DATE('07/01/2001', 'DD/MM/YYYY'), 4000, null, 20);
-- TO_DATE 함수를 사용하여 07은 일(DD) 01은 월(MM) 2001은 년(YYYY)으로 인식하도록 날짜 데이터 자료형으로 변환.
select * from emp_temp;

-- SYSDATE를 사용하여 날짜 데이터 입력하기
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (3111, '심청이', 'MANAGER', 9999, SYSDATE, 4000, null, 30);
select * from emp_temp;
-- 사용 환경 혹은 설정에 따라 오전/오후 시간이 함께 출력되기도 한다.

-- 서브쿼리로 한 번에 여러 데이터 추가하기
-- INSERT문은 모두 실행했을 때 한 행의 데이터가 추가됨. 여기에 서브쿼리를 사용하면 select문으로 한 번에 여러 행의 데이터 추가 가능

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno from emp e, salgrade s where e.sal between s.losal and s.hisal and s.grade = 1;
select * from emp_temp;

-- INSERT문에서 서브쿼리를 사용할 때 유의할 점
-- 1. VALUES절은 사용하지 않는다.
-- 2. 데이터가 추가되는 테이블의 열 개수와 서브쿼리의 열 개수가 일치해야 한다.
-- 3. 데이터가 추가되는 테이블의 자료형과 서브쿼리의 자료형이 일치해야 한다.


-- 테이블 데이터 수정하기
-- DEPT 테이블을 복사해서 DEPT_TEMP2 테이블 만들기
create table dept_temp2 as select * from dept;
select * from dept_temp;

-- UPDATE문의 기본 사용법 : UPDATE [변경할 테이블] SET [변경할 열1]=[데이터], [변경할 열2]=[데이터]... [where 데이터를 변경할 대상 행을 선별하기 위한 조건];
-- UPDATE: 데이터를 수정할 테이블 지정. SET: 변경할 열을 선택하고 데이터를 입력. WHERE: 테이블의 변경할 데이터 선별 조건식 지정. 생략할 경우 모든 열의 데이터가 변경됨.

-- 데이터 전체 수정하기
-- DEPT_TEMP2 테이블 업데이트하기
update dept_temp2 set loc = 'SEOUL';
select * from dept_temp2;

-- 수정한 내용 되돌리기 : rollback;
rollback;

-- 테이블 데이터 중 일부분만 수정하기
update dept_temp2 set dname = 'DATABASE', loc = 'SEOUL' where deptno = 40;
select * from dept_temp2;

-- 서브쿼리를 사용하여 데이터 수정하기 : 여러 열을 한번에 수정하는 경우
-- 서브쿼리로 데이터 일부분 수정하기
update dept_temp2 set(dname, loc) = (select dname, loc from dept where deptno = 40) where deptno = 40;
select * from dept_temp2; -- 메인쿼리의 dname, loc 두 개 열 값을 한 번에 변경.

-- 열 하나하나를 수정하는 경우
update dept_temp2 set dname = (select dname from dept where deptno = 40), loc = (select loc from dept where deptno = 40) where deptno = 40;
select * from dept_temp2; 
-- 이때 서브쿼리에 나열한 열과 UPDATE문으로 변경할 열 개수나 자료형이 일치해야 한다.

-- UPDATE문의 WHERE절에 서브쿼리 사용하기 
UPDATE DEPT_TEMP2 SET LOC = 'SEOUL' WHERE DEPTNO = (SELECT DEPTNO FROM DEPT_TEMP2 WHERE DNAME = 'OPERATIONS');
SELECT * FROM DEPT_TEMP2;

-- UPDATE문을 사용할 때 유의점 : 오류가 발생하기 쉽기 때문에 실행 전 UPDATE문의 WHERE절을 검증하는 작업 필요.
-- 검증: 해당 WHERE절을 UPDATE문에 넣어 실행하기 전에 SELECT문에서 먼저 사용해본다.
update dept_temp2 set dname = 'DATABASE', loc = 'SEOUL' where deptno = 40; -- 임의로 만든 UPDATE문
select * from dept_temp2 where deptno = 40; -- 위 UPDATE문의 검증문

-- 테이블에 있는 데이터 삭제
-- EMP 테이블을 복사해서 EMP_TEMP2 테이블 만들기
create table emp_temp2 as select * from emp;
select * from emp_temp2; -- 임의의 테이블 제작 완료

-- DELETE문의 기본 형식
-- delete [from] [테이블이름] [where 삭제할 대상 행을 선별하기 위한 조건식];
-- delete : 삭제할 테이블 지정, where: 삭제할 데이터를 선별하는 조건식을 지정. 생략할 경우 모든 데이터 삭제.

 -- 데이터 일부분만 삭제하기
 delete from emp_temp2 where job = 'MANAGER'; -- 'MANAGER' 데이터만 삭제
 select * from emp_temp2;
 
 -- where절에 서브쿼리를 사용하여 데이터 일부만 삭제
delete from emp_temp2 where empno in (select e.empno from emp_temp2 e, salgrade s where e.sal between s.losal and s.hisal and s.grade = 3 and deptno = 30);
select * from emp_temp2; -- 서브쿼리의 결과 값이 여러개이므로 IN 연산자도 사용함.

-- 문제 풀이
-- EMP_TEMP 테이블에서 급여가 3000 이상인 사원을 삭제하는 코드 작성
delete from emp_temp where sal >= 3000;

-- 테이블에 있는 데이터 전체 삭제하기
delete from emp_temp2; -- 삭제하기 전 where절의 조건식이 정확히 삭제할 대상을 선택하고 있는지 select문을 사용하여 반드시 검증해야 한다.
select * from emp_temp2; 


create table chap10hw_emp as select * from emp;
create table chap10hw_dept as select * from dept;
create table chap10hw_salgrade as select * from salgrade;

-- 문제풀이 1. chap10hw_dept 테이블에 50, 60, 70, 80번 부서를 등록하는 SQL문을 작성
insert into chap10hw_dept (deptno, dname, loc) values (50, 'ORACLE', 'BUSAN');
insert into chap10hw_dept (deptno, dname, loc) values (60, 'SQL', 'BUSAN');
insert into chap10hw_dept (deptno, dname, loc) values (70, 'SELECT', 'BUSAN');
insert into chap10hw_dept (deptno, dname, loc) values (80, 'DML', 'BUSAN'); 
select * from chap10hw_dept;

-- 문제풀이 2. chap1-hw_emp 테이블에 8명의 사원 정보를 등록.
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (7201, 'TEST_USER1', 'MANAGER', 7788, to_date('2016/01/02', 'YYYY/MM/DD'), 4500, null, 50);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (7202, 'TEST_USER2', 'CLERK', 7201, to_date('2016/02/21', 'YYYY/MM/DD'), 1800, null, 50);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (7203, 'TEST_USER3', 'ANALYST', 7201, to_date('2016/04/11', 'YYYY/MM/DD'), 3400, null, 60);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (7204, 'TEST_USER4', 'SALESMAN', 7201, to_date('2016/05/31', 'YYYY/MM/DD'), 2700, null, 60);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (7205, 'TEST_USER5', 'CLERK', 7201, to_date('2016/07/20', 'YYYY/MM/DD'), 2600, null, 70);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (7206, 'TEST_USER6', 'CLERK', 7201, to_date('2016/09/08', 'YYYY/MM/DD'), 2600, null, 70);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (7207, 'TEST_USER7', 'LECTURER', 7201, to_date('2016/10/28', 'YYYY/MM/DD'), 2300, null, 80);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (7208, 'TEST_USER8', 'STUDENT', 7201, to_date('2018/03/09', 'YYYY/MM/DD'), 1200, null, 80);
select * from chap10hw_emp; 

-- 문제풀이 3. CHAP10HW_EMP에 속한 사원 중 50번 부서에서 근무하는 사원들의 평균 급여보다 많은 급여를 받고있는 사원들을 70번 부서로 옮기는 SQL문 작성.
update chap10hw_emp set deptno = 50 where sal > (select AVG(sal) from chap10hw_emp where deptno = 70);
select * from chap10hw_emp;

-- 문제풀이 4. CHAP10HW_EMP에 속한 사원 중, 60번 부서의 사원 중 입사일이 가장 빠른 사원보다 늦게 입사한 사원의 급여를 10% 인상하고 80번 부서로 옮기는 SQL문을 작성.
update chap10hw_emp set sal = sal*1.1, deptno = 80 where hiredate > (select min(hiredate) from chap10hw_emp where deptno = 60);
select * from chap10hw_emp;

-- 문제풀이 5. CHAP10HW_EMP에 속한 사원 중, 급여 등급이 5인 사원을 삭제하는 SQL문 작성
delete from chap10hw_emp where empno in (select e.empno from chap10hw_emp e, chap10hw_salgrade s where e.sal between s.losal and s.hisal and s.grade = 5);
select * from chap10hw_emp;

-- 테이블 불러오기
create table dept_tcl as select * from dept; 
select * from dept_tcl;

insert into dept_tcl values(50, 'DATABASE', 'SEOUL');
update dept_tcl set loc = 'BUSAN' where deptno = 40;
delete from dept_tcl where dname = 'RESEARCH';
select * from dept_tcl;

-- 트랜잭션을 취소하고 싶을 때는 ROLLBACK
rollback;
select * from dept_tcl;

-- 트랙잭션을 영원히 반영하고 싶을 때는 COMMIT
-- DEPT_TCL 테이블에 데이터를 입력, 수정, 삭제하기
insert into dept_tcl values (50, 'NETWORK', 'SEOUL');
update dept_tcl set loc = 'BUSAN' where deptno = 20;
delete from dept_tcl where deptno = 40;
select * from dept_TCL

COMMIT; -- 입력한 데이터를 COMMIT으로 영구 반영

-- 세션(session) 데이터베이스 접속을 시작으로 여러 데이터 베이스에서 관련 작업을 수행한 후 접속을 종료하기까지의 전체 기간
-- 특정 세션에서 조작중인 데이터는 트랜잭션이 완료(COMMIT, ROLLBACK)되기 전까지 잠금(LOCK)상태.
-- 이때 다른 세션은 완료하기 전까지 기다림. 이를 행(HANG)이라고 함.
-- LOCK는 데이터를 여러 곳에서 동시에 조작하려 할 때 발생하는 혼란을 최소화 하기 위해 있는 시스템.
-- 대상 데이터가 테이블의 특정 행 데이터일 경우 해당 행만 LOOK이 발생하는 것 : 행 레벨 록(row level lock)
-- where절을 지정하지 않은 UPDATE, DELETE문은 모든 행이 LOCK상태가 됨. (그러나 테이블 전체 행이 LOCK 상태여도 INSERT문의 수행은 가능함.)
-- 테이블 단위 잠금 : 테이블 레벨 록 (table level lock)

-- 정의어
-- Create table 소유계정.테이블이름(열1이름 열1자료형, 열2이름 열2자료형...);

-- 테이블 이름 생성 규칙
-- 1. 문자로 시작해야 한다(한글도 가능, 숫자 불가능)
-- 2. 30byte 이하 (영어 30자 한글 15자)
-- 3. 같은 사용자 소유의 테이블 이름은 중복 안됨
-- 4. 영문자(한글 가능), 숫자, 특수문자($, #, _) 사용 가능
-- 5. SQL 키워드는 테이블 이름으로 불가능 (SELECT. FROM 등)

-- 열 이름 생성 규칙
-- 1. 문자로 시작해야 한다
-- 2. 30byte 이하
-- 3. 한 테이블의 열 이름은 중복X(EMP테이블에 EMPNO열 두 개 존재 불가)
-- 4. 영문자(한글 가능), 숫자, 특수문자($, #, _) 사용 가능
-- 5, SQL 키워드는 열 이름으로 사용 불가

-- 모든 열의 각 자료형을 정의하여 테이블 생성하기
create table EMP_DDL(empno number(4), ename varchar2(10), job varchar2(9), mgr number(4), hiredate date, sal number(7, 2), comm number(7, 2), deptno number(2));
DESC EMP_DDL;

-- CREATE 문에 서브쿼리를 활용하여 테이블을 생성하는 방법을 가장 많이 사용한다.이때 AS키워드를 함께 쓴다.
-- 다른 테이블을 복사하여 테이블 생성하기
create table dept_ddl as select * from dept;
desc dept_ddl;

-- DEPT_DDL 테이블 전체 조회하기
select * from dept_ddl;

-- 다른 테이블의 일부를 복사하여 테이블 생성
create table emp_ddl_30 as select * from emp where deptno = 30; 
select * from emp_ddl_30; -- emp 테이블과 열 구조는 같지만 30번 부서 사원 데이터만 저장함

-- 다른 테이블의 열 구조만 복사하여 새 테이블 생성하기
create table empdept_ddl as select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, d.deptno, d.dname, d.loc from emp e, dept d where 1<>1;
select * from empdept_ddl; -- 서브쿼리에서 지정한 열 구조를 가지지만 데이터는 저장 X (1 <> 1 때문에)

-- alter : 이미 생성된 오라클 데이터베이스 객체를 변경할 때 사용
-- emp 테이블을 복사하여 emp_alter테이블 생성
create table emp_alter as select * from emp;
select * from emp_alter;

-- add : 테이블에 열 추가하기
-- alter 명령어로 hp 열 추가하기
alter table emp_alter add hp varchar2(20);
select * from emp_alter; 

-- rename : 열 이름 변경
-- alter 명령어로 hp 열 이름 tel로 변경하기
alter table emp_alter rename column hp to tel;
select * from emp_alter;

-- modify : 열의 자료형을 변경
-- alter 명령어로 empno 열 길이 변경하기
alter table emp_alter modify empno number(5);
desc emp_alter;
 
-- drop : 특정 열을 삭제할 때 사용
-- alter 명령어로 tel열 삭제하기
alter table emp_alter drop column tel;
select * from emp_alter;

-- 테이블 이름 변경하기 (rename)
rename emp_alter to emp_rename;
desc emp_alter; -- 이름을 변경하여 원래의 이름 사용 불가

-- 변경된 테이블 이름(emp_rename)으로 조회
select * from emp_rename;  -- 조회됨

-- reuncate : 테이블의 모든 데이터 삭제. 데이터 조작어 중 where절을 명시하지 않은 delete문으로도 대체 가능. 
-- 그러나 truncate는 데이터 정의어이기 때문에 rollback이 되지 않음. 복구 불가.
-- emp_rename 테이블의 전체 데이터 삭제해보기
truncate table emp_rename; -- 전체 삭제
select * from emp_rename; -- 삭제된 것을 볼 수 있음

-- drop : 테이블 삭제
-- emp_rename 테이블 삭제
drop table emp_rename;
desc emp_name; -- 삭제된 것을 볼 수 있다.


-- 연습문제 1. 
create table emp_hw (empno number(4), ename varchar2(10), job varchar2(9), mgr number(4) HIREDATE date, sal number(7, 2) comm number(7,2), deptno number(2));

-- 연습문제 2. 
alter table emp_hw add bigo varchar(20);

-- 연습문제 3.
alter table emp_hw modify bigo varchar(30);

-- 연습문제 4. 
alter table emp_hw rename column bigo to remark;

-- 객체 : 테이블, 데이터 사전, 인덱스, 뷰, 시퀀스, 동의어 등
-- 데이터 사전 : 데이터베이스를 구성하고 운영하는데 필요한 모든 정보를 저장하는 특수 테이블, 데이터베이스가 생성되면 자동생성
-- 사용자 테이블(user) 데이터 사전(data dictionary)으로 나뉨. EMP, DEPT, SALGRADE 테이블 등이 사용자 테이블

-- SCOTT 계정에서 사용 가능한 데이터 사전 살펴보기 
select * from dict;
select * from dictionary;

-- user_ 접두어를 가진 데이터 사전
-- scott 계정이 가지고 있는 객체 정보 살펴보기 (user_ 접두어 사용)
select table_name from user_tables; -- scott 계정이 가지고 있는 테이블 이름이 알고 싶을 때 사용하면 유용하다
-- user_, all_ 등으로 시작하는 것들 뒤에는 복수형 s가 붙음

-- scott 계정이 사용할 수 있는 객체 정보 살펴보기
select owner, table_name from all_tables; -- all_ 접두어를 사용하면 사용 가능한 테이블이 모두 출력됨

-- scott 계정으로 DBA_ 접두어 사용하기
select * from dba_tables;

-- 인덱스 : 데이터 검색 성능의 향상을 위해 테이블 열에 사용하는 객체
-- Tavle Full Scan : 처음부터 끝까지 검색해서 찾는 것, 인덱스 미사용
-- Index Scan : 인덱스를 통해 데이터 찾기

-- SCOTT 계정이 소유한 인덱스 정보 알아보기
select * from user_indexes;

-- SCOTT 계정이 소유한 인덱스 컬럼 정보 알아보기
select * from USER_IND_COLUMNS;
-- 인덱스는 사용자가 직접 특정 테이블의 열에 지정할 수도 있지만 열이 기본키 또는 고유키일 경우 자동으로 생성됨.

-- 인덱스 생성 명령어 : create index. 인덱스를 생성할 테이블 및 열 지정이 가능하며(여러 개 가능) 지정한 열별로 인덱스 정렬 순서(오름차순, 내림차순) 정할 수 있음
--  CREATE INDEX 인덱스 이름 ON 테이블 이름(열 이름1 ASC or DESC 열 이름2 ASC or DESC...);

-- EMP 테이블의 SAL 열에 인덱스를 생성하기
create index idx_emp_sal on emp(sal);
select * from user_ind_columns; -- IDX_EMP_SAL 인덱스가 생성됨. 인덱스 정렬 옵션이 없으면 오름차순으로 정렬됨.

-- 인덱스 삭제 명령어 : DROP
drop index IDX_EMP_SAL;


-- 뷰(view) : 하나 이상의 테이블을 조회하는 select문을 저장한 객체
-- 뷰는 1. 편리성(select문의 복잡도 완화) 2. 보안성(테이블의 특정 열 노출X) 때문에 사용.
-- 뷰 생성 (명령 프롬포트로) SQLPLUS SYSTEM/oracle     GRANT CREATE VIEW TO SCOTT; 입력하여 권한 설정

-- create [or replace] [force | noforce] view 뷰이름 (열이름1, 열이름2...) as (저장할 select문) [with check option [constraint 제약 조건]] [with read only [constraint 제약 조건]];
-- [or replace]: 같은 이름의 뷰가 존재할 경우 현재 생성할 뷰로 대체하여 생성]
-- [froce] : 뷰가 저장할 select문의 기반 테이븰이 존재하지 않아도 강제로 생성
-- [noforce] : 뷰가 저장할 select문의 기반 테이블이 존재할 경우에만 생성(기본값)
-- [with check option] : 지정한 제약 조건을 만족하는 데이터에 한해 DML 작업이 가능하도록 뷰 생성(선택)
-- [with read only] : 뷰의 열람, 즉 select만 가능하도록 뷰 생성(선택)

-- 뷰 생성하기(토드)
create view vw_emp20 as (select empno, ename, job, deptno from emp where deptno = 20); -- cmd에 가서 확인(scott 계정으로 접속하기)
select * from user_views; 

select * from VW_EMP20; -- 생성한 뷰 조회하기
drop view vw_emp20; -- 뷰 삭제하기, 뷰를 삭제한다고 실제 테이블이나 데이터가 삭제되는 것은 아님.
-- 뷰에 데이터 조작어를 직접 사용할 수 있는 경우가 있다. 그러나 여러가지 조건을 만족해야 하며, 오류가 발생하기 쉬워 자주 사용X
-- 뷰의 주 목적은 select문만 자정하여 테이블의 데이터를 열람하는 것.

-- 인라인 뷰(inline viow): create문으로 만들어지는 것 외에 SQL문에서 일회성으로 만들어서 사용하는 것 (select문에서 사용하는 서브쿼리, with절에서 미리 이름을 정의해두고 사용하는 select문 등)
-- ROWNUM을 추가로 조회하기
select ROWNUM, E.* from emp e; -- ROWNUM열은 EMP테이블에 존재하지 않지만 데이터가 숫자로 출력되고 있음.
-- ROWNUM : 의사열(pseudo column)이라고 하는 특수 열. 실제로 사용되지는 않지만 특정 목적을 위해 테이블에 저장되어 있음.

-- EMP테이블을 SAL 열 기준으로 정렬
select rownum, E.* from emp e order by sal desc; 
-- 내림차순으로 정렬했으나 ROWNUM은 앞에서 사용한 Select문의 행 번호와 같은 번호로 매겨져있다. (ORDER BY 절로 정렬해도 유지됨)

-- 인라인 뷰 (서브쿼리 사용)
select ROWNUM, E.* from (select * from emp e order by sal desc) e;

-- 인라인 뷰 (WITH절 사용)
with e as (select * from emp order by sal desc) select rownum, E.* from e;

-- 인라인 뷰로 TOP-N 추출하기 (서브쿼리 사용)
select rownum, e.* from (select * from emp e order by sal desc) e where rownum <= 3;
-- 인라인 뷰로 TOP-N 추출하기 (with절 사용)
with e as (select * from emp order by sal desc) select rownum, e.* from e where rownum <= 3; -- 위 아래 결과값이 동일하다.

-- ***시퀀스*** (매우중요함)
-- : 오라클 데이터베이스에서 특정 규칙에 맞는 연속 숫자를 생성하는 객체. (은행이나 병원의 대기 순번표)
-- create SEQUENCE 시퀀스 이름 [increment by n] [staet with n] [ maxvalue n | nomaxvalue] [ minvalue n | nominvalue ] [ cycle | nocycle ] [ cache n | nocache ] 
-- [increment by n]: 시퀀스에서 생성할 번호의 증가값 (기본값 1)(선택)
-- [staet with n]: 시퀀스에서 생성할 번호의 시작값 (기본값 1)(선택)
-- [ maxvalue n | nomaxvalue ]: 시퀀스에서 생성할 번호의 최댓값 지정, 최댓값은 시작값 이상, 최솟값을 초괏값으로 지정


-- DEPT 테이블을 이용하여 DEPT_SEQUENCE테이블 생성
create table dept_sequence as select * from dept where 1 <> 1; -- 시퀀스를 사용하기 위해 DEPT 테이블의 열만 가져온 테이블 생성
select * from dept_sequence;
 
-- 시퀀스 생성하기
create sequence seq_dept_sequence increment by 10 start with 10 maxvalue 90 minvalue 0 nocycle cache 2;
select * from user_sequences; 

-- 생성된 시퀀스를 사용할 때는 [시퀀스이름.CURRVAL]과 [시퀀스이름.NEXTVAL]을 사용. 
-- CURRVAL > 시퀀스에서 마지막으로 생성한 번호 반환. (사영하고 바로 쓰면 번호가 만들어진 적 없어서 오류남) NEXTVAL > 다음 번호 생성.

-- 시퀀스에서 생성한 순번을 사용한 INSERT문 실행하기
insert into dept_sequence (deptno, dname, loc) values (seq_dept_sequence.nextval, 'DATABASE', 'SEOUL');
select * from dept_sequence order by deptno;

-- 가장 마지막으로 생성된 시퀀스 확인하기
select seq_dept_sequence.currval from dual;

-- 시퀀스에서 생성한 순번을 반복하여 사용하기
insert into dept_sequence (deptno, dname, loc) values (seq_dept_sequence.nextval, 'DATABASE', 'SEOUL');
select * from dept_sequence order by deptno;

-- 시퀀스 수정 : alter명령어로 수정하고 drop 명령어로 삭제, staer with 값은 변경 불가
-- alter sequence 시퀀스이름 [increment by n] [maxvalue n | nomaxvalue ] [minvalue n + nomincalue] [cycel | nocycle] [cache n | nocache]

-- 시퀀스 옵션 수정하기
alter sequence seq_dept_sequence increment by 3 maxvalue 99 cycle;
select * from user_sequences;

-- 옵션을 수정한 시퀀스 조회하기
select * from user_sequences;

-- 수정한 시퀀스를 사용하여 insert문 실행하기
insert into dept_sequence (deptno, dname, loc) values (seq_dept_sequence.nextval, 'DATABASE', 'SEOUL');
select * from dept_sequence order by deptno;

-- CYCLE 옵션을 사용한 시퀀스의 최댓값 도달 후 수행 결과 확인하기
insert into dept_sequence (deptno, dname, loc) values (seq_dept_sequence.nextval, 'DATABASE', 'SEOUL');
select * from dept_sequence order by deptno;

-- 시퀀스 삭제 : DROP SEQUENCE 사용. 시퀀스를 삭제해도 시퀀스를 사용(SEQ_DEPT_SEQUENCE.NETVAL)하여 추가된 데이터는 삭제X
-- 시퀀스 삭제 후 확인하기
drop sequence seq_dept_sequence;
select * from user_sequences;

-- 동의어 : 테이블, 뷰, 시퀀스 등 객체 이름 대신 사용할 수 있는 다른 이름을 부여하는 객체, 주로 이름이 너무 길어서 짧게 만들 때 사용. CREATE문을 사용
-- create [public] synonym 동의어 이름 for [사용자.][객체 이름];
-- [public]: 동의어를 데잍터베이스 내 모든 사용자가 사용할 수 있도록 설정. 생략할 경우 동의어를 생성한 사용자만 사용 가능(public으로 작성되어도 본래 객체의 사용권한이 있어야 사용 가능)(선택)
-- 사용자 : 생성할 동의어의 본래 객체 소유 사용자를 지정. 생략할 경우 현재 접속한 사용자로 지정(선택)
-- 객체이름 : 동의어를 생성할 대상 객체 이름(필수)

-- 덩의어 생성을 위해서는 권한을 부여해야 함. PUBLIC SYNONYM 권한도 따로 부여해야함.

-- EMP 테이블의 동의어 생성하기(토드)
create synonym e for emp;

-- E 테이블의 전체 내용 조회하기(토드)
select * from e;

-- 동의어 삭제하기(토드)
drop synonym e;



-- 제약조건 
-- 테이블의 특정 열에 지정하여 조건에 부합하지 않는 데이터를 저장하지 못하게끔 한다.

-- 오라클 데이터 베이스에서 사용하는 제약 조건
-- NOT NULL : 지정한 열에 NULL을 허용하지 않음. NULL을 제외한 데이터의 중복은 허용.
-- UNIQUE : 지정한 열이 유일한 값이어야 함. 중복X. 단, NULL은 중복에서 제외(가능하다는 뜻)
-- PRIMARY KEY(기본키) : 지정한 열이 유일한 값이어야 함. NULL X. 테이블당 하나만 지정 가능
-- FOREIGN KEY(외래키) : 다른 테이블의 열을 참조하여 존재하는 값만 입력 가능.
-- CHECK : 설명한 조건식을 만족하는 데이터만 입력 가능.

-- NOT NULL : 특정 열에 데이터 중복 여부와 상관 없이 NULL의 저장을 불허하는 제약조건.
-- 테이블을 생성할 때 NOT NULL 설정하기
create table table_notnull(login_id varchar2(20) not null, login_pwd varchar2(20) not null, tel varchar(20));
desc table_notnull;

-- 제약조건이 NOT NULL인 열에 NULL값 넣어보기
insert into table_notnull (login_id, login_pwd, tel) values ('TEST_ID_01', null, '010-1234-5678'); -- 오류 발생.

-- 제약 조건이 없는 TEL 열에 NULL값 입력
insert into table_notnull (login_id, login_pwd) values ('TEST_ID_01', '1234'); -- TEL 열을 비워두어 암시적으로 NULL 삽입
select * from table_notnull; 

-- NOT NULL이 제약 조건이 지정된 열 데이터를 NULL로 UPDATE를 해봐도 실행되지 않는다.
-- update table_notnull set login_pwd = null where login_id = 'TEST_ID_01';

-- *** 제약 조건 확인 ***
-- 지정한 제약 조건 정보를 확인하려면 다음과 같은 USER_CONSTRAINTS 데이터 사전을 활용해야 함.
-- OWNER : 제약 조건 소유 계정
-- CONSTRAINT_NAME : 제약 조건 이름(직접 지정하지 않으면 오라클에서 자동으로 지정)
-- CONSTRAINT_TYPE : 제약 조건 종류 (C : CHECK, NOT NULL), (U: UNIQUE), (P: PRIMARY KEY), (R: FOREIGN KEY)
-- TABLE_NAME : 제약 조건을 지정한 테이블 이름

-- 제약 조건 살펴보기
select owner, constraint_name, constraint_type, table_name from user_constraints;
select * from USER_CONSTRAINTS; -- 전체 확인

-- 테이블을 생성할 때 제약 조건에 이름 지정하기. (지정하지 않으면 오라클에서 자동 지정함)
create table table_notnull2(login_id varchar2(20) constraint tblnn2_lgin_nn not null, login_pwd varchar2(20) constraint tblnn2_lgnpw_n not null, tel varchar2(20));
select owner, constraint_name, constraint_type, table_name from user_constraints;
-- 실무에서는 이름 붙이는 규칙을 정하여 조건 이름을 직접 지정함. (자동 이름은 쉽고 빠르게 찾기 어려워서)

-- 이미 생성한 테이블에 제약조건 추가하기 : ALTER 명령어와 MODIFY 명령어를 사용.
-- TEL 열에 NOT NULL 제약 조건 추가하기
alter table table_notnull modify (tel not null); -- 제약 조건 대상이 되는 열을 가진 데이터 중 추가하려는 제약 조건에 맞지 않는 데이터가 있음. (NULL 값이 있음)

-- UPDATE문으로 데이터 수정
-- TEL 열 데이터 수정하기
update table_notnull set tel = '010-1234-5678' where login_id = 'TEST_ID_01'; 
select * from table_notnull;

-- not null 제약 조건 추가하기 
alter table table_notnull modify(tel not null);
select owner, constraint_name, constraint_type, table_name from user_constraints;

-- 제약 조건에 이름 지정해서 추가하기
alter table table_notnull2 modify(tel constraint tblnn_tel_nn not null);
select owner, constraint_name, constraint_type, table_name from user_constraints;

desc table_notnull2;

-- 이미 생성된 제약 조건 이름 변경하기
alter table table_notnull2 rename constraint tblnn_tel_nn to tblnn2_tel_nn;
select owner, constraint_name, constraint_type, table_name from user_constraints;

-- 제약 조건 삭제
alter table table_notnull2 drop constraint tblnn2_tel_nn;
desc table_notnull2;

-- UNIQUE: 데이터 중복 X, (NULL 제외)
-- 제약 조건 지정하기 (테이블 생성할 때)
create table table_unique(login_id varchar2(20) unique, login_pwd varchar2(20) not null, tel varchar2(20));
desc table_unique;

-- 제약 조건 확인
-- USER_CONSTRAINTS 데이터 사전 뷰로 제약 조건 확인하기
select owner, constraint_name, constraint_type, table_name from user_constraints where table_name = 'TABLE_UNIQUE';

-- TABLE_UNIQUE 테이블에 데이터 입력하기
insert into table_unique (login_id, login_pwd, tel) values ('test_id_01', 'pwd01', '010-1234-5678');
select * from table_unique;

-- LOGIN_ID 열에 중복되는 데이터 넣기
insert into table_unique (login_id, login_pwd, tel) values ('TEST_ID_01', 'PWD01', '010-1234-5678'); -- 오류 발생.

-- TABEL_UNIQUE 테이블에 데이터 입력하기
insert into table_unique(login_id, login_pwd, tel) values ('test_id_02', 'pwd01', '010-1234-5678');
select * from table_unique;

-- UNIQUE 제약 조건과 NULL 값 : NUIQUE에는 중복값이 안 되지만 NULL값을 여러개 넣는 건 가능하다.
-- UNIQUE 제약 조건이 지정된 열에 NULL값 입력하기
insert into table_unique(login_id, login_pwd, tel) values(null, 'PW01', '010-2345-6789');
select * from table_unique;

-- TABLE_UNIQUE 테이블 데이터 수정하기
update table_unique set login_id = 'TEST_ID_01' where login_id is null; -- 오류 발생

-- 테이블을 생성할 때 UNIQUE 제약 조건 설정하기
create table table_unique2(login_id varchar2(20) constraint tblunq2_lgnid_unq unique, login_pwd varchar2(20) constraint tblunq2_lgnpw_nn not null, tel varchar2(20));

-- 생성한 unique 제약 조건 확인하기(USER_CONSTRAINTS 사용)
select owner, constraint_name, constraint_type, table_name from user_constraints where table_name like 'TABLE_UNIQUE%';

-- 이미 생성한 테이블 열에 UNIQUE 제약 조건 추가하기
alter table table_unique modify(tel unique); -- tel 열에 이미 중복값이 있어서 오류 발생.

-- TEL 열 값을 모두 NULL 값으로 변경하기
update table_unique set tel = null;
select * from table_unique;

-- tel 값에 unique 제약 조건 설정하기
alter table table_unique modify(tel unique);

 -- UNIQUE 제약 조건 이름 직접 지정하기
alter table table_unique2 modify (tel constraint tblunq_tel_unq unique);
select owner, constraint_name, constraint_type, table_name from user_constraints where table_name like 'TABLE_UNIQUE%'; -- CONSTRAINT_NAME이 TBLUNQ_TEL_UNQ에서 TBLUNQ2_TEL_UNQ로 수정됨

-- 제약 조건 삭제하기
alter table table_unique2 drop constraint tblun2_tel_unq;
select owner, constraint_name, constraint_type, table_name from user_constraints where table_name like 'TABLE_UNIQUE%';

-- 유일하게 하나만 있는 값 PRIMARY KEY : 데이터 중복X, NULL X.NULL이 아닌 유일한 값을 가지므로 주민등록번호나 EMP테이블의 사원번호 같은 식별 코드 제작에 활용됨.
-- 테이블을 생성할 때 특정 열에 PRIMARY KEY 설정하기
create table table_pk(login_id varchar2(20) primary key, login_pwd varchar2(20) not null, tel varchar2(20));
desc table_pk;

-- 생성한 PRIMARY KEY 확인하기
select owner, constraint_name, constraint_type, table_name from user_constraints where table_name like 'TABLE_PK%';

-- 생성한 PRIMARY KEY를 통해 자동 생성된 INDEX 확인하기
select index_name, table_owner, table_name from user_indexes where table_name like 'TABLE_PK%';

-- 제약 조건의 이름을 직접 지정하여 테이블 생성하기
create table table_pk2(login_id varchar2(20) constraint tblpk2_lgnid_pk primary key, login_pwd varchar2(20) constraint tblpk2_lgnpw_nn not null, tel varchar2(20)); 
desc table_pk2;

-- TABLE_PK 테이블에 데이터 입력하기
insert into table_pk(login_id, login_pwd, tel) values('TEST_ID_01', 'PWD01', '010-1234-5678');
select * from table_pk; 

-- TABLE_PK 테이블에 중복되는 데이터 입력하기 
insert into table_pk(login_id, login_pwd, tel) values('TEST_ID_01', 'PWD02', '010-2345-6789'); -- 오류 발생. PRIMARY KEY 제약 조건이 지정되어 있는 열은 중복 허용 X

-- PRIMARY KEY 제약 조건을 지정한 열 확인 (NULL값을 입력했을 때)
-- NULL 값을 명시적으로 입력하기
insert into table_pk (login_id, login_pwd, tel) values (null, 'PWD02', '010-2345-6789');
-- NULL 값을 명시적으로 입력하기
insert into table_pk(login_pwd, tel) values('pwd02', '010-2345-6789');
-- 오류 발생.PRIMARY KEY 제약 조건이 지정되어 있는 열은 중복 허용 X. ALTER문으로 추가, 수정, 이름변경, 삭제 등이 가능. 

-- CREATE문에서 제약 조건을 지정하는 다른 방식 인라인(inline), 열 레벨(column-level) wpdir whrjs wjddml
-- 제약 조건 지정 방식
create table table_name(COL1 varchar2(20) constraint constraint_name primary key, COL2 varchar2(20) not null, COL3 varchar2(20));

-- 열을 명시한 후 제약 조건을 테이블 단위에 지정하는 방식 : 아웃오브라인 또는 테이블 레벨 제약 조건 정의 (NOT NULL 제약 조건을 제외한 제약 조건 지정 가능)
create table table_name(COL1 varchar2(20) constraint constraint_name primary key, COL2 varchar2(20), COL3 varchar2(20) primary key (COL1) constraint constraint_name unique (COL2));
 
-- 외래키, 외부키 FOREIGN KEY : 서로 다른 테이블 간 관계를 정의하는데 사용

-- EMP 테이블과 DEPT 테이블의 제약 조건 살펴보기
select owner, constraint_name, constraint_type, table_name, r_owner, R_constraint_name from user_constraints where table_name in ('EMP', 'DEPT');
-- constraint_type 열 값이 R일 경우 외래키를 의미. R_constraint_NAME의 PK_DEPT 테이블의 PRIMAPY KEY, 즉 DEPT 테이블의 DEPTNO 열을 참조한다는 뜻.

-- FOREIGN KEY가 참조하는 열에 존재하지 않는 데이터 입력
insert into emp (empno, ename, job, mgr, hiredate, sal, domm, deptno) values(9999, '홍길동', 'CLERK', '7788', TO_DATE('2017/04/30', 'YYYY/MM/DD'), 1200, null, 50);
-- 오류 발생. 부모 키가 없습니다. > DEPT 테이블의 DEPTNO 열에 50이 존재하지 않음.

-- FOREIGN KEY 지정하기
-- create table 테이블 이름(...(다른 열 정의), 열 자료형 constraint [제약 조건 이름] REFERENCES 참조테이블(참조할 열));

-- 아래와 같이 제약 조건의 이름을 지정하지 않고 정의할 수도 있음
-- create table 테이블 이름(...(다른 열 정의), 열 자료형 REFERENCES 참조 테이블(참조할 열));

-- 열을 모두 정의한 후 제약 조건을 지정하려면 마지막에 constraint키워드를 사용하면 됨.
-- create table 테이블 이름(...(다른 열 정의), constraint [제약 조건 이름] foreign key(열) references 참조테이블(참조할 열));
 
-- DEPT_FK 테이블 생성하기
create table dept_fk(deptno number(2) constraint deptkf_deptno_pk primary key, dname varchar2(14), loc varchar2(13));
desc dept_fk;

-- DEPT_FK 테이블의 DEPTNO 열을 참조하는 FOREIGN KEY 제약 조건을 정의 한 EMP 테이블 생성하기
-- EMP_FK 테이블 생성하기
create table emp_fk(empno number(4) constraint empfk_empno_ok primary key, ename varchar2(10), job varchar2(9), mgr number(4), hiredate date, sal number(7, 2) comm number(7, 2), deptno number(2) 
constraint empfk_deptno_fk references dept_fk (deptno)); -- dept 테이블의 deptno 열을 참조하는 foreign key제약 조건이 지정됨.
desc emp_fk;desc emp_fk;

-- EMP_FK 테이블에 데이터 삽입하기 (DEPTNO 데이터가 아직 DEPT_FK 테이블에 없을 때)
insert into emp_fk values(9999, 'TEST_NMAME', 'TEST_JOB', null, to_date('2001/00/01', 'YYYY/MM/DD'), 3000, null, 10); -- 오류 발생

-- DEPT_FK에 데이터 삽입하기
insert into dept_fk values(10, 'TEST_DNAME', 'TEST_LOC');
select * from dept_fk;

-- EMP_FK 테이블에 데이터 삽입하기
insert into emp_fk values(9999, 'TEST_NMAME', 'TEST_JOB', null, to_date('2001/00/01', 'YYYY/MM/DD'), 3000, null, 10); 
select * from dept_fk;

-- FOREIGN KEY로 참조 행 데이터 삭제하기
-- DEPT_FK 테이블의 10번 부서 데이터 삭제하기
delete from dept_fk where deptno = 10; -- 오류 발생
-- 오류 발생 이유 : 자식 레코드 값을 참조하는 데이터가 존재하기 때문. 
-- 삭제하기 위해서는 1. 현재 삭제하려는 열 값을 참조하는 데이터를 먼저 삭제 2. 현재 삭제하려는 열 값을 참조하는 데이터를 수정 3. 현재 삭제혀라는 열을 참조하는 자식 테이블의 FOREIGN KEY 제약 조건을 해제

-- 열 데이터를 삭제할 때 이 데이터를 참조하고 있는 데이터도 함께 삭제
-- constraint [제약 조건 이름] references 참조 테이블(참조할 열) on delete cascade

-- 열 데이터를 삭제할 때 이 데이터를 참조하는 데이터를 NULL으로 수정
-- constraint [제약 조건 이름[ references 참조 테이블(참조할 열) on delect set null

-- 데이터 형태와 범위를 정하는 CHECK : 열에 저장할 수 있는 값의 범위 또는 패턴을 정의

-- 테이블을 생성할 때 CHECK 제약 조건 설정하기
create table table_check(login_id varchar2(20) constraint tblck_loginid_pk primary key, login_pwd varchar2(20) constraint tblck_loginpw_ck check (length(login_pwd) > 3), tel varchar2(20)); -- 열 길이가 3 이상인 데이터만 저장 가능
desc table_check;

-- CHECK 제약 조건 확인하기
select owner, constraint_name, constraint_type, table_name from user_constraint where table_name like 'TABLE_CHECK';

-- 테이블을 생성할 때 DEFAULT 제약 조건 설정하기
create table table_default(login_id    varchar2(20) constraint tblck2_loginid_pk primary key, login_pwd   varchar2(20) default '1234', tel varchar2(20));
desc table_default;

-- default로 지정한 기본값이 입력되는 insert문 확인하기
insert into table_default values ('test_id', null, '010-1234-5678');
insert into table_default (login_id, tel) values ('test_id2', '010-1234-5678');
select * from table_default;

-- 제약 조건은 데이터 무결성을 보장하는데 중요한 역할을 하나, 테스트 등의 특정 업무에선 걸림돌이 됨. 이때 제약 조건을 비활성화하거나 비활성화 되어있는 제약 조건을 다시 활성화 가능.
-- 비활성화 : DISABLE, 활성화 :  

--alter table 테이블이름 disable [novalidate / validate] constraint 제약조건이름;
-- alter table 테이블이름 enable [novalidate / validate] constraint 제약조건이름;

-- 사용자 관리 : 데이터베이스에 접속하여 데이터를 관리하는 계정
-- 업무 분할과 효율, 보안을 위해 여러 사용자들을 나눈다.
-- 데이터 베이스 스키마 : 관계, 구조, 제약조건 등 저장 및 관리하기 위해 정의한 데이터베이스 구조
-- ***사용자가 생성한 테이블, 뷰, 제약조건, 인덱스, 시퀀스, 동의어 등 모든 객체는 사용자의 스키마가 됨***

-- 사용자 생성
-- create user 사용자 이름(필수, ID) identified by 패스워드(필수) default tablespace 테이블 스페이스 이름(선택, DB명) temporapy tablespace 테이블 스페이스(그룹) 이름(선택)
-- quota 테이블 스페이스 크기 on 테이블 스페이스 이름(선택, DB에서 쓸 용량 제한 걸기) profile 프로파일 이름(선택) password expire(선택, 암호 만기일) account [look/unlook](선택)

-- SCOTT 계정으로 사용자 생성하기
create user orclstudy identified by oracle; -- 권한 불충분으로 실행 안됨. SYSTEM계정으로 해야 함.

-- 권한 관리 : 접속 사용자에 따라 접근할 수 있는 데이터 영역과 권한을 지정
-- 오라클에서는 시스템 권한(system privilege)과 객체 권한(object privilege)으로 분류한다.
-- 시스템 권한 : 사용자 생성과 정보 수정 및 삭제, 데이터베이스 접근, 오라클 데이터베이스의 여러 자원과 객체 생성 및 관리 등의 권한
-- 이 역시 시스템 계정에서 가능.

-- 롤 관리 ( = 규칙 관리): 여러 종류의 권한을 한 종류로 묶어놓은 그룹. 여러 권한을 한 번에 부여하고 해제할 수 있으므로 권한 관리 효율을 높일 수 있다

-- 사정 정의된 롤(predefined roles)과 사용자 정의 롤(user roles)로 나뉨
-- 사전 정의된 롤
-- CONNECT 롤 : 사용자가 데이터 베이스에 접속하는 데 필요한 CREATE SESSOIN권한을 가지고 있음.
-- ALTER SESSION, CREATE CLUSTER, CREATE DATAVASE LINK, CREATE SEQUENCE, CREATE SESSION, CREATR SYNONYM, CREATE TABLE, CREATR VIEW

-- RESOURCE 롤 : 사용자가 테이블, 시퀀스를 비롯한 여러 객체를 생성할 수 있는 기본 시스템 권한
-- CREATE TRIGGER, CREATR SEQUENCE, CREATR TYPE, CREATE PROCEDURE, CREATE CLUSTER, CREATE OPERATOR, CREATE INDETYPE, CREATE TABLE

-- DBA 롤 : 데이터베이스를 관리하는 시스템 권한을 대부분 갖고 있음. 매우 강력한 롤

-- 사용자 정의 롤 : 필요에 의해 직접 권한을 포함시킨 롤. 아래 절차에 따라 롤을 생성해서 사용 가능
-- CREATR ROLE문으로 롤 생성 > GRANT 명령어로 생성한 롤에 권한을 포함 > GRANT 명령어로 권한이 포함된 롤을 특정 사용제에게 부여 > REVOKE 명령어로 롤을 취소
 