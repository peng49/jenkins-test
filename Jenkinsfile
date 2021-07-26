#!/usr/bin/env groovy
pipeline {
    agent {
        label 'dev-label'
    }
    stages {
        stage('test') {
            sh 'mvn clean && mvn test'
        }
        stage('build') {
            sh 'mvn package'
        }
        stage('deploy') {
            sh 'cp ./target/jenkins-test-1.0.jar /home/vagrant/'
        }
    }
}