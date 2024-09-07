# MySQL 8.0 버전을 베이스 이미지로 사용
FROM mysql:8.0.32

# MySQL 설정 파일을 복사
COPY ./my.cnf /etc/mysql/conf.d/my.cnf

# init.sql 파일을 /docker-entrypoint-initdb.d/로 복사
COPY ./init.sql /docker-entrypoint-initdb.d/

# 계정 정보 설정
ENV MYSQL_ROOT_PASSWORD=r2rdba98!
ENV MYSQL_DATABASE=r2r
ENV MYSQL_USER=r2rdba
ENV MYSQL_PASSWORD=r2rdba98!

# MySQL 기본 포트 3306 노출
EXPOSE 3306