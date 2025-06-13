drop table membertable ;
drop sequence membertable_seq

create table membertable(
mno number(5) not null,
bwriter nvarchar2(10) not null,
id nvarchar2(10) primary key,
pw nvarchar2(10) not null,
regidate date default sysdate not null
)


create sequence membertable_seq increment by 1 start with 1 nocache nocycle

-- �θ� ���̵����� �Է�
insert into MEMBERTABLE(mno, bwriter, id, pw)
values (membertable_seq.nextval, '����', 'kkw', '1234')

insert into MEMBERTABLE(mno, bwriter, id, pw)
values (membertable_seq.nextval, '�����', 'ksa', '1234')

insert into MEMBERTABLE(mno, bwriter, id, pw)
values (membertable_seq.nextval, '����', 'kim', '1234')



select * from membertable

------------------------------------------------------------------------------------------------------------------------------------------------

drop table memberboard
drop sequence memberboard_seq

create table memberboard(
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

create sequence memberboard_seq increment by 1 start with 1 nocache nocycle ; 

insert into MEMBERBOARD (bno, btitle, bcontent, bwriter, bdate)
values (memberboard_seq.nextval, '�ȳ��', '���� ������ ������ �ݿ����̿���', 'kkw', sysdate)

insert into MEMBERBOARD (bno, btitle, bcontent, bwriter, bdate)
values (memberboard_seq.nextval, '������', '���� ������ ������ �ݿ����̿���', 'ksa', sysdate)

insert into MEMBERBOARD (bno, btitle, bcontent, bwriter, bdate)
values (memberboard_seq.nextval, '�ݿ���', '���� ������ ������ �ݿ����̿���', 'kim', sysdate)

select * from memberboard