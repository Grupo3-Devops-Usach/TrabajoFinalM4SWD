pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Comile') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
		
		stage('JMeter')
        {
            steps
            {
				bat 'mvn verify -Pperformance'
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