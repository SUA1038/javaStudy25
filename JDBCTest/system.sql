create user membertest identified by membertest ; -- �Ϲ� ���� ����
grant resource, connect to membertest; -- ���� �ο�
alter user membertest default tablespace users ; -- db ����
alter user membertest temporary tablespace temp ; -- �ӽ� ���̺�