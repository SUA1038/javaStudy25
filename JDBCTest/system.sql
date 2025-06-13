create user membertest identified by membertest ; -- 일반 계정 생성
grant resource, connect to membertest; -- 권한 부여
alter user membertest default tablespace users ; -- db 연결
alter user membertest temporary tablespace temp ; -- 임시 테이블