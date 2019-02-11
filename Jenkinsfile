pipeline {
  agent {
    docker {
      image 'maven3.3.9-jdk-8'
    }

  }
  stages {
    stage('initialize') {
      steps {
        sh 'mvn clean '
      }
    }
    stage('Build') {
      steps {
        sh 'mvn -Dmaven.test.faliure.ignore.true install '
      }
    }
    stage('Report') {
      steps {
        junit 'target/logs '
      }
    }
  }
}