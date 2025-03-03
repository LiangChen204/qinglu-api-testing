pipeline {
    agent any
    
    tools {
        maven 'Maven 3.8.1'
        jdk 'JDK 8'
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Run Tests') {
            steps {
                sh 'mvn clean test'
            }
        }
        
        stage('Generate Report') {
            steps {
                sh 'mvn allure:report'
            }
        }
    }
    
    post {
        always {
            allure([
                includeProperties: false,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'target/allure-results']]
            ])
        }
    }
} 