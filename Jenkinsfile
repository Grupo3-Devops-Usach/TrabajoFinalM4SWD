pipeline {
    agent any

    stages {
        stage('Build') {
			figlet "Build"
            steps {
                bat 'mvn clean'
            }
        }

        stage('Comile') {
			figlet "Comile"
            steps {
                bat 'mvn compile'
            }
        }

        stage('Test') {
			figlet "Test"
            steps {
                bat 'mvn test'
            }
        }
		
		stage('JMeter') {
			figlet "JMeter"
            steps
            {
				bat 'mvn verify -Pperformance'
            }
        }
		
		stage('Run Jar') {
			figlet "Run Jar"
            steps {
                bat 'start mvnw.cmd spring-boot:run'
                sleep 10
            }
        }

        stage('test WS postman') {
			figlet "test WS postman"
            steps {
                bat "newman run Dxc.postman_collection.json"
            }
        }
    }
}