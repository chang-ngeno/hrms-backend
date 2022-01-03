# Get the postgres version 14 Alpine
FROM postgres:14-alpine as build

# Set the user
USER postgres
RUN whoami

# Create the database and initialize the db.
ADD scripts/1_hrms.sql /docker-entrypoint-initdb.d
ADD scripts/2_cities_insert_into_code.sql /docker-entrypoint-initdb.d

# Expose the db port
EXPOSE "5432"

# set the PG_DATA path
# ENV PGDATA=/var/lib/postgresql/data/pgdata
# RUN echo ${PGDATA} && mkdir -p /var/lib/postgresql/data/pgdata

# Start the container
ENTRYPOINT ["docker-entrypoint.sh"]
CMD ["postgres"]