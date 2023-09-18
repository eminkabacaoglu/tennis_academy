PGDMP     "                    {            tennisAcademy    14.5    14.5 �    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    33181    tennisAcademy    DATABASE     l   CREATE DATABASE "tennisAcademy" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE "tennisAcademy";
                postgres    false            �            1259    54179    cities    TABLE     !  CREATE TABLE public.cities (
    id bigint NOT NULL,
    city_name character varying(255),
    created_at timestamp without time zone,
    created_by character varying(255),
    last_modified_at timestamp without time zone,
    modified_by character varying(255),
    country_id bigint
);
    DROP TABLE public.cities;
       public         heap    postgres    false            �            1259    54178    cities_id_seq    SEQUENCE     v   CREATE SEQUENCE public.cities_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.cities_id_seq;
       public          postgres    false    235            �           0    0    cities_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.cities_id_seq OWNED BY public.cities.id;
          public          postgres    false    234            �            1259    54188    counties    TABLE     "  CREATE TABLE public.counties (
    id bigint NOT NULL,
    county_name character varying(255),
    created_at timestamp without time zone,
    created_by character varying(255),
    last_modified_at timestamp without time zone,
    modified_by character varying(255),
    city_id bigint
);
    DROP TABLE public.counties;
       public         heap    postgres    false            �            1259    54187    counties_id_seq    SEQUENCE     x   CREATE SEQUENCE public.counties_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.counties_id_seq;
       public          postgres    false    237            �           0    0    counties_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.counties_id_seq OWNED BY public.counties.id;
          public          postgres    false    236            �            1259    54197 	   countries    TABLE     1  CREATE TABLE public.countries (
    id bigint NOT NULL,
    country_name character varying(255),
    created_at timestamp without time zone,
    created_by character varying(255),
    is_default boolean NOT NULL,
    last_modified_at timestamp without time zone,
    modified_by character varying(255)
);
    DROP TABLE public.countries;
       public         heap    postgres    false            �            1259    54196    countries_id_seq    SEQUENCE     y   CREATE SEQUENCE public.countries_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.countries_id_seq;
       public          postgres    false    239            �           0    0    countries_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.countries_id_seq OWNED BY public.countries.id;
          public          postgres    false    238            �            1259    45631    employee_types    TABLE     :  CREATE TABLE public.employee_types (
    id bigint NOT NULL,
    description character varying(255),
    type_code character varying(255),
    created_at timestamp without time zone,
    last_modified_at timestamp without time zone,
    created_by character varying(255),
    modified_by character varying(255)
);
 "   DROP TABLE public.employee_types;
       public         heap    postgres    false            �            1259    45630    employee_types_id_seq    SEQUENCE     ~   CREATE SEQUENCE public.employee_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.employee_types_id_seq;
       public          postgres    false    212            �           0    0    employee_types_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.employee_types_id_seq OWNED BY public.employee_types.id;
          public          postgres    false    211            �            1259    45639 	   employees    TABLE     �   CREATE TABLE public.employees (
    driver_license character varying(255),
    is_married boolean NOT NULL,
    id bigint NOT NULL,
    employee_type_id bigint
);
    DROP TABLE public.employees;
       public         heap    postgres    false            �            1259    45645    field_types    TABLE     H  CREATE TABLE public.field_types (
    id bigint NOT NULL,
    field_type_code character varying(255),
    field_type_description character varying(255),
    created_at timestamp without time zone,
    created_by character varying(255),
    last_modified_at timestamp without time zone,
    modified_by character varying(255)
);
    DROP TABLE public.field_types;
       public         heap    postgres    false            �            1259    45644    field_types_id_seq    SEQUENCE     {   CREATE SEQUENCE public.field_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.field_types_id_seq;
       public          postgres    false    215            �           0    0    field_types_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.field_types_id_seq OWNED BY public.field_types.id;
          public          postgres    false    214            �            1259    45654    fields    TABLE     �  CREATE TABLE public.fields (
    id bigint NOT NULL,
    field_code character varying(255),
    field_description character varying(255),
    field_name character varying(255),
    is_active boolean NOT NULL,
    is_web_active boolean NOT NULL,
    field_type_id bigint,
    created_at timestamp without time zone,
    created_by character varying(255),
    last_modified_at timestamp without time zone,
    modified_by character varying(255)
);
    DROP TABLE public.fields;
       public         heap    postgres    false            �            1259    45653    fields_id_seq    SEQUENCE     v   CREATE SEQUENCE public.fields_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.fields_id_seq;
       public          postgres    false    217            �           0    0    fields_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.fields_id_seq OWNED BY public.fields.id;
          public          postgres    false    216            �            1259    70430    level    TABLE     o  CREATE TABLE public.level (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    created_by character varying(255),
    last_modified_at timestamp without time zone,
    level_code character varying(255),
    level_description character varying(255),
    modified_by character varying(255),
    quota integer NOT NULL,
    module_type_id bigint
);
    DROP TABLE public.level;
       public         heap    postgres    false            �            1259    70429    level_id_seq    SEQUENCE     u   CREATE SEQUENCE public.level_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.level_id_seq;
       public          postgres    false    243            �           0    0    level_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.level_id_seq OWNED BY public.level.id;
          public          postgres    false    242            �            1259    70477    locker_types    TABLE       CREATE TABLE public.locker_types (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    created_by character varying(255),
    description character varying(255),
    last_modified_at timestamp without time zone,
    modified_by character varying(255)
);
     DROP TABLE public.locker_types;
       public         heap    postgres    false            �            1259    70476    locker_types_id_seq    SEQUENCE     |   CREATE SEQUENCE public.locker_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.locker_types_id_seq;
       public          postgres    false    247            �           0    0    locker_types_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.locker_types_id_seq OWNED BY public.locker_types.id;
          public          postgres    false    246            �            1259    70486    lockers    TABLE     �  CREATE TABLE public.lockers (
    id bigint NOT NULL,
    allocation_fee double precision NOT NULL,
    created_at timestamp without time zone,
    created_by character varying(255),
    dues_fee double precision NOT NULL,
    last_modified_at timestamp without time zone,
    locker_code character varying(255),
    modified_by character varying(255),
    locker_type_id bigint,
    member_id bigint
);
    DROP TABLE public.lockers;
       public         heap    postgres    false            �            1259    70485    lockers_id_seq    SEQUENCE     w   CREATE SEQUENCE public.lockers_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.lockers_id_seq;
       public          postgres    false    249            �           0    0    lockers_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.lockers_id_seq OWNED BY public.lockers.id;
          public          postgres    false    248            �            1259    45663    member_types    TABLE     T  CREATE TABLE public.member_types (
    id bigint NOT NULL,
    description character varying(255),
    type_code character varying(255),
    created_at timestamp without time zone,
    last_modified_at timestamp without time zone,
    created_by character varying(255),
    modified_by character varying(255),
    payment_type_id bigint
);
     DROP TABLE public.member_types;
       public         heap    postgres    false            �            1259    45662    member_types_id_seq    SEQUENCE     |   CREATE SEQUENCE public.member_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.member_types_id_seq;
       public          postgres    false    219            �           0    0    member_types_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.member_types_id_seq OWNED BY public.member_types.id;
          public          postgres    false    218            �            1259    45671    members    TABLE     i  CREATE TABLE public.members (
    date_of_membership_begin date,
    date_of_membership_end date,
    father_name character varying(255),
    job character varying(255),
    mother_name character varying(255),
    note character varying(255),
    id bigint NOT NULL,
    member_type_id bigint,
    membership_status_id bigint,
    reference_member_id bigint
);
    DROP TABLE public.members;
       public         heap    postgres    false            �            1259    45679    membership_statuses    TABLE       CREATE TABLE public.membership_statuses (
    id bigint NOT NULL,
    status_name character varying(255),
    created_at timestamp without time zone,
    created_by character varying(255),
    last_modified_at timestamp without time zone,
    modified_by character varying(255)
);
 '   DROP TABLE public.membership_statuses;
       public         heap    postgres    false            �            1259    45678    membership_statuses_id_seq    SEQUENCE     �   CREATE SEQUENCE public.membership_statuses_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.membership_statuses_id_seq;
       public          postgres    false    222            �           0    0    membership_statuses_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.membership_statuses_id_seq OWNED BY public.membership_statuses.id;
          public          postgres    false    221            �            1259    70439    module_type    TABLE       CREATE TABLE public.module_type (
    id bigint NOT NULL,
    created_at timestamp without time zone,
    created_by character varying(255),
    last_modified_at timestamp without time zone,
    modified_by character varying(255),
    module_description character varying(255)
);
    DROP TABLE public.module_type;
       public         heap    postgres    false            �            1259    70438    module_type_id_seq    SEQUENCE     {   CREATE SEQUENCE public.module_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.module_type_id_seq;
       public          postgres    false    245            �           0    0    module_type_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.module_type_id_seq OWNED BY public.module_type.id;
          public          postgres    false    244            �            1259    45685    parents    TABLE     X   CREATE TABLE public.parents (
    job character varying(255),
    id bigint NOT NULL
);
    DROP TABLE public.parents;
       public         heap    postgres    false            �            1259    70385    payment_types    TABLE     f   CREATE TABLE public.payment_types (
    id bigint NOT NULL,
    description character varying(255)
);
 !   DROP TABLE public.payment_types;
       public         heap    postgres    false            �            1259    70384    payment_types_id_seq    SEQUENCE     }   CREATE SEQUENCE public.payment_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.payment_types_id_seq;
       public          postgres    false    241            �           0    0    payment_types_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.payment_types_id_seq OWNED BY public.payment_types.id;
          public          postgres    false    240            �            1259    45691    persons    TABLE     9  CREATE TABLE public.persons (
    id bigint NOT NULL,
    date_of_birth date,
    email character varying(255),
    first_name character varying(255),
    gender character varying(255),
    home_phone character varying(255),
    is_active boolean NOT NULL,
    is_web_reservation boolean NOT NULL,
    last_name character varying(255),
    mobile_phone character varying(255),
    national_id character varying(255),
    password character varying(255),
    photo_url character varying(255),
    place_of_birth character varying(255),
    username character varying(255),
    created_at timestamp without time zone,
    created_by character varying(255),
    last_modified_at timestamp without time zone,
    modified_by character varying(255),
    city_id bigint,
    county_id bigint,
    address character varying(255)
);
    DROP TABLE public.persons;
       public         heap    postgres    false            �            1259    45690    persons_id_seq    SEQUENCE     w   CREATE SEQUENCE public.persons_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.persons_id_seq;
       public          postgres    false    225            �           0    0    persons_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.persons_id_seq OWNED BY public.persons.id;
          public          postgres    false    224            �            1259    45801    reservation_setting    TABLE     �  CREATE TABLE public.reservation_setting (
    id bigint NOT NULL,
    max_number_of_days_owed integer NOT NULL,
    max_reservation_hour integer NOT NULL,
    max_reservation_hour_in_prime_time integer NOT NULL,
    min_time_period integer NOT NULL,
    player_waiting_minute integer NOT NULL,
    reservation_beginning_time character varying(255),
    reservation_cancellation_period integer NOT NULL,
    reservation_cancellation_period_trainers integer NOT NULL,
    reservation_ending_time character varying(255),
    reservation_forward_day integer NOT NULL,
    reservation_forward_day_for_trainers integer NOT NULL,
    reservation_period integer NOT NULL,
    web_reservation_beginning_time character varying(255),
    web_reservation_ending_time character varying(255),
    created_at timestamp without time zone,
    created_by character varying(255),
    last_modified_at timestamp without time zone,
    modified_by character varying(255)
);
 '   DROP TABLE public.reservation_setting;
       public         heap    postgres    false            �            1259    45800    reservation_setting_id_seq    SEQUENCE     �   CREATE SEQUENCE public.reservation_setting_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.reservation_setting_id_seq;
       public          postgres    false    233            �           0    0    reservation_setting_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.reservation_setting_id_seq OWNED BY public.reservation_setting.id;
          public          postgres    false    232            �            1259    45775    reservations    TABLE     l  CREATE TABLE public.reservations (
    id bigint NOT NULL,
    is_active boolean NOT NULL,
    reservation_date_time timestamp without time zone,
    member_id bigint,
    field_id bigint,
    created_at timestamp without time zone,
    created_by character varying(255),
    last_modified_at timestamp without time zone,
    modified_by character varying(255)
);
     DROP TABLE public.reservations;
       public         heap    postgres    false            �            1259    45774    reservations_id_seq    SEQUENCE     |   CREATE SEQUENCE public.reservations_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.reservations_id_seq;
       public          postgres    false    231            �           0    0    reservations_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.reservations_id_seq OWNED BY public.reservations.id;
          public          postgres    false    230            �            1259    37791    status    TABLE     f   CREATE TABLE public.status (
    status_id bigint NOT NULL,
    status_name character varying(255)
);
    DROP TABLE public.status;
       public         heap    postgres    false            �            1259    37790    status_status_id_seq    SEQUENCE     }   CREATE SEQUENCE public.status_status_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.status_status_id_seq;
       public          postgres    false    210            �           0    0    status_status_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.status_status_id_seq OWNED BY public.status.status_id;
          public          postgres    false    209            �            1259    45699    student_member    TABLE     f   CREATE TABLE public.student_member (
    student_id bigint NOT NULL,
    member_id bigint NOT NULL
);
 "   DROP TABLE public.student_member;
       public         heap    postgres    false            �            1259    45703    student_types    TABLE     9  CREATE TABLE public.student_types (
    id bigint NOT NULL,
    description character varying(255),
    type_code character varying(255),
    created_at timestamp without time zone,
    last_modified_at timestamp without time zone,
    created_by character varying(255),
    modified_by character varying(255)
);
 !   DROP TABLE public.student_types;
       public         heap    postgres    false            �            1259    45702    student_types_id_seq    SEQUENCE     }   CREATE SEQUENCE public.student_types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.student_types_id_seq;
       public          postgres    false    228            �           0    0    student_types_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.student_types_id_seq OWNED BY public.student_types.id;
          public          postgres    false    227            �            1259    45711    students    TABLE     �  CREATE TABLE public.students (
    attendance_type character varying(255),
    school character varying(255),
    id bigint NOT NULL,
    student_type_id bigint,
    black_list_description character varying(255),
    is_in_blacklist boolean NOT NULL,
    date_of_registration date,
    alternative_parent character varying(255),
    parent_job character varying(255),
    parent_name_surname character varying(255),
    parent_work_place character varying(255),
    level_id bigint
);
    DROP TABLE public.students;
       public         heap    postgres    false            �           2604    54182 	   cities id    DEFAULT     f   ALTER TABLE ONLY public.cities ALTER COLUMN id SET DEFAULT nextval('public.cities_id_seq'::regclass);
 8   ALTER TABLE public.cities ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    234    235    235            �           2604    54191    counties id    DEFAULT     j   ALTER TABLE ONLY public.counties ALTER COLUMN id SET DEFAULT nextval('public.counties_id_seq'::regclass);
 :   ALTER TABLE public.counties ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    236    237    237            �           2604    54200    countries id    DEFAULT     l   ALTER TABLE ONLY public.countries ALTER COLUMN id SET DEFAULT nextval('public.countries_id_seq'::regclass);
 ;   ALTER TABLE public.countries ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    239    238    239            �           2604    45634    employee_types id    DEFAULT     v   ALTER TABLE ONLY public.employee_types ALTER COLUMN id SET DEFAULT nextval('public.employee_types_id_seq'::regclass);
 @   ALTER TABLE public.employee_types ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    211    212    212            �           2604    45648    field_types id    DEFAULT     p   ALTER TABLE ONLY public.field_types ALTER COLUMN id SET DEFAULT nextval('public.field_types_id_seq'::regclass);
 =   ALTER TABLE public.field_types ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    215    215            �           2604    45657 	   fields id    DEFAULT     f   ALTER TABLE ONLY public.fields ALTER COLUMN id SET DEFAULT nextval('public.fields_id_seq'::regclass);
 8   ALTER TABLE public.fields ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    216    217    217            �           2604    70433    level id    DEFAULT     d   ALTER TABLE ONLY public.level ALTER COLUMN id SET DEFAULT nextval('public.level_id_seq'::regclass);
 7   ALTER TABLE public.level ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    242    243    243            �           2604    70480    locker_types id    DEFAULT     r   ALTER TABLE ONLY public.locker_types ALTER COLUMN id SET DEFAULT nextval('public.locker_types_id_seq'::regclass);
 >   ALTER TABLE public.locker_types ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    246    247    247            �           2604    70489 
   lockers id    DEFAULT     h   ALTER TABLE ONLY public.lockers ALTER COLUMN id SET DEFAULT nextval('public.lockers_id_seq'::regclass);
 9   ALTER TABLE public.lockers ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    248    249    249            �           2604    45666    member_types id    DEFAULT     r   ALTER TABLE ONLY public.member_types ALTER COLUMN id SET DEFAULT nextval('public.member_types_id_seq'::regclass);
 >   ALTER TABLE public.member_types ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    219    218    219            �           2604    45682    membership_statuses id    DEFAULT     �   ALTER TABLE ONLY public.membership_statuses ALTER COLUMN id SET DEFAULT nextval('public.membership_statuses_id_seq'::regclass);
 E   ALTER TABLE public.membership_statuses ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    221    222    222            �           2604    70442    module_type id    DEFAULT     p   ALTER TABLE ONLY public.module_type ALTER COLUMN id SET DEFAULT nextval('public.module_type_id_seq'::regclass);
 =   ALTER TABLE public.module_type ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    244    245    245            �           2604    70388    payment_types id    DEFAULT     t   ALTER TABLE ONLY public.payment_types ALTER COLUMN id SET DEFAULT nextval('public.payment_types_id_seq'::regclass);
 ?   ALTER TABLE public.payment_types ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    240    241    241            �           2604    45694 
   persons id    DEFAULT     h   ALTER TABLE ONLY public.persons ALTER COLUMN id SET DEFAULT nextval('public.persons_id_seq'::regclass);
 9   ALTER TABLE public.persons ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    224    225    225            �           2604    45804    reservation_setting id    DEFAULT     �   ALTER TABLE ONLY public.reservation_setting ALTER COLUMN id SET DEFAULT nextval('public.reservation_setting_id_seq'::regclass);
 E   ALTER TABLE public.reservation_setting ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    232    233    233            �           2604    45778    reservations id    DEFAULT     r   ALTER TABLE ONLY public.reservations ALTER COLUMN id SET DEFAULT nextval('public.reservations_id_seq'::regclass);
 >   ALTER TABLE public.reservations ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    231    230    231            �           2604    37794    status status_id    DEFAULT     t   ALTER TABLE ONLY public.status ALTER COLUMN status_id SET DEFAULT nextval('public.status_status_id_seq'::regclass);
 ?   ALTER TABLE public.status ALTER COLUMN status_id DROP DEFAULT;
       public          postgres    false    210    209    210            �           2604    45706    student_types id    DEFAULT     t   ALTER TABLE ONLY public.student_types ALTER COLUMN id SET DEFAULT nextval('public.student_types_id_seq'::regclass);
 ?   ALTER TABLE public.student_types ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    228    227    228            �          0    54179    cities 
   TABLE DATA           r   COPY public.cities (id, city_name, created_at, created_by, last_modified_at, modified_by, country_id) FROM stdin;
    public          postgres    false    235   ��       �          0    54188    counties 
   TABLE DATA           s   COPY public.counties (id, county_name, created_at, created_by, last_modified_at, modified_by, city_id) FROM stdin;
    public          postgres    false    237   ��       �          0    54197 	   countries 
   TABLE DATA           x   COPY public.countries (id, country_name, created_at, created_by, is_default, last_modified_at, modified_by) FROM stdin;
    public          postgres    false    239   ��       �          0    45631    employee_types 
   TABLE DATA           {   COPY public.employee_types (id, description, type_code, created_at, last_modified_at, created_by, modified_by) FROM stdin;
    public          postgres    false    212   $�       �          0    45639 	   employees 
   TABLE DATA           U   COPY public.employees (driver_license, is_married, id, employee_type_id) FROM stdin;
    public          postgres    false    213   A�       �          0    45645    field_types 
   TABLE DATA           �   COPY public.field_types (id, field_type_code, field_type_description, created_at, created_by, last_modified_at, modified_by) FROM stdin;
    public          postgres    false    215   ^�       �          0    45654    fields 
   TABLE DATA           �   COPY public.fields (id, field_code, field_description, field_name, is_active, is_web_active, field_type_id, created_at, created_by, last_modified_at, modified_by) FROM stdin;
    public          postgres    false    217   ��       �          0    70430    level 
   TABLE DATA           �   COPY public.level (id, created_at, created_by, last_modified_at, level_code, level_description, modified_by, quota, module_type_id) FROM stdin;
    public          postgres    false    243   !�       �          0    70477    locker_types 
   TABLE DATA           n   COPY public.locker_types (id, created_at, created_by, description, last_modified_at, modified_by) FROM stdin;
    public          postgres    false    247   ��       �          0    70486    lockers 
   TABLE DATA           �   COPY public.lockers (id, allocation_fee, created_at, created_by, dues_fee, last_modified_at, locker_code, modified_by, locker_type_id, member_id) FROM stdin;
    public          postgres    false    249    �       �          0    45663    member_types 
   TABLE DATA           �   COPY public.member_types (id, description, type_code, created_at, last_modified_at, created_by, modified_by, payment_type_id) FROM stdin;
    public          postgres    false    219   ��       �          0    45671    members 
   TABLE DATA           �   COPY public.members (date_of_membership_begin, date_of_membership_end, father_name, job, mother_name, note, id, member_type_id, membership_status_id, reference_member_id) FROM stdin;
    public          postgres    false    220   {�       �          0    45679    membership_statuses 
   TABLE DATA           u   COPY public.membership_statuses (id, status_name, created_at, created_by, last_modified_at, modified_by) FROM stdin;
    public          postgres    false    222   �       �          0    70439    module_type 
   TABLE DATA           t   COPY public.module_type (id, created_at, created_by, last_modified_at, modified_by, module_description) FROM stdin;
    public          postgres    false    245   w�       �          0    45685    parents 
   TABLE DATA           *   COPY public.parents (job, id) FROM stdin;
    public          postgres    false    223   ��       �          0    70385    payment_types 
   TABLE DATA           8   COPY public.payment_types (id, description) FROM stdin;
    public          postgres    false    241   ��       �          0    45691    persons 
   TABLE DATA           #  COPY public.persons (id, date_of_birth, email, first_name, gender, home_phone, is_active, is_web_reservation, last_name, mobile_phone, national_id, password, photo_url, place_of_birth, username, created_at, created_by, last_modified_at, modified_by, city_id, county_id, address) FROM stdin;
    public          postgres    false    225   5�       �          0    45801    reservation_setting 
   TABLE DATA           �  COPY public.reservation_setting (id, max_number_of_days_owed, max_reservation_hour, max_reservation_hour_in_prime_time, min_time_period, player_waiting_minute, reservation_beginning_time, reservation_cancellation_period, reservation_cancellation_period_trainers, reservation_ending_time, reservation_forward_day, reservation_forward_day_for_trainers, reservation_period, web_reservation_beginning_time, web_reservation_ending_time, created_at, created_by, last_modified_at, modified_by) FROM stdin;
    public          postgres    false    233   ��       �          0    45775    reservations 
   TABLE DATA           �   COPY public.reservations (id, is_active, reservation_date_time, member_id, field_id, created_at, created_by, last_modified_at, modified_by) FROM stdin;
    public          postgres    false    231   �       �          0    37791    status 
   TABLE DATA           8   COPY public.status (status_id, status_name) FROM stdin;
    public          postgres    false    210   8�       �          0    45699    student_member 
   TABLE DATA           ?   COPY public.student_member (student_id, member_id) FROM stdin;
    public          postgres    false    226   \�       �          0    45703    student_types 
   TABLE DATA           z   COPY public.student_types (id, description, type_code, created_at, last_modified_at, created_by, modified_by) FROM stdin;
    public          postgres    false    228   y�       �          0    45711    students 
   TABLE DATA           �   COPY public.students (attendance_type, school, id, student_type_id, black_list_description, is_in_blacklist, date_of_registration, alternative_parent, parent_job, parent_name_surname, parent_work_place, level_id) FROM stdin;
    public          postgres    false    229   ��       �           0    0    cities_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.cities_id_seq', 82, true);
          public          postgres    false    234            �           0    0    counties_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.counties_id_seq', 1, false);
          public          postgres    false    236            �           0    0    countries_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.countries_id_seq', 1, true);
          public          postgres    false    238            �           0    0    employee_types_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.employee_types_id_seq', 1, false);
          public          postgres    false    211            �           0    0    field_types_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.field_types_id_seq', 3, true);
          public          postgres    false    214            �           0    0    fields_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.fields_id_seq', 3, true);
          public          postgres    false    216            �           0    0    level_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.level_id_seq', 3, true);
          public          postgres    false    242            �           0    0    locker_types_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.locker_types_id_seq', 6, true);
          public          postgres    false    246            �           0    0    lockers_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.lockers_id_seq', 5, true);
          public          postgres    false    248            �           0    0    member_types_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.member_types_id_seq', 36, true);
          public          postgres    false    218            �           0    0    membership_statuses_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.membership_statuses_id_seq', 5, true);
          public          postgres    false    221            �           0    0    module_type_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.module_type_id_seq', 4, true);
          public          postgres    false    244            �           0    0    payment_types_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.payment_types_id_seq', 6, true);
          public          postgres    false    240            �           0    0    persons_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.persons_id_seq', 65, true);
          public          postgres    false    224            �           0    0    reservation_setting_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.reservation_setting_id_seq', 2, true);
          public          postgres    false    232            �           0    0    reservations_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.reservations_id_seq', 1, false);
          public          postgres    false    230            �           0    0    status_status_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.status_status_id_seq', 1, true);
          public          postgres    false    209            �           0    0    student_types_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.student_types_id_seq', 7, true);
          public          postgres    false    227            �           2606    54186    cities cities_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.cities
    ADD CONSTRAINT cities_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.cities DROP CONSTRAINT cities_pkey;
       public            postgres    false    235            �           2606    54195    counties counties_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.counties
    ADD CONSTRAINT counties_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.counties DROP CONSTRAINT counties_pkey;
       public            postgres    false    237            �           2606    54204    countries countries_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.countries
    ADD CONSTRAINT countries_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.countries DROP CONSTRAINT countries_pkey;
       public            postgres    false    239            �           2606    45638 "   employee_types employee_types_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.employee_types
    ADD CONSTRAINT employee_types_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.employee_types DROP CONSTRAINT employee_types_pkey;
       public            postgres    false    212            �           2606    45643    employees employees_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employees_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.employees DROP CONSTRAINT employees_pkey;
       public            postgres    false    213            �           2606    45652    field_types field_types_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.field_types
    ADD CONSTRAINT field_types_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.field_types DROP CONSTRAINT field_types_pkey;
       public            postgres    false    215            �           2606    45661    fields fields_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.fields
    ADD CONSTRAINT fields_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.fields DROP CONSTRAINT fields_pkey;
       public            postgres    false    217            �           2606    70437    level level_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.level
    ADD CONSTRAINT level_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.level DROP CONSTRAINT level_pkey;
       public            postgres    false    243                        2606    70484    locker_types locker_types_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.locker_types
    ADD CONSTRAINT locker_types_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.locker_types DROP CONSTRAINT locker_types_pkey;
       public            postgres    false    247                       2606    70493    lockers lockers_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.lockers
    ADD CONSTRAINT lockers_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.lockers DROP CONSTRAINT lockers_pkey;
       public            postgres    false    249            �           2606    45670    member_types member_types_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.member_types
    ADD CONSTRAINT member_types_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.member_types DROP CONSTRAINT member_types_pkey;
       public            postgres    false    219            �           2606    45677    members members_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.members
    ADD CONSTRAINT members_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.members DROP CONSTRAINT members_pkey;
       public            postgres    false    220            �           2606    45684 ,   membership_statuses membership_statuses_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.membership_statuses
    ADD CONSTRAINT membership_statuses_pkey PRIMARY KEY (id);
 V   ALTER TABLE ONLY public.membership_statuses DROP CONSTRAINT membership_statuses_pkey;
       public            postgres    false    222            �           2606    70446    module_type module_type_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.module_type
    ADD CONSTRAINT module_type_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.module_type DROP CONSTRAINT module_type_pkey;
       public            postgres    false    245            �           2606    45689    parents parents_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.parents
    ADD CONSTRAINT parents_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.parents DROP CONSTRAINT parents_pkey;
       public            postgres    false    223            �           2606    70390     payment_types payment_types_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.payment_types
    ADD CONSTRAINT payment_types_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.payment_types DROP CONSTRAINT payment_types_pkey;
       public            postgres    false    241            �           2606    45698    persons persons_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.persons
    ADD CONSTRAINT persons_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.persons DROP CONSTRAINT persons_pkey;
       public            postgres    false    225            �           2606    45808 ,   reservation_setting reservation_setting_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.reservation_setting
    ADD CONSTRAINT reservation_setting_pkey PRIMARY KEY (id);
 V   ALTER TABLE ONLY public.reservation_setting DROP CONSTRAINT reservation_setting_pkey;
       public            postgres    false    233            �           2606    45780    reservations reservations_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.reservations
    ADD CONSTRAINT reservations_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.reservations DROP CONSTRAINT reservations_pkey;
       public            postgres    false    231            �           2606    37796    status status_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.status
    ADD CONSTRAINT status_pkey PRIMARY KEY (status_id);
 <   ALTER TABLE ONLY public.status DROP CONSTRAINT status_pkey;
       public            postgres    false    210            �           2606    45710     student_types student_types_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.student_types
    ADD CONSTRAINT student_types_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.student_types DROP CONSTRAINT student_types_pkey;
       public            postgres    false    228            �           2606    45717    students students_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.students
    ADD CONSTRAINT students_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.students DROP CONSTRAINT students_pkey;
       public            postgres    false    229                       2606    45718 %   employees fk3ieleopldiw0royercatvp00i    FK CONSTRAINT     �   ALTER TABLE ONLY public.employees
    ADD CONSTRAINT fk3ieleopldiw0royercatvp00i FOREIGN KEY (employee_type_id) REFERENCES public.employee_types(id);
 O   ALTER TABLE ONLY public.employees DROP CONSTRAINT fk3ieleopldiw0royercatvp00i;
       public          postgres    false    213    3290    212                       2606    45793 (   reservations fk4wj528tycjlimib1banwsrkgf    FK CONSTRAINT     �   ALTER TABLE ONLY public.reservations
    ADD CONSTRAINT fk4wj528tycjlimib1banwsrkgf FOREIGN KEY (field_id) REFERENCES public.fields(id);
 R   ALTER TABLE ONLY public.reservations DROP CONSTRAINT fk4wj528tycjlimib1banwsrkgf;
       public          postgres    false    217    231    3296                       2606    54205 "   cities fk6gatmv9dwedve82icy8wrkdmk    FK CONSTRAINT     �   ALTER TABLE ONLY public.cities
    ADD CONSTRAINT fk6gatmv9dwedve82icy8wrkdmk FOREIGN KEY (country_id) REFERENCES public.countries(id);
 L   ALTER TABLE ONLY public.cities DROP CONSTRAINT fk6gatmv9dwedve82icy8wrkdmk;
       public          postgres    false    239    235    3320            
           2606    45743 #   members fk80bvooejgxg0emsgm09fc7au2    FK CONSTRAINT        ALTER TABLE ONLY public.members
    ADD CONSTRAINT fk80bvooejgxg0emsgm09fc7au2 FOREIGN KEY (id) REFERENCES public.persons(id);
 M   ALTER TABLE ONLY public.members DROP CONSTRAINT fk80bvooejgxg0emsgm09fc7au2;
       public          postgres    false    220    3306    225                       2606    82954 #   members fk8o0e5v7aaok8jt0iphg0l42xs    FK CONSTRAINT     �   ALTER TABLE ONLY public.members
    ADD CONSTRAINT fk8o0e5v7aaok8jt0iphg0l42xs FOREIGN KEY (reference_member_id) REFERENCES public.members(id);
 M   ALTER TABLE ONLY public.members DROP CONSTRAINT fk8o0e5v7aaok8jt0iphg0l42xs;
       public          postgres    false    220    3300    220                       2606    45768 $   students fk9nqs0pkter5l6no6n9v93uyau    FK CONSTRAINT     �   ALTER TABLE ONLY public.students
    ADD CONSTRAINT fk9nqs0pkter5l6no6n9v93uyau FOREIGN KEY (id) REFERENCES public.persons(id);
 N   ALTER TABLE ONLY public.students DROP CONSTRAINT fk9nqs0pkter5l6no6n9v93uyau;
       public          postgres    false    229    225    3306                       2606    82944 #   lockers fkaslourrdcwu99gvm42euudkg2    FK CONSTRAINT     �   ALTER TABLE ONLY public.lockers
    ADD CONSTRAINT fkaslourrdcwu99gvm42euudkg2 FOREIGN KEY (member_id) REFERENCES public.members(id);
 M   ALTER TABLE ONLY public.lockers DROP CONSTRAINT fkaslourrdcwu99gvm42euudkg2;
       public          postgres    false    220    249    3300                       2606    70396 (   member_types fkerf3p1qj5k2q6qut0gabalof0    FK CONSTRAINT     �   ALTER TABLE ONLY public.member_types
    ADD CONSTRAINT fkerf3p1qj5k2q6qut0gabalof0 FOREIGN KEY (payment_type_id) REFERENCES public.payment_types(id);
 R   ALTER TABLE ONLY public.member_types DROP CONSTRAINT fkerf3p1qj5k2q6qut0gabalof0;
       public          postgres    false    3322    219    241                       2606    45733 #   members fkfa8cdnhvk2v6e1nh0byccoutf    FK CONSTRAINT     �   ALTER TABLE ONLY public.members
    ADD CONSTRAINT fkfa8cdnhvk2v6e1nh0byccoutf FOREIGN KEY (member_type_id) REFERENCES public.member_types(id);
 M   ALTER TABLE ONLY public.members DROP CONSTRAINT fkfa8cdnhvk2v6e1nh0byccoutf;
       public          postgres    false    220    3298    219                       2606    45728 "   fields fkgdwpxlkge0fu3gmgmjtghoi4j    FK CONSTRAINT     �   ALTER TABLE ONLY public.fields
    ADD CONSTRAINT fkgdwpxlkge0fu3gmgmjtghoi4j FOREIGN KEY (field_type_id) REFERENCES public.field_types(id);
 L   ALTER TABLE ONLY public.fields DROP CONSTRAINT fkgdwpxlkge0fu3gmgmjtghoi4j;
       public          postgres    false    215    3294    217                       2606    54215 #   persons fkhcy9b4brono9em0c6mk1lbh16    FK CONSTRAINT     �   ALTER TABLE ONLY public.persons
    ADD CONSTRAINT fkhcy9b4brono9em0c6mk1lbh16 FOREIGN KEY (city_id) REFERENCES public.cities(id);
 M   ALTER TABLE ONLY public.persons DROP CONSTRAINT fkhcy9b4brono9em0c6mk1lbh16;
       public          postgres    false    3316    225    235            	           2606    45738 #   members fkhrsgfluj7m7n7wjkd3gfdo8fa    FK CONSTRAINT     �   ALTER TABLE ONLY public.members
    ADD CONSTRAINT fkhrsgfluj7m7n7wjkd3gfdo8fa FOREIGN KEY (membership_status_id) REFERENCES public.membership_statuses(id);
 M   ALTER TABLE ONLY public.members DROP CONSTRAINT fkhrsgfluj7m7n7wjkd3gfdo8fa;
       public          postgres    false    220    3302    222                       2606    45788 (   reservations fki17vaaphgbnwr0tbrg0qu0q66    FK CONSTRAINT     �   ALTER TABLE ONLY public.reservations
    ADD CONSTRAINT fki17vaaphgbnwr0tbrg0qu0q66 FOREIGN KEY (member_id) REFERENCES public.members(id);
 R   ALTER TABLE ONLY public.reservations DROP CONSTRAINT fki17vaaphgbnwr0tbrg0qu0q66;
       public          postgres    false    3300    231    220                       2606    45758 *   student_member fki9pkk20ith198tcws0136smsd    FK CONSTRAINT     �   ALTER TABLE ONLY public.student_member
    ADD CONSTRAINT fki9pkk20ith198tcws0136smsd FOREIGN KEY (student_id) REFERENCES public.students(id);
 T   ALTER TABLE ONLY public.student_member DROP CONSTRAINT fki9pkk20ith198tcws0136smsd;
       public          postgres    false    226    229    3310                       2606    70494 #   lockers fkm4x9y40jykc17c35wmhylh6u8    FK CONSTRAINT     �   ALTER TABLE ONLY public.lockers
    ADD CONSTRAINT fkm4x9y40jykc17c35wmhylh6u8 FOREIGN KEY (locker_type_id) REFERENCES public.locker_types(id);
 M   ALTER TABLE ONLY public.lockers DROP CONSTRAINT fkm4x9y40jykc17c35wmhylh6u8;
       public          postgres    false    249    247    3328                       2606    54210 $   counties fkm5s8rn07ak3a44difcr9ty77u    FK CONSTRAINT     �   ALTER TABLE ONLY public.counties
    ADD CONSTRAINT fkm5s8rn07ak3a44difcr9ty77u FOREIGN KEY (city_id) REFERENCES public.cities(id);
 N   ALTER TABLE ONLY public.counties DROP CONSTRAINT fkm5s8rn07ak3a44difcr9ty77u;
       public          postgres    false    237    235    3316                       2606    70447 !   level fkn1nmogomyuxipnraicop4e9mc    FK CONSTRAINT     �   ALTER TABLE ONLY public.level
    ADD CONSTRAINT fkn1nmogomyuxipnraicop4e9mc FOREIGN KEY (module_type_id) REFERENCES public.module_type(id);
 K   ALTER TABLE ONLY public.level DROP CONSTRAINT fkn1nmogomyuxipnraicop4e9mc;
       public          postgres    false    3326    243    245                       2606    45748 #   parents fknvbti8jff7l4o6hrfa6mcub8h    FK CONSTRAINT        ALTER TABLE ONLY public.parents
    ADD CONSTRAINT fknvbti8jff7l4o6hrfa6mcub8h FOREIGN KEY (id) REFERENCES public.persons(id);
 M   ALTER TABLE ONLY public.parents DROP CONSTRAINT fknvbti8jff7l4o6hrfa6mcub8h;
       public          postgres    false    223    225    3306                       2606    70452 $   students fkrm13u0rs7p5d9cuqn712kylb9    FK CONSTRAINT     �   ALTER TABLE ONLY public.students
    ADD CONSTRAINT fkrm13u0rs7p5d9cuqn712kylb9 FOREIGN KEY (level_id) REFERENCES public.level(id);
 N   ALTER TABLE ONLY public.students DROP CONSTRAINT fkrm13u0rs7p5d9cuqn712kylb9;
       public          postgres    false    243    229    3324                       2606    45723 %   employees fksfxfst8b5qgcjmw6nlktd94jh    FK CONSTRAINT     �   ALTER TABLE ONLY public.employees
    ADD CONSTRAINT fksfxfst8b5qgcjmw6nlktd94jh FOREIGN KEY (id) REFERENCES public.persons(id);
 O   ALTER TABLE ONLY public.employees DROP CONSTRAINT fksfxfst8b5qgcjmw6nlktd94jh;
       public          postgres    false    213    3306    225                       2606    54220 #   persons fksinvmm56mgsc0qwo3oaq4254s    FK CONSTRAINT     �   ALTER TABLE ONLY public.persons
    ADD CONSTRAINT fksinvmm56mgsc0qwo3oaq4254s FOREIGN KEY (county_id) REFERENCES public.counties(id);
 M   ALTER TABLE ONLY public.persons DROP CONSTRAINT fksinvmm56mgsc0qwo3oaq4254s;
       public          postgres    false    3318    237    225                       2606    45763 $   students fksjvtmqhb9m1mxa71kmqkv4ra2    FK CONSTRAINT     �   ALTER TABLE ONLY public.students
    ADD CONSTRAINT fksjvtmqhb9m1mxa71kmqkv4ra2 FOREIGN KEY (student_type_id) REFERENCES public.student_types(id);
 N   ALTER TABLE ONLY public.students DROP CONSTRAINT fksjvtmqhb9m1mxa71kmqkv4ra2;
       public          postgres    false    229    3308    228                       2606    45753 *   student_member fkt4258eg39c3mh9cq5qknpnnpe    FK CONSTRAINT     �   ALTER TABLE ONLY public.student_member
    ADD CONSTRAINT fkt4258eg39c3mh9cq5qknpnnpe FOREIGN KEY (member_id) REFERENCES public.members(id);
 T   ALTER TABLE ONLY public.student_member DROP CONSTRAINT fkt4258eg39c3mh9cq5qknpnnpe;
       public          postgres    false    226    220    3300            �   �  x���Mn�@���S�&⧡!;�X�(J"M<�2ʦl��4Q��s��ƛYyg|�)[s�g�����~^>e+�L�_}y�/����k^�Z':�����?	D=�z�؂DH�{_ۂ�M��e�֍;PQV�˹�1e7����|P����G�)en�k8��'@�1�ާ�������\��"o�0?Ƶ|D	���G���kQ ��)�)P@`?KHhKӠ���u١��Ѵs��@�����~I��9ʄg�wxkJ��u���&�f(
�tczv>��4����yB��q֧4+yw�5J�fn0v�[�":<�a@��0�m���:�ö�?QDѭqy���������VLq�����	ݍ�^"aJwͧx�Qʣ�OӲ]t��(_�������;��J��-.
�xqأf�ԙ��YE' �B�ZbU��C��ܡƠ�?;�%��3T��r؂"�]�X�O���d�^�g����A"��a��'"z��[���P��[�kN��C�\��C7nK�<�'z��b���E%�hģ�Z�Cz�U+zj��M�?��f��1=�l�p=�Z�
qB����_������Ҟ�7��������lɝ{��#��(d�B���ya�� ^$��y]0&�\&�P�i�1�;�ĝHk�q��WN��::�W.��k��k=|��I|�Yۏ�\��c�Kd��s��j2��ڴ�<      �      x������ � �      �   7   x�3�)-�άL�4202�5"KCS++3=Sc ���,1~\1z\\\ V(�      �      x������ � �      �      x������ � �      �   Z   x�3�	�I,*I�SN�H�4202�5"sC3+c3+Cc=S3s�?<R\F���}�83W�;��S������VSL��-,A���qqq �  k      �   I   x�E��	�0гN�����B�d�B��4��4@4�w	hm �Y6AT�M�A��+Ŭ,˻�����W��      �   c   x�e�9
�0@�zr�\ a���y۴)����M@�������Pe����GI��o*�g��	�~�g�Ϗ��{��EQ"C����i{$�[N�Ƙ�	      �   |   x�3�4202�50�54R00�22�24�31����t:����l<J�L�&
��V@dl�gb`��}x���(`��2Ŕ41�376��G��Y�,s+�$���ԼL����<��b���� 4-9/      �   �   x�M���0c�
5 b��a��*p�u�l�w��,����Z�7�
� !<���C�f�����]�и+��H��Ѫ�>�&;�*�qoXUV�L�l��0<���?�U5c����9?:�ಈ��~��m9��� M'�      �   �   x�U�1�0Eg��@#�I��s��P:��sp�^�D*�J�������3�SF�rC��#J��P�ͷ��YVd�a�HyX^�)�Y�����5R��5l��;��G�!�Y��y�����<Xy�`<��mH4�XDlЇ5����4���b%k�sy�ba[ߐ;�y���� �%@-      �   �   x����AE�Fp6W��)>Y#��������q� 9��{2R�R2�a�8�9A�rZ���M1��03�Pm7 �5�41��nh7��E��)�ZC�ZSN�ҢLNǲ���N�ʣ�S9�S���=... �?t      �   S   x�3�tKL��4202�50�5�T02�24�25�3�����#�e�钟�RZT��R
Wgd�``lellej�g`a�l�W� n�      �   U   x�e�!�0@Q��bXӮe[��Q��J0��!(��?�LYI���ՔP��X�T-7T�e�sN�����Hmi(���?u?|w }�:      �      x������ � �      �   ,   x�3�<<'�(�$U!$1)���-ά�2�tI�K�M����� 3�>      �   v  x�uTKn�0]ӧ�Lp�?�����MV�a&"ɅlH/�3�9X��,َL��h~��E�!_1�B$���W��6n��>=��n�fے;��/�o]�	��I`�� ����Z�ͤ�\H�����%�����E?o�+S���Y�Vr�RE�!#&�A�`����������6[�p���7uK�1��Ӻ��k��/�U��wG�rŪ%6�B�4f�0jdE���%0���:ԜoO)X��" �BͺC�װB]myE9?���J�d}��ݓ����C�9���p��S�+�,-
��"��#�Y����4�o}�/1��^����S���>-�D5ƕj�"�~��3l�S�����0,
Qrg&�(�VH:���+8��4t2u�q(�'_�n����h9	c�J))�^]�c`X0��Z����h(SbJH<p"�&���Lػ�m2?'	��d6I_^���`�@H�'S�d�a��ڿ�r�/�Vx�״��)1K�m����-HR<�c�RScR�|��'���J ��!z�{��.��Ua�*ІrU���Q��AE�Ub��� 5��=�s>voa5�3:�]4~p�1��+t܋J�nUV0�R�PfxqO��v�d       �   P   x�UJ�� {'St�"7�2D'`�9j��%�a3�H�Y�8�6m�^'�bo�q铺��N��o��(�=ki����߶�      �      x������ � �      �      x�3�tKL������ �a      �      x������ � �      �   Z   x�3�L��TP�,P�O/J�K��tt�4202�50�54R02�"SK=3��1~@�e�yxڑ�C�݃@���M��,���͡b���� +�~      �   �   x�m�A
�0DדS��$%�n�B�Jw����4B�
�Ƌ�ӃY��0˙7/m�]�MI@,!ϰ��2
�
E��4.��^���6�dr��PW�:X8s$_���^1Hx�E`v���mL���&�+�����$��[��.��u;?�>@��w.Z<Zy�1v�E     