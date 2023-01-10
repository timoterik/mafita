FROM eclipse-temurin:17-jre-alpine

COPY local local

LABEL version="@version@"

WORKDIR /local/mafita_webapp

ENTRYPOINT [\
    "java",\
    "-Duser.timezone=UTC",\
    "-jar",\
    "/local/mafita_webapp/lib/mafita_webapp-@version@-all.jar",\
    "--settings",\
    "/local/mafita_webapp/etc/stack.server-docker.yaml"\
]

EXPOSE 8080
