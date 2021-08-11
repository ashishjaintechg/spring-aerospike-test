# spring-aerospike-test
Aerospike spring boot test on docker software

Docker software installation process

docker run -d --name aerospike aerospike/aerospike-server
#This will give IP address of server
docker inspect -f '{{.NetworkSettings.IPAddress }}' aerospike 
#IP is 172.17.0.2 in my case
telnet 172.17.0.2 3000
docker run -it aerospike/aerospike-tools aql -h  $(docker inspect -f '{{.NetworkSettings.IPAddress }}' aerospike)
insert into test.foo (PK, foo) values ('123','my string')
select * from test.foo
test is default namespace

Post requst : http://localhost:8080/test/users
{
    "id":101,
    "name":"abc",
    "salary":1000
}

select * from test.User

Get Request : http://localhost:8080/test/users/101





