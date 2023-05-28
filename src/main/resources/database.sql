create table public.rol (
    id serial primary key,
    nombre text unique
);
create table public.profesor (
    id serial primary key,
    dni text unique,
    paterno text,
    materno text,
    nombres text,
    nacimiento date
);
create table public.alumno (
    id serial primary key,
    dni text unique,
    paterno text,
    materno text,
    nombres text,
    nacimiento date
);
create table public.grupo(
    id serial primary key,
    nombre text unique
);
create table public.matricula (
    id serial primary key,
    alumno integer references public.alumno,
    grupo integer references public.grupo
);
create table public.asistencia (
    id serial primary key,
    rol integer references public.rol,
    entidadid integer,
    fecha date,
    entrada time,
    salida time,
    estado smallint
);

insert into public.rol (nombre) values ('Alumno'),('Profesor');
insert into public.grupo (nombre) values ('A'),('B');
insert into public.alumno(dni,paterno,materno,nombres,nacimiento)values('44845551','Mollapaza','Cutipa','Carlos Adan','2020-10-10');
insert into public.alumno(dni,paterno,materno,nombres,nacimiento)values('01305243','Zea','Jara','Vilma','2020-10-10');
insert into public.profesor(dni,paterno,materno,nombres,nacimiento)values('40407072','Mollapaza','Cutipa','Nilda','2020-10-10');
insert into public.profesor(dni,paterno,materno,nombres,nacimiento)values('40407071','Zamata','Zapata','Cesar','2020-10-10');
insert into public.matricula(alumno,grupo)values(1,1),(2, 2);
insert into public.asistencia(rol,entidadid,fecha,entrada,salida,estado)values(1,1,'2023-05-24','08:01:00','13:01:00',1);
insert into public.asistencia(rol,entidadid,fecha,entrada,salida,estado)values(1,1,'2023-05-25','08:00:00','13:00:00',1);
insert into public.asistencia(rol,entidadid,fecha,entrada,salida,estado)values(1,2,'2023-05-24','07:01:00','11:01:00',1);
insert into public.asistencia(rol,entidadid,fecha,entrada,salida,estado)values(1,2,'2023-05-25','07:00:00','11:00:00',1);
insert into public.asistencia(rol,entidadid,fecha,entrada,salida,estado)values(2,1,'2023-05-24','06:00:00','17:00:00',1);
insert into public.asistencia(rol,entidadid,fecha,entrada,salida,estado)values(2,2,'2023-05-24','05:00:00','16:00:00',1);