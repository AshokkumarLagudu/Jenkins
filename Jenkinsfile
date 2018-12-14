pipeline{
    agent any
    stages{
        stage('compileStage'){
            steps{
                withMaven(maven:'maven-3.5.2')
                sh 'mvn clean compile'
            }
            
        }
        stage('TestingStage'){
            steps{
                withMaven(maven:'maven-3.5.2')
                sh 'mvn test'
            }
        }
        stage('DeployStage'){
            steps{
                withMaven(maven:'maven-3.5.2')
                sh 'mvn deploy'
            }
        }
    }
    post{
        always{
            echo 'This will always run'
        }
        success{
            echo 'This will run only if success'
        }
        failure{
            echo 'This will run only if fail'
        }
        unstable{
            echo 'This will run only if unstable'
        }
        
    }
}
