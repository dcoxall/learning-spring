FROM java:7-jdk
RUN mkdir /learningspring
WORKDIR /learningspring
ADD . /learningspring
RUN /learningspring/gradlew assemble
