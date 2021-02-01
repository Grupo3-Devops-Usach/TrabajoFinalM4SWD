pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('test') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('test2') {
            steps {
                bat 'mvn test'
            }
        }
    }
}