/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image 'openjdk:11' } }
    stages {
        stage('build') {
            steps {
                sh 'java --version'
                sh './gradlew clean build'
            }
        }
        stage('test') {
            steps {
                sh 'echo Making test'
            }
        }
        stage('deploy') {
            steps {
                sh 'kubectl config get-contexts'
                sh 'kubectl get pods'
                sh 'echo Deploy Successfully!'
            }
        }
    }
}
