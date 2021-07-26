#!/usr/bin/env groovy
pipeline {
    agent {
        label 'dev-label'
    }
    stages {
        stage('test') {
            steps {
                sh 'mvn clean && mvn test'
            }
        }
        stage('build') {
            steps {
                sh 'mvn package'
            }
        }
        stage('deploy') {
            steps {
                sh 'cp ./target/jenkins-test-1.0.jar /home/vagrant/'
                sh 'cd /home/vagrant && java -jar jenkins-test-1.0.jar --server.port=8090'
            }
        }
    }
}