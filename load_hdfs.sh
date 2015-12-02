#!/bin/bash 
VERSION=tachyon
BASE_DIR=/media/code-netopt

${HADOOP_HOME}/bin/hdfs dfs -mkdir -p /apps/${VERSION}
${HADOOP_HOME}/bin/hdfs dfs -copyFromLocal ${BASE_DIR}/tachyon/clients/client/target/tachyon-client-0.9.0-SNAPSHOT-jar-with-dependencies.jar /apps/${VERSION}
