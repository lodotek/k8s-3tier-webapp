FROM nginx:1.20.0
ENV TZ America/Denver
ARG BUILD_DATE
ARG VCS_REF
LABEL org.label-schema.build-date=$BUILD_DATE org.label-schema.vcs-ref=$VCS_REF \
    org.label-schema.vcs-url="https://github.com/lodotek/k8s-3tier-webapp"
COPY default.conf /etc/nginx/conf.d/default.conf
COPY docs /etc/nginx/docs
