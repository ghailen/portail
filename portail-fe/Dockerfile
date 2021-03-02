FROM nginx:stable-alpine
LABEL maintainer="Houssem BenAbdallah <houssem.benabdallah@sofrecom.com>"
ARG ARG_DIST=dist
ENV DIST=${ARG_DIST}
ENV ls -l /etc/nginx/conf.d/
RUN rm /etc/nginx/conf.d/default.conf
#RUN rm /etc/nginx/conf.d/examplessl.conf

COPY nginx.conf /etc/nginx

WORKDIR /usr/share/nginx/html
RUN rm -f /usr/share/nginx/html/*.*
COPY ${DIST}/ /usr/share/nginx/html/
