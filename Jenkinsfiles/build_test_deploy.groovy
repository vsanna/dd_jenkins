pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "This build file comes from Github"
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}