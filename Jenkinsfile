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
                sh '''
                        version=$(cat pom.xml | grep '<version>' | head -1 | awk '{gsub(/\\s*<\\/?version>\\s*/,""); print}')
                        cp ./target/jenkins-test-${version}.jar /home/vagrant/jenkins-test.jar
                        sudo cp ./jenkins-test.service /usr/lib/systemd/system/jenkins-test.service && sudo systemctl daemon-reload                                              
                '''
                sh '''sudo systemctl restart jenkins-test'''
            }
        }
    }
}