pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
				figlet "Build"
                bat 'mvnw clean'
            }
        }

        stage('Compile') {
            steps {
				figlet "Compile"
                bat 'mvnw compile'
            }
        }
		
		stage('Test') {
            steps {
				figlet "Test"
				bat 'mvnw verify -Pperformance'
            }
        }
		
		stage('Run Jar') {
            steps {
				figlet "Run Jar"
                bat 'start mvnw.cmd spring-boot:run'
                sleep 10
            }
        }
		
		stage('JMeter') {
            steps {
				figlet "JMeter"
				bat 'mvnw verify -Pperformance'
            }
        }

        stage('Test WS Newman') {
            steps {
				figlet "Test WS Newman"
                bat "newman run Dxc.postman_collection.json"
            }
        }
    }
}