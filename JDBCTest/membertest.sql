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

-- 부모 더미데이터 입력
insert into MEMBERTABLE(mno, bwriter, id, pw)
values (membertable_seq.nextval, '김기원', 'kkw', '1234')

insert into MEMBERTABLE(mno, bwriter, id, pw)
values (membertable_seq.nextval, '김수아', 'ksa', '1234')

insert into MEMBERTABLE(mno, bwriter, id, pw)
values (membertable_seq.nextval, '김김김', 'kim', '1234')



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
values (memberboard_seq.nextval, '안녕요', '집에 가세요 오늘은 금요일이에요', 'kkw', sysdate)

insert into MEMBERBOARD (bno, btitle, bcontent, bwriter, bdate)
values (memberboard_seq.nextval, '집가자', '집에 가세요 오늘은 금요일이에요', 'ksa', sysdate)

insert into MEMBERBOARD (bno, btitle, bcontent, bwriter, bdate)
values (memberboard_seq.nextval, '금요일', '집에 가세요 오늘은 금요일이에요', 'kim', sysdate)

select * from memberboard