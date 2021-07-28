#!/usr/bin/env groovy
import sun.util.resources.cldr.nyn.CalendarData_nyn_UG

pipeline {
    agent any
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
                        sudo cp ./target/jenkins-test-${version}.jar /var/www/jenkins-test.jar
                        sudo cp ./jenkins-test.service /usr/lib/systemd/system/jenkins-test.service && sudo systemctl daemon-reload                                              
                '''
                sh '''sudo systemctl restart jenkins-test'''
            }
        }
    }
}