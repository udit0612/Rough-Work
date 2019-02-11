pipeline {
  agent any
  stages {
    stage('Intialize') {
      steps {
        echo 'App initialized'
      }
    }
  }
  post {
    always {
      junit 'target/**/*.xml'

    }

  }
}