PGDMP     5            	        y            hrms    13.2    13.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    32768    hrms    DATABASE     a   CREATE DATABASE hrms WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE hrms;
                postgres    false            �            1259    32785 	   Employees    TABLE     �   CREATE TABLE public."Employees" (
    "UserId" integer NOT NULL,
    "FirstName" character varying(30)[] NOT NULL,
    "LastName" character varying(30)[] NOT NULL,
    "TCNo" character varying(30)[] NOT NULL,
    "DateOfBirth" date NOT NULL
);
    DROP TABLE public."Employees";
       public         heap    postgres    false            �            1259    32793 	   Employers    TABLE     �   CREATE TABLE public."Employers" (
    "UserId" integer NOT NULL,
    "CompanyName" character varying(60)[] NOT NULL,
    "Website" character varying(100)[] NOT NULL,
    "Phone" character varying(10)[] NOT NULL,
    "VerifiedBySystem" boolean NOT NULL
);
    DROP TABLE public."Employers";
       public         heap    postgres    false            �            1259    32777 	   Personels    TABLE     �   CREATE TABLE public."Personels" (
    "UserId" integer NOT NULL,
    "FirstName" character varying(30)[] NOT NULL,
    "LastName" character varying(30)[] NOT NULL,
    "RoleId" integer NOT NULL
);
    DROP TABLE public."Personels";
       public         heap    postgres    false            �            1259    32801 	   Positions    TABLE     t   CREATE TABLE public."Positions" (
    "Id" integer NOT NULL,
    "PositionName" character varying(60)[] NOT NULL
);
    DROP TABLE public."Positions";
       public         heap    postgres    false            �            1259    32838    Roles    TABLE     l   CREATE TABLE public."Roles" (
    "Id" integer NOT NULL,
    "RoleName" character varying(60)[] NOT NULL
);
    DROP TABLE public."Roles";
       public         heap    postgres    false            �            1259    32769    Users    TABLE     �   CREATE TABLE public."Users" (
    "Id" integer NOT NULL,
    "Email" character varying(60)[] NOT NULL,
    "Password" character varying(60)[] NOT NULL,
    "Verified" boolean NOT NULL
);
    DROP TABLE public."Users";
       public         heap    postgres    false            �          0    32785 	   Employees 
   TABLE DATA           _   COPY public."Employees" ("UserId", "FirstName", "LastName", "TCNo", "DateOfBirth") FROM stdin;
    public          postgres    false    202   l$       �          0    32793 	   Employers 
   TABLE DATA           f   COPY public."Employers" ("UserId", "CompanyName", "Website", "Phone", "VerifiedBySystem") FROM stdin;
    public          postgres    false    203   �$       �          0    32777 	   Personels 
   TABLE DATA           R   COPY public."Personels" ("UserId", "FirstName", "LastName", "RoleId") FROM stdin;
    public          postgres    false    201   �$       �          0    32801 	   Positions 
   TABLE DATA           ;   COPY public."Positions" ("Id", "PositionName") FROM stdin;
    public          postgres    false    204   �$       �          0    32838    Roles 
   TABLE DATA           3   COPY public."Roles" ("Id", "RoleName") FROM stdin;
    public          postgres    false    205   �$       �          0    32769    Users 
   TABLE DATA           H   COPY public."Users" ("Id", "Email", "Password", "Verified") FROM stdin;
    public          postgres    false    200   �$       A           2606    32792    Employees Employees_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public."Employees"
    ADD CONSTRAINT "Employees_pkey" PRIMARY KEY ("UserId");
 F   ALTER TABLE ONLY public."Employees" DROP CONSTRAINT "Employees_pkey";
       public            postgres    false    202            C           2606    32832    Employees Employees_uk_TCNo 
   CONSTRAINT     \   ALTER TABLE ONLY public."Employees"
    ADD CONSTRAINT "Employees_uk_TCNo" UNIQUE ("TCNo");
 I   ALTER TABLE ONLY public."Employees" DROP CONSTRAINT "Employees_uk_TCNo";
       public            postgres    false    202            E           2606    32800    Employers Employers_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public."Employers"
    ADD CONSTRAINT "Employers_pkey" PRIMARY KEY ("UserId");
 F   ALTER TABLE ONLY public."Employers" DROP CONSTRAINT "Employers_pkey";
       public            postgres    false    203            G           2606    32821 "   Employers Employers_uk_CompanyName 
   CONSTRAINT     j   ALTER TABLE ONLY public."Employers"
    ADD CONSTRAINT "Employers_uk_CompanyName" UNIQUE ("CompanyName");
 P   ALTER TABLE ONLY public."Employers" DROP CONSTRAINT "Employers_uk_CompanyName";
       public            postgres    false    203            I           2606    32825    Employers Employers_uk_Phone 
   CONSTRAINT     ^   ALTER TABLE ONLY public."Employers"
    ADD CONSTRAINT "Employers_uk_Phone" UNIQUE ("Phone");
 J   ALTER TABLE ONLY public."Employers" DROP CONSTRAINT "Employers_uk_Phone";
       public            postgres    false    203            K           2606    32823    Employers Employers_uk_Website 
   CONSTRAINT     b   ALTER TABLE ONLY public."Employers"
    ADD CONSTRAINT "Employers_uk_Website" UNIQUE ("Website");
 L   ALTER TABLE ONLY public."Employers" DROP CONSTRAINT "Employers_uk_Website";
       public            postgres    false    203            ?           2606    32784    Personels Personels_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public."Personels"
    ADD CONSTRAINT "Personels_pkey" PRIMARY KEY ("UserId");
 F   ALTER TABLE ONLY public."Personels" DROP CONSTRAINT "Personels_pkey";
       public            postgres    false    201            M           2606    32808    Positions Positions_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public."Positions"
    ADD CONSTRAINT "Positions_pkey" PRIMARY KEY ("Id");
 F   ALTER TABLE ONLY public."Positions" DROP CONSTRAINT "Positions_pkey";
       public            postgres    false    204            O           2606    32845    Roles Roles_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public."Roles"
    ADD CONSTRAINT "Roles_pkey" PRIMARY KEY ("Id");
 >   ALTER TABLE ONLY public."Roles" DROP CONSTRAINT "Roles_pkey";
       public            postgres    false    205            ;           2606    32776    Users Users_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public."Users"
    ADD CONSTRAINT "Users_pkey" PRIMARY KEY ("Id");
 >   ALTER TABLE ONLY public."Users" DROP CONSTRAINT "Users_pkey";
       public            postgres    false    200            =           2606    32810    Users Users_uk_Email 
   CONSTRAINT     V   ALTER TABLE ONLY public."Users"
    ADD CONSTRAINT "Users_uk_Email" UNIQUE ("Email");
 B   ALTER TABLE ONLY public."Users" DROP CONSTRAINT "Users_uk_Email";
       public            postgres    false    200            R           2606    32833    Employees Employees    FK CONSTRAINT     �   ALTER TABLE ONLY public."Employees"
    ADD CONSTRAINT "Employees" FOREIGN KEY ("UserId") REFERENCES public."Users"("Id") NOT VALID;
 A   ALTER TABLE ONLY public."Employees" DROP CONSTRAINT "Employees";
       public          postgres    false    200    202    2875            S           2606    32826    Employers Employers_fkey_UserId    FK CONSTRAINT     �   ALTER TABLE ONLY public."Employers"
    ADD CONSTRAINT "Employers_fkey_UserId" FOREIGN KEY ("UserId") REFERENCES public."Users"("Id") NOT VALID;
 M   ALTER TABLE ONLY public."Employers" DROP CONSTRAINT "Employers_fkey_UserId";
       public          postgres    false    2875    200    203            Q           2606    32846    Personels Personels_fkey_RoleId    FK CONSTRAINT     �   ALTER TABLE ONLY public."Personels"
    ADD CONSTRAINT "Personels_fkey_RoleId" FOREIGN KEY ("UserId") REFERENCES public."Roles"("Id") NOT VALID;
 M   ALTER TABLE ONLY public."Personels" DROP CONSTRAINT "Personels_fkey_RoleId";
       public          postgres    false    201    205    2895            P           2606    32815    Personels Personels_fkey_UserId    FK CONSTRAINT     �   ALTER TABLE ONLY public."Personels"
    ADD CONSTRAINT "Personels_fkey_UserId" FOREIGN KEY ("UserId") REFERENCES public."Users"("Id") NOT VALID;
 M   ALTER TABLE ONLY public."Personels" DROP CONSTRAINT "Personels_fkey_UserId";
       public          postgres    false    2875    201    200            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �     