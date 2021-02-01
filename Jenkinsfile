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

        stage('Run Jar') {
            steps {
                    bat 'start mvnw.cmd spring-boot:run'
                    sleep 10
            }
        }

        stage('test WS postman') {
            steps {
                bat "newman run Dxc.postman_collection.json"
            }
        }

    }
}