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
                sh 'sudo cp ./jenkins-test.service /usr/lib/systemd/system/jenkins-test.service && sudo systemctl daemon-reload'
                sh '''sudo systemctl start jenkins-test'''
            }
        }
    }
}