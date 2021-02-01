pipeline {
    agent any

     stages {
        stage('Build') {
            steps {
                bat "mvnw.cmd clean"
            }
        }

        stage('compile') {
            steps {
                bat "mvnw.cmd compile"
            }
        }

        stage('test') {
            steps {
                bat "mvnw.cmd test"
            }
        }

        stage('test WS postman') {
            steps {
                bat "newman run Dxc.postman_collection.json"
            }
        }

    }
}