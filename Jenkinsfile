pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'M3') {
                    bat 'mvn clean install'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'M3') {
                    bat 'mvn test'
                }
            }
        }

        stage('Generate HTML report') {
            steps {
                cucumber buildStatus: "UNSTABLE",
                        fileIncludePattern: '**/cucumber.json',
                        jsonReportDirectory: 'target'
            }

        }
    }
}
