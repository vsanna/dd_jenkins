pipeline {
    agent any
    parameters {
        string(name: "string1", defaultValue: "default")
        string(name: "string2", defaultValue: "default2")
    }
    stages {
        stage('Build') {
            steps {
                echo "This build file comes from Github"
                echo 'Building..'
                echo "${params.string2}"
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