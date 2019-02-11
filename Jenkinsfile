pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        echo 'HI its initializing '
      }
    }
    stage('Test') {
      steps {
        junit './gradlew check'
      }
    }
  }
}