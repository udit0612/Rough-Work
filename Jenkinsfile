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
  }
}