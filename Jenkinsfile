pipeline {
  agent any
  stages {
    stage('Intialize') {
      steps {
        echo 'App initialized'
      }
    }
    stage('Build') {
      steps {
        echo 'Building App'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing'
      }
    }
  }
  post {
    always {
      junit 'target/**/*.xml'

    }

  }
}