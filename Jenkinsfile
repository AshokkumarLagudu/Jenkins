pipeline{
    agent any
    stages{
        stage('compileStage'){
            steps{
                withMaven(maven:'MAVEN_HOME')
                sh 'mvn clean compile'
            }
            
        }
        stage('TestingStage'){
            steps{
                withMaven(maven:'MAVEN_HOME')
                sh 'mvn test'
            }
        }
        stage('DeployStage'){
            steps{
                withMaven(maven:'MAVEN_HOME')
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
