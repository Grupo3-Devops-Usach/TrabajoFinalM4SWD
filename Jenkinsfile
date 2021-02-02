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

        stage('Postman') {
            steps {
                bat 'newman run Dxc.postman_collection1.json'
            }
        }
    }
}