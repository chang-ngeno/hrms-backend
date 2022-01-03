#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    CREATE USER hrms WITH PASSWORD 'hrms123';
    CREATE DATABASE hrms;
    GRANT ALL PRIVILEGES ON DATABASE hrms TO hrms;
EOSQL