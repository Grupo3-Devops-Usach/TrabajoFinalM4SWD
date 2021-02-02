pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
				figlet "Build"
                bat 'mvn clean'
            }
        }

        stage('Comile') {
            steps {
				figlet "Comile"
                bat 'mvn compile'
            }
        }

        stage('Test') {
            steps {
				figlet "Test"
                bat 'mvn test'
            }
        }
		
		stage('JMeter') {
            steps {
				figlet "JMeter"
				bat 'mvn verify -Pperformance'
            }
        }
		
		stage('Run Jar') {
            steps {
				figlet "Run Jar"
                bat 'start mvnw.cmd spring-boot:run'
                sleep 10
            }
        }

        stage('test WS postman') {
            steps {
				figlet "test WS postman"
                bat "newman run Dxc.postman_collection.json"
            }
        }
    }
}