pipeline
{
    agent any

    stages
    {
        stage('Build')
        {
            steps
            {
				figlet "Build"
                sh 'mvn clean'
            }
        }

        stage('Compile')
        {
            steps
            {
				figlet "Compile"
                sh 'mvn compile'
            }
        }
		
		stage('Test')
		{
            steps
            {
				figlet "Test"
				sh 'mvn verify -Pperformance'
            }
        }
		
		stage('Run Jar')
		{
            steps
            {
				figlet "Run Jar"
                sh 'mvn spring-boot:run'
                sleep 10
            }
        }
		
		stage('JMeter')
		{
            steps
            {
				figlet "JMeter"
				sh 'mvn verify -Pperformance'
            }
        }

        stage('Test WS Newman')
        {
            steps
            {
				figlet "Test WS Newman"
                sh "newman run Dxc.postman_collection.json"
            }
        }
    }
}