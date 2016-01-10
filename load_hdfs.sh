#!/bin/bash 
VERSION=tachyon
BASE_DIR=${CODE_DIR}

${HADOOP_HOME}/bin/hdfs dfs -rm -r /apps/${VERSION}
${HADOOP_HOME}/bin/hdfs dfs -mkdir -p /apps/${VERSION}
${HADOOP_HOME}/bin/hdfs dfs -copyFromLocal ${BASE_DIR}/tachyon/clients/client/target/tachyon-client-0.9.0-SNAPSHOT-jar-with-dependencies.jar /apps/${VERSION}
