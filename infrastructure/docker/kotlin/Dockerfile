FROM zenika/kotlin:1.4-jdk11

COPY scripts/ /opt/scripts
RUN cd /opt/scripts && ./provision.sh && rm -rf /opt/scripts

WORKDIR /app
