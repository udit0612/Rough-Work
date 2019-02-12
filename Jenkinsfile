pipeline {
  agent any
  stages {
    stage('initialize') {
      steps {
        echo 'Hello app is initializing'
      }
    }
    stage('clean') {
      steps {
        sh 'yum clean all'
      }
    }
  }
}